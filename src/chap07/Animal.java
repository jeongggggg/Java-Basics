package chap07;

public class Animal {
    String name;
    
    // 객체 생성 순서 확인
    Animal(){
        System.out.println("Animal 객체 생성");
    }

    void setName(String name){
        this.name = name;
    }

    void sleep(){
        System.out.println(this.name + " Zzz...");
    }
}
