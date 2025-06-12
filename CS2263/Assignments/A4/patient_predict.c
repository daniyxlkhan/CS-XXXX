#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>

float ** dataReadIn(char *fileName, int *numRows);
float euclideanDist(float * row1, float * row2, int length);

#define NUM_OF_MEASUREMENTS 4

int main(int argc, char **argv) {
    if (argc < 2) {
        printf("Usage: %s <filename>.txt\n", argv[0]);
        return 1;
    }
    int numRows = 0;
    float **patientData = dataReadIn(argv[1], &numRows);
    if (patientData == NULL) {
        return 1;
    }

    float p1, m1, m2, m3, m4;
    printf("Input patient data: ");
    scanf("%f, %f, %f, %f, %f", &p1, &m1, &m2, &m3, &m4);
    float patientToBeDiagnosed[] = {p1, m1, m2, m3, m4};
    
    float dist;
    int closetPatientNum = 0;
    float smallestDist = euclideanDist(patientData[0], patientToBeDiagnosed, NUM_OF_MEASUREMENTS);

    for (int i = 0; i < numRows; i++) {
        dist = euclideanDist(patientData[i], patientToBeDiagnosed, NUM_OF_MEASUREMENTS);
        if (dist < smallestDist) {
            closetPatientNum = i;
            smallestDist = dist;
        }
    }

    printf("Diagnosis of the closest previous patient: %.0f \n", patientData[closetPatientNum][5]);

    for (int i = 0; i < numRows; i++) {
        free(patientData[i]);
    }
    free(patientData);
    
    return 0;
}

float euclideanDist(float * row1, float * row2, int length) {
    float sum = 0.0;
    for (int i = 1; i <= length; i++) { // skip the patient number
        float diff = row1[i] - row2[i];
        sum += diff * diff;
    }
    return sqrt(sum);
}

float ** dataReadIn(char * fileName, int * numRows) {
    FILE *fptr = fopen(fileName, "r");
    if (fptr == NULL) {
        printf("File not found!\n");
        return NULL;
    }

    int ch;
    while ((ch = fgetc(fptr)) != EOF) { // count the number of rows
        if (ch == '\n') {
            (*numRows)++;
        }
    }
    if (*numRows == 0) {
        printf("Not enough data in file!\n");
        return NULL;
    }

    float ** data = malloc((*numRows) * sizeof(float*)); // allocate space of the heap for the 2D Array
    if (data == NULL) {
        printf("Error allocating space!\n");
        return NULL;
    }
    for (int i = 0; i < *numRows; i++) {
        data[i] = malloc(6 * sizeof(float));
        if (data[i] == NULL) {
            printf("Error allocating space!\n");
            // freee all previously allocated rows
            for (int j = 0; j < i; j++) {
                free(data[j]);
            }
            free(data); 
            return NULL; 
        }
    }
    rewind(fptr); // reset file pointer to the beginning

    for (int i = 0; i < *numRows; i++) {
        fscanf(fptr, "%f,%f,%f,%f,%f,%f", &data[i][0], &data[i][1], &data[i][2], &data[i][3], &data[i][4], &data[i][5]);
    }
    fclose(fptr);

    return data;
}

