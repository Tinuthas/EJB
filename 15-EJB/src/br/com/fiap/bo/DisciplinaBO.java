package br.com.fiap.bo;
import java.util.List;

import javax.ejb.Local;

@Local
//@Remote
public interface DisciplinaBO {
	
	double calcularMedia(double nac, double am, double ps);
	
	double calcularPS(double nac, double am);
	
	double calcularMediaNac(List<Double> nacs) throws Exception;
}
