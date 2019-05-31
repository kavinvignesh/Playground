#include<stdio.h>
int main()
{
  //Type your code here
  int max=0,mid=0,n=0,arr[100]={0},seq[100]={0},seqidx=0,startidx=0,index=0,sum=0;
  scanf("%d",&n);
  for(int i=0;i<n;i++){
    scanf("%d",&arr[i]);
  }
  for(index=0;index<n;index++){
    if(arr[index]>arr[index+1]){
      seq[seqidx++]=startidx;
      seq[seqidx++]=index++;
      startidx=index;
    }
  }
  if(startidx!=index-1){
    seq[seqidx++]=startidx;
    seq[seqidx++]=index-1;
  }
  if(startidx==index-1){
    seq[seqidx++]=startidx;
    seq[seqidx++]=index-1;
  }
  
  for(int i=0;i<seqidx;i++){
    for(int j=seq[i];j<=seq[i+1];j++){
      sum+=arr[j];
    }
    if(max<sum){
      max=sum;
      sum=0;
    }
  }
  
  printf("%d",max);
  return 0;
}