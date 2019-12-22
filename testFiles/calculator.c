int stackData[1000 * 2];
int stackNo[1];
int initStack() {
    int ans = stackNo[0];
    stackNo[0] = stackNo[0] + 1;
    stackData[1000 * ans] = 0;
    return ans;
}
void push(int stack, int tar) {
    int length = stackData[stack * 1000];
    if (stack >= 2 || stack < 0) {
        return;
    }
    stackData[stack * 1000 + length + 1] = tar;
    stackData[stack * 1000] = length + 1;
}
int pop(int stack) {
    if (stack >= 2) {
        return 0;
    }
    if (stack < 0) {
        return 0;
    }
    int length = stackData[stack * 1000];
    if (length <= 0) {
        return 0;
    }
    stackData[stack * 1000] = length - 1;
    return stackData[stack * 1000 + length];
}
int stackEmpty(int stack) {
    if (stack >= 2) {
        return 1;
    }
    if (stack < 0) {
        return 1;
    }
    int length = stackData[stack * 1000];
    if (length == 0) {
        return 1;
    }
    return 0;
}
int getTop(int stack) {
    if (stack >= 2) {
        return 0;
    }
    if (stack < 0) {
        return 0;
    }
    int length = stackData[stack * 1000];
    if (length <= 0) {
        return 0;
    }
    return stackData[stack * 1000 + length];
}

char str[] = "5+6*(3+2)-1";

int Priority(int s)
{
    if (s == '(')
    {
        return 3;
    }
    if (s == '*' || s == '/') {
        return 2;
    }
    if (s == '+' || s == '-') {
        return 1;
    }
    return 0;
}

int main()
{
    stackNo[0] = 0;
    int num = initStack();
    int opt = initStack();
    int i = 0;
    int tmp = 0;
    int j;
    int strlen_t = strlen(str);

    while (stackEmpty(opt) != 1 || i < strlen_t)
    {
        if(i < strlen_t){

        if(str[i] >= '0' && str[i] <= '9')
        {
            tmp = tmp * 10 + (int)(str[i]);
            i = i + 1;
            if (i >= strlen_t){
                push(num, tmp);
                tmp = 0;
            }
            else {

            if(str[i] >= '0' && str[i] <= '9') {
                continue;
            }
            else {
                push(num, tmp);
                tmp = 0;
            }
            }
        }
        else
        {
            if(stackEmpty(opt) || Priority(str[i]) > Priority(getTop(opt)))
            {
                push(opt, str[i]);
                i = i + 1;
                continue;
            }
            if (getTop(opt) == '(' && str[i] != ')') {
                push(opt, str[i]);
                i = i + 1;
                continue;
            }
            if(getTop(opt) == '(' && str[i] == ')')
            {
                pop(opt);
                i = i + 1;
                continue;
            }
            int ok = 0;
            if (stackEmpty(opt) != 1 && str[i] == '\0') {
                ok = 1;
            }
            if(str[i] == ')' && getTop(opt) != '(') {
                ok = 1;
            }
            if (Priority(str[i]) <= Priority(getTop(opt))) {
                ok = 1;
            }
            if (ok) {
                int opt_now = pop(opt);
                if (opt_now ==  '+') {
                    push(num, pop(num) + pop(num));
                }
                if (opt_now ==  '-') {
                    j = pop(num);
                    push(num, pop(num) - j);
                }
                if (opt_now ==  '*') {
                    push(num, pop(num) * pop(num));
                }
                if (opt_now ==  '/') {
                    j = pop(num);
                    push(num, pop(num) / j);
                }
            }
        }
        }else{
            int ok = 0;
            if (stackEmpty(opt) != 1 && i == strlen_t) {
                ok = 1;
            }
            if (ok) {
                int opt_now = pop(opt);
                if (opt_now ==  '+') {
                    push(num, pop(num) + pop(num));
                }
                if (opt_now ==  '-') {
                    j = pop(num);
                    push(num, pop(num) - j);
                }
                if (opt_now ==  '*') {
                    push(num, pop(num) * pop(num));
                }
                if (opt_now ==  '/') {
                    j = pop(num);
                    push(num, pop(num) / j);
                }
            }
        }
    }

    printf("%d\n", pop(num));
    return 0;
}