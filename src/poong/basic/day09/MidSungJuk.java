package poong.basic.day09;

public class MidSungJuk {

    protected String name;
    protected  int kor;
    protected  int eng;
    protected  int mat;
    protected  int tot;
    protected  double avg;
    protected  char grd;

    public MidSungJuk() {
    }

    public MidSungJuk(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getTot() {
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public char getGrd() {
        return grd;
    }

    public void setGrd(char grd) {
        this.grd = grd;
    }

    public void computeSungJuk() {

    }//public void computeSungJuk()

    /* 성적처리코드를 기능별로 나눠서 짬*/
    public void getTotal() { tot = kor + eng + mat;}

    public void getMean() { avg = (double) tot / 3; }

    public void getGrade() {
        //학점 산정
        switch ((int) avg / 10) {
            case 10:
            case 9:
                grd = '수';
                break;
            case 8:
                grd = '우';
                break;
            case 7:
                grd = '미';
                break;
            case 6:
                grd = '양';
                break;
            default:
                grd = '가';
                break;
        }//swich

    }

} // public class MidSungJuk

class FinalSungJuk extends MidSungJuk {

    private int soc;
    private int sci;

    public FinalSungJuk(int soc, int sci) {
        this.soc = soc;
        this.sci = sci;
    }

    public FinalSungJuk(String name, int kor, int eng, int mat, int soc, int sci) {
        super(name, kor, eng, mat);
        this.soc = soc;
        this.sci = sci;
    }

    @Override
    public void computeSungJuk() {
        /*
            setTot( getKor() + getEng() + getMat() + soc + sci );
            부모클래스의 멤버변수 접근지정자가
            privat으로 선언된 경우 원칙적으르 접근 불가하다
            따라서 setter/getter를 이용해서 코드 완성해야 함.
            코드가 다소 지저분해지는 단점이 존재한다.
         */
        tot = kor + eng + mat + soc + sci;
            // 부모클래스의 벰버변수 접근지정자가
            // protected로 선언된 경우에는 기존 수정없이 그대로 사용가능하다.
        avg = (double) tot / 5;

        //학점 산정
        switch ((int) avg / 10) {
            case 10:
            case 9:
                grd = '수';
                break;
            case 8:
                grd = '우';
                break;
            case 7:
                grd = '미';
                break;
            case 6:
                grd = '양';
                break;
            default:
                grd = '가';
                break;
        }//swich

    } //public void computeSungJuk()

    /*
        기능별로 모듈화를 적용하는 경우 상속 관계
        상속 관계에서 메서드 재정의 시
        편리하게 코드를 작성할 수 있음.
     */
    @Override
    public void getTotal() {
        super.getTotal();
        tot = tot + soc + sci;
    }

    @Override
    public void getMean() {
        avg = (double) tot / 5;
    }

    @Override
    public void getGrade() {
        super.getGrade();
    }

}//class FinalSungJuk extends MidSungJuk

