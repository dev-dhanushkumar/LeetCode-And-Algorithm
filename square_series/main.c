#include <stdio.h>

void square_series(int n, int count) {
    if (count == 0) {
        return;
    }
    printf("%d ", n * n);
    square_series(n + 1, count - 1);
}

int main() {
    int count;
    printf("Enter length of square number series: ");
    scanf("%d", &count);
    square_series(1, count);
    return 0;
}