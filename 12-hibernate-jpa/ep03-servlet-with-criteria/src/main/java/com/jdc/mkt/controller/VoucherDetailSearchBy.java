package com.jdc.mkt.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.jdc.mkt.entity.Account_;
import com.jdc.mkt.entity.Category_;
import com.jdc.mkt.entity.Customer_;
import com.jdc.mkt.entity.Product;
import com.jdc.mkt.entity.Product_;
import com.jdc.mkt.entity.Voucher;
import com.jdc.mkt.entity.VoucherDetail;
import com.jdc.mkt.entity.Voucher_;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public record VoucherDetailSearchBy(String account, String customer, String keyword, LocalDate saleDate) {

	public Predicate[] where(
			CriteriaBuilder cb
			,Root<VoucherDetail> root
			,Join<VoucherDetail, Product> pdJoin
			,Join<VoucherDetail,Voucher> vouJoin) {
		
		List<Predicate> params = new ArrayList<Predicate>();
		
		if (null != account && !account.isEmpty()) {
			params.add(cb.equal(
					cb.lower(
						vouJoin.get(Voucher_.account)
						.get(Account_.loginId)), account.toLowerCase()));
		}
		if (null != customer && !customer.isEmpty()) {
			params.add(cb.equal(
					cb.lower(
						vouJoin.get(Voucher_.customer)
						.get(Customer_.name)), customer.toLowerCase()));
		}
		if (null != keyword && !keyword.isEmpty()) {
			params.add(cb.or(
					cb.equal(
						cb.lower(pdJoin.get(Product_.category)
							.get(Category_.name)), keyword.toLowerCase()),
					cb.like(
							cb.lower(pdJoin.get(Product_.name)), 
							keyword.toLowerCase().concat("%"))
					));
		}
		if (null != saleDate) {
			params.add(
				cb.greaterThanOrEqualTo(
					vouJoin.get(Voucher_.saleDate), saleDate));
		}
		return params.toArray(new Predicate[params.size()]);
	}
}
