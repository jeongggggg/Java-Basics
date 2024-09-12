package chap09;

public class TryWithResourceSample2 {
    public static void main(String[] args) {
        try(FileStream stream = new FileStream("example.txt")){
            stream.read();
        } catch (Exception e){
            System.out.println(e.getMessage()); // 예외 상황 발생시 catch
        } finally {
            System.out.println("완료");
        }
    }
}
