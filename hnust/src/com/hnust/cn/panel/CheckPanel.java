package com.hnust.cn.panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/***
 * 转账签约
 * @author zhuzg
 */
public class CheckPanel extends JPanel {
	private JLabel titleLab;
	private JLabel currencyLab;
	private JComboBox<String> currencyCom;
	private JLabel cuacctCodeLab;
	private JTextField cuacctCodeTxt;
	private JLabel fundNameLab;
	private JLabel fundNameLabInput;
	private JLabel cuacctCodeLab2;
	private JLabel cuacctCodeLabInput;
	private JLabel currencyLab2;
	private JLabel currencyLabInput2;
	private JLabel fundAvlLab;
	private JLabel fundAvlLabInput;
	private JLabel fundBlnLab;
	private JLabel fundBlnLabInput;
	private JLabel fundTrnFrzLab;
	private JLabel fundTrnFrzLabInput;
	private JLabel fundInfoLab;
	private JToggleButton jToggleBtn;
	private JLabel extOrgLab;
	private JTextField exeOrgTxt;
	private JLabel bankCodeLab;
	private JTextField bankCodeTxt;
	private JLabel banCodeAgainLab;
	private JTextField bankCodeAgainTxt;
	private JLabel remarkLab;
	private JTextField remarkTxt;
	private JButton submitBtn;
	private JButton cancelBtn;
	public CheckPanel() {
		// TODO Auto-generated constructor stub
		initComponents();
	}
	
	private void initComponents() {
		titleLab = new JLabel("转账签约");
		
        currencyLab = new JLabel("币种：");
        currencyCom = new JComboBox<String>();
		
        cuacctCodeLab = new JLabel("资金账号：");
        cuacctCodeTxt = new JTextField("test");
		
        fundNameLab = new JLabel("用户名称：");
        fundNameLabInput = new JLabel("test");
		
		cuacctCodeLab2 = new JLabel("资金账号：");
//        cuacctCodeLab2 = new JLabel("test");
        
		
        currencyLab2 = new JLabel("币种：");
        currencyLabInput2 = new JLabel("test");
		
        fundBlnLab = new JLabel("资金余额：");
		fundBlnLabInput = new JLabel("test");
		 
        fundAvlLab = new JLabel("资金可用：");
		fundAvlLabInput = new JLabel("test");
       
	    fundTrnFrzLab = new JLabel("现金可取：");
		fundTrnFrzLabInput = new JLabel("test");
       
        fundInfoLab = new JLabel("资金信息：");
        jToggleBtn = new JToggleButton("test");
       
        
        extOrgLab = new JLabel("外部机构：");
        exeOrgTxt = new JTextField("test");
		
        bankCodeLab = new JLabel("银行账号：");
        bankCodeTxt = new JTextField("test");
		
        banCodeAgainLab = new JLabel("账号验证：");
        bankCodeAgainTxt = new JTextField("test");
		
        remarkLab = new JLabel("备注：");
        remarkTxt = new JTextField("test");
		
        submitBtn = new JButton("提交");
        cancelBtn = new JButton("取消");

        jToggleBtn.setText("点击隐藏");
        jToggleBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
//                jToggleButton1ActionPerformed(evt);
            }
        });

    
        exeOrgTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jTextField3ActionPerformed(evt);
            }
        });

       GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(currencyLab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(currencyCom, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cuacctCodeLab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cuacctCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fundInfoLab))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(extOrgLab)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(exeOrgTxt))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(banCodeAgainLab)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bankCodeAgainTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(remarkLab)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(remarkTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(bankCodeLab)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bankCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fundNameLab)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fundNameLabInput))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fundAvlLab)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fundAvlLabInput)))
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cuacctCodeLab2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cuacctCodeLab2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fundBlnLab)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fundBlnLabInput))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(submitBtn)))
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(currencyLab2)
                                    .addComponent(fundTrnFrzLab))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fundTrnFrzLabInput)
                                    .addComponent(currencyLabInput2))))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleBtn)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(titleLab, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLab, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currencyLab)
                    .addComponent(currencyCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuacctCodeLab)
                    .addComponent(cuacctCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fundInfoLab)
                    .addComponent(jToggleBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fundNameLab, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fundNameLabInput)
                    .addComponent(cuacctCodeLab2)
                    .addComponent(cuacctCodeLab2)
                    .addComponent(currencyLab2)
                    .addComponent(currencyLabInput2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fundBlnLab)
                    .addComponent(fundBlnLabInput)
                    .addComponent(fundAvlLab)
                    .addComponent(fundAvlLabInput)
                    .addComponent(fundTrnFrzLabInput)
                    .addComponent(fundTrnFrzLab))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(extOrgLab)
                    .addComponent(exeOrgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bankCodeLab)
                    .addComponent(bankCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(banCodeAgainLab)
                    .addComponent(bankCodeAgainTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remarkLab)
                    .addComponent(remarkTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(169, Short.MAX_VALUE))
        );
	}
	

	
	public static void main(String[] args) {
		new CheckPanel();
	}
}
