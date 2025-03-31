package com.jdc.mkt.controller.services;

import java.time.LocalDate;
import java.util.List;

import com.jdc.mkt.controller.VoucherDetailSearchBy;
import com.jdc.mkt.controller.VoucherDetailSelectInfo;
import com.jdc.mkt.entity.VoucherDetail;
import com.jdc.mkt.entity.VoucherDetail_;

public class VoucherDetailServices extends JpaFactory{
	

	public List<VoucherDetailSelectInfo> searchBy(
			String keyword,String customer,String account,LocalDate saleDate){
		
		var cb = getEm().getCriteriaBuilder();
		var cq = cb.createQuery(VoucherDetailSelectInfo.class);
		
		var root = cq.from(VoucherDetail.class);
		var vouJoin = root.join(VoucherDetail_.voucher);
		var pdJoin = root.join(VoucherDetail_.product);
		
		
		var search = new VoucherDetailSearchBy(account, customer, keyword, saleDate);
		VoucherDetailSelectInfo.select(cq, root, pdJoin, vouJoin);
		cq.where(search.where(cb, root, pdJoin, vouJoin));
		
		return getEm().createQuery(cq).getResultList();
	}
}
