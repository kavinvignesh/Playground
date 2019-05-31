#include<stdio.h>
int main()
{
  //Type your code here
  int n=0,arr[10]={0},count=0,max=0;
  scanf("%d",&n);
  for(int i=0;i<n;i++){
	scanf("%d",&arr[i]);
  }
  for(int i=0;i<n;i++){
    if(arr[i]==1){
      count++;
    }
    else{
      if(max<count){
        max=count;
        count=0;
      }
    }
  }
  printf("%d",max);
  return 0;
}