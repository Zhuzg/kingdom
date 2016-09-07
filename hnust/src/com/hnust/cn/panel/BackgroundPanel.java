package com.hnust.cn.panel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JPanel;
/**
 * ��Ȩ����: ����ʡ���տƼ����޹�˾
 * 
 * ������ڣ� 2010-09-15
 * 
 * ��Ŀ������ ��̴ʵ�
 * 
 * ���������� www.mingribook.com
 * 
 * ѧϰ������ www.mrbccd.com
 *
 */
public class BackgroundPanel extends JPanel {
    private Image image; // ����ͼ�����
    public BackgroundPanel(Image image) {
        super(); // ���ó���Ĺ��췽��
        this.image = image; // Ϊͼ�����ֵ
    }
    /*
     * ��дpaintComponent����
     */
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // ���ø���ķ���
        Graphics2D g2 = (Graphics2D) g; // ����Graphics2D����
        if (image != null) {
            int width = getWidth(); // ������Ŀ��
            int height = getHeight(); // ������ĸ߶�
            // ����ͼ��
            g2.drawImage(image, 0, 0, width, height, this);
        }
    }
}
