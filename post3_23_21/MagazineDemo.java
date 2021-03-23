package logicblocks.post3_23_21;

import java.util.Scanner;

// Implements the interface Magazine
public class MagazineDemo implements Magazine {
    // Prints the Article
    public void postArticle(Article a) {
        System.out.println("title: " + a.title);
        System.out.println("author: " + a.author);
        System.out.println("content: " + a.content);
    }

    // Implements the interface method - getArticleLen(Article a)
    public int getArticleLen(Article a) {
        int len = a.content.length();
        System.out.println("Article has " + len + " characters.");
        return len;
    }

    // Implements the interface method - getArticleWords(Article a)
    public int getArticleWords(Article a) {
        String words[] = a.content.split(" ");
        int wordCount = words.length;
        System.out.println("Article has " + wordCount + " words.");
        return wordCount;
    }

    public static void main(String args[]) {
        System.out.print("Enter title:");
        Scanner sc = new Scanner(System.in);
        String title, author, content;
        title = sc.nextLine();

        System.out.print("Enter author name:");
        author = sc.nextLine();

        System.out.print("Enter content:");
        content = sc.nextLine();
        System.out.println("----------------");

        MagazineDemo d = new MagazineDemo();
        Article a = new Article(title, author, content);
        d.getArticleLen(a);
        d.getArticleWords(a);
        d.postArticle(a);
    }
}
