package chap07;

public class Animal {
    String name;

    void setName(String name){
        this.name = name;
    }

    void sleep(){
        System.out.println(this.name + " Zzz...");
    }
}
