/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messaging.producer;

import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.InitialContext;

/**
 *
 * @author rupesh kumar
 */
public class MessageProducerForProvince {

    public static void main(String[] args) throws Exception {
        //1. get context and start connection
        InitialContext context = new InitialContext();
        QueueConnectionFactory queueConnectionFactory = (QueueConnectionFactory) context.lookup("myQueueConnectionFactory");
        QueueConnection queueConnection = queueConnectionFactory.createQueueConnection();
        queueConnection.start();
        //2. create queue session
        QueueSession queueSession = queueConnection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
        //3 get the queue object
        Queue queue = (Queue) context.lookup("myQueue");
        //4. create queueSender
        QueueSender sender = queueSession.createSender(queue);
        //5. create text message
        TextMessage textMessage = queueSession.createTextMessage();
        //6. write message
        textMessage.setText(" This is message from Rupesh-106 ");
        //7. send message
        sender.send(textMessage);
        System.out.println("Message succefully sent");
        //8. close connection
        queueConnection.close();
    }
}
