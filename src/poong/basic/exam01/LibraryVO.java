package poong.basic.exam01;

public class LibraryVO {

    protected String lbname;    //도서관명
    protected String sido;      //시도
    protected String gugon;     //구군
    protected String lbtype;    //도서관유형
    protected String clsday;    //휴관일
    protected String addr;      //주소
    protected String phone;     //전화번호
    protected String homepage;  //홈페이지
    protected float lat;        //위도
    protected float lon;        //경도

    public LibraryVO() {
    }

    public LibraryVO(String lbname, String sido, String gugon, String lbtype, String clsday, String addr, String phone, String homepage, float lat, float lon) {

        this.lbname = lbname;
        this.sido = sido;
        this.gugon = gugon;
        this.lbtype = lbtype;
        this.clsday = clsday;
        this.addr = addr;
        this.phone = phone;
        this.homepage = homepage;
        this.lat = lat;
        this.lon = lon;
    }

    public String getLbname() {
        return lbname;
    }

    public void setLbname(String lbname) {
        this.lbname = lbname;
    }

    public String getSido() {
        return sido;
    }

    public void setSido(String sido) {
        this.sido = sido;
    }

    public String getGugon() {
        return gugon;
    }

    public void setGugon(String gugon) {
        this.gugon = gugon;
    }

    public String getLbtype() {
        return lbtype;
    }

    public void setLbtype(String lbtype) {
        this.lbtype = lbtype;
    }

    public String getClsday() {
        return clsday;
    }

    public void setClsday(String clsday) {
        this.clsday = clsday;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        return "LibraryVO{" +
                "lbname='" + lbname + '\'' +
                ", sido='" + sido + '\'' +
                ", gugon='" + gugon + '\'' +
                ", lbtype='" + lbtype + '\'' +
                ", clsday='" + clsday + '\'' +
                ", addr='" + addr + '\'' +
                ", phone='" + phone + '\'' +
                ", homepage='" + homepage + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                '}';
    }
}
