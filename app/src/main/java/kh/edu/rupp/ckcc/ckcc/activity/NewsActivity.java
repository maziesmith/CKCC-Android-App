package kh.edu.rupp.ckcc.ckcc.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import kh.edu.rupp.ckcc.ckcc.R;
import kh.edu.rupp.ckcc.ckcc.adapter.NewsAdapter;
import kh.edu.rupp.ckcc.ckcc.datamodel.Article;
import kh.edu.rupp.ckcc.ckcc.db.DbManager;

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

        //Temporary insert
        Article article = new Article(0, "News 1", "This is news 1", 0, "");


        DbManager dbManager = new DbManager(this, null, null, 1);
        dbManager.insertArticle(article);
        Article[] articles = dbManager.getAllArticles();

        // Adapter
        NewsAdapter adapter = new NewsAdapter();
        adapter.setArticles(articles);
        recyclerView.setAdapter(adapter);

    }



}
