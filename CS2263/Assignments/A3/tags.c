#include "tags.h"

int exists(char **tags, char *arr, int *tagCounts, int *tagNum) {
    char **end = tags + (*tagNum);

    while (tags < end) {
        char *tagPtr = *tags;
        char *arrPtr = arr;
        while (*tagPtr && *arrPtr &&
               *tagPtr != '>' && *tagPtr != ' ' && *tagPtr != '/' &&
               *arrPtr != '>' && *arrPtr != ' ' && *arrPtr != '/' &&
               *tagPtr == *arrPtr) {
            tagPtr++;
            arrPtr++;
        }
        if ((*tagPtr == '>' || *tagPtr == ' ' || *tagPtr == '/' ) &&
            (*arrPtr == '>' || *arrPtr == ' ' || *arrPtr == '/' )) 
        {
            (*tagCounts)++;
            return 1;
        }

        tags++;
        tagCounts++;
    }
    return 0;
}