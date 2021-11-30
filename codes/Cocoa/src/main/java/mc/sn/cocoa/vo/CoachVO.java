package mc.sn.cocoa.vo;

import org.springframework.stereotype.Component;

@Component("coachVO")
public class CoachVO {
	private String coachId;
	private String lang;
	private String cImg;
	private String cTitle;
	private int basicPrice;
	private String cContents;
	
	public CoachVO() {
		
	}

	public CoachVO(String coachId, String lang, String cImg, String cTitle, int basicPrice, String cContents) {
		this.coachId = coachId;
		this.lang = lang;
		this.cImg = cImg;
		this.cTitle = cTitle;
		this.basicPrice = basicPrice;
		this.cContents = cContents;
	}

	public String getCoachId() {
		return coachId;
	}

	public void setCoachId(String coachId) {
		this.coachId = coachId;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getcImg() {
		return cImg;
	}

	public void setcImg(String cImg) {
		this.cImg = cImg;
	}

	public String getcTitle() {
		return cTitle;
	}

	public void setcTitle(String cTitle) {
		this.cTitle = cTitle;
	}

	public int getBasicPrice() {
		return basicPrice;
	}

	public void setBasicPrice(int basicPrice) {
		this.basicPrice = basicPrice;
	}

	public String getcContents() {
		return cContents;
	}

	public void setcContents(String cContents) {
		this.cContents = cContents;
	}
	
	
}
