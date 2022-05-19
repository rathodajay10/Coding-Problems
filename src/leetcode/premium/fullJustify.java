//package leetcode.premium;
///*
//RULES:
//    1. Words should be justified.
//    2. Each line should have maxWidth total chars ( alphabets + spaces )
//    3. Distribute spaces evenly b/w words, start distributing extra spaces from the left to right
//    4. last line - no extra spaces.
//
//    TC : O(n), where n = words.length;
//SC : O(n * L), where  L = number of lines
//
//Input: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
//Output: [ "This is an", "example of text", "justification. " ]
// */
//
//
//public class fullJustify {
//    public static void main(String[] args) {
//
//        String[] words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
//
//        fullJustify
//
//    }
//
//    public List<String> fullJustify(String[] words, int maxWidth) {
//        int lineWidth = 0, wordsWidth = 0, from = 0;
//        List<String> result = new LinkedList<>();
//        for (int i = 0; i < words.length; i++) {
//            int len = words[i].length();
//            int width = lineWidth + len;
//            if (width == maxWidth) {
//                result.add(format(words, maxWidth, from, i, wordsWidth + len));
//                from = i + 1;
//                lineWidth = wordsWidth = 0;
//                continue;
//            } else if (width > maxWidth) {
//                result.add(format(words, maxWidth, from, i - 1, wordsWidth));
//                from = i;
//                lineWidth = wordsWidth = 0;
//            }
//            lineWidth += len + 1;
//            wordsWidth += len;
//        }
//
//        if (from < words.length)
//            result.add(formatLeft(words, maxWidth, from, words.length));
//
//        return result;
//    }
//
//    private String format(String[] words, int maxWidth, int from, int to, int width) {
//        int wordsCount = to - from + 1;
//        if (wordsCount == 1) {
//            return formatLeft(words, maxWidth, from, from + 1);
//        } else {
//            return formatJustify(words, maxWidth, from, to, width);
//        }
//    }
//
//    private String formatJustify(String[] words, int maxWidth, int from, int to, int width) {
//        int gapsCount = to - from;
//        int base = (maxWidth - width) / gapsCount;
//        int extra = (maxWidth - width) % gapsCount;
//
//        StringBuilder sb = new StringBuilder();
//        String baseStr = " ".repeat(base);
//        for (int i = from; i < to; i++) {
//            sb.append(words[i]);
//            sb.append(baseStr);
//            if (extra-- > 0) sb.append(" ");
//        }
//        if (from != to)
//            sb.append(words[to]);
//        return sb.toString();
//    }
//
//    private String formatLeft(String[] words, int maxWidth, int from, int to) {
//        if (words[from].length() == maxWidth) return words[from];
//        StringBuilder sb = new StringBuilder();
//        for (int i = from; i < to; i++) {
//            sb.append(words[i]).append(" ");
//            maxWidth -= words[i].length() + 1;
//        }
//        sb.append(" ".repeat(maxWidth));
//        return sb.toString();
//    }
//}
//}
