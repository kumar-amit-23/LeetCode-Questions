package find_Words_That_Can_Be_Formed_by_Characters;

import java.util.HashMap;

public class Solution {
	
	public int countCharacters(String[] words, String chars) {
		HashMap<Character,Integer> hmap=new HashMap<>();
        int length=0;
        for(int i=0;i<chars.length();i++)
            hmap.put(chars.charAt(i),hmap.getOrDefault(chars.charAt(i),0)+1);
        for(int j=0;j<words.length;j++){
            int count=0;
            HashMap<Character,Integer> map=new HashMap<>();
            String ele=words[j];
            for(int k=0;k<ele.length();k++)
                map.put(ele.charAt(k),map.getOrDefault(ele.charAt(k),0)+1);
            for(int l=0;l<ele.length();l++){
                char ch=ele.charAt(l);
                    if(hmap.containsKey(ch) && hmap.get(ch)>=map.get(ch))
                        count++;
            }
            if(count==ele.length()){
                length += ele.length();
            }
        }
        return length;
        
    }

}
