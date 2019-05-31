/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  //Type your code here
  int sz=0,arr[10]={0},sum=0,flag=1,val=0;
  scanf("%d",&sz);
  for(int i=0;i<sz;i++){
    scanf("%d",&arr[i]);
    sum+=arr[i];
    if((i+1)%3==0){
      if(i<3)
        val = sum;
      if(sum!=val)
        flag=0;
      sum=0;
    }
  }
  if(flag==1)
     printf("Perfect Batch");
  else
    printf("Not a Perfect Batch");
  
  return 0;
}