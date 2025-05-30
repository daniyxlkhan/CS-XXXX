#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "tags.h"

# define N 100000
# define T  100

void readInput(char *fileName, char *inputArray, int *length);
void countTags(char *arr, int length);
void printTags(char **tags, int *tagCounts, int tagNum);

int main(int argc, char **argv) {
    if (argc < 2) {
        printf("Usage: %s <html_file>\n", argv[0]);
    }
    char *inputArr = malloc(N);
    int inputArrLength = 0;
    readInput(argv[1], inputArr, &inputArrLength);

    countTags(inputArr, inputArrLength);
    putchar('\n');

    free(inputArr);
}

void countTags(char *arr, int length) {
    char **tags = malloc(T * sizeof(char*)); 
    int *tagCounts = malloc(T * sizeof(int));
    memset(tagCounts, 0, T * sizeof(int)); 

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

    free(tags);
    free(tagCounts);
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

void readInput(char *fileName, char *inputArr, int *length) {
    FILE *fp = fopen(fileName, "r");
    if (fp != NULL) {
        char ch;
        while ((ch = fgetc(fp)) != EOF && *length < N - 1) {
            *(inputArr + *length) = ch;
            (*length)++;
        }
    }
    fclose(fp);
}