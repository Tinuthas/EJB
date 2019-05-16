package br.com.fiap.bo.impl;

import java.util.Collections;
import java.util.List;

import javax.ejb.Stateless;

import br.com.fiap.bo.DisciplinaBO;

@Stateless
public class DisciplinaBOImpl implements DisciplinaBO{
	
	@Override
	public double calcularMedia(double nac, double am, double ps) {
		return (nac*0.2) + (am*0.3) + (ps*0.5);
	}
	
	@Override
	public double calcularPS(double nac, double am) {
		return 6 - (nac * 0.2 + am * 0.3);
	}
	
	@Override
	public double calcularMediaNac(List<Double> nacs) throws Exception {
		Collections.reverse(nacs);
		if(nacs.size() <= 0) throw new Exception("Sem nac");
		if(nacs.size() <= 2) return nacs.get(0);
		if(nacs.size() == 3) return (nacs.get(0) + nacs.get(1))/2;
		if(nacs.size() >= 4) return	(nacs.get(0) + nacs.get(1) + nacs.get(2))/3;
		return 0;
	}

}
