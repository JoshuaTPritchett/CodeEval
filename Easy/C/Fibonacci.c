#include <stdio.h>
long Fib(long i);

int main(int argc, const char *argv[]){
	FILE *file = fopen(argv[1], "r");
	char line[1024];
	while(fgets(line, 1024, file)){
		int number = atoi(line);
		printf("%lu\n", Fib(number));
	}


}

long Fib(long i)
{
		if(i == 0)
			return 0;
		if(i == 1)
			return 1;
		else
			return Fib(i-1) + Fib(i-2);
	
}

