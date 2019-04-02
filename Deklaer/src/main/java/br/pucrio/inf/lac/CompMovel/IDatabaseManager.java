/**
 * 
 */
package br.pucrio.inf.lac.CompMovel;

import br.pucrio.inf.lac.CompMovel.model.Monitoring;

/**
 * @author vitor
 *
 */
public interface IDatabaseManager 
{

	public Boolean registerNewPatient(String patientPhone, String ontologiesPath);
	
	public Boolean loadPatientOntologies(String patientPhone);
	
	public Monitoring getAllMonitoringInformation(String patientMHubID);
	
	//public boolean addPatientAndHeros(UUID patientUUID, ArrayList<UUID> herosUUIDs);
	
	//public ArrayList<UUID> getHeros(UUID patientUUID);
}
