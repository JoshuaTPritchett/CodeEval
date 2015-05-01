#include <stdio.h>
#include <string.h>
int main(int argc, const char* argv[]){
	FILE *file = fopen(argv[1], "r");
	char line[1024];
	while(fgets(line, 1024, file)){
		int i;
		if(isalpha(line[0]))
			line[0] = toupper(line[0]);
		for(i = 0; i < strlen(line); i++){
				if(isalpha(line[i]) && line[i-1] == ' ')
						line[i] = toupper(line[i]);
		}
		printf("%s", line);
	}
}
