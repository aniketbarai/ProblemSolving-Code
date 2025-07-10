#include <stdio.h>

int main() {
	int testCase;
	scanf("%d",&testCase);
	while(testCase){
	    int chef,chefina;
	    scanf("%d %d",&chef,&chefina);
	    printf("%d\n",chefina - chef);
	   testCase--;
	}
	return 0;

}

