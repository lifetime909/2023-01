package ch06.accessModifier;

import ch06.accessModifier.test.*;

public class Test {
    public static void main(String[] args) {
        AccessModifierTest01 amf1 = new AccessModifierTest01();

        // amf1.privateVariable = 100; //private member는 클래스 밖에서 접근 안됨.
        amf1.defaultVariable = 200; // default member는 동일 패키지에서 접근할 수 있음.
        amf1.protectedVariable = 300; // protected member는 동일 패키지에서 접근할 수 있음.
        amf1.publicVariable = 400; // public member는 어디서든 접근할 수 있음.

        amf1.print();

        AccessModifierTest02 amf2 = new AccessModifierTest02();

        // amf2.privateVariable = 100; //private member는 클래스 밖에서 접근 안됨.
        // amf2.defaultVariable = 200; // default member는 동일 패키지에서 접근할 수 있음.
        // amf2.protectedVariable = 300; // protected member는 동일 패키지에서 접근할 수 있음.
        amf2.publicVariable = 400; // public member는 어디서든 접근할 수 있음.

        amf2.print();
    }
}
