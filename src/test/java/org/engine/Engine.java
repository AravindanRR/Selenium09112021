package org.engine;

import java.lang.reflect.Method;

import org.exl.ExcelUtility;
import org.pro.Program;

public class Engine {
	Program pro;
	Method[] methods;
	static String keyword;

	public void getKeywordsfromProgram() {
		pro = new Program();
		methods = pro.getClass().getMethods();

	}

	public void executeKeywords() throws Exception {
		for (int i = 0; i < methods.length; i++) {
			if (methods[i].getName().equalsIgnoreCase(keyword)) {
				methods[i].invoke(keyword);
				break;
				}
			}

	}

	public static void main(String[] args) throws Exception {
		ExcelUtility utility = new ExcelUtility();
		utility.readExcelFile("src\\test\\resources\\Automation Script.xlsx");
		
		Engine engine = new Engine();
		engine.getKeywordsfromProgram();
		for (int row = 1; row <= 8; row++) {
			 keyword = utility.getExclvalue(row, 4);
			 
			 engine.executeKeywords();
			 

}
}}