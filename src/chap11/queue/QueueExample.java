package chap11.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail", "길동이"));
        messageQueue.offer(new Message("sendSms", "길동삼"));
        messageQueue.offer(new Message("sendKakaoTalk", "길동사"));

        // switch~case 문 이용해서 특정 command일 경우 각각 출력문 다르게
        while (!messageQueue.isEmpty()) {        // 메시지 큐가 비었는지 확인
            Message message = messageQueue.poll(); // 메시지 큐에서 하나의 메시지 꺼냄
            switch (message.getCommand()) {
                case "sendMail":
                    System.out.println(message.getTo() + "에게 메일을 보냅니다.");
                    break;
                case "sendSms":
                    System.out.println(message.getTo() + "에게 SMS를 보냅니다.");
                    break;
                case "sendKakaoTalk":
                    System.out.println(message.getTo() + "에게 카톡을 보냅니다.");
                    break;
            }
        }
    }
}
