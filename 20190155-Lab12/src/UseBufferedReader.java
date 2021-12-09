import java.io.*;
import java.util.*;

public class UseBufferedReader {

	public static void main(String[] args) throws IOException {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String str = "";
			
			while((str = in.readLine()) != null)
			{
				if(str.equals("quit")) System.exit(0);
				StringTokenizer stk = new StringTokenizer(str);
				System.out.println("There are "+stk.countTokens()+" words in this line.");
				while(stk.hasMoreTokens()){
					System.out.println(stk.nextToken());
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
