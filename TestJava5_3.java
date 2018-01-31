public class TestJava5_3
{
  public static void main(String args[])
  {
    int int_max=java.lang.Integer.MAX_VALUE;//得到整形的最大值
    //int int_max=Integer.MAX_VALUE;//与上一句工能相同
    System.out.println("INT的最大值"+int_max);
  }
}
//
public class ShortDemo2
{
  public static void main(String args[])
  {
    int max=Integer.MAX_VALUE;//取得int的最大值
    int min=Integer.MIN_VALUE;//取得int的最小值
    System.out.println(max);//最大值：
    Ststem.out.println(min);//最小值：
    System.out.println(max+1);//得到最小值
    System.out.println(max+2);//相当于最小值+1
    System.out.println(min-1);//得到最大值
  }
}
