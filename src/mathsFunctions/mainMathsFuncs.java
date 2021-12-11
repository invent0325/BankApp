package mathsFunctions;

import javax.security.auth.Subject;

public class mainMathsFuncs {
    public static void main(String[] args) {

        System.out.println("entering in the mathCode class");

        mathsCode.addNumbers(10, 29);
        mathsCode.deductNumbers(40, 21);
        mathsCode.divideNumbers(20, 10);
        mathsCode.multiplyNumbers(5, 10);

        Subjects sbMaths = new Subjects("Maths", "Molly", 90, 35);
        Subjects sbChemics = new Subjects("Chemistry", "John", 50, 40);

        System.out.println(sbMaths);
        System.out.println(sbChemics);
    }
}
