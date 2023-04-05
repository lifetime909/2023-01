package ch06.accessModifierTest;

import ch06.accessModifier.AccessModifierTest01;

public class Test {
    public static void main(String[] args) {
        AccessModifierTest01 amf = new AccessModifierTest01();

        //amf.privateVariable = 100; //private member는 클래스 밖에서 접근 안됨.
        //amf.defaultVariable = 200; //default member는 동일 패키지에서 접근할 수 있음.
        //amf.protectedVariable = 300; //protected member는 동일 패키지에서 접근할 수 있음.
        amf.publicVariable = 400; //public member는 어디서든 접근할 수 있음.

        amf.print();
    }
}
