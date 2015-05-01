#include <stdio.h>
#include <string.h>
//File in work in progress
int main(int argc, char const *argv[]){
	FILE *file = fopen(argv[1], "r");
	char line[1024];
	char *right;
	char *left;
	char *token;
	while(fgets(line, 1024, file)){
			int i = 0;
			left = strtok(line, ";");
			right = strtok(NULL, ";");
			token = strtok(left, ",");
			int leftNums[100];
			while(token!=NULL){
				leftNums[i] = atoi(token);
				token = strtok(NULL, ",");
				i++;
			}
			int q;
			for(q = 0; q <= i;  q++){
				printf("%d", leftNums[i]);
			}
			

		
	}

}
