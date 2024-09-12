package chap09;

public class FileStream implements AutoCloseable{
    private String fileName;

    FileStream(String fileName) {
        this.fileName = fileName;
    }

    void read() throws Exception{
        System.out.println("FileStream.read() 호출 : " + fileName);
        // throw new Exception("예외 발생 상황 가정"); // 예외상황 발생 후 throw로 던져줌
    }

    // AutoCloseable 에 있는 close 메서드 반드시 호출 필요
    @Override
    public void close() throws Exception {
        System.out.println("close() 메서드 호출");
    }
}
