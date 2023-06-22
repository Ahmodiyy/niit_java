package anonymous;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ButtonEvent {

    JButton jButton = new JButton();
    JButton jButton1 = new JButton();
    void btcEvent(){
        jButton.addActionListener(new ActionClick());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

    }
}
