package calculator;

public class NewMain {

    public static void main(String[] args) {
        Calculation calcOne = new Calculation(new IntValue(6), new Operator("+"), new IntValue(10) );
        System.out.println(calcOne.display());

        Calculation calcTwo = new Calculation(calcOne, new Operator("-"), new IntValue(5) );
        System.out.println(calcTwo.display());

    }


}
