package com.jdc.mkt.controller;

import static com.jdc.mkt.calculators.MaharboteCalculator.getSign;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jdc.mkt.converters.MyanmarConverter;
import com.jdc.mkt.dto.MaharboteSign;
import com.jdc.mkt.dto.Planet;
import com.jdc.mkt.dto.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/maharbote")
public class MaharboteController extends HttpServlet {

	private static final long serialVersionUID = -4041285159221274572L;
	private Map<MaharboteSign, String> mapContent = new HashMap<MaharboteSign, String>();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getMaharbote(req, resp,null);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var name = req.getParameter("name");
		var email = req.getParameter("email");
		var dob = LocalDate.parse(req.getParameter("dob"));
		var dayName = Planet.valueOf(req.getParameter("dayName"));
		

		User user = new User(name, dob.getYear(), dob.getMonthValue(), dob.getDayOfMonth(), dayName.getPNumber());
		getMaharbote(req, resp, user);
	}

	private void getMaharbote(HttpServletRequest req, HttpServletResponse resp, User user)
			throws ServletException, IOException {

		List<MaharboteSign> signs = null;
		mapContent.clear();
		
		if (null != user) {
			signs = getSign(MyanmarConverter.convert(user.getYear(), user.getMonth(), user.getDay()), user.getDayName());
		} else {
			signs = getSign(0, 0);
		}

		if (!signs.isEmpty()) {
			for (MaharboteSign sign : signs) {
				mapContent.put(sign, getContent(sign));
			}
		}
		req.setAttribute("mapContent", mapContent);
		req.setAttribute("user", user);
		req.getRequestDispatcher("/all/maharbote.jsp").forward(req, resp);
	}

	public String getContent(MaharboteSign sign) {
		String content = "";
		try (BufferedReader br = new BufferedReader(
				new FileReader(new File("src/main/resources/maharbotes/" + sign.name().toLowerCase() + ".txt")))) {
			
			while (br.ready()) {
				content += br.readLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return content;
	}

}
