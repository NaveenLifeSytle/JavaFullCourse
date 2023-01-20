import java.util.Arrays;

public class arrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] =new int[] {10,12,66,22,456,5,33};

//itteration
///////////////////////////////////////////////////
int b[]=new int[arr.length];
for(int i=0;i<arr.length;i++) {
	b[i]=arr[i];
	
         }

//original array 
System.out.println("original array ");
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
	
         }
System.out.println();
System.out.println("copy array ");
//copy array
for(int i=0;i<b.length;i++) {
	System.out.print(b[i]+" ");
	
         }

/////////////////////////////////////////////////////////////////

//clone
System.out.println();
System.out.println("//////////////////////////////////////////////////");
System.out.println();
System.out.println("clone");


int c[]=new int[arr.length];

 c=arr.clone();

//original array 
System.out.println("original array ");
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
	
         }
System.out.println();
System.out.println("copy array ");
//copy array
for(int i=0;i<c.length;i++) {
	System.out.print(b[i]+" ");
	
         }


/////////////////////////////////////////////////////////

//System.arraycopy
System.out.println();
System.out.println("//////////////////////////////////////////////////");
System.out.println();
System.out.println("System.arraycopy");


int d[]=new int[arr.length];

System.arraycopy(arr,0,d,0,arr.length);

//original array 
System.out.println("original array ");
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
	
       }
System.out.println();
System.out.println("copy array ");
//copy array
for(int i=0;i<d.length;i++) {
	System.out.print(d[i]+" ");
	
       }


/////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////

//Arrays.copyOf
System.out.println();
System.out.println("//////////////////////////////////////////////////");
System.out.println();
System.out.println("Arrays.copyOf()");


int e[]=new int[arr.length];

e=Arrays.copyOf(arr, arr.length);

//original array 
System.out.println("original array ");
for(int i=0;i<arr.length;i++) {
System.out.print(arr[i]+" ");

}
System.out.println();
System.out.println("copy array ");
//copy array
for(int i=0;i<e.length;i++) {
System.out.print(e[i]+" ");

}


/////////////////////////////////////////////////////////

//Arrays.copyOfRange
System.out.println();
System.out.println("//////////////////////////////////////////////////");
System.out.println();
System.out.println("Arrays.copyOfRange");


int f[]=new int[arr.length];

f=Arrays.copyOfRange(arr,0,3);

//original array 
System.out.println("original array ");
for(int i=0;i<arr.length;i++) {
System.out.print(arr[i]+" ");

}
System.out.println();
System.out.println("copy array ");
//copy array
for(int i=0;i<f.length;i++) {
System.out.print(f[i]+" ");

}


/////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////

	}

}
