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
  	sum = (num[0] - '0') + (num[c-1] - '0');
  	printf("%d",sum);
	return 0;
}