// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Type your code here 
 int size=0,arr[100]={0},l=0,ldex=0;
  scanf("%d",&size);
  for(int i=0;i<size;i++){
    scanf("%d",&arr[i]);
    if(arr[i]>l){
      l=arr[i];
      ldex=i;
  	}
  }
  printf("%d",ldex);
   return 0;
}