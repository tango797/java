package complexNumbers;

public class ComplexNumbers {

    public static void main(String[] args) {
        Complex num = new Complex(2, 4);
        Complex num2 = new Complex(3,3);
        num.print();
        num2.print();
        num.add(num2).print();
    }
}

    class Complex{

        int a;
        int b ;

       Complex(int a , int b) {
            this.a =a;
            this.b=b;

        }

       void print(){
           System.out.println(a+"+"+(b+"i"));
        }

        Complex add(Complex num2){

           return  new Complex(this.a+ num2.a,this.b+ num2.b)  ;
       }


    }

