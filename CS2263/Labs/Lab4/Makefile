GCC = gcc
CFLAGS = -g -Wall -Wshadow

prog: Exercise3.o tags.o
	$(GCC) $(CFLAGS) Exercise3.o tags.o -o htag1

Exercise3.o: Exercise3.c tags.h
	$(GCC) $(CFLAGS) -c Exercise3.c

tags.o: tags.c tags.h
	$(GCC) $(CFLAGS) -c tags.c

test1: prog
	./htag1 < htag1_project/inputs/sample.html > htag1_project/outputs/output1.txt

test2: prog
	./htag1 < htag1_project/outputs/output1.txt > htag1_project/outputs/output2.txt

compare: test1 test2
	diff htag1_project/outputs/output1.txt htag1_project/outputs/output2.txt

tests: compare

clean:
	rm -f *.o htag1 htag1_project/outputs/*
