package kh.edu.rupp.ckcc.ckcc.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import kh.edu.rupp.ckcc.ckcc.R;
import kh.edu.rupp.ckcc.ckcc.adapter.NewsAdapter;
import kh.edu.rupp.ckcc.ckcc.datamodel.Article;

/**
 * CKCC
 * Created by leapkh on 4/25/17.
 */

public class NewsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_news);

        recyclerView = (RecyclerView)findViewById(R.id.news_recyclerview);

        // Layout Manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Temporary Generated Articles
        Article article1 = new Article();
        article1.setTitle("Article 1");
        article1.setDate("25 April 17");

        Article article2 = new Article();
        article2.setTitle("Article 2");
        article2.setDate("24 April 17");

        Article article3 = new Article();
        article3.setTitle("Article 3");
        article3.setDate("23 April 17");

        String atricle9 = "This is article";

        Article[] articles = {article1, article2, article3};

        // Adapter
        NewsAdapter adapter = new NewsAdapter();
        adapter.setArticles(articles);
        recyclerView.setAdapter(adapter);

    }



}
