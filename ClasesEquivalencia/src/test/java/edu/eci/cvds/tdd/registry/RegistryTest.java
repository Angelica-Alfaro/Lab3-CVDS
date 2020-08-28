package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
	
	private Registry registry = new Registry();

		/**Prueba caso de equivalencia VALID
		 * VALID: Cumple con los requerimientos (Edad v�lida, vivo, mayor de edad, id �nico)
		 */
	    @Test
	    public void validateRegistryResult() {
	    	Person person = new Person("Federico", 1224182690, 20, Gender.MALE, true);
	    	
	        RegisterResult result = registry.registerVoter(person);
	        
	        Assert.assertEquals(RegisterResult.VALID, result);
	    }

	    /**Prueba caso de equivalencia DEAD
		 * DEAD: Est� muerto
		 */
	    @Test
	    public void deadRegistryResult() {
	    	Person person = new Person("Teresa", 2135678943, 50, Gender.FEMALE, false);
	    	
	        RegisterResult result = registry.registerVoter(person);
	        
	        Assert.assertEquals(RegisterResult.DEAD, result);
	    }
	    
	    /**Prueba caso de equivalencia UNDERAGE
		 * UNDERAGE: Es menor de 18 a�os
		 */
	    @Test
	    public void underAgeRegistryResult() {
	    	Person person = new Person("Carlos", 763563943, 12, Gender.MALE, true);
	    	
	        RegisterResult result = registry.registerVoter(person);
	        
	        Assert.assertEquals(RegisterResult.UNDERAGE, result);
	    }
	    
	    /**Prueba caso de equivalencia INVALID_AGE
		 * INVALID_AGE: Tiene m�s de 130 a�os o menor o igual a 0 a�os
		 */
	    @Test
	    public void invalidAgeRegistryResult() {
	    	Person person = new Person("Lucia", 1029356432, -3, Gender.FEMALE, true);
	    	
	        RegisterResult result = registry.registerVoter(person);
	        
	        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
	    }
	    

	    /**Prueba caso de equivalencia DUPLICATED
		 * DUPLICATED: Hay c�dulas con id repetido
		 */
	    @Test
	    public void duplicateRegistryResult() {
	    	Person person1 = new Person("Juan", 233412695, 60, Gender.MALE, true);
	    	Person person2 = new Person("Pedro", 233412695, 20, Gender.MALE, true);
	    	
	    	RegisterResult result1 = registry.registerVoter(person1);
	    	RegisterResult result2 = registry.registerVoter(person2);
	    	
	    	Assert.assertEquals(RegisterResult.VALID, result1);
	        Assert.assertEquals(RegisterResult.DUPLICATED, result2);
	        
	    }
}
