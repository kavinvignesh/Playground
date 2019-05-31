#include <stdio.h>
void gcd(int n1,int n2,int n3){
  int g=0,g1=0;
  if(n1<n2)
    g = n1;
  else
    g = n2;
  while(g){
    if(n1%g==0 && n2%g==0)
      break;
    else
      g--;
  }
  if(g>n3)
    g1=n3;
  else
    g1=g;
  while(g){
    if(g%g1==0 && n3%g1==0)
      break;
    else
      g1--;
  }
  printf("%d",g1);
}
int main(){
	// Type your code here
  int n1=0,n2=0,n3=0;
  scanf("%d %d %d",&n1,&n2,&n3);
  gcd(n1,n2,n3);
  return 0;
}