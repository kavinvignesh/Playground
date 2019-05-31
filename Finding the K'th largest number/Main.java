#include<stdio.h>
int main()
{
//Type your code here
  int n=0,ar[100]={0},k=0,temp=0;
  scanf("%d",&n);
  for(int i=0;i<n;i++){
    scanf("%d",&ar[i]);
  }
  
  scanf("%d",&k);
  for(int i=0;i<n-1;i++){
    for(int j=i+1;j<n;j++){
      if(ar[i]>ar[j]){
        temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
      }
    }
  }
  printf("%d",ar[n-k]);
return 0;
}