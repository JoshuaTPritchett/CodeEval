#include <stdio.h>
#include <string.h>

int main(int argc, const char* argv[]){
		FILE *file = fopen(argv[1], "r");
		char line[1024];
		while(fgets(line, 1024, file)){
			int x = atoi(strtok(line, " "));
			int y = atoi(strtok(NULL, " "));
			int n =  atoi(strtok(NULL, " "));
			int i;
			for(i = 1; i <= n; i++){
				if(i % y == 0 && i % x == 0)
					printf("FB");
				else if ( i % x == 0)
					printf("F");
				else if ( i % y == 0)
					printf("B");
				else 
					printf("%i", i);
				if( i < n)
					printf(" ");
			}
			printf("\n");
		}
}
