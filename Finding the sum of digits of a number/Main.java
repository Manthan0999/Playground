#include <stdio.h>
int main() {
	int a,m,sum=0;
  scanf("%d",&a);
  int count=1;
  while(a>=count){
    m= a%10;
    sum=sum+m;
    a=a/10;
  }
  printf("%d",sum);
    
	return 0;
}