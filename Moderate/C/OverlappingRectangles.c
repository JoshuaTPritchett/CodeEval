#include <stdio.h>
#include <string.h>
int main(int argc, const char * argv[]){
	FILE *file = fopen(argv[1], "r");
	char line[1024];
	while(fgets(line, 1024, file)){
		//Points for A
		int P1X = atoi(strtok(line, ","));
		int P1Y = atoi(strtok(NULL, ","));
		int P2X = atoi(strtok(NULL, ","));
		int P2Y = atoi(strtok(NULL, ","));
		//Points for B
		int P3X = atoi(strtok(NULL, ","));
		int P3Y = atoi(strtok(NULL, ","));
		int P4X = atoi(strtok(NULL, ","));
		int P4Y = atoi(strtok(NULL, ","));
		if(ComparePoints(P1X, P1Y, P2X, P2Y, 
						 P3X, P3Y, P4X, P4Y) == 1)
					printf("True\n");
		else
					printf("False\n");
	}
}
int ComparePoints(int P1X, int P1Y, int P2X, int P2Y, 
				  int P3X, int P3Y, int P4X, int P4Y)
		
	{
		if(P2Y <= P3Y && P1Y >= P4Y && P2X >= P3X && P1X <= P4X)
				return 1;
		else 
				return 0;
	}
