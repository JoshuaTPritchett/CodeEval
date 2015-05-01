#include <stdio.h>
#include <string.h>
int main(int argc, const char * argv[]){
	FILE *file = fopen(argv[1], "r");
	char line[1024];
	while(fgets(line, 1024, file)){
		int n = atoi(strtok(line, ","));
		int m = atoi(strtok(NULL, ","));		
		int i = n;
		int numberOfPrimes = 0;
		for(; i <= m; i++){
			if(isPrime(i) == 1)
				numberOfPrimes++;
		}	
		printf("%d\n", numberOfPrimes);
	}
}
int isPrime(unsigned int number) {
    	if (number <= 1) return 0; // zero and one are not prime
    	unsigned int i;
    	for (i=2; i*i<=number; i++) {
        	if (number % i == 0) return 0;
    	}
    	return 1;
}
