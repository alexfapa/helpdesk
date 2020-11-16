package com.fapa.helpdesk.api.enums;

public enum StatusEnum {
	New,
	Resolved,
	Approved,
	Disapproved,
	Closed;
	
	public static StatusEnum getStatus(String status) {
		switch (status) {
			case "New": return New;
			case "Resolved": return Resolved;
			case "Approved": return Approved;
			case "Disapproved": return Disapproved;
			case "Closed": return Closed;

			default:
				return New;
		}
	}
}
