// Sample code to read in test cases:
#include <stdio.h>
#include <string.h>
int main(int argc, const char * argv[]) {
    FILE *file = fopen(argv[1], "r");
    char line[1024], word[1024], max[1024];
	int i = 0, j = 0, first= 0;
    while (fgets(line, 1024, file)) {
			memset(max, 0, sizeof max);
			for( i = 0; i < strlen(line); i++){
				while(i < strlen(line) && !isspace(line[i]) && isalnum(line[i])){
					word[j++] = line[i++];
				}
				if(j!=0){
					word[j] ='\0';
					if(!first){
							first = !first;
							strcpy(max, word);				
					}//END FIRST VALUE IF
					if(strlen(word) > strlen(max)){
							strcpy(max,word);					
					}//END STRLEN TEST
					j = 0;
				}//END j!=0 IF
			}//END FOR
			printf("%s\n", max);
    }
    return 0;
} 
