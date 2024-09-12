package chap10.generic;

public class Box<T> {
    private T Object;

    public void set(T object){
        this.Object = object;
    }

   public T get(){
       return this.Object;
   }
}
