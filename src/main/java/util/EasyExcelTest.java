package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.metadata.Sheet;

public class EasyExcelTest {

	public static void main(String[] args) {

		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(new File("C:\\Users\\w\\Desktop\\测试大文件读取.xlsx"));
			// 解析每行结果在listener中处理
			ExcelListener listener = new ExcelListener();

			ExcelReader excelReader = new ExcelReader(inputStream, null, listener);
			excelReader.read();

			List<Sheet> sheets = excelReader.getSheets();
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
