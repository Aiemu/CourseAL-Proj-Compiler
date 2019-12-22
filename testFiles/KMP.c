char string1[] = "1234567890";
char string2[] = "678";

int next[200];

void KMP(){
    int length1 = strlen(string1);
    int length2 = strlen(string2);
    int j = 0;
    for(int i = 0; i < 200; i++){
        next[i] = 0;
    }
    int i = 1;
    for(i = 1; i < length2; i++)
    {
        while(i < length2 && j < length2 && string2[i] == string2[j])
        {
            i++;
            j++;
            next[i] = j;
        }
        while(j > 0 && string2[i] != string2[j])
        {
            j = next[j];
        }
        next[i] = j;
    }
    next[i] = j;
    j = 0;
    int temp = 0;
    while(temp < length1)
    {
        while(temp < length1 && j < length2 && string1[temp] == string2[j])
        {
            ++j;
            ++temp;
        }
        if(j == length2)
        {
            printf("from %d to %d\n", temp - length2, temp - length2 + length2);
            j = next[j];
            continue;
        }
        while(temp < length1 && j != 0 && string1[temp] != string2[j])
        {
            j = next[j];
        }
        ++temp;
    }
}

int main()
{
    KMP();
    return 0;
}