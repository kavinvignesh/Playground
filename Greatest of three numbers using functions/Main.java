#include <stdio.h>
void gtr(int n1,int n2,int n3){
  int g=0;
  if(n1<n2)
    g = n2;
  else
    g = n1;
  if(g<n3)
    g = n3;
  printf("%d",g);
}
int main(){
	// Type your code here
  int n1=0,n2=0,n3=0;
  scanf("%d %d %d",&n1,&n2,&n3);
  gtr(n1,n2,n3);
  return 0;
}