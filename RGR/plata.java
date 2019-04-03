package plata;
//��������� ���������� ��� ������ � ���������� ������, �������, 
//��� �������� ������������ ����
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;

//������� �����, ��������� ��������� ActionListener
//��������� ����� ��� ��������� ������� ������� �� ������
public class plata implements ActionListener{
	JFrame frame = new JFrame("���������"); //������� ����
    JPanel panelLeft = new JPanel(); //������ � �������
    JPanel panelRight = new JPanel(); //������ � ���������� ������
    JPanel panelBottom = new JPanel(); //������ � �������� 
    public JTextField[] arrTf = new JTextField[18];//������ ��������� �����
    
    //�����������
    public plata(){
    	//������������� �������� ���������� ��� ������ � �������
        //������ ������������ �� ���������
        panelLeft.setLayout(new BoxLayout(panelLeft, BoxLayout.Y_AXIS));
        //������������  ������ 250 �� 300 ��������
        panelLeft.setPreferredSize(new Dimension(250, 300));
        
        //������������� �������� ���������� ��� ������ � ���������� ������
        //������ ������������ �� ���������
        panelRight.setLayout(new BoxLayout(panelRight, BoxLayout.Y_AXIS));
        //�������������  ������ 130 �� 300 ��������
        panelRight.setPreferredSize(new Dimension(130,300));
        
        //�������� ����� ����� ����� addLabel
        addLabel(panelLeft, "����� �� �������� ����:", Color.RED);
        addLabel(panelLeft, "����� �� ������� ����:", Color.RED);
        addLabel(panelLeft, "����� �� ����:", Color.RED);
        addLabel(panelLeft, "����� �� ���:", Color.RED);
        addLabel(panelLeft, "���������� �����������:", Color.RED);
        addLabel(panelLeft, "����� ������������ ����:", Color.RED);
        addLabel(panelLeft, "����� ����������� ������� ����:", Color.RED);
        addLabel(panelLeft, "����� ����������� �������� ����:", Color.RED);	
        addLabel(panelLeft, "����� ������������ �����:", Color.RED);	
        addLabel(panelLeft, "������������ ������:", Color.RED);	
        addLabel(panelLeft, "���� �� ������� �����:", Color.RED);	
        addLabel(panelLeft, "��������� � �������� ������:", Color.RED);	
        addLabel(panelLeft, "������� �������� ����:", Color.BLUE);
        addLabel(panelLeft, "������� ������� ����:", Color.BLUE);
        addLabel(panelLeft, "������� ����:", Color.BLUE);
        addLabel(panelLeft, "������� �����:", Color.BLUE);
        addLabel(panelLeft, "������� ������������ �����:", Color.BLUE);
        addLabel(panelLeft, "����� �����:", Color.BLUE);
      //��������� ��������� ���� ����� ���� � ���������� �� � ������
        for(int i=0; i<arrTf.length; i++){
        	if(arrTf.length>=0){
            //���������� ������ �� ������ � ������ ��� ���������� ������ � 
            //�������� �����
            arrTf[i] = addTextField(panelRight);
        }}
        
        //��������� ������ ������� � ������
        JButton calc = addButton(panelBottom, "������");
        //��������� ��������� �� ������� �������
        calc.addActionListener(this);
        JButton reset = addButton(panelBottom, "�����");
        //��������� ��������� �� ������� �������
        reset.addActionListener(this);
        
        
        //������ ������� ����� �������
        frame.setVisible(true);
        //������������� �������� ��� ������� �� ������� - ���������� ����������
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //������������� ��������� ��������� ������������ ������ ������ (�� ������)
        frame.setLocationRelativeTo(null);
        //������������� ������ �������� ����(400 �� 450)
        frame.setSize(400,450);
        //��������� ����� � ����������� � ������ � ����� ���� ����
        JLabel top = new JLabel("������� ���� �������� ������������� ��� ����������");
        //������������� ������������ ������ � ����� �� ������
        top.setHorizontalAlignment(JLabel.CENTER);
        
        //��������� ������ �� ������� ����
        frame.add(top, BorderLayout.NORTH);
        frame.add(panelLeft, BorderLayout.WEST);
        frame.add(panelRight, BorderLayout.EAST);
        frame.add(panelBottom, BorderLayout.SOUTH);
        frame.setResizable(false); //��������� ��������� �������� �������� ����
        
    }
    
    
    //����� ���������� ��������� �����
    public void addLabel(JComponent container, String name, Color color){
        //������� �������� ����� � ������ name
        JLabel lb = new JLabel(name);
        //������������� ����������� ���������� ������
        lb.setMaximumSize(new Dimension(400,20));
        //������������� ����� ������
        lb.setForeground(color);
        //������������� ������������ �� ������� ����
        lb.setHorizontalAlignment(JLabel.RIGHT);
        //��������� �����
        lb.setBorder(new EtchedBorder());
        //��������� ��������� ����� � ������
        container.add(lb);
    }
    
    //����� ���������� ��������� �����
    public JTextField addTextField(JComponent container){
        //������� ��������� ����
        JTextField tf = new JTextField();
        //������������� ��� ����������� ���������� ������
        tf.setMaximumSize(new Dimension(150,20));
        
        //��������� ��������� ���� �� ������
        container.add(tf);
        //���������� ������ �� ��������� ����
        return tf;
    }
    
    //����� ���������� ������
    public JButton addButton(JComponent container, String name){
        //������� ������
        JButton btn = new JButton(name);
        //������������� ����������� ���������� ������
        btn.setMaximumSize(new Dimension(100,20));
        //����������� �� ����������� �� ������
        btn.setHorizontalAlignment(JButton.CENTER);
        
        //��������� ������ �� ������
        container.add(btn);
        //���������� ������ �� ������
        return btn;
    }
    
    
    //����� ������� 
    public void kvartira() throws Exception{
        double c = Double.valueOf(arrTf[0].getText()); //�������� ����
        double h = Double.valueOf(arrTf[1].getText()); //������� ����
        double s = Double.valueOf(arrTf[2].getText()); //����
        double g = Double.valueOf(arrTf[3].getText()); //���
        double k = Double.valueOf(arrTf[4].getText()); //���������� �����������
        double vg = Double.valueOf(arrTf[5].getText()); //����� ������������ ����
        double vh = Double.valueOf(arrTf[6].getText()); //����� ���������� ������� ����
        double vc = Double.valueOf(arrTf[7].getText()); //����� ����������� �������� ����
        double vs = Double.valueOf(arrTf[8].getText()); //����� ������������ ����
        double u = Double.valueOf(arrTf[9].getText()); //������������ ������
        double d = Double.valueOf(arrTf[10].getText()); //���� 
        double p = Double.valueOf(arrTf[11].getText()); //���������
        double q1 = c*vc; //���� �� �������� ����
        double q2 = h*vh; //���� �� ������� ����
        double q3 = g*vg; //���� �� ���
        double q4 = s*vs; //���� �� ����
        double q5 = k*u; //���� �� ������������ ������
        double summa = q1+q2+q3+q4+q5+d-p; //���� �� �������� ����
        arrTf[12].setText(String.format("%.2f", q1)); //������� ���� � 13 �.�.
        arrTf[13].setText(String.format("%.2f", q2)); //������� ���� � 14 �.�.
        arrTf[14].setText(String.format("%.2f", q3)); //������� ���� � 15 �.�.
        arrTf[15].setText(String.format("%.2f", q4)); //������� ���� � 16 �.�.
        arrTf[16].setText(String.format("%.2f", q5)); //������� ���� � 17 �.�.
        arrTf[17].setText(String.format("%.2f", summa)); //������� ���� � 18 �.�.
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new plata();
            }
        });
    }

    //����� ��������� ������� ������� �� ������
    @Override
    public void actionPerformed(ActionEvent e) {
        //������ ��� ������, �� ������� ������
        if (e.getActionCommand().equals("������")) {
            try {
                //��������� ������
              kvartira();
              
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "��������� ������������ �����");
            }
            
        }else{
            //������� ��� ����
            for(int i=0; i<arrTf.length; i++){
                arrTf[i].setText("");
            }
        }
        
    }
    
}
