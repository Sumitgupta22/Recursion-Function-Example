// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
class Demo{
  
  public static void printnumber(int a){
    //base condition 
    if(a==0){
      return;
    }
    System.out.println(a);
   printnumber(a-1);

 }
  public static void sumofnumber(int i,int n,int sum){
    if(n==i){
      sum+=n;
      System.out.println(sum);
      
      return;
    }
    sum+=i;
    sumofnumber(i+1,n,sum);
  }
  public static int cal_factorial(int a){
   if(a==0 || a==1){
     return 1;
   }
    int fect = cal_factorial(a-1);
    int fact1 = a*fect;
    return fact1;
  }
  public static void print_fibo(int a,int b,int n){
    if(n==0){
      return;
    }
    int c = a+b;
    System.out.println(c);
    print_fibo(b,c,n-1);
  }
  public static int cal_power(int a,int b){
    if(b==0){
      return 1;
    }
    if(a==0){
      return 0;
    }
    int powern_1 = cal_power(a,b-1);
    int power = a*powern_1;
    return power;
  }
}
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Demo obj = new Demo();
    //print numbers
    obj.printnumber(10);
    //Sum of N number 
    obj.sumofnumber(1,5,0);
    //Factoial
    System.out.println(obj.cal_factorial(5));
    //Fhibonacci series
    System.out.println("Fhibonacci series");
    System.out.println(0);
    System.out.println(1);
    obj.print_fibo(0,1,10-2);
    //print x^n (Height= n)
    System.out.println("print x^n \n"+obj.cal_power(2,5));
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}