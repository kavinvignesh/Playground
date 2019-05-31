#include<stdio.h>
int main()
{
	//Try out your code here
  int n=0,arr[10]={0},max=0;
  scanf("%d",&n);
  for(int i=0;i<n;i++){
    scanf("%d",&arr[i]);
  }
  for(int i=0;i<n;i++){
    max=0;
    for(int j=i+1;j<n;j++){
      if(max<arr[j])
        max=arr[j];
      if(arr[i]<arr[j]&&arr[j]>=max)
        printf("%d,%d\n",arr[i],arr[j]);
    }
  }
	return 0;
}