public static boolean Solution(String magazine, String note) 
    {
        //Vector<String> vector =new Vector<String>();
        ArrayList<String> arrayList = new ArrayList<String>();
        
        StringTokenizer mag = new StringTokenizer(magazine," "); //split words in magazine String as separate tokens
        
        while (mag.hasMoreTokens()) 
                    arrayList.add(mag.nextToken()); // add all words in mag to arraylist
        
        StringTokenizer notes = new StringTokenizer(note," "); //split words in note String as separate tokens
        
        while (notes.hasMoreTokens()) //traverse through note words.
        {
            String word= notes.nextToken(); 
            
            if(arrayList.contains(word)) // if a note-word is present in mag-word, remove the word from arraylist.           
                arrayList.remove(word);
            else
                 return false; //even if one word is not present, return false.
        }
        return true; // if all words are removed, then all note-words are present in mag words.
    }
        