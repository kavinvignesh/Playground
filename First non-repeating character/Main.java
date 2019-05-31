#include<stdio.h>
#include<string.h>
int main()
{
	//Try out your code here
  char st[100]={"\0"},t='\0';
  int l=0,flag=0;
  scanf("%[^\n]s",st);
  l = strlen(st);
  for(int i=0;i<l;i++){
    flag=0;
    for(int j=0;j<l;j++){
      
      if(st[i]==st[j]){
        flag++;
       
      }
    }
     if(flag==1){
       t=st[i];
       printf("%c",t);
       exit(1);
     }
  }
  printf("All the characters are repetitive");
	return 0;
}