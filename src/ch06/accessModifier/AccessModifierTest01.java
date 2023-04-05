package ch06.accessModifier;

public class AccessModifierTest01 {
    private int privateVariable;
    int defaultVariable;
    protected int protectedVariable;
    public int publicVariable;

    public void print() {
        System.out.println("privateVariable : " + privateVariable);
        System.out.println("defaultVariable : " + defaultVariable);
        System.out.println("protectedVariable : " + protectedVariable);
        System.out.println("pulicVariable : " + publicVariable);
    }
}
