package se.iths.ellinor.emailmicroservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import se.iths.ellinor.emailmicroservice.service.EmailService;
import se.iths.johan.springmessenger.service.MessageService;

@SpringBootTest
class EmailMicroserviceApplicationTests {

    @MockitoBean
    private MessageService messageService;

    @MockitoBean
    private EmailService emailService;



    @Test
    void contextLoads() {

    }

}
