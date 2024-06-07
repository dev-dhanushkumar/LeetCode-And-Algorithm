#include<stdio.h>

int isDuckNum(int n) {
    int rem = 0;
    while(n>0) {
        rem = n % 10;
        if(rem == 0) {
            return 1;
        }
        n = n/10;
    }
    return 0;
}

void main() {
    int num;
    printf("Enter the Number to check Duck or Not: ");
    scanf("%d", &num);

    if(isDuckNum(num)) {
        printf("\n %d is a Duck Number", num);
    } else {
        printf("\n %d not a Duck Number\n", num);
    }
}