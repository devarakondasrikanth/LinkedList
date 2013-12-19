package com.srikanth.collections;

@SuppressWarnings("rawtypes")
public class Employee implements Comparable{

		public String name;
		public int age;
		
		public String designation;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String toPrint()
		{
			String str = this.name +" "+ this.designation+" "+this.age;
			return str;
		}
		
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			int age = ((Employee) o).getAge();
			return (age-this.age);
			
		}
		
		
}
