package main;

import cn.hutool.json.JSONUtil;
import com.meilisearch.sdk.Client;
import com.meilisearch.sdk.Config;
import com.meilisearch.sdk.Index;
import com.meilisearch.sdk.Settings;

public class SetRankingRule {

  public static void main(String[] args) throws Exception {
    Client client = new Client(new Config("http://localhost:7700", "masterKey"));
    Index index = client.getIndex("books");
    Settings settings = index.getSettings();
    settings.setRankingRules(new String[]{"words","typo","proximity","attribute","exactness","desc(price)"});
    index.updateSettings(settings);
    System.out.println(JSONUtil.toJsonStr(settings));
  }
}
