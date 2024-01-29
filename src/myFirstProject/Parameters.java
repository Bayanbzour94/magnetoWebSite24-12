package myFirstProject;

import java.util.Random;

public class Parameters  {
	Random rand = new Random();

	String [] firstNames = {"Alice", "Bob", "Charlie", "David", "Eva",
            "Frank", "Grace", "Henry", "Ivy", "Jack"};
	String [] LastNames = {"Smith", "Johnson", "Williams", "Jones", "Brown",
            "Davis", "Miller", "Wilson", "Moore", "Taylor"};
	String  commonPassword = "Asd123!@#$" ;
	
	int randomindex= rand.nextInt(10);
	int randomemailID = rand.nextInt(9999);

	String emailID = firstNames[randomindex]+LastNames[randomindex]+randomemailID+"@"+"gmail.com";

	
}
