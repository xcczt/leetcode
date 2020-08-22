package 字符串;

import java.util.HashMap;

/**
 * 给你一个字符串 s 和一个 长度相同 的整数数组 indices 。
 *
 * 请你重新排列字符串 s ，其中第 i 个字符需要移动到 indices[i] 指示的位置。
 *
 * 返回重新排列后的字符串。
 *
 */
public class _1528重新排列字符串 {
    /**
     * 写的有点多余了
     * @param s
     * @param indices
     * @return
     */
    public String restoreString(String s, int[] indices) {
        HashMap<Integer, Character> temp = new HashMap<>();
        char[] chars = s.toCharArray();
        //默认indices.length是等价与s.length
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < indices.length ; i++) {
            temp.put(indices[i],chars[i]);
        }

        for (int i = 0; i < indices.length ; i++) {
            res.append(temp.get(i));
        }
        return res.toString();
    }

    /**
     * 官方解答
     * @param s
     * @param indices
     * @return
     */
    public String restoreString1(String s, int[] indices) {
        int length = s.length();
        char[] result = new char[length];

        for (int i = 0; i < length; i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }

}
