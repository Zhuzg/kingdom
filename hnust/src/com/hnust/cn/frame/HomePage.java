package com.hnust.cn.frame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

import com.hnust.cn.dialog.LoginDialog;
import com.hnust.cn.panel.CheckPanel;
import com.hnust.cn.util.DictUtil;
/***
 * 首页
 * @author zhuzg
 *
 */
public class HomePage extends JFrame{

	private static final long serialVersionUID = 1L;
	private Container container = getContentPane();
	private Font f=new Font("sanserif",Font.PLAIN,12);
	
	private JMenuBar mBar = new JMenuBar();
	
	private JMenu fileMenu = new JMenu("文件");
	private JMenu helpMenu = new JMenu("帮助");
	
	private JMenuItem loginItem = new JMenuItem("操作员登录");
	private JMenuItem logoutItem = new JMenuItem("退出");
	
	private JMenuItem helpItem = new JMenuItem("关于我们");
	
	
	public HomePage() {
		// TODO Auto-generated constructor stub
		super("资金转入转出系统");
		container.setLayout(new BorderLayout());
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();   
		Rectangle bounds = new Rectangle(screenSize);   
		Insets insets = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());   
		bounds.x += insets.left;   
		bounds.y += insets.top;   
		bounds.width -= insets.left   +   insets.right;   
		bounds.height -= insets.top   +   insets.bottom;   
		setBounds(bounds); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		//固定大小
		setResizable(false);
		//全屏显示
//		GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(this);
		
		initFrame();
	
		
	}
	
	private void initDialog() {
		LoginDialog dialog = new LoginDialog();
		dialog.setAlwaysOnTop(true);
		dialog.setModal(true);
	}
	private class JMHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == loginItem) {
				
				initDialog();
			} else if(e.getSource() == logoutItem) {
				System.exit(0);
			}
		}
		
	}
	private void initFrame() {
		JMHandler Jhandler = new JMHandler();
		loginItem.addActionListener(Jhandler);
		logoutItem.addActionListener(Jhandler);
		fileMenu.add(loginItem);
		fileMenu.addSeparator();
		fileMenu.add(logoutItem);
		
		helpMenu.add(helpItem);
		
		mBar.add(fileMenu);
		mBar.add(helpMenu);
		setJMenuBar(mBar);
		
		JTabbedPane tabPanel = new JTabbedPane(JTabbedPane.LEFT);
		CheckPanel transPanel_check = new CheckPanel();   //转账签约
		
		JPanel transPanel_to = new JPanel();      //转账转入
		JLabel testText2 = new JLabel("转账转入");
		transPanel_to.add(testText2);
		JPanel transPanel_out = new JPanel();     //转账转出
		JLabel testText3 = new JLabel("转账转出");
		transPanel_out.add(testText3);
		JPanel transPanel_query = new JPanel();   //转账查询
		JLabel testText4 = new JLabel("转账查询");
		transPanel_query.add(testText4);
		JPanel transPanel_surd = new JPanel();    //转账解约
		JLabel testText5 = new JLabel("转账解约");
		transPanel_surd.add(testText5);
		tabPanel.add("转账签约", transPanel_check);
		tabPanel.add("转账转入", transPanel_to);
		tabPanel.add("转账转出", transPanel_out);
		tabPanel.add("转账查询", transPanel_query);
		tabPanel.add("转账解约", transPanel_surd);
		
		container.add(tabPanel);
		
		
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				HomePage homePage = new HomePage();
				
			}
		});
	}
	
}
