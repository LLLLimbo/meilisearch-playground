package main;

import com.meilisearch.sdk.Client;
import com.meilisearch.sdk.Config;
import com.meilisearch.sdk.Index;

public class TestMeiliSearch {

  public static void main(String[] args) throws Exception {
    final String documents =
        "["
            + "{\"book_id\": 123, \"title\": \"Pride and Prejudice\"},"
            + "{\"book_id\": 456, \"title\": \"Le Petit Prince\"},"
            + "{\"book_id\": 1, \"title\": \"Alice In Wonderland\"},"
            + "{\"book_id\": 1344, \"title\": \"The Hobbit\"},"
            + "{\"book_id\": 4, \"title\": \"Harry Potter and the Half-Blood Prince\"},"
            + "{\"book_id\": 2, \"title\": \"The Hitchhiker\'s Guide to the Galaxy\"}"
            + "]";

    Client client = new Client(new Config("http://localhost:7700", "masterKey"));

    // An index is where the documents are stored.
    Index index = client.getOrCreateIndex("books");

    // If the index 'books' does not exist, MeiliSearch creates it when you first add the documents.
    index.addDocuments(documents); // => { "updateId": 0 }
  }
}
