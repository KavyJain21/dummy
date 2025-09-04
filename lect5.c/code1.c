#include <stdio.h>
int main()
{
   int lastdigit;
   int num;
   int sum=0;
   printf("ENTER A NUMBER");
   scanf("%d", &num);
   while(num>0)
   {
     lastdigit = num%10;
     sum=sum+lastdigit;

     
     num=num/10;
    
   }
   printf("%d",sum);

   return 0;
}