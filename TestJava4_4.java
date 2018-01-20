//局部变量
//以下程序说明了局部变量的使用方法
public class TestJava4_4
{
  public static void main(String[] args)
  {
    int sum=0;
    //下面是for循环的使用，计算1~5数字累加之和
    for(int i=1;i<=5;i++)
    {
      sum=sum+i;
        System.out.println("i="+i+",sum="+sum);
    }
  }
}
