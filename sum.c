#include<stdio.h>
int main()
{
    int i,sum=0,n;
    printf("Enter no\n");
    for(i=1;i<=10;i++)
    {
        scanf("%d",&n);
            sum=sum+n;
     }

    
    printf("The sum is %d",sum);
    return 0;
}
