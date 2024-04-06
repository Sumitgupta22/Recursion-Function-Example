// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
class Demo{
  public static void printnumber(int a){
    //base condition 
    if(a==0){
      return;
    }
   printnumber(a-1);

 }
}
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Demo obj = Demo()
    obj.printnumber(10);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}