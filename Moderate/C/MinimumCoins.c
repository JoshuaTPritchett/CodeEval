#include <string.h>
#include <stdio.h>
int main(int argc, const char *argv[]){
	FILE *file = fopen(argv[1], "r");
	char line[1024];
	while(fgets(line, 1024, file)){
		int full = atoi(line);
		int fives = full / 5;
		full -= fives  * 5;
		int threes = full / 3;
		full -= threes * 3;
		int ones = full;
		int total =  fives + threes + ones;
		printf("%d\n", total);
	}

}
