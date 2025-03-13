package com.jdc.mkt.controller;

import static com.jdc.mkt.utils.Maharbote.getSign;
import static com.jdc.mkt.utils.MyanmarConverter.convert;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

import com.jdc.mkt.dto.User;

public class MaharboteController {


	public String getResult(User user) {
		return getSign(convert(user.getYear(), user.getMonth(), user.getDay()), user.getDayName());
	}

	public void showResult(String sign) {
		try (BufferedReader br = new BufferedReader(
				new FileReader(
						new File("src/main/resources/maharbotes/"+sign.toLowerCase()+".txt")))) {
			System.out.println(sign);
			
			while(br.ready()) {
				System.out.println(br.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
