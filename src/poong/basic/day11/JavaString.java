package poong.basic.day11;

import java.util.Date;
import java.util.Locale;

public class JavaString {
    public static void main(String[] args) {

        /*
            String 클래스
            java.lang 패키지에 포함된 클래스
            c언어에서는 char 배열로 표현하지만
            자바에서는 String이라는 클래스를 사용함.
            String 객체는 한 번 생성되면 그 값을 읽기만 가능, 수정은 불가.
            ==> "불변 객체 immutable object"
            String 객체값 비교시 equals 메서도 사용해야 함.
            charAt, concat, indexOf, trim,
            toLowerCase, toUpperCase, split, substring
         */

        /*
            자바에서 String 객체는 메모리 재활용interning함.
            즉, 생성하는 String 객체 값을 String Pool에 저장하는데,
            그 다음에 생성한 String 객체의 값이 이전과 유사한 경우
            String Pool에 이미 만들어둔 객체를 재활용함.
         */

        //문자열 비교시 ==연산자는 값의 동등을 비교하는 것이 아니라 값의 위치를 비교한다. (참조값 비교)

        String str1 = "Hello, World!!";
        // 힙 영역 내 상수풀에 상성됨.
        String str2 = new String("Hello, World!!");
        //HEAP 영역에 생성됨.
        String str3 = "Hello, World!!";
        // 힙 영역 내 상수풀에 상성됨.

        if (str1 == str2)
            System.out.println("str1과 str2는 저장위치(주소)가 같다.");
        else
            System.out.println("str1과 str2는 저장위치(주소)가 다르다.");

        if (str1 == str3)
            System.out.println("str1과 str3는 저장위치(주소)가  같다.");
        else
            System.out.println("str1과 str3는 저장위치(주소)가 다르다.");

        /*
            문자열 비교시 equals 메서드를 사용하면 변수에 저장된 값을 비교함.
         */
        if (str1.equals(str2))
            System.out.println("str1과 str2는 값이 같다.");
        else
            System.out.println("str1과 str2는 값이 다르다.");

        if (str1.equals(str3))
            System.out.println("str1과 str3는 값이 같다.");
        else
            System.out.println("str1과 str3는 값이 다르다.");

        /*
            charAt : 문자열의 특정 위치index에 있는 문자를 반환
         */
        String jumin = "123456-1234567";
        if (jumin.charAt(7) == '1')  // 8번째 문자 추출
            System.out.println("남자입니다.");

        /*
            concat : 두 문자열을 하나로 이어 묶음.
            문자열에 + 연산자를 사용하면 먼저 StringBuilder로 변환한 후
            Append로 문자열을 더하고 toString으로 문자열로 변환.
            따라서 2개의 문자열을 합칠 때는 concat으로
            그 이상은 +로 합치는 것이 나을 수 있음
         */
        String a = "Hello";
        String b = "World!";
        System.out.println(a.concat(b));

        /*
            indexOf:
            특정 문자열이 처음 등장하는 위치를 알려준다.
            문자열이 존재하지 않을 경우, -1을 반환ㄷ.
         */
        String c = "Hello, World!!";
        System.out.println(c.indexOf("World!!")); //7번째

        String d = "abc123.jpg";
        System.out.println(d.indexOf('.')); //6번쩨

        String e = "123412341234";

        //시작위치 재조정 하기 위해 fromIndex
        System.out.println(e.indexOf("12"));
        System.out.println(e.indexOf("12",3));
        System.out.println(e.indexOf("12",7));
        System.out.println(e.lastIndexOf("12" )); //오른쪽 기준으로 왼족 가

        /*
            trim :  문자열 입력시 삽입된 공백을 제거
                    단, 문자열 중간에 있는 공백은 제거 안됨.
                        (--> replace() 메서드 이용해서 가능)

         */
        String f = " abc123 ";
        System.out.println("[" + f + "]" + "[" + f.trim() + "]");
        String g = " 987 xyz ";
        System.out.println("[" + g + "]" + "[" + g.trim() + "]");

        /*
            length : 문자열의 길이(갯수)를 반환하는 메서드
            문자열의 시실제 byte를 알아내려면 getbyte()를 이용해야 함.
         */
        System.out.println(a.length());
        System.out.println(c.length());
        System.out.println(e.length());
        String h = "안녕하세요 자바!!";
        System.out.println(h.length());
        System.out.println(h + "는 " + h.getBytes().length + "byte.");

        /*
            toLower case, toUpperCAese
         */
//        System.out.println(.toUppercCae);

        /*
            split :
                    특정 문자를 기준으로 문자열을 잘라서 배열에 넣어주는 메서드
         */
        String k = "혜교 78 56 12";
        String[] datas = k.split(" ");
        for (int z=0 ; z< datas.length;++z)
            System.out.print(datas[z]);
        System.out.println("");

        /*
            replace : 특정 문자열을 다른 문자열로 바꾸는 메서드
            replace(기존문자, 바꿀문자)
         */
        System.out.println(
                h.replace("자바", "파이썬")
        );//"안녕하세요 자바!!"을 "안녕하세요 파이썬!!"으로 변경

        System.out.println(
                e.replace("12","98")
        );//123412341234에서 12를 98로 변경

        String m = "1234-4567-9812";
        System.out.println(
                m.replace("-",":")
        );//"1234-4567-9812"를 "1234:4567:9812"로 변경



        /*
            hello, java!!라는 문자열에서 각 단어의 첫글자를 대문자로 만드는 코드를 만들자.
         */

        //내 버전
        String l = "hello, java!!";
        String[] words = l.split(" ");

        System.out.println(words[0]);
        System.out.println(words[1]);

        System.out.print(
            (words[0].charAt(0) + "").toUpperCase()
            ); //"H"

        for (int zz=1; zz < words[0].length(); ++zz){
            System.out.print(words[0].charAt(zz));
        } //"ello, "

        System.out.print(
                (words[1].charAt(0) + "").toUpperCase()
            ); //"J"

        for (int zz=1; zz < words[1].length(); ++zz){
            System.out.print(words[1].charAt(zz));
        } //"ava!!"


        //선생님 버전
        String word1 = (words[0].charAt(0) + "").toUpperCase();
        String word2 = (words[0].charAt(0) + "").toUpperCase();

        l = l.replace("h", word1);
        l = l.replace("j", word2);
        System.out.println(l);



        /*
            substring : 문자열의 시작 위치부터 끝위치-1까지의 문자열을 추출하는 메서드

            문자열을 추출하는 메서드
            substring(시작)
            substring(시작, 끝-1

            예제)     주민번호에서 생년월일을 추출해 봄
         */
        System.out.println(
                jumin.substring(0,6)
        );

        //생년월일을 제외한 나머지를 추출해 봄.
        System.out.println(
                jumin.substring(7, 14)
        ); //7번째 자리부터 14번째 자리까지를 다 가져옴.
        System.out.println(
                jumin.substring(7)
        ); //7번째 자리 이후 모두를 다 가져옴.



        /*
            valueOf : 숫자를 문자형으로 변환시 사용.
         */
        int height = 123;
        System.out.println(height + "");
        System.out.println(String.valueOf(height));
        System.out.println(Integer.toString(height));


        /*
            format : c언어의 printf처럼 서식 문자열을 이용해서
                    변수들과 문자열을 조합해서 문자열을 생성하는 메서드

                    반면, system.out.printf 메서드는 생성된 문자열을
                    화면에 출력하는데 사용하는 메서드임.
         */
        Date today = new Date();

        // %tY : year
        // %tm : month
        // %td :  day
        // %tH :  hour
        // %tM :  minute
        // %tS :  second
        String fmt = "%tY년 %<tm월 %<td일 %<tH시 %<tM분 %<tS초 \n";  //<======== <는 today 변수 한 개에서 다 끌어온다는 의미
        String result = String.format(fmt, today);
        System.out.println(result);

        /*
            StringBuilder, StringBuffer

            String 객체는 불변객체이므로 새로운 문자열이 추가되면 기존 공간 대신
            새로운 공간을 생성한 후 추가함. => 메모리 낭비가 심함.

            StringBuilder나 StringBuffer를 이용하면
            기존 공간에 새로운 문자열을 바로 추가할 수 있으므로
            메모리를 절약할 수 있음.

            따라서, + 를 이용해서 문자열을 결합하는 것보다는
            StringBuilder를 이용하는 것이 더 나음.
         */
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ").append("World").append("!!");
        System.out.println(sb.toString()); //StringBuilder로 작성했으므로 toString()을 받드시 호출해야 함.




    }//main

}//class JavaString
