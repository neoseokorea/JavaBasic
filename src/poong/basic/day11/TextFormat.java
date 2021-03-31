package poong.basic.day11;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class TextFormat {
    public static void main(String[] args) {

        /*
            MessageFormat
            다양한 형식의 데이터를 같은 양식을 출력할 때 사용
            템플릿 문자열을 쉽게 작성할 수 있도록 해 줌.

            printf나 String.format보다 세련된 기능을 제공한다.
         */
        String name = "혜교";
        int kor = 98;
        int eng = 99;
        int mat = 74;

        String fmt = "이름 : {0}, 국어 : {1}, 영어 : {2}, 수학 : {3}";
        String result = MessageFormat.format(fmt, name, kor, eng, mat);
        System.out.println(result);
        /*
            변수의 바인딩을 임의로 설정 가능
         */

        Object[] sj = {"지현", 98, 99, 74, 300, 100, '수'};
        result = MessageFormat.format(fmt, sj);
        System.out.println(result);
        /*
            변수를 배열로 정의하면 바인딩을 수월하게 할 수 있음.
         */

        /*
            DecimalFormat

            정수, 실수를 포함한 다양한 종류의 수를
            과학적 표기, 퍼센트 표시, 화폐 표시 등으로 출려갛ㄹ 때 사용

         */

        double num = 12345.6789;

        DecimalFormat df = new DecimalFormat("0");
        System.out.println(df.format(num));
        // 정수로만 반올림해서 출력

        df = new DecimalFormat("0.00");
        System.out.println(df.format(num));
        // 소수 둘째자리까지 반올림해서 출력됨.

        df = new DecimalFormat("000000.00");
        System.out.println(df.format(num));
        // 전체 자리 수를 6자리로 지정
        // 숫자가 모자랄 경우 그 자리를 0으로 채움

        df = new DecimalFormat("######");
        System.out.println(df.format(num));
        // 전체 자리 수를 6자리로 지정
        // 숫자가 모자랄 경우 그 자리를 공백으로 채움

        num = 123456789;
        df = new DecimalFormat("###,###,###");
        System.out.println(df.format(num));
        //천단위마다 ,를 출력

        num = 0.55;
        df = new DecimalFormat("## %");
        System.out.println(df.format(num));
        // 백분율로 출력

        num = 0.125;
        df = new DecimalFormat("## %");
        System.out.println(df.format(num));
        // 백분율로 출력

    }
}
