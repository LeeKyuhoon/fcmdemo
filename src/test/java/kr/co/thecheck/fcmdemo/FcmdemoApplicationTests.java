package kr.co.thecheck.fcmdemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import kr.co.thecheck.fcmdemo.service.FirebaseCloudMessageService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class FcmdemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void sendMsg() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        FirebaseCloudMessageService firebaseCloudMessageService = new FirebaseCloudMessageService(objectMapper);

        firebaseCloudMessageService.sendMessageTo("cTIloShZzUIRjsRsnzNMxI:APA91bH90Iu_j38mDus97PmZnioMhN3WjBqvfKsepASUrCu_Jh9bOdMwr8bumTplTMHJuCLQojqv1FHp0aRKzf8P2i9AJLhx9J7PxhzkZwzHfI17cRhLclOlnfzOoNm95XT-T8E2eYEp",
                "타이틀입니다.",
                "바디입니다.");


    }

}
