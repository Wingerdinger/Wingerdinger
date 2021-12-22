//Author Wing Sun Au
//Created Date 12/21/2021
package SnakeGame;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
    
    GameFrame(){
        
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

}
