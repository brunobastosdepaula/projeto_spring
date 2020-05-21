package com.curso.projeto_spring.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1),
	PAD(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(4);

	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
	
}

