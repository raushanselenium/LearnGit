package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDemoTest {
	@Test
	public void excelDriven() throws IOException {
		ArrayList<String> a = new ArrayList<String>();
		FileInputStream fis = new FileInputStream(
				"C://Users//vicky//eclipse-workspace//maven-selenium//excel-data//login-data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int sheets = wb.getNumberOfSheets();
		// System.out.println(sheets);
		for (int i = 0; i < sheets; i++) {
			String rs = wb.getSheetName(i);
			// System.out.println(rs);
			if (rs.equalsIgnoreCase("Data-sheet")) {
				XSSFSheet sheet = wb.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstRow = rows.next();
				Iterator<Cell> ce = firstRow.cellIterator();
				int k = 0;
				int column = 0;
				while (ce.hasNext()) {
					Cell value = ce.next();
					// System.out.println(value.getStringCellValue());
					if (value.getStringCellValue().equalsIgnoreCase("Company")) {
						column = k;
					}
					k++;
				}
				while (rows.hasNext()) {
					Row r = rows.next();
					// System.out.println(r.getCell(column).getStringCellValue());
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase("Accenture")) {
						Iterator<Cell> c = r.cellIterator();
						while (c.hasNext()) {
							Cell cv = c.next();
							if (cv.getCellType() == CellType.STRING) {
								a.add(cv.getStringCellValue());
								// System.out.print(c.next().getStringCellValue()+" ");
							} else {

								a.add(NumberToTextConverter.toText(cv.getNumericCellValue()));
							}
							// System.out.println();
						}
					}
					Iterator<String> itr = a.iterator();
					while (itr.hasNext()) {
						System.out.println(itr.next().toString());
					}

				}

			}

		}

	}
}
