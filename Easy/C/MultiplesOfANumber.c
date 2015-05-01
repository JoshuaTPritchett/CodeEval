#include <stdio.h>
#include <string.h>
int main(int argc, const char *argv[]){
	FILE *file = fopen(argv[1], "r");
	char line[1024];
	while(fgets(line, 1024, file)){
		
		int x = atoi(strtok(line, ","));
		int n = atoi(strtok(NULL, ","));
		int total = 0;
		while( x > total){
			total += n;
		}
		printf("%d\n", total);
	}
}
