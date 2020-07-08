#include<stdio.h>
#include<string.h>
int main(void){
	int i, c, count;
	char s[101], str[101];
	char *check="hello";
	scanf("%s", s);
	for(i=0; i<strlen(s); i++)
	{
		if(s[i]=='h' && c==0){
			str[c]=s[i];
			c++;
		}
		else if(s[i]=='e' && c==1){
			str[c]=s[i];
			c++;	
		}
		else if(s[i]=='l' && c==2){
			str[c]=s[i];
			c++;
		}
		else if(s[i]=='l' && c==3){
			str[c]=s[i];
			c++;
		}
		else if(s[i]=='o' && c==4){
			str[c]=s[i];
			c++;
		}
	}
	for(i=0; i<5; i++){
		count=0;
		if(check[i]!=str[i]){
			break;
		}
		else
			count++;
	}
	if(count==1)
		printf("YES\n");
	else
		printf("NO\n");
	return 0;
}