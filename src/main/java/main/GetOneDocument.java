package main;

import com.meilisearch.sdk.Client;
import com.meilisearch.sdk.Config;
import com.meilisearch.sdk.Index;

public class GetOneDocument {

  public static void main(String[] args) throws Exception {
    Client client = new Client(new Config("http://localhost:7700", "masterKey"));
    Index index = client.index("books");
    String document = index.getDocument("1");
    System.out.println(document);
  }
}
