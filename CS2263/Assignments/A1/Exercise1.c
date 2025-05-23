#include <stdio.h>
#include <stdlib.h>

void printArray (char array[], int length);

int main (int argc, char ** argv) {
    char array[] = {'H','e','l','l','o',' ','W','o','r','l','d','!'};
    int length = sizeof(array);
    printArray(array, length);
    putchar('\n');
    return 0;
}

void printArray (char array[], int length) {
    for (int i = 0; i < length; i++) {
        putchar(array[i]);
    }
}