#include <stdio.h>

int square_series(int n, int count) {
    if (count == 0) {
        return 0;
    }
    int square = n * n;
    printf("%d ", square);
    return square + square_series(n + 1, count - 1);
}

int main() {
    int count;
    printf("Enter length of square number series: ");
    scanf("%d", &count);
    int sum = square_series(1, count);
    printf("\nSum of squares: %d", sum);
    return 0;
}