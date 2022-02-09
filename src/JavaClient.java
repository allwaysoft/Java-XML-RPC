import java.util.*;

import helma.xmlrpc.XmlRpcClient;

public class JavaClient {
	public static void main(String[] args) {
		try {

			XmlRpcClient client = new XmlRpcClient("http://localhost:8080/RPC2");
			Vector params = new Vector();
			params.addElement(new Integer(17));
			params.addElement(new Integer(13));

			Object result = client.execute("sample.sum", params);

			int sum = ((Integer) result).intValue();
			System.out.println("The sum is: " + sum);

		} catch (Exception exception) {
			System.err.println("JavaClient: " + exception);
		}
	}
}