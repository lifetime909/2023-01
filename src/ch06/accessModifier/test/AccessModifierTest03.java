package ch06.accessModifier.test;

import ch06.accessModifier.AccessModifierTest01;

public class AccessModifierTest03 extends AccessModifierTest01 {

    public void print() {
        // System.out.println("privateVariable : " + privateVariable);
        // System.out.println("defaultVariable : " + defaultVariable);
        System.out.println("protectedVariable : " + protectedVariable);
        System.out.println("pulicVariable : " + publicVariable);
    }
}
