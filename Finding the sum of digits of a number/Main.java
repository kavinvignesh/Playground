#include <stdio.h>
int main() {
	//Type your code
   	char num[10]="\0";
   	int c=0,i=0,sum=0;
  	scanf("%s",num);
   	while(num[i]){
      c++;
      i++;
    }
  	i=0;
  	while(i<c){
      sum+= num[i] - '0';
      i++;
    }
  printf("%d",sum);
	return 0;
}