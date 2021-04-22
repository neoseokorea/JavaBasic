package poong.basic.board_practice1;

import java.io.Serializable;

public class BoardVO {

    protected   int     bdno;
    protected   String  title;
    protected   String  userid;
    protected   String  regdate;
    protected   int     views;
    protected   int     thumbup;
    protected   String  contents;

    public BoardVO() {
    }

    public int getBdno() {
        return bdno;
    }

    public void setBdno(int bdno) {
        this.bdno = bdno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getThumbup() {
        return thumbup;
    }

    public void setThumbup(int thumbup) {
        this.thumbup = thumbup;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "BoardVO{" +
                "bdno=" + bdno +
                ", title='" + title + '\'' +
                ", userid='" + userid + '\'' +
                ", regdate='" + regdate + '\'' +
                ", views=" + views +
                ", thumbup=" + thumbup +
                ", contents='" + contents + '\'' +
                '}';
    }
}//public class BoardVO {


