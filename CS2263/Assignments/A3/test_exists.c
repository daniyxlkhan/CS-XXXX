#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "tags.h"

#define T 100

int main() {
    char **tags = malloc(T * sizeof(char *));
    int *tagCounts = calloc(T, sizeof(int));
    int tagNum = 0;

    // Create a fake tag in memory
    tags[0] = "<div>";
    tagCounts[0] = 1;
    tagNum++;

    // Test tag that already exists
    char *testTag1 = "<div>";
    int result1 = exists(tags, testTag1, tagCounts, &tagNum);
    printf("exists('<div>') = %d (should be 1)\n", result1);

    // Test tag that doesn't exist
    char *testTag2 = "<span>";
    int result2 = exists(tags, testTag2, tagCounts, &tagNum);
    printf("exists('<span>') = %d (should be 0)\n", result2);

    free(tags);
    free(tagCounts);
    return 0;
}
