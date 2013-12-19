package com.srikanth.collections;

import java.util.*;


public class HashMapExample {
	
	public static void main(String args[])
	{
	   Employee[] aEmp = new Employee[4]; 
		List<String> lst = new ArrayList<String>();
		Set<String> setMy = new TreeSet<String>();
		lst.add("srikanth");
		lst.add("Volume");
		lst.add("vector");
		lst.add("srikanth");
		setMy.addAll(lst);
		System.out.println(setMy);
		//List is interface implementing ArrayList class
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("a", "Srikanth");
		hm.put("b","Voulme");
		hm.put("c", "Srikanth");
		hm.put("d","Voulme");
		hm.put("e", "Srikanth");
		hm.put("f","Voulme");
		hm.put("f", "Sony");
		hm.put("g",null);
		Set<String> keys = hm.keySet();
		for(String k :keys)
		{
			System.out.println("The value for the key "+ k+" is "+hm.get(k));
		}
				
		HashMap<String,Employee> hmEmp = new HashMap<String,Employee>();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		e1.setAge(20);
		e1.setDesignation("Software Engineer");
		e1.setName("Sony");
		e2.setAge(22);
		e2.setDesignation("Software Developer");
		e2.setName("Qualcom");
		e3.setAge(26);
		e3.setDesignation("Consultant");
		e3.setName("IBM ISL");
		e4.setAge(18);
		e4.setDesignation("Software User");
		e4.setName("Apple");
		hmEmp.put("E472739", e1);
		hmEmp.put("E472349", e2);
		hmEmp.put("E472344", e3);
		hmEmp.put("E423539", e4);
		Set<String> keysEmp = hmEmp.keySet();
		for(String kEmp : keysEmp)
		{
			System.out.println("The value for the key "+kEmp+" is "+(hmEmp.get(kEmp)).toPrint());
		}

		aEmp[0] = e1;
		aEmp[1] = e2;
		aEmp[2] = e3;
		aEmp[3] = e4;
		Arrays.sort(aEmp);		
		 for(Employee e : aEmp)
		 {
			 System.out.println(e.toPrint());
		 }
		 Hashtable balance = new Hashtable();
	      Enumeration names;
	      String str;
	      double bal;

	      balance.put("Zara", new Double(3434.34));
	      balance.put("Mahnaz", new Double(123.22));
	      balance.put("Ayan", new Double(1378.00));
	      balance.put("Daisy", new Double(99.22));
	      balance.put("Qadir", new Double(-19.08));
	      // Show all balances in hash table.
	      names = balance.keys();
	      while(names.hasMoreElements()) {
	         str = (String) names.nextElement();
	         System.out.println(str + ": " +
	         balance.get(str));
	      }
	      System.out.println();
	      // Deposit 1,000 into Zara's account
	      bal = ((Double)balance.get("Zara")).doubleValue();
	      balance.put("Zara", new Double(bal+1000));
	      System.out.println("Zara's new balance: " +
	      balance.get("Zara"));
	      
	      /**/
	      Long in = new Long(0);
	      in = (long) Math.pow(10,2);
	      System.out.println(in);
	      for(long i =1;i<in;i++)
	      {
	    	  if(i%3 == 0 && i%5 == 0)
	    		  System.out.println("Heaven");
	    	  else if(i%3 == 0)
	    		  System.out.println("Bizz");
	    	  else if(i%5==0)
	    		  System.out.println("Fuzz");
	    	  else
	    	  {
	    		  System.out.println(i);
	    	  }
	    	  
	      }
	      int a =10,b =20;
	      a = a+b;
	      b = a-b;
	      a = a-b;
	      System.out.println("a : "+a);
	      System.out.println("b : "+b);
	}

}
