package chap06.annotation;

@AnnotationName(elementNameOne = "값", elementNameTwo = 40)
public class ClassName {
    
    @AnnotationName(elementNameOne = "값")
    int field;

    int getField(){
        return field;
    }

    void setField(int field){
        this.field = field;
    }

    @AnnotationName(elementNameOne = "값") // AnnotationName.java의 target에서 메서드 부분을 지우게 된다면 에러 발생
    void method(){

    }
}
