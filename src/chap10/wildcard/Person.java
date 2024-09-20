package chap10.wildcard;

public class Person {
    private String name;

    // 생성자는 리턴 타입이 없어도 된다.
    public Person(String name){
        this.name = name;
    }

    // 메서드는 리턴 타입이 있어야 한다.
    public String getName() {
        return name;
    }

    // toString 재정의, 해쉬값이 아닌 이름이 출력될 수 있도록
    @Override
    public String toString() { // Object 에서 물려 받음
        // return super.toString(); // 부모의 toString 출력
        return name; // 입력 받은 이름을 바로 리턴할 수 있게 return getName 으로 해도 됨
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }

   @Override
    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person person = (Person) obj;
            return person.name.equals(name);
        } else{
            return super.equals(obj);
        }
   }
}
