package ch06.accessModifier.test;

import ch06.accessModifier.*;

class test01NotExtends { // 다른 패키지에서의 패키지 생성 후 접근
    AccessModifierTest01 amf = new AccessModifierTest01();

    public void print() {
        // System.out.println("privateVariable : " + amf.privateVariable); // 접근 불가 ALl
        // 거부
        // System.out.println("defaultVariable : " + amf.defaultVariable); // 다른 패키지에서의
        // 접근 거부
        // System.out.println("protectedVariable : " + amf.protectedVariable); // 다른
        // 패키지에서 상속된 클래스가 아닌 이상 접근 거부
        System.out.println("publicVariable : " + amf.publicVariable); // All 허용
    }
}

class test01 extends AccessModifierTest01 { // 다른 패키지에서의 상속 후 접근
    public void print() {
        // System.out.println("privateVariable : " + privateVariable);// 접근 불가 ALl 거부
        // System.out.println("defaultVariable : " + defaultVariable); // 다른 패키지에서의 접근
        // 거부
        System.out.println("protectedVariable : " + protectedVariable); // 다른 패키지에서 상속 했을 경우 접금 허용
        System.out.println("publicVariable : " + publicVariable); // All 허용
    }
}

class test02 extends AccessModifierTest02 { // 같은 패키지에서의 상속 후 접근
    public void print() {
        // System.out.println("privateVariable : " + privateVariable); // 접근 불가 ALl 거부
        System.out.println("defaultVariable : " + defaultVariable); // 같은 패키지 접근 허용
        System.out.println("protectedVariable : " + protectedVariable); // 같은 패키지 접근 허용
        System.out.println("publicVariable : " + publicVariable); // All 허용
    }
}

class test02NotExtends { // 같은 패키지에서의 클래스 생성 후 접근
    AccessModifierTest02 amf = new AccessModifierTest02();

    public void print() {
        // System.out.println("privateVariable : " + amf.privateVariable); // 접근 불가 ALl
        // 거부
        System.out.println("defaultVariable : " + amf.defaultVariable); // 같은 패키지 접근 허용
        System.out.println("protectedVariable : " + amf.protectedVariable); // 같은 패키지 접근 허용
        System.out.println("publicVariable : " + amf.publicVariable); // All 허용
    }
}

class test03NotExtends { // 다른 패키지에서 상속된 클래스 생성 후 접근
    AccessModifierTest03 amf = new AccessModifierTest03();

    public void print() {
        // System.out.println("privateVariable : " + amf.privateVariable); // 접근 불가 ALl
        // 거부
        // System.out.println("defaultVariable : " + amf.defaultVariable); // 접근이 되는
        // 클래스의 인스턴스는 접근 가증
        // System.out.println("protectedVariable : " + amf.protectedVariable); // 같은 패키지
        // 접근 허용
        System.out.println("publicVariable : " + amf.publicVariable); // All 허용
    }
}