#include <stdio.h>
#include <string.h>
int main(int argc, const char* argv[]){
	FILE *file = fopen(argv[1], "r");
	char line[1024], *character, *word[2];
	while(fgets(line, 1024, file)){
			character = strtok(line, " ");	
			while( character != NULL){
						word[0] = word[1];
						word[1] = character;
						character = strtok(NULL, " ");			
			}
			puts(word[0]);
	}

}
