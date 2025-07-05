#include <stdio.h>

int main() {
	int testCase;
	scanf("%d",&testCase);
	for(int i = 0; i<testCase; i++){
	   int seat;
	   scanf("%d",&seat);
	 if(seat <= 50){
	     printf("LEFT\n");
	 }
	 else{
printf("RIGHT\n");
	 }
	}
return 0;
}

