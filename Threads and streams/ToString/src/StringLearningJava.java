import java.util.Objects;

public class StringLearningJava {
    int price;

    @Override
    public String toString() {
        return "hello";
    }

    @Override
    public boolean equals(Object o) {


        StringLearningJava that = (StringLearningJava) o;
      if(this.price< that.price){
          return  true;
      }
      return  false;
    }

    @Override
    public int hashCode() {
            return 129;
    }

    public static void main(String[] args){
//      String st = new String();
//      System.out.println("Hash code of"+st);


      StringLearningJava sl1=new StringLearningJava();
      System.out.println("Hash code of "+sl1);
      sl1.price=1000;

      StringLearningJava sl2=new StringLearningJava();
      System.out.println("Hash code of "+sl2);
      sl2.price=2000;

        System.out.println( sl1.equals(sl2));




  }
}
