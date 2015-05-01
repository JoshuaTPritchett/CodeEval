#include <stdio.h>
#include <string.h>

void getYear(char line[]);

int main(int argc, const char* argv[]){
	FILE *file = fopen(argv[1], "r");
	char line[1024];
	while(fgets(line, 1024, file)){
			getYear(line);
			printf("\n");
	}
	return 0;
}


void getYear(char *line){
		int test = atoi(line);
		
		if(test >= 0  && test <= 2) 
			printf("Still in Mama's arms");
		else if(test >= 3 && test <= 4) 
			printf("Preschool Maniac");
		else if(test >= 5 && test <= 11) 
			printf("Elementary  school");
		else if(test >= 12 && test <= 14) 
			printf("Middle school");
		else if(test >= 15 && test <= 18) 
			printf("High school");
		else if(test >= 19 && test <= 22) 
			printf("College");
		else if(test >= 23 && test <= 65) 
			printf("Working for the man");
		else if(test >= 66 && test <= 100)
			printf("The Golden Years");
		else
			printf("This program is for humans");
	}
