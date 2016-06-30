package io.domshom.struts2.results.stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.codec.Base64.InputStream;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class EmployeeAction extends ActionSupport implements Preparable {
	Employee emp;
	ArrayList<EmployeeIncome> list;
	private ByteArrayInputStream inputStream;

	@Override
	public void prepare() throws Exception {
		emp = new Employee("PWD20155", "Tom dark", "Software Developer","IT");
		list = new ArrayList<EmployeeIncome>();
		list.add(new EmployeeIncome("January", 18000.0d));
		list.add(new EmployeeIncome("February", 21000.0d));
		list.add(new EmployeeIncome("March", 20200.0d));
		list.add(new EmployeeIncome("April", 22700.0d));
		list.add(new EmployeeIncome("May", 24300.0d));
		list.add(new EmployeeIncome("June", 20900.0d));
		list.add(new EmployeeIncome("July", 20300.0d));
	}

	public ByteArrayInputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(ByteArrayInputStream inputStream) {
		this.inputStream = inputStream;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("in execute");
		// generate pdf
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		Document document = new Document();
		PdfWriter.getInstance(document, buffer);

		document.open();
		Paragraph p = new Paragraph();
		p.add(" Employee income Report");
		p.add("\n =============================================================");
		try {
			System.out.println(emp);
			p.add("\n Employee Id : " + emp.getId());
			p.add("\n Name : " + emp.getName());
			p.add("\n Role : " + emp.getDesignation());
			p.add("\n Department : " + emp.getDepartment());
			p.add("\n =============================================================");
		} catch (Exception e) {
			e.printStackTrace();
		}
		p.add("\nMonth Basic HRA PF Allowence NetPay");
		for (EmployeeIncome emp1 : list) {
			double hra = emp1.getBasic() * .5;
			double pf = emp1.getBasic() * .12;
			double allowence = emp1.getBasic() * .2;
			double netpay = (emp1.getBasic() + hra + allowence) - pf;
			p.add("\n" + emp1.getMonth() + " " + emp1.getBasic() + " " + hra
					+ " " + pf + " " + allowence + " " + netpay);
		}
		p.add("\n =============================================================");
		p.add("\n Thanks DomShom.io");
		document.add(p);
		document.close();
		inputStream = new ByteArrayInputStream(buffer.toByteArray());
		return SUCCESS;
	}
}
