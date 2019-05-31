#include <stdio.h>
int main() {
	//Type your code
  	int n=0,p=1;
  	scanf("%d",&n);
  	for(int i=1;i<=n;i++)
      p*=i;
  	printf("%d",p);
	return 0;
}