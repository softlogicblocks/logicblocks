package logicblocks.post3_23_21;

// Interface Magazine - prototype of a magazine
public interface Magazine {

    // Prints the article
    void postArticle(Article a);

    // Gets the number of characters in an Article
    int getArticleLen(Article a);

    // Gets the number of words in an Article
    int getArticleWords(Article a);

    // Class Article in the interface Magazine
    class Article {
        String title;
        String author;
        String content;

        // Article class constructor
        Article(String title, String author, String content) {
            this.title = title;
            this.author = author;
            this.content = content;
        }
    }
}
