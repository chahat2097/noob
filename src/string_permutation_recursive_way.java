import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class string_permutation_recursive_way {
    public List<String> permute(char input[]){
        Map<Character, Integer> countMap = new TreeMap<>();
        for(char ch : input){
            countMap.compute(ch, (key, val) -> {
                if(val == null) {
                    return 1;
                }else{
                    return val+1;
                }
            });
        }
        char str[] = new char[countMap.size()];
        int count[] = new int[countMap.size()];
        int index = 0;
        for(Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            str[index] = entry.getKey();
            count[index] = entry.getValue();
            index++;
        }
        List<String> resultlist = new ArrayList<>();
        char result[] = new char[input.length];
        permuteUtil(str, count, result, 0, resultlist);
        return resultlist;
    }

    public void permuteUtil(char str[], int count[], char result[], int level, List<String> resultlist){
        if(level == result.length){
            resultlist.add(new String(result));
            return;
        }

        for(int i=0;i<str.length;i++){
            if(count[i] == 0){
                continue;
            }
            result[level] = str[i];
            count[i]--;
            permuteUtil(str, count, result, level + 1, resultlist);
            count[i]++;
        }
    }

    private void printArray(char input[]){
        for(char ch : input){
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void main(String args[]){
        string_permutation_recursive_way sp = new string_permutation_recursive_way();
        sp.permute("MATTO".toCharArray()).forEach(s -> System.out.println(s));
    }
}
