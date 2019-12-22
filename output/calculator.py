data = [0] * 1000*2
count = [0] * 1
orderList = [0, 1, 2, 3]
calStr = "1+3*6/2-2"


def init():
	ans = count[0]
	count[0]=count[0]+1
	data[1000*ans]=0
	return ans


def order(opt):
	if opt == '(': 
		return orderList[3]
	if opt == '*' or opt == '/': 
		return orderList[2]
	if opt == '+' or opt == '-': 
		return orderList[1]
	return orderList[0]


def ifEmpty(stack):
	len = data[stack*1000]
	if stack<0: 
		return 1
	if stack>=2: 
		return 1
	if len == 0: 
		return 1
	return 0


def push(stack, ele):
	len = data[stack*1000]
	if stack>=2 or stack<0: 
		return
	data[stack*1000+len+1]=ele
	data[stack*1000]=len+1


def pop(stack):
	len = data[stack*1000]
	if stack<0: 
		return 0
	if stack>=2: 
		return 0
	if len<=0: 
		return 0
	data[stack*1000]=len-1
	return data[stack*1000+len]


def getStackTop(stack):
	len = data[stack*1000]
	if stack<0: 
		return 0
	if stack>=2: 
		return 0
	if len<=0: 
		return 0
	return data[stack*1000+len]


def main():
	count[0]=0
	num = init()
	operator = init()
	i = 0
	tmp = 0
	
	strlen_t = len(calStr)
	print("%s = " % (calStr), end ='')
	while ifEmpty(operator) == 0 or i<strlen_t:
		if i<strlen_t: 
			if calStr[i]>='0' and calStr[i]<='9': 
				tmp=tmp*10+int(calStr[i])
				i=i+1
				if i>=strlen_t: 
					push(num, tmp)
					tmp=0
				else:
					if calStr[i]>='0' and calStr[i]<='9': 
						continue
					else:
						push(num, tmp)
						tmp=0
			else:
				if ifEmpty(operator) or order(calStr[i])>order(getStackTop(operator)): 
					push(operator, calStr[i])
					i=i+1
					continue
				if getStackTop(operator) == '(' and calStr[i] != ')': 
					push(operator, calStr[i])
					i=i+1
					continue
				if getStackTop(operator) == '(' and calStr[i] == ')': 
					pop(operator)
					i=i+1
					continue
				if (ifEmpty(operator) != 1 and calStr[i] == '\0') or (calStr[i] == ')' and getStackTop(operator) != '(') or (order(calStr[i])<=order(getStackTop(operator))): 
					operatorNow = pop(operator)
					if operatorNow == '+': 
						push(num, pop(num)+pop(num))
					if operatorNow == '-': 
						j=pop(num)
						push(num, pop(num)-j)
					if operatorNow == '*': 
						push(num, pop(num)*pop(num))
					if operatorNow == '/': 
						j=pop(num)
						push(num, pop(num)/j)
		else:
			if ifEmpty(operator) == 0 and i == strlen_t: 
				operatorNow = pop(operator)
				if operatorNow == '+': 
					push(num, pop(num)+pop(num))
				if operatorNow == '-': 
					j=pop(num)
					push(num, pop(num)-j)
				if operatorNow == '*': 
					push(num, pop(num)*pop(num))
				if operatorNow == '/': 
					j=pop(num)
					push(num, pop(num)/j)
	print("%d\n"% ((pop(num))), end = '')
	return 0


if __name__ == '__main__': 
	main()
