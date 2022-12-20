package com.hu.request;

import java.time.LocalDateTime;

public class UserHistoryRequest {
	private int historyId;

	private String description;

	private LocalDateTime startDate;

	private LocalDateTime endDate;

	private String finished;

	private String status;

	public UserHistoryRequest(int historyId, String description, LocalDateTime startDate, LocalDateTime endDate,
			String finished, String status) {
		this.historyId = historyId;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.finished = finished;
		this.status = status;
	}

	public int getHistoryId() {
		return historyId;
	}

	public void setHistoryId(int historyId) {
		this.historyId = historyId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public String getFinished() {
		return finished;
	}

	public void setFinished(String finished) {
		this.finished = finished;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
