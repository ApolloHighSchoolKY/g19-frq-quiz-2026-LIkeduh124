public static String scrambleWord(String word){
  /* To be implemented in part (a) */
  String result = "";
  for(int pos = 0; pos<word.length(); pos++)
  {
    if((word.charAt(pos)=='A')&&(pos != word.length()-1))
    {
      if(word.charAt(pos+1)!='A')
      {
        result += word.charAt(pos+1);
        result += 'A';
        pos++;
      }
    }
    else
    {
      result += word.charAt(pos);
    }
  }

  return result;

}


public static void scrambleOrRemove(List<String> wordList){
  /* To be implemented in part (b) */
  for(int pos = wordList.size()-1; pos>=0; pos--)
  {
    if(wordList.get(pos).equals(scrambleWord(wordList.get(pos))))
    {
      wordList.remove(pos);
    }
    else
    {
      wordList.set(pos) = scrambleWord(wordList.get(pos));
    }
  }

}
