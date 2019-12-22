string1 = "1234567890"
string2 = "678"
next = [0] * 200


def KMP():
	length1 = len(string1)
	length2 = len(string2)
	j = 0
	i = 0
	while i<200:
		next[i]=0
		i += 1
	i = 1
	i = 1
	while i<length2:
		while i<length2 and j<length2 and string2[i] == string2[j]:
			i += 1
			j += 1
			next[i]=j
		while j>0 and string2[i] != string2[j]:
			j=next[j]
		next[i]=j
		i += 1
	next[i]=j
	j=0
	temp = 0
	while temp<length1:
		while temp<length1 and j<length2 and string1[temp] == string2[j]:
			j += 1
			temp += 1
		if j == length2: 
			print("from %d to %d\n"% ((temp-length2), (temp-length2+length2)), end = '')
			j=next[j]
			continue
		while temp<length1 and j != 0 and string1[temp] != string2[j]:
			j=next[j]
		temp += 1


def main():
	KMP()
	return 0


if __name__ == '__main__': 
	main()
