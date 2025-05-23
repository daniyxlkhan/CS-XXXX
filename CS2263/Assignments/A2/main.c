#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "tags.h"

# define N 100000
# define T  100

void readInput(char *p, int *length);
void countTags(char *arr, int length);
int exists(char **tags, char *arr, int *tagCounts, int *tagNum);
void printTags(char **tags, int *tagCounts, int tagNum);

int main(int argc, char **argv) {
    char inputArr[N];
    int inputArrLength = 0;
    readInput(inputArr, &inputArrLength);
    
    countTags(inputArr, inputArrLength);
    putchar('\n');
}

void countTags(char *arr, int length) {
    char *tags[T];
    int tagCounts[T] = {0};
    
    int tagNum = 0;
    char *end = arr + length;
    while (arr < end) {
        if (*arr == '<' && *(arr+1) != '!' && *(arr+1) != '/') {
            if (!exists(tags, arr, tagCounts, &tagNum)) {
                *(tags+tagNum) = arr;
                tagCounts[tagNum]++;
                tagNum++;
            }
        }
        arr++;
    }
    printTags(tags, tagCounts, tagNum);
}

void printTags(char **tags, int *tagCounts, int tagNum) {
    char **end = tags + tagNum;

    while (tags < end) {
        char *tagPtr = *tags;
        while (*tagPtr != '>' && *tagPtr != ' ' && *tagPtr != '/') {
            if (*tagPtr != '<') {
                printf("%c", *tagPtr);
            }
            tagPtr++;
        }
        putchar('\t');
        printf("%i", *tagCounts);
        putchar('\n');
        tags++;
        tagCounts++;
    }
}

void readInput(char *p, int *length) {
    char ch;
    while ((ch = getchar()) != EOF && *length < N - 1) {
        *p = ch;
        p++;
        (*length)++;
    }
}