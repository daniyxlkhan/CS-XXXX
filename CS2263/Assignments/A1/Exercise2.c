#include <stdio.h>
#include <stdlib.h>

void printEachNumber(unsigned int x);

int main (int argc, char ** argv) {
    unsigned int x = 2263;
    printEachNumber(x);
    putchar('\n');
    return EXIT_SUCCESS;
}

void printEachNumber(unsigned int x) {
    if (x == 0) {
        return;
    }
    int r = x % 10;
    printEachNumber(x/10);
    putchar(r + '0'); // Convert digit to char
}