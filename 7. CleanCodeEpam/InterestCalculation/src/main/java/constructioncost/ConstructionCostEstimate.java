package constructioncost;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConstructionCostEstimate  {
	BufferedWriter br;
	int totalconstructioncost=0;

  public ConstructionCostEstimate() throws Exception
  {
	  
	  
	  br=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out),"ASCII"),512);
	  
	  br.write("Choose from the options Below for required house construction material\n");
	  br.write("1) Standard Material\n2) Above Standard Material\n3) High Standard Material\n");
	  br.flush();
	  BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
	  int materialtype=Integer.parseInt(read.readLine());
	
	  if(materialtype==1)
	  {
		 totalconstructioncost=GetConstructionCost.getstandardprice();
	  }
	  else if(materialtype==2)
	  {
		  totalconstructioncost=GetConstructionCost.getabovestandardprice();
	  }
	  else if(materialtype==3)
	  {
		  br.write("1)Fully Automated \n2)Not Fully Automated\n");
		  br.flush();
		  int automated=Integer.parseInt(read.readLine());
		  if(automated==1)
			  totalconstructioncost=GetConstructionCost.gethighstandarmaterial(true);
		  else
			  totalconstructioncost=GetConstructionCost.gethighstandarmaterial(false);
			  
	  }
	  br.write("The Total Cost for Construction material is "+totalconstructioncost);
	  br.close();
	  
	  
	
  }
}
