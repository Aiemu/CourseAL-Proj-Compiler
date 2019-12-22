int main(){
    char s1[] = 'sadas';
    for(int i = 0; i < (int)(strlen(s1) / 2); i++) {
        if(s1[i] != s1[strlen(s1) - i - 1]) {
            printf("s1 is not palindrome\n");
            return 0;
        }
    }
    printf("s1 is palindrome\n");
    return 0;
}