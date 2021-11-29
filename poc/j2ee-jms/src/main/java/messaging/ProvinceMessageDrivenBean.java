/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messaging;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
/**
 *
 * @author rupesh kumar
 */
public class ProvinceMessageDrivenBean implements MessageListener{

    @Override
    public void onMessage(Message message) {
        TextMessage textMessage=(TextMessage)message;
        try {
            System.out.println(textMessage.getText());
        } catch (JMSException ex) {
            Logger.getLogger(ProvinceMessageDrivenBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    
}
