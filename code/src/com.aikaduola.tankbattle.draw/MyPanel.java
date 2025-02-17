package com.aikaduola.tankbattle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyPanel extends JPanel implements KeyListener {

    private Tank hero;

    /** 坦克起点坐标 */
    private int x = 100;
    private int y = 100;

    public MyPanel() {
        hero = new Tank(x, y);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawTank(g, hero.getX(), hero.getY(), hero.getDirection(), 0);
        hero.setSpeed(5);
    }

    public void drawTank(Graphics g, int x, int y, int direction, int type) {
        switch (type) {
            case 0:
                g.setColor(Color.CYAN);
                break;
            case 1:
                g.setColor(Color.YELLOW);
                break;
        }

        switch (direction) {
            case 1: // 向右
                g.fill3DRect(x, y, 60, 10, false); // 坦克的左轮
                g.fill3DRect(x, y + 30, 60, 10, false); // 坦克的右轮
                g.fill3DRect(x + 10, y + 10, 40, 20, false); // 坦克的中间
                g.fillOval(x + 20, y + 10, 20, 20); // 坦克的盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20); // 坦克的炮桶
                break;
            case 2: // 向下
                g.fill3DRect(x, y, 10, 60, false); // 坦克的左轮
                g.fill3DRect(x + 30, y, 10, 60, false); // 坦克的右轮
                g.fill3DRect(x + 10, y + 10, 20, 40, false); // 坦克的中间
                g.fillOval(x + 10, y + 20, 20, 20); // 坦克的盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60); // 坦克的炮桶
                break;
            case 3: // 向左
                g.fill3DRect(x, y, 60, 10, false); // 坦克的左轮
                g.fill3DRect(x, y + 30, 60, 10, false); // 坦克的右轮
                g.fill3DRect(x + 10, y + 10, 40, 20, false); // 坦克的中间
                g.fillOval(x + 20, y + 10, 20, 20); // 坦克的盖子
                g.drawLine(x + 30, y + 20, x, y + 20); // 坦克的炮桶
                break;
            default: // 默认方向为上
                g.fill3DRect(x, y, 10, 60, false); // 坦克的左轮
                g.fill3DRect(x + 30, y, 10, 60, false); // 坦克的右轮
                g.fill3DRect(x + 10, y + 10, 20, 40, false); // 坦克的中间
                g.fillOval(x + 10, y + 20, 20, 20); // 坦克的盖子
                g.drawLine(x + 20, y + 30, x + 20, y); // 坦克的炮桶
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                hero.moveUp();
                hero.setDirection(0);
                break;
            case KeyEvent.VK_RIGHT:
                hero.moveRight();
                hero.setDirection(1);
                break;
            case KeyEvent.VK_DOWN:
                hero.moveDown();
                hero.setDirection(2);
                break;
            case KeyEvent.VK_LEFT:
                hero.moveLeft();
                hero.setDirection(3);
                break;
         }
//        System.out.println("key = " + e.getKeyChar());
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
