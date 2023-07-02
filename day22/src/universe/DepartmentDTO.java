package universe;

public class DepartmentDTO {
	private int deptno;		 // 학과 번호
	private String dname;	 // 학과 이름
	private String building; // 강의실건물
	
	public DepartmentDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public DepartmentDTO(int deptno, String dname, String building) {
		this.deptno = deptno;
		this.dname = dname;
		this.building = building;
	}



	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	
	
}
