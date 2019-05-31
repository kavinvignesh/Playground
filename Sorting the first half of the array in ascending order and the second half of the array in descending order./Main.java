#include<stdio.h>
int main()
{
	//Try out your code here
  int n=0,arr[10]={0},a=0,t=0;
  scanf("%d",&n);
  for(int i=0;i<n;i++){
    scanf("%d",&arr[i]);
  }
  a=n/2;
  for(int i=0;i<=a-2;i++){
    for(int j=1;j<=a-1;j++){
      if(arr[i]>arr[j]){
        t=arr[i];
        
        arr[i] = arr[j];
        arr[j] = t;
      }
    }
  }
  for(int i=a;i<=n-2;i++){
    for(int j=i+1;j<=n-1;j++){
      if(arr[i]<arr[j]){
        t=arr[i];
        arr[i] = arr[j];
        arr[j] = t;
      }
    }
  }
  for(int i=0;i<n;i++){
    printf("%d ",arr[i]);
  }
   
	return 0;
}