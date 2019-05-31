#include <stdio.h>
int main() {
	//Type your code
  	int num=0;
  	scanf("%d",&num);
  	for(int i=1;i<=num;i++){
      if(num%i == 0)
        printf("%d\n",i);
    }
	return 0;
}