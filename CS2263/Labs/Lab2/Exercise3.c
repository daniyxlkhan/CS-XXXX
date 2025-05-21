#include <stdio.h>
#include <stdlib.h>

void calcFib(int n);

int main() {
    calcFib(10);
    return EXIT_SUCCESS;
}

void calcFib(int n) {
    int a = 0, b = 1, temp;
    if (n <= 0) {
        return;
    }
    
    printf("%d ", a);
    for (int i = 1; i < n; i++) {
        printf("%d ", b);
        temp = a + b;
        a = b;
        b = temp;
    }
}
