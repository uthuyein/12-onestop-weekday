package com.jdc.mkt.controller;

import java.time.LocalDate;

import com.jdc.mkt.entity.Account_;
import com.jdc.mkt.entity.Category_;
import com.jdc.mkt.entity.Customer_;
import com.jdc.mkt.entity.Product;
import com.jdc.mkt.entity.Product_;
import com.jdc.mkt.entity.Voucher;
import com.jdc.mkt.entity.VoucherDetail;
import com.jdc.mkt.entity.VoucherDetail_;
import com.jdc.mkt.entity.Voucher_;

import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Root;

public record VoucherDetailSelectInfo(
		String account,
		String customer,
		String category,
		String product,
		int qty,
		LocalDate saleDate
		) {

	public static void select(
			CriteriaQuery<VoucherDetailSelectInfo> cq
			,Root<VoucherDetail> root
			,Join<VoucherDetail, Product> pdJoin
			,Join<VoucherDetail,Voucher> vouJoin) {
			
		cq.multiselect(
				vouJoin.get(Voucher_.account).get(Account_.loginId),
				vouJoin.get(Voucher_.customer).get(Customer_.name),
				pdJoin.get(Product_.category).get(Category_.name),
				pdJoin.get(Product_.name),
				root.get(VoucherDetail_.qty),
				vouJoin.get(Voucher_.saleDate)
				);
	}
}




