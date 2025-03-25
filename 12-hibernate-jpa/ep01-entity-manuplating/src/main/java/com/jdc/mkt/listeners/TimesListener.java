package com.jdc.mkt.listeners;

import java.time.LocalDateTime;

import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

public class TimesListener {

	@PrePersist
	void beforeSave(Object obj) {
		if(obj instanceof EnableTimesListener entity) {
			Times time = entity.getTimes();
			
			if(null == time) {
				time = new Times();
				entity.setTimes(time);
			}
			time.setCreateTimes(LocalDateTime.now());			
		}
	}
	
	@PreUpdate
	void beforeUpdate(Object obj) {
		if(obj instanceof EnableTimesListener entity) {
			Times time = entity.getTimes();
			
			if(null == time) {
				time = new Times();
				entity.setTimes(time);
			}
			time.setUpdateTimes(LocalDateTime.now());			
		}
	}
}
