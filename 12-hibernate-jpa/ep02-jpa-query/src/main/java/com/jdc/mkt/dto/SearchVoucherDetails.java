package com.jdc.mkt.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.jdc.mkt.entity.Category_;
import com.jdc.mkt.entity.Product_;
import com.jdc.mkt.entity.VoucherDetail;
import com.jdc.mkt.entity.VoucherDetail_;
import com.jdc.mkt.entity.Voucher_;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public record SearchVoucherDetails(
		String keyword,
		LocalDate date,
		long qty
		) {

	public  Predicate[] where(CriteriaBuilder cb,Root<VoucherDetail> root) {
		List<Predicate> params = new ArrayList<>();
		
		if(null != keyword && !keyword.isEmpty()) {
			params.add(
					cb.or(
							cb.equal(root.get(VoucherDetail_.product).get(Product_.name), keyword),
							cb.equal(root.get(VoucherDetail_.product).get(Product_.category).get(Category_.name), keyword)
							));
		}
		
		if(null != date) {
			params.add(cb.greaterThanOrEqualTo(root.get(VoucherDetail_.voucher).get(Voucher_.saleDate), date));
		}
		
		
		return params.toArray(new Predicate[params.size()]);
	}
}
