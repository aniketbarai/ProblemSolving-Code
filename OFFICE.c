#include <stdio.h>

int main() {
	int testCase;
	scanf("%d",&testCase);
	for(int i =0; i<testCase; i++){
	    int monToThurs,fri;
	    scanf("%d %d",&monToThurs,&fri);
	    int final =(monToThurs*4)+fri;
	    printf("%d\n",final);
	}
return 0;
}

