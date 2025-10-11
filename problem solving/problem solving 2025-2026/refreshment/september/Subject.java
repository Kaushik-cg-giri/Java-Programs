package refreshment.september;

public class Subject {
	
	private int subId;
	
	private String subName;
	
	private int subMark;
	
	

	public Subject(int subId, String subName, int subMark) {
		super();
		this.subId = subId;
		this.subName = subName;
		this.subMark = subMark;
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getSubMark() {
		return subMark;
	}

	public void setSubMark(int subMark) {
		this.subMark = subMark;
	}

	@Override
	public String toString() {
		return "Subject [subId=" + subId + ", subName=" + subName + ", subMark=" + subMark + "]";
	}
	
	

}
