package chap10.generic;

public class Box<T> {
    private T Object;

   public T get(){
       return Object;
   }

   public void set(T Object){
        this.Object = Object;;
   }
}
