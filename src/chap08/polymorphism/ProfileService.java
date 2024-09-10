package chap08.polymorphism;

public class ProfileService {
    ProfileRepository repository; // 객체 생성
    void saveProfile(){
        // 만약 다른 저장소가 추가된다면 객체 생성부만 바꿔끼우면 됨
        repository = new ProfileDBRepository();
        repository.save();
    }

    // 인터페이스의 다형성으로 코드의 변형 없이 레파지토리를 추가할 수 있음
    void saveProfile(ProfileRepository repository){
        repository.save();
    }
}
