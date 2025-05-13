#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void displayPrompt(char prompt[], int length);
void printArray (char array[], int length);

int main (int argc, char ** argv) {
    // char prompt[] = "Enter an array:\n(Enter '/' to stop)\n";
    // int promptLength = sizeOf(promptLength);
    // displayPrompt(prompt, promptLength);

    char array[] = {'H','e','l','l','o',' ','W','o','r','l','d','!'};
    int length = sizeof(array);
    printArray(array, length);

    putchar('\n');
}

void displayPrompt(char prompt[], int length) {
    for (int i = 0; i < length; i++) {
        putchar(prompt[i]);
    }
}

void printArray (char array[], int length) {
    for (int i = 0; i < length; i++) {
        putchar(array[i]);
    }
}

// char array[] = "Hello World!";
// int length = strlen(array);