package poong.basic.day07;

public class SungjukV4 {
    public static void main(String[] args) {

        SungJuk sj = new SungJuk("혜교", 99, 98,99); // 객체 생성해라

        sj.computeSungJuk(); // 성적 처리해라

        System.out.println(sj.toString()); // 출력해봐



    }//public static void main







    // 성적 클래스
    // 클래스는 속성과 기능으로 구성(?)
    static class SungJuk {

        //멤버변수
        private String name;
        private int kor;
        private int eng;
        private int mat;
        private int tot;
        private double avg;
        private char grd;

        //생성자
        //alt insert를 눌러 생성자 선택 후 <선택 안함> 누르면 자동
        public SungJuk() {       }

        //생성자
        //alt insert를 눌러 생성자 선택 후 블럭 선택 후 <확인> 누르면 자동
        public SungJuk(String name, int kor, int eng, int mat) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.mat = mat;
        }

        //성적 처리
        public void computeSungJuk() {
            tot = kor + eng + mat;
            avg = (double) tot / 3;

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
        }//public void computeSungJuk()

        //결과 출력
        //alt insert 후 <toString> 선택해서 자동 입력가능
        @Override
        public String toString() {
            return "SungJuk{" +
                    "name=" + name +
                    ", kor=" + kor +
                    ", eng=" + eng +
                    ", mat=" + mat +
                    ", tot=" + tot +
                    ", avg=" + (int)avg +
                    ", grd=" + grd +
                    '}';
        }
    } //static class SungJuk





}//public class SungjukV4
