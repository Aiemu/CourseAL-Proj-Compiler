s = "abcdefgabdef"
t = "ab"
next = [0] * 1000


def computeNext():
	length_t = len(t)
	index_t = 0
	next[index_t]=0
	index_moving = 1
	while index_moving<length_t+1:
		while index_moving<length_t and index_t<length_t and t[index_moving] == t[index_t]:
			index_t += 1
			index_moving += 1
			next[index_moving]=index_t
			continue
		if index_moving == length_t: 
			next[index_moving]=index_t
			break
		if t[index_moving] != t[index_t]: 
			while index_t != 0 and t[index_moving] != t[index_t]:
				index_t=next[index_t]
			next[index_moving]=index_t
			index_moving += 1
			continue
		index_moving += 1


def main():
	computeNext()
	length_s = len(s)
	length_t = len(t)
	if length_t == 0: 
		print("empty template string!\n")
		return
	index_t = 0
	index_s = 0
	while index_s<length_s:
		while index_s<length_s and index_t<length_t and s[index_s] == t[index_t]:
			index_t += 1
			index_s += 1
		if index_t == length_t: 
			print("%d\n" % (index_s-length_t))
			index_t=next[index_t]
			continue
		if index_s == length_s: 
			break
		while index_t != 0 and s[index_s] != t[index_t]:
			index_t=next[index_t]
		index_s += 1
		

if __name__ == '__main__': 
	main()
