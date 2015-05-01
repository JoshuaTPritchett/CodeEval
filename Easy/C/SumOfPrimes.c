#include <stdio.h>
int main(int argc, const char* argv[]){
	  
	int number = 2;
	int count = 0;
	int sum = 0;
	while(count < 1000){
		if(isPrime(number)){
			sum += number;
			count++;
		}
	number++;
	}
	printf("%d", sum);
}
int isPrime(unsigned int number) {
    	if (number <= 1) return 0; // zero and one are not prime
    	unsigned int i;
    	for (i=2; i*i<=number; i++) {
        	if (number % i == 0) return 0;
    	}
    	return 1;
}
