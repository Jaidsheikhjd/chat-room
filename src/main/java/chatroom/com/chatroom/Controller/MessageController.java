package chatroom.com.chatroom.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//  import java.lang.InterruptedException;
import chatroom.com.chatroom.Entity.Message;
import chatroom.com.chatroom.Repo.MessageRepo;

@RestController
public class MessageController {

    @Autowired
    private MessageRepo messageRepo;

    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    public Message getContent(@RequestBody Message message) {
                
 
System.out.println(message);
    //    try {
    //       messageRepo.save(message);
    //        //processing
    //        Thread.sleep(2000);

    //    } catch (InterruptedException e) {
    //        e.printStackTrace();
    //    }          
        return message;
    }

}