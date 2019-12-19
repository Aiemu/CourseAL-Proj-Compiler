s = "abcdefgabdef"
t = "ab"
next = []
def computeNext(): 
{
  length_t = t.length
  index_t = 0
  next[index_t] = 0
  for (let index_moving = 1; index_moving < length_t + 1; ++ index_moving): 
  {
    while(index_moving < length_t and index_t < length_t and t[index_moving] == t[index_t]): 
    {
      ++ index_t
      ++ index_moving
      next[index_moving] = index_t
    }
    if(index_moving == length_t): 
    {
      next[index_moving] = index_t
      break;
    }
    if(t[index_moving] != t[index_t]): 
    {
      while(index_t != 0 and t[index_moving] != t[index_t]): 
      {
        index_t = next[index_t]
      }
      next[index_moving] = index_t
      continue;
    }
  }
}
def main(): 
{
  computeNext()
  length_s = s.length
  length_t = t.length
  if(length_t == 0): 
  {
    print("empty template string!")
    return 0
  }
  index_t = 0
  for (let index_s = 0; index_s < length_s; ): 
  {
    while(index_s < length_s and index_t < length_t and s[index_s] == t[index_t]): 
    {
      ++ index_t
      ++ index_s
    }
    if(index_t == length_t): 
    {
      print("%d")
      index_t = next[index_t]
      continue;
    }
    if(index_s == length_s): 
    {
      break;
    }
    while(index_t != 0 and s[index_s] != t[index_t]): 
    {
      index_t = next[index_t]
    }
    ++ index_s
  }
}

if __name__ == '__main__': 
    main()
