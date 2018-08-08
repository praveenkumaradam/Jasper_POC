package charPackage;

import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.DefaultJasperReportsContext;
import net.sf.jasperreports.engine.JRDefaultScriptlet;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.fill.BaseReportFiller;
import net.sf.jasperreports.engine.fill.JRFiller;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
public class charLength2 extends JRDefaultScriptlet{
	
	
public static void main(String args[]) throws JRException
   { 
	
	String a ="\"[product1\",\"product2\"]";
	String a1 ="\"[product11\",\"product22\"]";
	String b ="[abc]";
    String b1 ="[321213123]";
	String c ="\"[care1\",\"care2\"]";
    String d ="\"Strainer is included.\",\"An installation tool is included that makes it easy to secure the wash-basin mixer tap in place.\",\"Water and energy saving aerator (5.7 l/min.) for high-pressure systems included.\"]";
	String e ="\"[package1\",\"package2\"]";
	String f ="\"[people1\",\"people2\"]";
	

	
	System.out.println(calculate(a,b,c,d,e,f,a1,b1,"product"));
	//int abc= calculate(a,b,c,d,e,f,a1,b1,"measure").length();
//	System.out.println(abc);
	
   }


	




public static String calculate(String a,String b,String c,String d,String e,String f,String a1,String b1,String fieldname) throws JRException  {
		int pageLength = 1000;
		
		String productText = "";
		//String productText1 = "";
		String measureText = "";
		String careText = "";
		//String measureText1 = "";
		String goodText = "";
		String packageText = "";
		String peopleText = "";
		String newline = "";
		
		
	    String check = "";
	    String materialparttext = "";
	   
		 String[] productArray = a.split("\",\"");
		String[] productArray1 = a1.split("\",\"");
		String[] measureArray = b.split("\",\"");
		String[] measureArray1 = b1.split("\",\"");
		String[] careArray = c.split("\",\"");
		String[] goodArray = d.split("\",\"");
		String[] packageArray = e.split("\",\"");
		String[] peopleArray = f.split("\",\"");
		
		int totalLength = 0;
		for (int i =0;i < productArray1.length;i++)
		{
			
			if (a =="[null]")
			{
				 materialparttext = "";
				
			}
			else 
			{
				materialparttext = productArray[i].replace("[","").replace("]","").replace("\"","");
			}
			check = materialparttext+productArray1[i].replace("[","").replace("]","").replace("\"","");	
			
			totalLength = totalLength+ check.length();
			
			if (i==0)
			{
				 newline = "";
			}
			else
			{
				 newline = "\n";
			}
		
			if (totalLength > pageLength)
			{
				
				break;
			}
			
			else 
			{
	       
	        	
				productText = productText+newline+materialparttext+productArray1[i].replace("[","").replace("]","").replace("\"","");
				
		}
		
	}
		
		for (int i =0;i < measureArray.length;i++)
		{
			
			check = measureArray[i].replace("[","").replace("]","").replace("\"","")+measureArray1[i].replace("[","").replace("]","").replace("\"","");	
			
			totalLength = totalLength+ check.length();
			
			//System.out.println(measureArray[i]);
			//System.out.println(measureArray1[i]);

			if (i==0)
			{
				 newline = "";
			}
			else
			{
				 newline = "\n";
			}
		
		
			if (totalLength > pageLength)
			{
				
				break;
			}
			else 
			{
	        
				measureText = measureText+newline+measureArray[i].replace("[","").replace("]","").replace("\"","")+" "+measureArray1[i].replace("[","").replace("]","").replace("\"","");
				
		}
		
		}
		for (int i =0;i < careArray.length;i++)
		{
			
			check = careArray[i].replace("[","").replace("]","").replace("\"","");	
			
			totalLength = totalLength+ check.length();

			if (i==0)
			{
				 newline = "";
			}
			else
			{
				 newline = "\n";
			}
		
		
			if (totalLength > pageLength)
			{
				
				break;
			}
			else 
			{
	        
				careText = careText+newline+ careArray[i].replace("[","").replace("]","").replace("\"","");
		}
		}
		for (int i =0;i < goodArray.length;i++)
		{
			
			check = goodArray[i].replace("[","").replace("]","").replace("\"","");	
			
			totalLength = totalLength+ check.length();

			if (i==0)
			{
				 newline = "";
			}
			else
			{
				 newline = "\n";
			}
		
		
			if (totalLength > pageLength)
			{
				
				break;
			}
			else 
			{
	        
				goodText = goodText+newline+ goodArray[i].replace("[","").replace("]","").replace("\"","");
		}
		}
		for (int i =0;i < packageArray.length;i++)
		{
			
			check = packageArray[i].replace("[","").replace("]","").replace("\"","");	
			
			totalLength = totalLength+ check.length();

			if (i==0)
			{
				 newline = "";
			}
			else
			{
				 newline = "\n";
			}
		
		
			if (totalLength > pageLength)
			{
				
				break;
			}
			else 
			{
	        
				packageText = packageText+newline+ packageArray[i].replace("[","").replace("]","").replace("\"","");
		}
		}
		for (int i =0;i < peopleArray.length;i++)
		{
			
			check = peopleArray[i].replace("[","").replace("]","").replace("\"","");	
			
			totalLength = totalLength+ check.length();

			if (i==0)
			{
				 newline = "";
			}
			else
			{
				 newline = "\n";
			}
		
		
			if (totalLength > pageLength)
			{
				
				break;
			}
			else 
			{
	        
				peopleText = peopleText+newline+ peopleArray[i].replace("[","").replace("]","").replace("\"","");
		}
		}
	
		if (fieldname == "product")
			{
			return productText;	
			}
		else if (fieldname == "measure")
		{
			return measureText;
		}
		else if (fieldname == "care")
		{
			return careText;
		}
		else if (fieldname == "good")
		{
			return goodText;
		}
		else if (fieldname == "package")
		{
			return packageText;
		}
		else if (fieldname == "people")
		{
			return peopleText;
		}
		
		
		return "";	
		
		
}	
		
		
		
		
   }