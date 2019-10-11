package assignmentFA;

import java.util.*;


public class mainClass {

	public static void main(String[] args) {
		
//		memRgn mem[] = new memRgn[2];
//		processes p[] = new processes[4];
		ArrayList<memRgn> mem = new ArrayList<memRgn>();
		//aray list for preoccess objects
		ArrayList<processes> pr = new ArrayList<processes>();
		
		//array list for just intvariables
		ArrayList<int[]> p = new ArrayList<int[]>();
		ArrayList<Integer> k = new ArrayList<Integer>();
		
		ArrayList<int[]> t = new ArrayList<int[]>();
		
		ArrayList<int[]> m = new ArrayList<int[]>();
		
//		int[] memArray = {40,60};
		int[] memArray = {10,20,30};
		int memArrayLength = memArray.length;
		
		//int programs = 4;
		int programs = 5;
		
		
		
		
		
		
//		int[] p1 = {35};
		int[] p1 = {10,12};
//		int k1 = 1;
		int k1 = 2;
		
		
		p.add(p1);
		k.add(k1);
		
	
//		int[] p2 = {20};
//		int k2 = 1;
		int[] p2 = {10,20};
		int k2 = 2;
		
		k.add(k2);
		p.add(p2);
		
//		int[] p3 = {40};
//		int k3 = 1;
		int[] p3 = {25,1000};
		int k3 = 1;
		
		k.add(k3);
		p.add(p3);
		
//		int[] p4 = {60};
//		int k4 = 1;
		int[] p4 = {19,1000};
		int k4 = 1;
		
		k.add(k4);
		p.add(p4);
		
		int[] p5 = {10,30};
		int k5 = 2;
		
		k.add(k5);
		p.add(p5);
		
		
		
//		int[] t1 = {4};
//		t.add(t1);
//		int[] t2 = {3};
//		t.add(t2);
//		int[] t3 = {10};
//		t.add(t3);
//		int[] t4 = {7};
//		t.add(t4);
		int[] t1 = {50,30};
		t.add(t1);
		int[] t2 = {100,25};
		t.add(t2);
		int[] t3 = {19,1000};
		t.add(t3);
		int[] t4 = {41,1000};
		t.add(t4);
		int[] t5 = {18,42};
		t.add(t5);
		
		
		//creating objects
		for (int i = 0; i <= memArrayLength; i++) {
			mem.add(i,new memRgn());
			
			
		}
		for (int i = 0; i < programs; i++) {
			pr.add(i,new processes(2));
			
		}
		
	
		
		//creating objects ended
		
		
		for (int i = 0; i < memArray.length; i++) {
			mem.get(i).setSize(memArray[i]);
		}
		
		
		for (int i = 0; i < memArray.length; i++) {
			System.out.println("memory reigon "+ (i+1) + " size "+ mem.get(i).getSize());
		}
		
		//inseting sizes and times to pprocessesrocesses
		for (int i = 0; i < programs; i++) 
		{
			
				pr.get(i).setSize(p.get(i));
				pr.get(i).setTime(t.get(i));
				pr.get(i).setkVal(k.get(i));
			

		}
		//printing space
		System.out.println("");
		
		for (int i = 0; i < 4; i++) {
			System.out.println("process " + (i+1) + " size "+pr.get(i).getSize(0));
			System.out.println("time " + (i+1) + " size "+pr.get(i).getTime(0));
		}
		System.out.println("\n\n");
	
		
		

		
//		int[] sortArray= {pr.get(0).getMinSize(),pr.get(1).getMinSize(),pr.get(2).getMinSize(),pr.get(3).getMinSize(),1000};
//		int[] sortTimeArray= {pr.get(0).getMinTime(),pr.get(1).getMinTime(),pr.get(2).getMinTime(),pr.get(3).getMinTime(),1000};
//		int[] kValArray = {(pr.get(0).getkVal()-1),(pr.get(1).getkVal()-1),(pr.get(2).getkVal()-1),(pr.get(3).getkVal()-1), 1000};
//		int[] indexID = {pr.get(0).getMinTimeId() ,  pr.get(1).getMinTimeId() ,  pr.get(2).getMinTimeId() ,  pr.get(3).getMinTimeId(),1000 };
//		int[] processName = {1,2,3,4,1000};
		

		
		
		
		
		int[] sortArray= {pr.get(0).getMinSize(),pr.get(1).getMinSize(),pr.get(2).getMinSize(),pr.get(3).getMinSize(),pr.get(4).getMinSize(),1000};
		
		int[] sortTimeArray= {pr.get(0).getMinTime(),pr.get(1).getMinTime(),pr.get(2).getMinTime(),pr.get(3).getMinTime(),pr.get(4).getMinTime(),1000};
		
		int[] kValArray = {(pr.get(0).getkVal()-1),(pr.get(1).getkVal()-1),(pr.get(2).getkVal()-1),(pr.get(3).getkVal()-1),(pr.get(4).getkVal()-1), 1000};
		
		int[] indexID = {pr.get(0).getMinTimeId() ,  pr.get(1).getMinTimeId() ,  pr.get(2).getMinTimeId() ,  pr.get(3).getMinTimeId(),  pr.get(4).getMinTimeId(),1000 };
		
		int[] processName = {1,2,3,4,5,1000};		
		
		pr.get(0).showTime();
		pr.get(1).showTime();
		pr.get(2).showTime();
		pr.get(3).showTime();
		pr.get(4).showTime();
		
		int x ;
		for (int i = 0; i < sortArray.length; i++) {
			System.out.println(sortTimeArray[i]);
		}
		System.out.println(" index array ");
		for (int i = 0; i < sortTimeArray.length; i++) {
			System.out.println(indexID[i]);
		}
		
/*********************sorting start**************************/
			int key;
			int keyName;
			int in;
			int timeSize;
			int kay;
			int idOfIndex;
			for (int j = 1; j <= 5; j++) 
			{
				key = sortArray[j];
				keyName = processName[j];
				timeSize = sortTimeArray[j];
				kay = kValArray[j];
				idOfIndex = indexID[j];
				
				in = j -1;
				while(in >= 0 && sortTimeArray[in] > timeSize)
				{
					sortArray[in + 1] = sortArray[in];
					processName[in + 1] = processName[in];
					sortTimeArray[in + 1] = sortTimeArray[in];
					kValArray[in + 1] = kValArray[in];
					indexID[ in + 1 ] = indexID[ in ];
			
					in = in - 1;
				}
				
				sortArray[in + 1] = key;
				processName[in + 1] = keyName;
				sortTimeArray[in + 1] = timeSize;
				kValArray[in + 1] = kay;
				indexID[ in + 1 ] = idOfIndex;
			
			}
		
/*********************sorting end**************************/	
		
		
		
		System.out.println("\nsoterd:");
		for (int i = 0; i < processName.length; i++) 
		{
			System.out.println("k val:"+ kValArray[i] +" ||"+sortArray[i]+ " " + processName[i]+ "  time " + sortTimeArray[i]);
		}
		

		
		int[][] memoryArray = new int[memArrayLength][sortArray.length + 1];
		int[][] memoryName = new int[memArrayLength][sortArray.length + 1];
		
		
		
		
		//start of memory length 2
		if (memArrayLength == 2) {
			for (int i = 0; i < memArrayLength; i++) {
				memoryArray[i][0] = memArray[i];
				memoryName[i][0] = 99;
				
				for (int j = 1; j < ( sortArray.length + 1 ); j++) {
					memoryArray[i][j] = 999;
					memoryName[i][j] = 99;
				}
			}
			
			
			
			
			int count;
			int mem1count = 0;
			int mem2count = 0;
			
			
			for (int i = 0; i <4 ; i++) 
			{ 
				count = 1;
//				System.out.println("adding "+i+" to the array "+"mem2 count : "+ mem2count + " mem1 count " + mem1count);
				System.out.println("kay value "+ kValArray[i] + " min id "+ indexID[i]);
				while(count < 5 )
				{
					
					if(sortArray[i] == memoryArray[0][0] && memoryArray[0][count]  == 999)
					{
//						System.out.println("it equals to 40...so...");
//						System.out.println("mem2 index : "+count);
						memoryArray[0][count] = sortTimeArray[i];
						memoryName[0][count] = processName[i];
						mem1count++;
//						System.out.println("mem1 count : "+ mem2count);
						break;
					}
					else if(indexID[i] == kValArray[i] && sortArray[i] <= memoryArray[1][0] && memoryArray[1][count]  == 999 && mem1count == mem2count)
					{
//						System.out.println("mem2 index : "+ count);
//						
						
							memoryArray[1][count] = sortTimeArray[i];
							memoryName[1][count] = processName[i];
							mem2count++;
//							System.out.println("mem2 count : "+ mem2count);
							break;
							
						
						
					}
					else if (sortArray[i] <= memoryArray[0][0] && memoryArray[0][count] == 999) {
//						System.out.println("mem1 index : "+count);
						
							memoryArray[0][count] = sortTimeArray[i];
							memoryName[0][count] = processName[i];
							mem1count++;
//							System.out.println("mem1 count : "+ mem2count);
							break;
							
						
					}
					else if (sortArray[i] > memoryArray[0][0] && memoryArray[1][count] == 999)  {
							
//						System.out.println("mem2 index : "+ count);
							memoryArray[1][count] = sortTimeArray[i];
							memoryName[1][count] = processName[i];
							mem2count++;
//							System.out.println("mem2 count : "+ mem2count);
							break;
							
						
					}
						count++;
				}
			}
			
			
			System.out.println("done !");
			System.out.println("");
			
			
			int calculatemem1 = 0;
			int calculatemem2 = 0;
			float total = 0;
			for (int i = 0; i <= 4; i++) {
				if(memoryName[0][i] != 99)
				{
					
					System.out.println("process "+memoryName[0][i]+ " runs in mem 1 from "+ calculatemem1 + " to "+ (calculatemem1 = calculatemem1 + memoryArray[0][i]) );
					total = total + calculatemem1;
				}
				
			}
	 		

			for (int i = 0; i <= 4; i++) {
				
				if(memoryName[1][i] != 99)
				{
					
					System.out.println("process "+memoryName[1][i]+ " runs in mem 2 from "+ calculatemem2 + " to "+ (calculatemem2 = calculatemem2 + memoryArray[1][i] ) );
					total = total + calculatemem2;
				}
			}
			System.out.println("\ntotal = "+ total+ " average = "+ ( total / 4 ) );
		}
		//end of memory length 2
/******************************************************************************************************************************/		
		//start of memory length 3
		if (memArrayLength == 3) {
			for (int i = 0; i < memArrayLength; i++) {
				memoryArray[i][0] = memArray[i];
				memoryName[i][0] = 99;
				
				for (int j = 1; j < ( sortArray.length + 1 ); j++) {
					memoryArray[i][j] = 999;
					memoryName[i][j] = 99;
				}
			}
			
			
			
			
			int count;
			int mem1count = 0;
			int mem2count = 0;
			int mem3count = 0;
			
			System.out.println("\n\n");
			for (int i = 0; i < programs ; i++) 
			{ 
				count = 1;
//				System.out.println("adding "+i+" to the array "+"mem2 count : "+ mem2count + " mem1 count " + mem1count);
				System.out.println("kay value "+ kValArray[i] + " min id "+ indexID[i]);
				while(count < 5 )
				{
					
					if(sortArray[i] == memoryArray[0][0] && memoryArray[0][count]  == 999)
					{
//						System.out.println("it equals to 40...so...");
//						System.out.println("mem2 index : "+count);
						memoryArray[0][count] = sortTimeArray[i];
						memoryName[0][count] = processName[i];
						mem1count++;
//						System.out.println("mem1 count : "+ mem2count);
						break;
					}
					else
						if(sortArray[i] == memoryArray[1][0] && memoryArray[0][count]  == 999)
						{
//							System.out.println("it equals to 40...so...");
//							System.out.println("mem2 index : "+count);
							memoryArray[1][count] = sortTimeArray[i];
							memoryName[1][count] = processName[i];
							mem2count++;
//							System.out.println("mem1 count : "+ mem2count);
							break;
						}
					else if(indexID[i] == kValArray[i] && sortArray[i] <= memoryArray[2][0] && memoryArray[1][count]  == 999 && mem1count == mem2count && mem2count == mem3count)
					{
//						System.out.println("mem2 index : "+ count);
//						
						
							memoryArray[2][count] = sortTimeArray[i];
							memoryName[2][count] = processName[i];
							mem3count++;
//							System.out.println("mem2 count : "+ mem2count);
							break;
							
						
						
					}
					else if (sortArray[i] <= memoryArray[0][0] && memoryArray[0][count] == 999) {
//						System.out.println("mem1 index : "+count);
						
							memoryArray[0][count] = sortTimeArray[i];
							memoryName[0][count] = processName[i];
							mem1count++;
//							System.out.println("mem1 count : "+ mem2count);
							break;
							
						
					}
					else if (sortArray[i] > memoryArray[0][0] && sortArray[i] <= memoryArray[1][0] && memoryArray[1][count] == 999)  {
							
//						System.out.println("mem2 index : "+ count);
							memoryArray[1][count] = sortTimeArray[i];
							memoryName[1][count] = processName[i];
							mem2count++;
//							System.out.println("mem2 count : "+ mem2count);
							break;
							
						
					}
					else if (sortArray[i] > memoryArray[1][0] && sortArray[i] <= memoryArray[2][0] && memoryArray[1][count] == 999)  {
						
//						System.out.println("mem2 index : "+ count);
							memoryArray[2][count] = sortTimeArray[i];
							memoryName[2][count] = processName[i];
							mem3count++;
//							System.out.println("mem2 count : "+ mem2count);
							break;
							
						
					}
						count++;
				}
			}
			
			
			System.out.println("done !");
			System.out.println("");
			
			
			int calculatemem1 = 0;
			int calculatemem2 = 0;
			int calculatemem3 = 0;
			float total = 0;
			for (int i = 0; i <= 4; i++) {
				if(memoryName[0][i] != 99)
				{
					
					System.out.println("process "+memoryName[0][i]+ " runs in mem 1 from "+ calculatemem1 + " to "+ (calculatemem1 = calculatemem1 + memoryArray[0][i]) );
					total = total + calculatemem1;
				}
				
			}
	 		

			for (int i = 0; i <= 4; i++) {
				
				if(memoryName[1][i] != 99)
				{
					
					System.out.println("process "+memoryName[1][i]+ " runs in mem 2 from "+ calculatemem2 + " to "+ (calculatemem2 = calculatemem2 + memoryArray[1][i] ) );
					total = total + calculatemem2;
				}
			}
			for (int i = 0; i <= 4; i++) {
				
				if(memoryName[2][i] != 99)
				{
					
					System.out.println("process "+memoryName[2][i]+ " runs in mem 3 from "+ calculatemem3 + " to "+ (calculatemem3 = calculatemem3 + memoryArray[2][i] ) );
					total = total + calculatemem3;
				}
			}
			System.out.println("\ntotal = "+ total+ " average = "+ ( total / 4 ) );
		}
		
		//end of memory lenfgth 3
 		
		 
		
		
		
		
		
	}

}
