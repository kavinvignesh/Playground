#include<stdio.h>
int main()
{
	//Try out your code here
  int n=0,arr[10]={0};
  scanf("%d",&n);
  for(int i=0;i<n;i++){
    scanf("%d",&arr[i]);
  }
  for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++){
      if(arr[i]<arr[j])
        printf("%d,%d\n",arr[i],arr[j]);
    }
  }
	return 0;
}