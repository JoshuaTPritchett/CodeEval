#include <stdio.h>
#include <string.h>
int main(int argc, const char * argv[]){
	FILE *file = fopen(argv[1], "r");
	char line[1024];
	while(fgets(line, 1024, file)){
		int i;
		for( i = 0; i < strlen(line); i++){
			if(line[i] >= 'A' && line[i] <= 'Z')
				line[i] = tolower(line[i]);
			else if(line[i] >= 'a' && line[i] <='z')
				line[i] = toupper(line[i]);
			
		}
		printf("%s\n", line);
	}
}
