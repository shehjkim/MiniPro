package co.micol.minipro.board.service;

import java.sql.Date;

public class BoardVo {

	private int bID;
	private String bName;
	private String bTitle;
	private String bContent;
	private Date bDate;
	private int bHit;
	private int bGroup;			//최상위 글(원글)
	private int bStep;			//댓글 스텝(최상위 글에 단 댓글)
	private int bIndent;		//어느 게시글의 대한 댓글
	
	
	public int getbID() {
		return bID;
	}
	
	public void setbID(int bID) {
		this.bID = bID;
	}
	
	public String getbName() {
		return bName;
	}
	
	public void setbName(String bName) {
		this.bName = bName;
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
	
	public Date getbDate() {
		return bDate;
	}
	
	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}
	
	public int getbHit() {
		return bHit;
	}
	
	public void setbHit(int bHit) {
		this.bHit = bHit;
	}
	
	public int getbGroup() {
		return bGroup;
	}
	
	public void setbGroup(int bGroup) {
		this.bGroup = bGroup;
	}
	
	public int getbStep() {
		return bStep;
	}
	
	public void setbStep(int bStep) {
		this.bStep = bStep;
	}
	
	public int getbIndent() {
		return bIndent;
	}
	
	public void setbIndent(int bIndent) {
		this.bIndent = bIndent;
	}
	
	
	
}
