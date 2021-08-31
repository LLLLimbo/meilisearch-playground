package main;

import cn.hutool.json.JSONUtil;
import com.meilisearch.sdk.Client;
import com.meilisearch.sdk.Config;
import com.meilisearch.sdk.Index;
import com.meilisearch.sdk.SearchRequest;
import com.meilisearch.sdk.model.SearchResult;

public class HighLightSearch {

  public static void main(String[] args) throws Exception {
    Client client = new Client(new Config("http://localhost:7700", "masterKey"));
    Index index = client.index("books");
    SearchResult results = index.search(
        new SearchRequest("Java并发")
            .setMatches(true)
            .setLimit(10)
            .setAttributesToHighlight(new String[]{"title"})
    );
    System.out.println(JSONUtil.toJsonStr(results.getHits()));
    System.out.println(results);
  }

}
