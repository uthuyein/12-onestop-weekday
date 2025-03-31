package com.jdc.mkt.dto;

import java.time.LocalDate;

import com.jdc.mkt.entity.Category_;
import com.jdc.mkt.entity.Product_;
import com.jdc.mkt.entity.VoucherDetail;
import com.jdc.mkt.entity.VoucherDetail_;
import com.jdc.mkt.entity.Voucher_;

import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public record SelectVoucherDetailsInfo(
		String categoryName,
		String productName,
		int qty,
		LocalDate saleDate
		) {

	public static void select(CriteriaQuery<SelectVoucherDetailsInfo> cq,Root<VoucherDetail> root) {
		var product = root.join(VoucherDetail_.product);
		var voucher = root.join(VoucherDetail_.voucher);
		var category = product.join(Product_.category);
		
		cq.multiselect(
				category.get(Category_.name),
				product.get(Product_.name),
				root.get(VoucherDetail_.qty),
				voucher.get(Voucher_.saleDate)
				);
	}
}
