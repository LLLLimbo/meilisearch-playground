package main;

import cn.hutool.json.JSONUtil;
import com.meilisearch.sdk.Client;
import com.meilisearch.sdk.Config;
import com.meilisearch.sdk.Index;

public class ListIndex {

  public static void main(String[] args) throws Exception {
    Client client = new Client(new Config("http://localhost:7700", "masterKey"));
    Index[] indices = client.getIndexList();
    System.out.println(JSONUtil.toJsonStr(indices));
  }
}
