#include<stdio.h>
#include<string.h>
int main(void){
	int i;
	char str[101], copy[101], c=0;
	scanf("%s", str);
	for(i=0; i<strlen(str); i++){
		if(str[i]==65 || str[i]==69 || str[i]==73 || str[i]==79 || str[i]==85 || str[i]==89 || str[i]==97 || str[i]==101 || str[i]==105 || str[i]==111 || str[i]==117 || str[i]==121)
			continue;
		else{
			if(str[i]<97){
				copy[c]=str[i]+32;
				c++;
			}
			else{
				copy[c]=str[i];
				c++;	
			}
		}
	}		
	
	for(i=0; i<c; i++){
		printf(".%c",copy[i]);
	}
	printf("\n");
	return 0;
}