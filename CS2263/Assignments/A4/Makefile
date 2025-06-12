GCC = gcc
CFLAGS = -g -Wall -Wshadow -lm

all: patient_predict

patient_predict: patient_predict.o
	$(GCC) $(CFLAGS) patient_predict.o -o patient_predict

patient_predict.o: patient_predict.c
	$(GCC) $(CFLAGS) -c patient_predict.c

test0: patient_predict
	./patient_predict MedData.txt < Test/input0.txt > Test/output0.txt

test1: patient_predict
	./patient_predict MedData.txt < Test/input1.txt > Test/output1.txt

test2: patient_predict
	./patient_predict MedData.txt < Test/input2.txt > Test/output2.txt

tests: test0 test1 test2

check0: test0
	grep "Diagnosis of the closest previous patient: 0" Test/output0.txt

check1: test1
	grep "Diagnosis of the closest previous patient: 1" Test/output1.txt

check2: test2
	grep "Diagnosis of the closest previous patient: 2" Test/output2.txt

check: check0 check1 check2
	@echo "All tests passed!"

clean:
	rm -f *.o patient_predict