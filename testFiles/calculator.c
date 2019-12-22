int data[1000 * 2];
int count[1];
char calStr[] = "1+(5-2)*4/(2+1)";

int init() {
    int ans = count[0];
    count[0] = count[0] + 1;
    data[1000 * ans] = 0;
    return ans;
}

void push(int stack, int tar) {
    int len = data[stack * 1000];
    if (stack >= 2 || stack < 0) {
        return;
    }
    data[stack * 1000 + len + 1] = tar;
    data[stack * 1000] = len + 1;
}

int pop(int stack) {
    if (stack >= 2) {
        return 0;
    }
    if (stack < 0) {
        return 0;
    }
    int len = data[stack * 1000];
    if (len <= 0) {
        return 0;
    }
    data[stack * 1000] = len - 1;
    return data[stack * 1000 + len];
}

int ifEmpty(int stack) {
    if (stack >= 2) {
        return 1;
    }
    if (stack < 0) {
        return 1;
    }
    int len = data[stack * 1000];
    if (len == 0) {
        return 1;
    }
    return 0;
}

int getStackTop(int stack) {
    if (stack >= 2) {
        return 0;
    }
    if (stack < 0) {
        return 0;
    }
    int len = data[stack * 1000];
    if (len <= 0) {
        return 0;
    }
    return data[stack * 1000 + len];
}

int order(int s) {
    if (s == '(') {
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

int main() {
    count[0] = 0;
    int num = init();
    int operator = init();
    int i = 0;
    int tmp = 0;
    int j;
    int strlen_t = strlen(calStr);

    while (ifEmpty(operator) != 1 || i < strlen_t) {
        if(i < strlen_t) {
            if(calStr[i] >= '0' && calStr[i] <= '9') {
                tmp = tmp * 10 + (int)(calStr[i]);
                i = i + 1;
                if (i >= strlen_t) {
                    push(num, tmp);
                    tmp = 0;
                }
                else {

                if(calStr[i] >= '0' && calStr[i] <= '9') {
                    continue;
                }
                else {
                    push(num, tmp);
                    tmp = 0;
                }
                }
            }
            else {
                if(ifEmpty(operator) || order(calStr[i]) > order(getStackTop(operator))) {
                    push(operator, calStr[i]);
                    i = i + 1;
                    continue;
                }
                if (getStackTop(operator) == '(' && calStr[i] != ')') {
                    push(operator, calStr[i]);
                    i = i + 1;
                    continue;
                }
                if(getStackTop(operator) == '(' && calStr[i] == ')') {
                    pop(operator);
                    i = i + 1;
                    continue;
                }
                int ok = 0;
                if (ifEmpty(operator) != 1 && calStr[i] == '\0') {
                    ok = 1;
                }
                if(calStr[i] == ')' && getStackTop(operator) != '(') {
                    ok = 1;
                }
                if (order(calStr[i]) <= order(getStackTop(operator))) {
                    ok = 1;
                }
                if (ok) {
                    int operatorNow = pop(operator);
                    if (operatorNow ==  '+') {
                        push(num, pop(num) + pop(num));
                    }
                    if (operatorNow ==  '-') {
                        j = pop(num);
                        push(num, pop(num) - j);
                    }
                    if (operatorNow ==  '*') {
                        push(num, pop(num) * pop(num));
                    }
                    if (operatorNow ==  '/') {
                        j = pop(num);
                        push(num, pop(num) / j);
                    }
                }
            }
        }
        else {
            int ok = 0;
            if (ifEmpty(operator) != 1 && i == strlen_t) {
                ok = 1;
            }
            if (ok) {
                int operatorNow = pop(operator);
                if (operatorNow ==  '+') {
                    push(num, pop(num) + pop(num));
                }
                if (operatorNow ==  '-') {
                    j = pop(num);
                    push(num, pop(num) - j);
                }
                if (operatorNow ==  '*') {
                    push(num, pop(num) * pop(num));
                }
                if (operatorNow ==  '/') {
                    j = pop(num);
                    push(num, pop(num) / j);
                }
            }
        }
    }

    printf("%d\n", pop(num));
    return 0;
}