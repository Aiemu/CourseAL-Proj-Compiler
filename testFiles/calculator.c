int data[1000 * 2];
int count[1];
int orderList[4] = {0, 1, 2, 3};
char calStr[] = "1+3*6/2-2";

int init() {
    int ans = count[0];
    count[0] = count[0] + 1;
    data[1000 * ans] = 0;
    return ans;
}

int order(int opt) {
    if (opt == '(') {
        return orderList[3];
    }
    if (opt == '*' || opt == '/') {
        return orderList[2];
    }
    if (opt == '+' || opt == '-') {
        return orderList[1];
    }
    return orderList[0];
}

int ifEmpty(int stack) {
    int len = data[stack * 1000];
    if (stack < 0) {
        return 1;
    }
    if (stack >= 2) {
        return 1;
    }
    if (len == 0) {
        return 1;
    }
    return 0;
}

void push(int stack, int ele) {
    int len = data[stack * 1000];
    if (stack >= 2 || stack < 0) {
        return;
    }
    data[stack * 1000 + len + 1] = ele;
    data[stack * 1000] = len + 1;
}

int pop(int stack) {
    int len = data[stack * 1000];
    if (stack < 0) {
        return 0;
    }
    if (stack >= 2) {
        return 0;
    }
    if (len <= 0) {
        return 0;
    }
    data[stack * 1000] = len - 1;
    return data[stack * 1000 + len];
}

int getStackTop(int stack) {
    int len = data[stack * 1000];
    if (stack < 0) {
        return 0;
    }
    if (stack >= 2) {
        return 0;
    }
    if (len <= 0) {
        return 0;
    }
    return data[stack * 1000 + len];
}

int main() {
    count[0] = 0;
    int num = init();
    int operator = init();
    int i = 0;
    int tmp = 0;
    int j;
    int strlen_t = strlen(calStr);
    printf("%s = ", calStr);
    while (ifEmpty(operator) == 0 || i < strlen_t) {
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
                if (ifEmpty(operator) || order(calStr[i]) > order(getStackTop(operator))) {
                    push(operator, calStr[i]);
                    i = i + 1;
                    continue;
                }
                if (getStackTop(operator) == '(' && calStr[i] != ')') {
                    push(operator, calStr[i]);
                    i = i + 1;
                    continue;
                }
                if (getStackTop(operator) == '(' && calStr[i] == ')') {
                    pop(operator);
                    i = i + 1;
                    continue;
                }
                if ((ifEmpty(operator) != 1 && calStr[i] == '\0') || (calStr[i] == ')' && getStackTop(operator) != '(') || (order(calStr[i]) <= order(getStackTop(operator)))) {
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
            if (ifEmpty(operator) == 0 && i == strlen_t) {
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