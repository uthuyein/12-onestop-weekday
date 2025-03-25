package com.jdc.mkt.listeners;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Times implements Serializable{

	private static final long serialVersionUID = 1L;
	private LocalDateTime createTimes;
	private LocalDateTime updateTimes;
}
