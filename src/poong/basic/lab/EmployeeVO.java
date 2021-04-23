package poong.basic.lab;



public class EmployeeVO {

//    create table employeeLab (
//            empno       int         auto_increment,
//            fname       varchar(20) not null,
//            lname       varchar(20) not null,
//            email       varchar(30) not null,
//            phone       varchar(20) not null,
//            hdate       varchar(10) not null,
//            jobid       varchar(10) not null,
//            sal         int          default 0,
//            comm        double       default 0,
//            mgird       varchar(10) not null,
//            deptid      varchar(10) not null,
//            primary key (empno)
//    );

    protected int empno;
    protected String fname;
    protected String lname;
    protected String email;
    protected String phone;
    protected String hdate;
    protected String jobid;
    protected int sal;
    protected double comm;
    protected String mgird;
    protected String deptid;

    public EmployeeVO() {
    }

    public EmployeeVO(int empno, String fname, String lname, String email, String phone, String hdate) {

        this.empno = empno;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.hdate = hdate;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHdate() {
        return hdate;
    }

    public void setHdate(String hdate) {
        this.hdate = hdate;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public String getMgird() {
        return mgird;
    }

    public void setMgird(String mgird) {
        this.mgird = mgird;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    @Override
    public String toString() {
        String fmt = "emp{empno, fname, lname, email, phone, \n" +
                "email: %s, phone: %s, \n" +
                "jobid:%s, sal:%s, comm:%s, " +
                "mgrid:%s, deptid:%s} \n";

        String result = String.format(fmt, empno, fname, lname, email, phone, hdate,
        jobid, sal, comm,mgird, deptid);

        return result;
    }
}

