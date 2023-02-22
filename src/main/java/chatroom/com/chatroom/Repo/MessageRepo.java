package chatroom.com.chatroom.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import chatroom.com.chatroom.Entity.Message;

public interface MessageRepo extends JpaRepository<Message,String>{
    
}
