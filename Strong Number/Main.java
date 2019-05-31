#include <stdio.h>
int fact(int n){
  int p=1;
  for(int i=1;i<=n;i++)
    p*=i;
  return p;
}
int main() {
	//Type your code
  	int num=0,sum=0,ld=0;
  	scanf("%d",&num);
  	for(int i=num;i>0;i/=10){
      ld = i%10;
      sum+=fact(ld);
    }
    if(sum == num)
      printf("Yes");
  	else
      printf("No");
  
	return 0;
}