#include <stdio.h>

int main() {
	int testCase;
	scanf("%d",&testCase);
	for(int i =0; i<testCase; i++){
	    int a,b;
	    scanf("%d %d",&a,&b);
	    int c,d;
	    scanf("%d %d",&c,&d);
	    if(c>=a && d>=b){
	        printf("POSSIBLE\n");
	    }else{
	        printf("IMPOSSIBLE\n");
	    }
	    
	}
return 0;
}

