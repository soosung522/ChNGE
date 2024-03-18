   import java.util.Scanner;
   public class Code02_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double num;
        System.out.println("실숫를 입력하세요 :");
        num = s.nextDouble();
        System.out.println("실숫를 입력하세요 ==> " + num);

        String str;
        System.out.println("문자열을 입력하세요 : ");
        str = s.next();
        System.out.println("사용자가 입력한 값 ==> " + str);

        s.close();


    }

}
