public class Portatil {
    private int teacherCode;
    private String teacherName, department, lapBrand, macDirection, ipDirection;

    public String getTeacherName() {
        return teacherName;
    }
    public int getTeacherCode() {
        return teacherCode;
    }
    public String getDepartment() {
        return department;
    }
    public String getLapBrand() {
        return lapBrand;
    }
    public String getMacDirection() {
        return macDirection;
    }
    public String getIpDirection() {
        return ipDirection;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public void setTeacherCode(int teacherCode) {
        this.teacherCode = teacherCode;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setLapBrand(String lapBrand) {
        this.lapBrand = lapBrand;
    }
    public void setMacDirection(String macDirection) {
        this.macDirection = macDirection;
    }
    public void setIpDirection(String ipDirection) {
        this.ipDirection = ipDirection;
    }

}