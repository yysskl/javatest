
public class helloworld {
		String breed;
		int agea;
		String color;
		
		public void setAge( int age ){
			agea = age;
		}
		public int getAge(){
			System.out.println( "年龄"  + agea);
			return agea;
		}
		
		public helloworld(String name){
			System.out.println("名字 : " + name ); 
		}
		
		public static void main(String []args){
				helloworld mytest = new helloworld("tom");
				mytest.setAge(5);
				mytest.getAge();
				
				int size = 10;
				double[] myList = new double[size];
				myList[0] = 5.6;
				myList[1] = 1;
				
				double  total = 0;
				for(int i=0;i<size;i++){
					total += myList[i];
				}
				System.out.println(total);
		}
		
}

