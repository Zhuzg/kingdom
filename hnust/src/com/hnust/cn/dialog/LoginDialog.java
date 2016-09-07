package com.hnust.cn.dialog;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import com.hnust.cn.frame.HomePage;
import com.hnust.cn.panel.BackgroundPanel;


public class LoginDialog extends JDialog{
	private URL url = null;
	private Image image=null;
	private BackgroundPanel jContentPane=null;
	private JTextField tf_user = null;
	private JPasswordField pf_pwd = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JPanel jPanel = null;
	private JButton btn_ok = null;
	private JButton jButton1 = null;
	private JLabel jLabel2 = null;
	
	public LoginDialog() {
		super();
		init();
	}
	
	private void init() {
		this.setSize(300, 200);
		Toolkit tookit = this.getToolkit();
		Dimension dm = tookit.getScreenSize();
		this.setLocation((dm.width - this.getWidth())/2, (dm.height-this.getHeight())/2);
		this.setContentPane(getJContentPane());
		this.setTitle("资金转入转出系统");
		this.setVisible(true);
	}
	
	private JPanel getJContentPane() {
		if(jContentPane == null) {
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.gridx = 0;
			gridBagConstraints5.weightx = 1.0D;
			gridBagConstraints5.weighty = 1.0D;
			gridBagConstraints5.fill = GridBagConstraints.BOTH;
			gridBagConstraints5.gridwidth = 2;
			gridBagConstraints5.gridy = 0;
			jLabel2 = new JLabel();  
			jLabel2.setText("操作员登录");
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.gridx = 0;
			gridBagConstraints4.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints4.gridwidth = 2;
			gridBagConstraints4.insets = new Insets(8, 0, 8, 0);
			gridBagConstraints4.weightx = 1.0D;
			gridBagConstraints4.gridy = 3;
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.gridx = 0;
			gridBagConstraints3.insets = new Insets(12, 10, 0, 0);
			gridBagConstraints3.gridy = 2;
			jLabel1 = new JLabel();
			jLabel1.setText("用   户");
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 0;
			gridBagConstraints2.insets = new Insets(12, 10, 0, 0);
			gridBagConstraints2.gridy = 1;
			jLabel = new JLabel();
			jLabel.setText("密   码");
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints1.gridy = 2;
			gridBagConstraints1.weightx = 0.0D;
			gridBagConstraints1.insets = new Insets(10, 10, 0, 10);
			gridBagConstraints1.gridx = 1;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints.gridy = 1;
			gridBagConstraints.weightx = 0.0D;
			gridBagConstraints.insets = new Insets(10, 10, 0, 10);
			gridBagConstraints.gridx = 1;
		    url = LoginDialog.class.getResource("/image/login.jpg");  // ���ͼƬ��URL
            image=new ImageIcon(url).getImage();                       // ����ͼ����� 
		    jContentPane=new BackgroundPanel(image);                   // �����������
			jContentPane.setLayout(new GridBagLayout());
			jContentPane.add(getTf_user(), gridBagConstraints);
			jContentPane.add(getPf_pwd(), gridBagConstraints1);
			jContentPane.add(jLabel, gridBagConstraints2);
			jContentPane.add(jLabel1, gridBagConstraints3);
			jContentPane.add(getJPanel(), gridBagConstraints4);
			jContentPane.add(jLabel2, gridBagConstraints5);
		}
		return jContentPane;
	}
	
	private JTextField getTf_user() {
		if (tf_user == null) {
			tf_user = new JTextField();
		}
		return tf_user;
	}
	
	private JPasswordField getPf_pwd() {
		if (pf_pwd == null) {
			pf_pwd = new JPasswordField();
			pf_pwd.setEchoChar('*');
		}
		return pf_pwd;
	}
	
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel();
			jPanel.setOpaque(false);
			jPanel.setLayout(new FlowLayout());
			jPanel.add(getBtn_ok(), null);
			jPanel.add(getJButton1(), null);
		}
		return jPanel;
	}
	 private JButton getBtn_ok() {
        if (btn_ok == null) {
            btn_ok = new JButton();
            btn_ok.setText("确定");
            btn_ok.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    String user = tf_user.getText().trim();
                    String pwd = new String(pf_pwd.getPassword());
                   if(user.equals("8888") && pwd.equals("888888")) {
                	   HomePage homePage = new HomePage();
                	   dispose();  //释放窗口
                   } else {
                	   JOptionPane.showMessageDialog(null, "用户名或密码输入错误，请重新输入！");
                   }
    				
                }
            });
        }
        return btn_ok;
	  }
	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("退出");
			jButton1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.exit(0);
				}
			});
		}
		return jButton1;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new LoginDialog();
			}
		});
	}
	
	
}
