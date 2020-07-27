package client_app;
import interest.SimpleInterest;
import interest.CompoundInterest;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import constructioncost.*;
public class ClientApplication {
 public static void main(String[] ar) throws Exception
 {
	BufferedWriter br=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out),"ASCII"),512);
	br.write("SimpleInterest="+SimpleInterest.estimate(1000.0,2.0,4.0));
	br.write('\n');
	br.write("CompountInterest="+CompoundInterest.estimate(1000.0,2.0,4.0,1));
	br.write('\n');
	br.flush();
	new ConstructionCostEstimate();
 }
}
