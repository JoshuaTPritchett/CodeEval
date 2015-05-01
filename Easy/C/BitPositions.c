#include <stdio.h>
#include <string.h>
int main(int argc, const char * argv[]){
	FILE *file = fopen(argv[1], "r");
	char line[1024];
	int primary = 0; 
	int first = 0; 
	int second = 0;
	int modification = 0, position, place1, place2;
	while(fgets(line, 1024, file)){
			position = 1;
			primary = atoi(strtok(line, ","));
			first = atoi(strtok(NULL, ","));
			second = atoi(strtok(NULL, ","));
			while(primary > 0){
				modification = (primary % 2);
				primary = (primary / 2);
				if(position == first)
					place1 = modification;
				if(position == second)
					place2 = modification;
				position++;
			}
			if(place1 == place2)
				printf("true\n");
			else
				printf("false\n");
	}


}
