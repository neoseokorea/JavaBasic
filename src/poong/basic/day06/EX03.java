package poong.basic.day06;

public class EX03 {
    public static void main(String[] args) {
        //배열 다루는 예제 1 (연습문제 54)
//        char [] letter = {'a', 'b', 'c'};
//        for ( int index = 0; index < letter.length; index++)
//            System.out.print(letter[index] + ", ");

//        char [] letter;       //배열변수 선언
//        letter = new char[3]; //문자 3개를 저장할 수 있는 배열 정의
//        letter[0] = 'a';
//        letter[1] = 'b';
//        letter[2] = 'c';
        char[] letter = {'a', 'b', 'c'};

        for (int i = 0; i < 3; ++i) {
            System.out.print(letter[i] + ", ");
        }

        //배열 다루는 예제 2
        double[] a = {1.1, 2.2, 3.3};
        System.out.println(a[0] + " " + a[1] + " " + a[2]);

        a[1] = a[2];
        System.out.println(a[0] + " " + a[1] + " " + a[2]);

        System.out.println(); //줄바꿈

        //배열 다루는 예제 3
        int[] sampleArray = new int[10];
        //배열의 인덱스 범위는 0 ~ 9(10개)
//        for(int idx = 1; idx <= sampleArray.length; ++idx) {
//            sampleArray[idx] = 3 * idx;
//        }
            //반복문 인덱스 범위는 1 ~ 10(10개) => ArrayIndexOutOfBoundsException 에러를 발생시킴.
        for(int idx = 1; idx < sampleArray.length; ++idx) {
            sampleArray[idx] = 3 * idx;
            // [][3][6][9][12] [15][18][21][24][27]
        }


        for(int idx = 1; idx < sampleArray.length; ++idx) {
            System.out.print(sampleArray[idx] + ", ");
        }
        System.out.println(); //줄바꿈

        // 배열에 정의하고 값 저장하기 1
        int[] num1 = new int[10];
//        num1[0] = 1;
//        num1[1] = 2;
//        num1[2] = 3;
//        num1[3] = 4;
//        num1[4] = 5;
//        num1[5] = 6;
//        num1[6] = 7;
//        num1[7] = 8;
//        num1[8] = 9;
//        num1[9] = 10;
//        System.out.print(num1[0]);
//        System.out.print(num1[1]);
//        System.out.print(num1[2]);
//        System.out.print(num1[3]);
//        System.out.print(num1[4]);
//        System.out.print(num1[5]);
//        System.out.print(num1[6]);
//        System.out.print(num1[7]);
//        System.out.print(num1[8]);
//        System.out.print(num1[9]);

//        for(int i = 1;i < num1.length; ++i) {
//            num1[i-1] = i;
//            //[1][2][3][4][5] [][][][][]
//        }

        for(int i = 0;i < num1.length; ++i) {
            num1[i] = i + 1;  //
        }

        for(int i = 0;i < num1.length; ++i) {
            System.out.print(num1[i] + ", ");
        }
        System.out.println(); //줄바꿈


        // 배열에 정의하고 값 저장하기 4
        // 배열에 정의하고 값 저장하기 5





//        55. 다음 값들을 배열에 저장하는 프로그램을 작성하여라
//
//        가. 1 2 3 4 5 6 7 8 9 10
//
//        나. 0 2 4 6 8 10 12 14 16 18 20
//
//        다. 1 4 9 16 25 36 49 64 81 100
//
//        라. 0 0 0 0 0 0 0 0 0 0
//
//        마. 1 4 9 16 9 7 4 9 11




// 배열에 정의하고 값 저장하기 1
//        가. 1 2 3 4 5 6 7 8 9 10

        for(int i = 0;i < num1.length; ++i) {
            num1[i] = i + 1;  //
        }

        for(int i = 0;i < num1.length; ++i) {
            System.out.print(num1[i] + ", ");
        }
        System.out.println(); //줄바꿈


// 배열에 정의하고 값 저장하기 2
//        나. 0 2 4 6 8 10 12 14 16 18 20
        int[] num2 = new int[11];

        for(int i = 0;i < num2.length; ++i) {
            num2[i] = i * 2;  //
        }

        for(int i = 0;i < num2.length; ++i) {
            System.out.print(num2[i] + ", ");
        }
        System.out.println(); //줄바꿈


// 배열에 정의하고 값 저장하기 3

        //        다. 1 4 9 16 25 36 49 64 81 100
        int[] num3 = new int[10 ];

        for(int i = 0;i < num3.length; ++i) {
            num3[i] = (i+1) * (i+1);  //
            num3[i] = (i+1) * (i+1);  // (int) Math.pow((i+1),2) // pow(밑수,지수) // i^2
        }

        for(int i = 0;i < num3.length; ++i) {
            System.out.print(num3[i] + ", ");
        }
        System.out.println(); //줄바꿈



// 배열에 정의하고 값 저장하기 4
//        라. 0 0 0 0 0 0 0 0 0 0
        int[] num4 = new int[10 ];

        //값을 할당하지 않고 바로 출력해본다.
        //참고: 참조 자료형 변수들은 new 연산자로 객체 생성시 미리 변수에 기본값이 할당된다.
        for(int i = 0;i < num4.length; ++i) {
            System.out.print(num4[i] + ", ");
        }
        System.out.println(); //줄바꿈



// 배열에 정의하고 값 저장하기 5
//        마. 1 4 9 16 9 7 4 9 11    //규칙이 안 보임
        int[] num5 = {1, 4, 9, 16, 9, 7, 4, 9, 11}; //규칙이 안 보여서 바로 넣음

        for (int j : num5) {
            System.out.print(j + ", ");
        }
        System.out.println(); //줄바꿈




//        56. 다음 값들을 입력했을 때, 아래의 결과를 출력하는 프로그램을 작성하여라
//        입력값 : 0  11  2  33  4  55  6  77  8  99
//        출력결과 : 99  8  77  6  55  4  33  2  11  0
        int[] num6 = {0, 11, 2, 33, 4, 55, 6, 77, 8, 99};

        //값을 할당하지 않고 바로 출력해본다.
        //참고: 참조 자료형 변수들은 new 연산자로 객체 생성시 미리 변수에 기본값이 할당된다.
        for(int i = num6.length - 1;i >= 0; --i) {
            System.out.print(num6[i] + ", ");       //index를 감소시키며 출력
        }
        System.out.println(); //줄바꿈


    }//main
}
