package br.com.fiap.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.fiap.bo.DisciplinaBO;

@ManagedBean
public class DisciplinaBean {
	
	private double nac, am, ps, media;
	
	@EJB
	private DisciplinaBO bo;
	
	private void calcular() {
		media = bo.calcularMedia(nac, am, ps);
	}


	public double getMedia() {
		return media;
	}



	public void setMedia(double media) {
		this.media = media;
	}



	public double getNac() {
		return nac;
	}

	public void setNac(double nac) {
		this.nac = nac;
	}

	public double getAm() {
		return am;
	}

	public void setAm(double am) {
		this.am = am;
	}

	public double getPs() {
		return ps;
	}

	public void setPs(double ps) {
		this.ps = ps;
	}
	
	

}
