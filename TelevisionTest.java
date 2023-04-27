public class TelevisionTest {
  public static void main(String[] args) {

    // 서로 다른 객체를 나타냄
    Television mytv = new Television();
    Television yourtv = new Television();

    mytv.channel = 8;
    mytv.volum = 9;
    mytv.onOff = true;

    yourtv.channel = 10;
    yourtv.volum = 11;
    yourtv.onOff = true;

    // mytv
    System.out.println("나의 텔레비전 채널번호:" + mytv.channel + "이다");
    System.out.println("나의 텔레비전 볼륨:" + mytv.volum + "이다");

    // yourtv
    System.out.println("너의 텔레비전 채널번호:" + yourtv.channel + "이다");
    System.out.println("너의 텔레비전 볼륨:" + yourtv.volum + "이다");

  }

}
