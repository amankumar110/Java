
 class Main {

		public static void main(String args[])
		{
			for(int space=0;space<6;space++)
			{
				System.out.println();
			}
			int n = 9;
			
			for(int row1=1;row1<=4*n+3;row1++)
			{ 
				if(row1==n+1||row1==n+3 || row1==n+4 || row1==n+5 || row1==2*n+2 || row1==3*n+3 || row1==4*n || row1==4*n+1 || row1==4*n+2) 
					System.out.print("  ");
				else
					System.out.print("**");
			}
			System.out.println();
			for(int row2=1;row2<=4*n+3;row2++)
			{ 
				if(row2==1 || row2==n || row2==n+2 || row2==n+3 || row2==n*2 || row2==2*n+1 || row2==2*n+3 || row2==3*n+2 || row2==3*n+4 || row2==3*n+5|| row2==4*n+3) 
					System.out.print("**");
				else
					System.out.print("  ");
			}
			System.out.println();
			for(int row3=1;row3<=4*n+3;row3++)
			{ 
				if(row3==n+1 || row3==n+3 || row3==2*n || row3==2*n+2 || row3==3*n+3 || row3==4*n  || row3==4*n+2) 
					System.out.print("  ");
				else
					System.out.print("**");
			}
			System.out.println();
			for(int row4=1;row4<=4*n+3;row4++)
			{ 
				if(row4==1 || row4==n || row4==n+2  || row4==n+6 || row4==n+8 || row4==n+12 || row4==n+14 || row4== n+17|| row4==n+18) 
					System.out.print("**");
				else
					System.out.print("  ");
			}
			System.out.println();
			for(int row5=1;row5<=4*n+3;row5++)
			{ 
				if(row5==1 || row5==n || row5==n+2 || row5==n+6 || row5==n+8 || row5==n+12 || row5==n+14 || row5==n+18) 
					System.out.print("**");
				else
					System.out.print("  ");
			}
			System.out.println();
		}


}
