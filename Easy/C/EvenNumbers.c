#include <stdio.h>
int main(int argc, const char * argv[]){
	FILE *file = fopen(argv[1], "r");
	char line[1024];
	while(fgets(line, 1024, file)){
			int x = atoi(line);
			if( x % 2)
				printf("%d\n", 0);
			else
				printf("%d\n", 1);

	}
}
