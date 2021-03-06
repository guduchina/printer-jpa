package com.cpw.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 打印机
 * 
 * @author epeicen
 *
 */
@Entity
@Table(name = "printer")
public class PrinterVO {

	@Id
	@GeneratedValue
	@Column(name = "PRINTERID")
	private int printerId;
	@Column(name = "PRINTERNAME")
	private String printerName;
	@Column(name = "PRINTERSPEED")
	private int speed;
	@Column(name = "STATUS")
	private String status;

	public int getPrinterId() {
		return printerId;
	}

	public void setPrinterId(int printerId) {
		this.printerId = printerId;
	}

	public String getPrinterName() {
		return printerName;
	}

	public void setPrinterName(String printName) {
		this.printerName = printName;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
