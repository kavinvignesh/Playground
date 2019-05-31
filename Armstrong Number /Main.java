#include <stdio.h>
#include <math.h>
int main() {
	//Type your code
  	int num=0,size=0,ld=0,sum=0;
  	scanf("%d",&num);
  	for(int i=num;i>0;i/=10)
      size++;
    for(int i=num;i>0;i/=10){
      ld = i%10;
      sum+=pow(ld,size);
    }
  	if(sum == num)
  		printf("Armstrong Number");
  	else
        printf("Not an Armstrong Number");
	return 0;
}