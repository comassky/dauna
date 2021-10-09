package com.comassky.dauna.dto;

import com.opencsv.bean.CsvBindByName;

public class HelloAssoWinnerCsv extends HelloAssoCsv {

	@CsvBindByName(column = "Lot")
	private String lot;

	public HelloAssoWinnerCsv(final NewHelloAssoCsv newhelloAssoCsv)  {
		this.setNumero(newhelloAssoCsv.getNumero());
		this.setDateNaissance(newhelloAssoCsv.getDateNaissance());
		this.setDate(newhelloAssoCsv.getDate());
		this.setCampagne(newhelloAssoCsv.getCampagne());
		this.setBillet(newhelloAssoCsv.getBillet());
		this.setAdresseAcheteur(newhelloAssoCsv.getAdresseAcheteur());
		this.setEmail(newhelloAssoCsv.getEmail());
		this.setVilleAcheteur(newhelloAssoCsv.getVilleAcheteur());
		this.setStatut(newhelloAssoCsv.getStatut());
		this.setPrenomAcheteur(newhelloAssoCsv.getPrenomAcheteur());
		this.setPrenom(newhelloAssoCsv.getPrenom());
		this.setNomAcheteur(newhelloAssoCsv.getNomAcheteur());
		this.setNom(newhelloAssoCsv.getNom());
		this.setCodePostalAcheteur(newhelloAssoCsv.getCodePostalAcheteur());
		this.setFormule(newhelloAssoCsv.getFormule());
	}

	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}
}
