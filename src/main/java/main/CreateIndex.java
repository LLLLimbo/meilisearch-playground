package main;

import com.meilisearch.sdk.Client;
import com.meilisearch.sdk.Config;
import com.meilisearch.sdk.Index;

public class CreateIndex {

  public static void main(String[] args) throws Exception {
    Client client = new Client(new Config("http://localhost:7700", "masterKey"));
    Index index = client.index("books");
  }
}
