package QUEUE;

public class CandidateDetails implements Comparable<CandidateDetails> {
	private String name;
	private int yoe;
	@Override
	public int compareTo(CandidateDetails o) {
		return this.yoe-o.yoe;
	}
	public CandidateDetails(String name, int yoe) {
		this.name = name;
		this.yoe = yoe;
	}
	
	public String getName() {
		return name;
	}
	
	public int getYoe() {
		return yoe;
	}
	
	public void setYoe(int yoe) {
		this.yoe = yoe;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CandidateDetails [name=" + name + ", yoe=" + yoe + "]";
	}
	
}