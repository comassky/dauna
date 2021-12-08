package com.comassky.dauna.dto;

public class NewHelloAssoCsv extends HelloAssoCsv {

	public NewHelloAssoCsv(final HelloAssoCsv helloAssoCsv)  {
		this.setNumero(helloAssoCsv.getNumero());
		this.setDateAchat(helloAssoCsv.getDateAchat());
		this.setStatus(helloAssoCsv.getStatus());
		this.setPrenom(helloAssoCsv.getPrenom());
		this.setNom(helloAssoCsv.getNom());
		this.setCodePromo(helloAssoCsv.getCodePromo());
		this.setEmailAcheteur(helloAssoCsv.getEmailAcheteur());
		this.setMontant(helloAssoCsv.getMontant());
		this.setTarif(helloAssoCsv.getTarif());
		this.setTelephone(helloAssoCsv.getTelephone());
		this.setEmailBis(helloAssoCsv.getEmailBis());
	}

	public NewHelloAssoCsv() {
	}

}
