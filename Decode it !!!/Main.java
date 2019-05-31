#include<stdio.h>
#include<string.h>
int main()
{
  //Your Code here!!
  int n=0,offset=0;
  char ch[100]={"\0"};
  scanf("%[^\n]s",ch);
  scanf("%d",&n);
  n=n%26;
  for(int i=0;i<strlen(ch);i++){
    if(ch[i]>=65&&ch[i]<=90){
      offset = ch[i]-'A';
      offset = (offset - n)%26;
      if(offset<0)
        offset+=26;
      ch[i] = offset+'A';
    }
    if(ch[i]>=97&&ch[i]<=122){
      offset = ch[i]-'a';
      offset = (offset - n)%26;
      if(offset<0)
        offset+=26;
      ch[i] = offset+'a';
    }
  }
    printf("%s",ch);
   return  0;
}