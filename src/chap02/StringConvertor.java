package chap02;

public class StringConvertor {
    public static void main(String[] args) {
        // String -> 숫자 변환
        String str = "12345";

        int primitiveSrt = Integer.parseInt(str); // int 로 변환

        int sum = primitiveSrt + 1; // 12346 변환을 안했다면 123451
        Integer wrapperStr = Integer.valueOf(str); // Integer 로 변환

        // String -> long / Long
        long primitiveLong = Long.parseLong(str); // long 타입으로 변환
        Long wrapperLong = Long.valueOf(str); // Long 타입으로 변환

        String value = "10000.345";

        // String -> float / Float
        float primitiveFloat = Float.parseFloat(value); // float 타입으로 변환
        Float wrapperFloat = Float.valueOf(value); // Float 타입으로 변환

        // String -> double / Double
        double primitiveDouble = Double.parseDouble(value); // double 타입으로 변환
        Double wrapperDouble = Double.valueOf(value); // Double 타입으로 변환

        // 숫자 -> 문자 형변환
        int intValue = 10; // 10 -> "10"
        String s1 = intValue + "";
        String s2 = Integer.toString(intValue);
        String s3 = String.valueOf(intValue);

        System.out.println(s1.getClass().getName());
        System.out.println(s2.getClass().getName());
        System.out.println(s3.getClass().getName());
    }
}
