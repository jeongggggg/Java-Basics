package chap06.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD})
// 어노테이션 형태로 사용할 것이라 @를 붙혀준다.
public @interface AnnotationName {
    String elementNameOne(); // 구현부가 없는 메서드로 정의
    int elementNameTwo() default 5; // 아무런 값도 설정하지 않았을 때는 5라는 값이 들어가도록 default 값 설정
}
