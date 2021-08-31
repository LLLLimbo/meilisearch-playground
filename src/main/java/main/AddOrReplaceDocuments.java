package main;

import com.meilisearch.sdk.Client;
import com.meilisearch.sdk.Config;
import com.meilisearch.sdk.Index;

public class AddOrReplaceDocuments {

  public static void main(String[] args) throws Exception {
    Client client = new Client(new Config("http://localhost:7700", "masterKey"));
    Index index = client.index("books");
    final String documents =
        "["
            + "{\"book_id\": 123, \"title\": \"Pride and Prejudice\",\"price\": 0},"
            + "{\"book_id\": 456, \"title\": \"Le Petit Prince\",\"price\": 0},"
            + "{\"book_id\": 1, \"title\": \"Alice In Wonderland\",\"price\": 0},"
            + "{\"book_id\": 1344, \"title\": \"The Hobbit\",\"price\": 0},"
            + "{\"book_id\": 4, \"title\": \"Harry Potter and the Half-Blood Prince\",\"price\": 0},"
            + "{\"book_id\": 2, \"title\": \"The Hitchhiker's Guide to the Galaxy\",\"price\": 0},"
            + "{\"book_id\": 1001, \"title\": \"three-body-problem\",\"price\": 100},"
            + "{\"book_id\": 1002, \"title\": \"三体-死神永生\",\"price\": 500},"
            + "{\"book_id\": 1003, \"title\": \"三体-黑暗森林\",\"price\": 300},"
            + "{\"book_id\": 1004, \"title\": \"Java编程思想\",\"price\": 20},"
            + "{\"book_id\": 1005, \"title\": \"Java并发编程的艺术\",\"price\": 25},"
            + "{\"book_id\": 1006, \"title\": \"Java并发编程实战\",\"price\": 25},"
            + "{\"book_id\": 1007, \"title\": \"Java高并发核心编程\",\"price\": 89.40}"
            + "]";
    index.addDocuments(documents);
    System.out.println(documents);
  }
}
