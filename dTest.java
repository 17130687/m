package plata;

import junit.framework.TestCase;
public class dTest extends TestCase {
	public void test() {
		plata testing = new plata();//Присваивание класса 
		assertNotNull("Тариф на газ", testing.arrTf[3]);//Проверка, что объект не null
		assertNotNull("Количество проживающих", testing.arrTf[4]);//Проверка, что объект не null
		assertNotNull("Объем потраченного газа", testing.arrTf[5]);//Проверка, что объект не null
	}}
