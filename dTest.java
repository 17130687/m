package plata;

import junit.framework.TestCase;
public class dTest extends TestCase {
	public void test() {
		plata testing = new plata();//������������ ������ 
		assertNotNull("����� �� ���", testing.arrTf[3]);//��������, ��� ������ �� null
		assertNotNull("���������� �����������", testing.arrTf[4]);//��������, ��� ������ �� null
		assertNotNull("����� ������������ ����", testing.arrTf[5]);//��������, ��� ������ �� null
	}}
