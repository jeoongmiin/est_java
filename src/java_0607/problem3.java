package java_0607;
/* 주어진 문장에서 category 에 해당하는 모든 단어를 출력하세요. *
 "When organizing items, always label each group with the appropriate
 category. category: books, category: electronics, category: clothing, category: kitchenware,
 and so on. " */

public class problem3 {
    public static void main(String[] args) {
        String str = "When organizing items, always label each group with the appropriate category. category: books, category: electronics, category: clothing, category: kitchenware, and so on.";
        printCategory(str);
    }
    static void printCategory(String str) {
        int i = 0;
        while (true) {
            int idx = str.indexOf("category:", i);
            if (idx == -1) {
                break;
            }
            int startIdx = idx + 9;
            int endIdx = str.indexOf(',',startIdx);
            System.out.println(str.substring(startIdx, endIdx));
            i = endIdx + 1;
        }
    }
}