package br.com.mariojp.solid.isp;

public class MultiFunctionDevice implements Printer, Scanner{
	public void print(String content){
		System.out.println("Dispositivo multifuncional: imprimindo " + content);
	}
	@Override
	public void scan(String targetFile){
		System.out.println("Dispositivo multifuncional: escaneando para" + targetFile);
	}
}
