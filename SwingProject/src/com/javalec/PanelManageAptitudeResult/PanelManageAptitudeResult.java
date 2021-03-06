package com.javalec.PanelManageAptitudeResult;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelManageAptitudeResult extends JPanel {
	
	
	private JScrollPane scrollPane_AdAptitideResult;
	private final DefaultTableModel Outer_Table_AdAptitideResult = new DefaultTableModel(); // ################
	private JTable inner_table_AdAptitideResult;
	private JLabel lblAdAptitideResultName;
	private JLabel lblAdAptitideResultarExplain;
	private JTextField tfAdAptitideResultName;
	private JTextField tfAdAptitideResultarExplain;
	private JButton btnAdAptitideResultCreate;
	private JButton btnAdAptitideResultEdit;
	private JButton btnAdAptitideResultRemove;
	private JLabel lblAdAptitideResultNum;
	private JTextField tfAdAptitideResultNum;

	/**
	 * Create the panel.
	 */
	public PanelManageAptitudeResult() {
		setBackground(new Color(238, 238, 238));
		setBounds(new Rectangle(0, 57, 500, 350));
		setLayout(null);
		add(getScrollPane_AdAptitideResult());
		add(getLblAdAptitideResultName());
		add(getlblAdMBTIResultExplanation());
		add(getTfAdAptitideResultName());
		add(getTfAdAptitideResultarExplain());
		add(getBtnAdMBTIResultCreate());
		add(getBtnAdAptitideResultEdit());
		add(getBtnAdAptitideResultRemove());
		add(getLblAdAptitideResultNum());
		add(getTfAdAptitideResultNum());
	}
	
	
	private JScrollPane getScrollPane_AdAptitideResult() {
		if (scrollPane_AdAptitideResult == null) {
			scrollPane_AdAptitideResult = new JScrollPane();
			scrollPane_AdAptitideResult.setBounds(12, 17, 478, 156);
			scrollPane_AdAptitideResult.setViewportView(inner_table_AdAptitideResult());
		}
		return scrollPane_AdAptitideResult;
	}
	private JTable inner_table_AdAptitideResult() {
		if (inner_table_AdAptitideResult == null) {
			inner_table_AdAptitideResult = new JTable();
			inner_table_AdAptitideResult.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					MAR_TableClick();
				}
			});
			inner_table_AdAptitideResult.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			inner_table_AdAptitideResult.setModel(Outer_Table_AdAptitideResult); // ???????????? ???????????? ?????? ******??? ????????? ???*****
			MAR_TableInit();
			MAR_selectList();
		}
		return inner_table_AdAptitideResult;
	}

	
	private JLabel getLblAdAptitideResultName() {
		if (lblAdAptitideResultName == null) {
			lblAdAptitideResultName = new JLabel("??????");
			lblAdAptitideResultName.setBounds(12, 227, 60, 16);
		}
		return lblAdAptitideResultName;
	}
	private JLabel getlblAdMBTIResultExplanation() {
		if (lblAdAptitideResultarExplain == null) {
			lblAdAptitideResultarExplain = new JLabel("???????????????");
			lblAdAptitideResultarExplain.setBounds(12, 260, 61, 16);
		}
		return lblAdAptitideResultarExplain;
	}
	
	private JTextField getTfAdAptitideResultName() {
		if (tfAdAptitideResultName == null) {
			tfAdAptitideResultName = new JTextField();
			tfAdAptitideResultName.setBounds(90, 225, 398, 26);
			tfAdAptitideResultName.setColumns(10);
		}
		return tfAdAptitideResultName;
	}
	private JTextField getTfAdAptitideResultarExplain() {
		if (tfAdAptitideResultarExplain == null) {
			tfAdAptitideResultarExplain = new JTextField();
			tfAdAptitideResultarExplain.setColumns(10);
			tfAdAptitideResultarExplain.setBounds(90, 256, 398, 54);
		}
		return tfAdAptitideResultarExplain;
	}
	
	private JButton getBtnAdMBTIResultCreate() {
		if (btnAdAptitideResultCreate == null) {
			btnAdAptitideResultCreate = new JButton("??????");
			btnAdAptitideResultCreate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MAR_Action(1);
				}
			});
			btnAdAptitideResultCreate.setBounds(90, 320, 60, 29);
		}
		return btnAdAptitideResultCreate;
	}
	private JButton getBtnAdAptitideResultEdit() {
		if (btnAdAptitideResultEdit == null) {
			btnAdAptitideResultEdit = new JButton("??????");
			btnAdAptitideResultEdit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MAR_Action(2);
				}
			});
			btnAdAptitideResultEdit.setBounds(253, 320, 60, 29);
		}
		return btnAdAptitideResultEdit;
	}
	private JButton getBtnAdAptitideResultRemove() {
		if (btnAdAptitideResultRemove == null) {
			btnAdAptitideResultRemove = new JButton("??????");
			btnAdAptitideResultRemove.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MAR_Action(3);
					
				}
			});
			btnAdAptitideResultRemove.setBounds(428, 320, 60, 29);
		}
		return btnAdAptitideResultRemove;
	}
	private JLabel getLblAdAptitideResultNum() {
		if (lblAdAptitideResultNum == null) {
			lblAdAptitideResultNum = new JLabel("??????");
			lblAdAptitideResultNum.setBounds(12, 191, 61, 16);
		}
		return lblAdAptitideResultNum;
	}
	private JTextField getTfAdAptitideResultNum() {
		if (tfAdAptitideResultNum == null) {
			tfAdAptitideResultNum = new JTextField();
			tfAdAptitideResultNum.setEditable(false);
			tfAdAptitideResultNum.setColumns(10);
			tfAdAptitideResultNum.setBounds(90, 187, 60, 26);
		}
		return tfAdAptitideResultNum;
	}
	
	//-------------------------------
	//??????????????? 
	//-------------------------------
	
	//?????????????????? Dowoo 2021.04.28 ???????????? ??????	
	public void MAR_TableInit() {
			//????????? User table ??????
			Outer_Table_AdAptitideResult.addColumn("??????");
			Outer_Table_AdAptitideResult.addColumn("??????");
			Outer_Table_AdAptitideResult.addColumn("??????");
			Outer_Table_AdAptitideResult.setColumnCount(3);
			
			int i = Outer_Table_AdAptitideResult.getRowCount();
			for(int j=0; j<i; j++) {
				Outer_Table_AdAptitideResult.removeRow(0);
			}
			
			inner_table_AdAptitideResult.setAutoResizeMode(inner_table_AdAptitideResult.AUTO_RESIZE_OFF); // ???????????? ???????????? x
			
			int vColIndex = 0; // ????????? ???
			TableColumn col = inner_table_AdAptitideResult.getColumnModel().getColumn(vColIndex);
			int width = 30; // ????????? ??? ??????
			col.setPreferredWidth(width);; // ????????? ??? ???????????? ??????
			
			vColIndex = 1; // 2?????? ???
			col = inner_table_AdAptitideResult.getColumnModel().getColumn(vColIndex);
			width = 100; // 2?????? ??? ??????
			col.setPreferredWidth(width);; // 2?????? ??? ???????????? ??????
			
			vColIndex = 2; // 3?????? ???
			col = inner_table_AdAptitideResult.getColumnModel().getColumn(vColIndex);
			width = 345; // 3?????? ??? ??????
			col.setPreferredWidth(width);; // 3?????? ??? ???????????? ??????

	}

	
	//????????? ?????????
	public void MAR_ClearColumn() {
		tfAdAptitideResultarExplain.setText("");
		tfAdAptitideResultName.setText("");
		tfAdAptitideResultNum.setText("");
	}

	//???????????? Dowoo 2021.04.29
	public void MAR_selectList(){

		MAR_DbAction dbAction = new MAR_DbAction();
		ArrayList<MAR_Bean> beanlList = dbAction.MAR_selectList();
		
		int listCount =beanlList.size();
		
		for(int i=0; i<listCount; i++) {
			String temp =Integer.toString(beanlList.get(i).getArNum());
			String[] qtxt = {temp, beanlList.get(i).getArName(),beanlList.get(i).getArExplain()};
			Outer_Table_AdAptitideResult.addRow(qtxt);
			}
	}
	
	//????????? ????????? Dowoo 2021.04.29
	private void MAR_TableClick() {
	int i = inner_table_AdAptitideResult.getSelectedRow();
	String tmArNum = (String)inner_table_AdAptitideResult.getValueAt(i,0);
	int wkArNUM = Integer.parseInt(tmArNum);
	
	MAR_DbAction mar_DbAction =new MAR_DbAction(wkArNUM);
	MAR_Bean bean =mar_DbAction.MAR_TableClick();
	
	tfAdAptitideResultNum.setText(Integer.toString(bean.getArNum()));
	tfAdAptitideResultName.setText(bean.getArName()); 
	tfAdAptitideResultarExplain.setText(bean.getArExplain());
		
	}
	
		// ???????????? ??????
		private void MAR_Action(int k) {
			int i_chk = MAR_FieldCheck();
			if(i_chk == 0){
				
				switch(k) {
				case 1 : MAR_insertAction();
					break;
				case 2 : MAR_UpdateAction();
					break;
				case 3 : MAR_DeleteAction();
					break;
				}
				MAR_TableInit();
				MAR_selectList();
				MAR_ClearColumn();
			}else {
				JOptionPane.showMessageDialog(this, "????????????" + "\n" + 
						"Data??? ??????????????? ?????????!");			
				}	
			}
	
		
	//??????????????? Dowoo 2021.04.29
	private void MAR_insertAction(){

		String arName = tfAdAptitideResultName.getText().trim();
		String arExplain = tfAdAptitideResultarExplain.getText().trim();
	
		MAR_DbAction mar_DbAction =new MAR_DbAction(arName, arExplain);
		boolean msg = mar_DbAction.MAR_insertAction();
		
		if(msg=true) {
			JOptionPane.showMessageDialog(this, tfAdAptitideResultName.getText()+" ?????? ????????? ?????? ???????????????.!",
		             "?????? ??????!", 
		             JOptionPane.INFORMATION_MESSAGE);  
		}else if(msg=false){
			 
			   JOptionPane.showMessageDialog(this, "DB??? ?????? ????????? ????????? ??????????????????! \n ????????????????????? ???????????????!",
				          "Critical Error!", 
				          JOptionPane.ERROR_MESSAGE);    
		}
	}
	
	//??????	Dowoo 2021.04.29
	private int MAR_FieldCheck(){
		int i = 0;
		if(tfAdAptitideResultName.getText().length() == 0){
			i++;
			tfAdAptitideResultName.requestFocus();
		}
		if(tfAdAptitideResultarExplain.getText().length() == 0){
			i++;
			tfAdAptitideResultarExplain.requestFocus();
		}
		return i;
	}
		
	
	
	
	
	//??????	Dowoo 2021.04.29
	private void MAR_UpdateAction() {
		int arNum = Integer.parseInt(tfAdAptitideResultNum.getText().trim());
		String arName = tfAdAptitideResultName.getText().trim();
		String arExplain = tfAdAptitideResultarExplain.getText().trim();
		
		MAR_DbAction mar_DbAction =new MAR_DbAction(arNum, arName, arExplain);
		boolean msg = mar_DbAction.MAR_UpdateAction();
		
		if(msg=true) {
			JOptionPane.showMessageDialog(this, tfAdAptitideResultName.getText()+" ?????? ????????? ?????????????????????.!",
		             "?????? ??????!", 
		             JOptionPane.INFORMATION_MESSAGE);  
		}else if(msg=false) {
			JOptionPane.showMessageDialog(this, tfAdAptitideResultName.getText()+"DB??? ?????? ????????? ????????? ??????????????????! \n ????????????????????? ???????????????!",
		             "?????? ??????!", 
		             JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	//?????? Dowoo 2021.04.28 
	private void MAR_DeleteAction() {
		
		int aNum  = Integer.parseInt(tfAdAptitideResultNum.getText());
		
		MAR_DbAction mar_DbAction =new MAR_DbAction(aNum);
		boolean msg = mar_DbAction.MAR_DeleteAction();
			if(msg=true) {
				JOptionPane.showMessageDialog(this,tfAdAptitideResultName.getText()+"??? ?????????????????????.",
				        	"????????????!",JOptionPane.INFORMATION_MESSAGE);
       
			}else if(msg=false){	 
				JOptionPane.showMessageDialog(this, "DB??? ?????? ????????? ????????? ??????????????????! \n ????????????????????? ???????????????!",
						 "Critical Error!", 
						 JOptionPane.ERROR_MESSAGE);    
			}
		}

}//---------------------------------
