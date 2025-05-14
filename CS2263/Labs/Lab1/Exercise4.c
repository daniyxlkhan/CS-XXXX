#include <stdio.h>
#include <stdlib.h>

void printFib(int n);

int main() {
    printFib(10);
    return EXIT_SUCCESS;
}

void printFib(int n) {
    int a = 0, b = 0, temp;
    if (n <= 0) {
        return;
    }
    printf("%d ", a);
    for (int i = 1; i < n; i++) {
        printf("%d ", b);
    }
}
