#include<stdio.h>
#include<string.h>
void rem(char st1[],int i){
  for(int j=i;j<strlen(st1);j++){
    st1[j]=st1[j+4];
  }
}
int main()
{
	//Try out your code here
  char  st1[100]={"\0"},st2[]="the";
  int a=0,p=0;
  scanf("%[^\n]s",st1);
  for(int i=0;i<strlen(st1);i++){
    if(st1[i]>=65&&st1[i]<=90)
      st1[i]+=32;
  }
  for(int i=0;i<strlen(st1);i++){
    p=0;
    if(st1[i]==st2[p++]){
        if(st1[i+1]==st2[p++]){
         if(st1[i+2]==st2[p]){
          	a=i;
          	rem(st1,a);
        }
      }
    }
  }
  printf("%s",st1);
	return 0;
}