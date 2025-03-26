package com.jdc.mkt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "voucher_detail_tbl")
public class VoucherDetail {

	@EmbeddedId
	private VoucherDetailPk id;
	@Column(columnDefinition = "int default 1")
	private int qty;
	@Column(columnDefinition = "int default 0")
	private int discount;
	
	@ManyToOne
	@MapsId("productId")
	private Product product;
	
	@ManyToOne
	@MapsId("voucherId")
	private Voucher voucher;
}
