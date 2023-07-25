public class P1 {
    // Public
    public int publicVar = 10; // makes a public variable and sets it to 10
    public void publicMethod() {
        System.out.println("This is a public method");
    } // makes a public method

    // Default
    int defaultVar = 20; // makes a variable and sets it to 20
    void defaultMethod() {
        System.out.println("This is a default method");
    } // makes a method

    // Protected
    protected int protectedVar = 30; // makes a protected variable and sets it to 30
    protected void protectedMethod(){
        System.out.println("This is a protected method");
    } // makes a protected method

    // Private
    private int privateVar = 40; // makes a private variable and sets it to 40
    private void privateMethod() {
        System.out.println("This is a private method");
    } // makes a private method

    public static void main(String[] args){
        P1 priv = new P1();
        System.out.println("Private Variable: " + priv.privateVar);
        priv.privateMethod();
    }
}
