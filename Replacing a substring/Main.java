#include<stdio.h>
#include<string.h>
int chok(char s1[100],char s2[100],char s3[100],int i){
  int check,j=0,l1,l2,l3,k;
  char alt[100];
  
  l2 = strlen(s2);
  l1 = strlen(s1);
  l3 = strlen(s3);
  while(j<l2){
    if(s1[i+j] != s2[j])
       return "\0";
    j++;
	}
   for(int i1=0;i1<i;i1++){
     alt[i1] = s1[i1];
   }
  for(j=0;j<l3;j++){
    alt[j+i] = s3[j];
  }
  k = i+j;
  for(j=(i+l2);j<l1;j++){
    alt[k++] = s1[j];
  }
  printf("%s",alt);
  return alt;
}
int main()
{
  //Type your code here
  char str1[100],str2[100],str3[100],alt[100];
  int l=0,l2=0,l3=0,cindex=0,check=0;
  gets(str1);
  gets(str2);
  gets(str3);
  l = strlen(str1);
  for(int i=0;i<l;i++){
    if(str1[i]==str2[0]){
      alt[100] = chok(str1,str2,str3,i);
      //printf("%s",alt);
      break;
    }
  }
  
  return 0;
}