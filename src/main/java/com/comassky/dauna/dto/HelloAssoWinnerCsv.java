package com.comassky.dauna.dto;

import com.opencsv.bean.CsvBindByPosition;

public class HelloAssoWinnerCsv extends HelloAssoCsv {

	@CsvBindByPosition(position = 12)
	private String lot;

	public HelloAssoWinnerCsv(final NewHelloAssoCsv newhelloAssoCsv)  {
		this.setNumero(newhelloAssoCsv.getNumero());
		this.setDateAchat(newhelloAssoCsv.getDateAchat());
		this.setStatus(newhelloAssoCsv.getStatus());
		this.setPrenom(newhelloAssoCsv.getPrenom());
		this.setNom(newhelloAssoCsv.getNom());
		this.setCodePromo(newhelloAssoCsv.getCodePromo());
		this.setEmailAcheteur(newhelloAssoCsv.getEmailAcheteur());
		this.setMontant(newhelloAssoCsv.getMontant());
		this.setTarif(newhelloAssoCsv.getTarif());
		this.setTelephone(newhelloAssoCsv.getTelephone());
		this.setEmailBis(newhelloAssoCsv.getEmailBis());
	}

	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}
}
