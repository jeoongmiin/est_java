package java_0617;

public class Test1 {
    public static void main(String[] args) {
        Phone applePhone = new ApplePhone();
        Phone samsungPhone = new SamsungPhone();

        System.out.println(applePhone.call());
        System.out.println(samsungPhone.call());

        System.out.println(applePhone.answerThePhone());
        System.out.println(samsungPhone.answerThePhone());
    }
}