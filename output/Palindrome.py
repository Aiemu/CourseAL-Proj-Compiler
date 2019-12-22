

def main():
	s1 = 'sadas'
	i = 0
	while i<int(len(s1)/2):
		if s1[i] != s1[len(s1)-i-1]: 
			print("s1 is not palindrome\n"% (), end = '')
			return 0
		i += 1
	print("s1 is palindrome\n"% (), end = '')
	return 0


if __name__ == '__main__': 
	main()
