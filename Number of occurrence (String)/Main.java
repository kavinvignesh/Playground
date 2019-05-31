#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char str1[100]="\0",str2[100]="\0",ch;
  int l1=0,l2=0,match=1,mcount=0;
  gets(str1);
  gets(str2);
  l1 = strlen(str1);
  l2 = strlen(str2);
  for(int i=0;i<l1;i++){
    if(str1[i]>='A' && str1[i]<='Z'){
      ch = str1[i]+32;
      str1[i] = ch;
    }
  }
  for(int i=0;i<l2;i++){
    if(str2[i]>='A' && str2[i]<='Z'){
      ch = str2[i]+32;
      str2[i] = ch;
    }
  }
  
  for(int i=0;i<(l1-l2)+1;i++){
    match = 1;
    for(int j=0;j<l2;j++){
      if(str1[i+j]!=str2[j]){
      
        match = 0;
      }
     
    }
    if(match == 1){
      mcount++;

    }
  }
  printf("%d",mcount);
  return 0;
}
