package edu.eci.cvds.tdd.registry;
import java.util.ArrayList;

public class Registry {
	private ArrayList<Integer> idRegistrados = new ArrayList<Integer>();
	
	public RegisterResult registerVoter(Person p) {
		RegisterResult resultado = RegisterResult.VALID;
		
		if (!p.isAlive()) {
			resultado = RegisterResult.DEAD;
		}
		
		else if (p.getAge()<18 && p.getAge()>0){
			resultado = RegisterResult.UNDERAGE;
		}
		
		else if (p.getAge()<=0 || p.getAge()>130){
			resultado = RegisterResult.INVALID_AGE;
		}
		
		else if (isDuplicated(p.getId())){
			resultado = RegisterResult.DUPLICATED;
		}
        return resultado;
    }
	
	public boolean isDuplicated(int id) {
		boolean repetido = false;
		if (idRegistrados.contains(id)) {
			repetido = true;			
		}
		
		else {
			idRegistrados.add(id);
		}
		return repetido;
	}
}
