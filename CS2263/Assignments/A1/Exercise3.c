#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void printArray(char prompt[], int length);
void printEachNumber(unsigned int x);
void convertToDecimal(char binaryArr[], int length);

int main (int argc, char ** argv) {
    char prompt[] = {
        'E','n','t','e','r',' ','a',' ','b','i','n','a','r','y',' ',
        't','o',' ','b','e',' ','c','o','n','v','e','r','t','e','d',' ',
        't','o',' ','d','e','c','i','m','a','l',':'
    };
    int promptLength = sizeof(prompt);
    printArray(prompt, promptLength);
    
    int i = 0;
    int ch;
    char binaryArr[32];
    while ((ch = getchar()) != '\n' && i < 31) {
        binaryArr[i] = ch;    
        i++;
    }
    
    convertToDecimal(binaryArr, i);

    putchar('\n');
    return EXIT_SUCCESS;
}

void convertToDecimal(char binaryArr[], int length) {
    unsigned int result = 0;
    for (int i = 0; i < length; i++) {
        result = result * 2 + (binaryArr[i] - '0');
    }
    printEachNumber(result);
}

void printArray (char array[], int length) {
    for (int i = 0; i < length; i++) {
        putchar(array[i]);
    }
}

void printEachNumber(unsigned int x) {
    if (x == 0) {
        return;
    }
    int r = x % 10;
    printEachNumber(x/10);
    putchar(r + '0'); // Convert digit to char
}
