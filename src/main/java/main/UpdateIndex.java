package main;

import cn.hutool.json.JSONUtil;
import com.meilisearch.sdk.Client;
import com.meilisearch.sdk.Config;
import com.meilisearch.sdk.Index;

public class UpdateIndex {

  public static void main(String[] args) throws Exception {
    Client client = new Client(new Config("http://localhost:7700", "masterKey"));
    Index index = client.updateIndex("books","book_id");
    System.out.println(JSONUtil.toJsonStr(index));
  }

}
