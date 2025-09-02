package br.com.mariojp.solid.isp;

public class Main {
	public static void main(String[] args) {
		OfficeService svc = new OfficeService(new SimplePrinter());
		svc.printReport("Relatório do Dia");

		System.out.println("Teste com dispositivo multifuncional");
		OfficeService multiSvc = new OfficeService(new MultiFunctionDevice());
		multiSvc.printReport(" Relatorio de Vendas");
	}
}
