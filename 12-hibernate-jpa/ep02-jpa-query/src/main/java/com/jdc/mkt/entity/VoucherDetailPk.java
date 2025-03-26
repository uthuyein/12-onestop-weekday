package com.jdc.mkt.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class VoucherDetailPk {

	@Column(name = "product_id")
	private int productId;
	@Column(name = "voucher_id")
	private int voucherId;
	@Column(columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP ")
	private LocalDateTime addDate;
}
