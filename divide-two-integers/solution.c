#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<limits.h>


//More efficient Method
int divide(int dividend, int divisor) {
    //check for overflow
    if((divisor == 0) ||(dividend == INT_MIN && divisor == -1)){
        return dividend-1;
    }

    //sign for result 
    int sign= ((dividend > 0) && (divisor < 0)||((dividend < 0) && (divisor > 0)))?-1:1;


    int quotient = 0;
    long absolutedividend = (dividend >= 0)? dividend: -1 * dividend;
    long abdolutedivisor =  (divisor >= 0)? divisor: -1 * divisor;

    while(absolutedividend - abdolutedivisor >= 0) {
        int shift = 0;
        while (absolutedividend-(abdolutedivisor<<1<<shift) >= 0) {
            shift++;
        }

        quotient += 1 << shift;

        absolutedividend -= abdolutedivisor << shift;
    }

    return sign  == -1? -quotient: quotient;
}

int main() {
    int d = 5;
    int n = -21474836 ;
    int div = divide(n,d);
    printf("\n%d", div);
    return 0;
}