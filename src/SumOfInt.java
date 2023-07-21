
public class SumOfInt
{
    static int value = 1;
    public static void main(String[] args) {
        sum(5);
    }
    public static void sum(int a){
        if(a==0){
            System.out.println(value); //Prints sum after the numbers are added togethe ( if a = 0 )
            return;
        }
        value = value + a; // updates value to value + starting value
        sum(a-1); // updates starting value
    }
}
