package com.board.domain;

import java.io.Serializable;

public class Board implements Serializable {
	private int bSeq;
	private String bTitle;
	private String bContent;
	private String bDate;
	public int getbSeq() {
		return bSeq;
	}
	public void setbSeq(int bSeq) {
		this.bSeq = bSeq;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public String getbDate() {
		return bDate;
	}
	public void setbDate(String bDate) {
		this.bDate = bDate;
	}
	@Override
	public String toString() {
		return "Board [bSeq=" + bSeq + ", bTitle=" + bTitle + ", bContent=" + bContent + ", bDate=" + bDate + "]";
	}

}
