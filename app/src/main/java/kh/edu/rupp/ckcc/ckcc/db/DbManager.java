package kh.edu.rupp.ckcc.ckcc.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import kh.edu.rupp.ckcc.ckcc.datamodel.Article;

/**
 * CKCC
 * Created by leapkh on 5/11/17.
 */

public class DbManager extends SQLiteOpenHelper {

    public DbManager(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "ckcc.db", factory, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String sql = "create table tblArticle(id integer primary key autoincrement, " +
                "title text, content text, date integer, thumbnailUrl text)";
        sqLiteDatabase.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


    public void insertArticle(Article article){
        ContentValues row = new ContentValues();
        row.put("title", article.getTitle());
        row.put("content", article.getContent());
        row.put("date", article.getDate());
        row.put("thumbnailUrl", article.getThumbnailUrl());
        SQLiteDatabase db = getWritableDatabase();
        db.insert("tblArticle", null, row);
    }

    public Article[] getAllArticles(){
        SQLiteDatabase db = getReadableDatabase();
        String[] columns = {"id", "title", "content", "date", "thumbnailUrl"};
        Cursor cursor = db.query("tblArticle", columns, null, null, null, null, "id desc");
        Article[] articles = new Article[cursor.getCount()];
        int index = 0;
        while (cursor.moveToNext()){
            int id = cursor.getInt(0);
            String title = cursor.getString(1);
            String content = cursor.getString(2);
            int date = cursor.getInt(3);
            String thumbnailUrl = cursor.getString(4);
            Article article = new Article(id, title, content, date, thumbnailUrl);
            articles[index] = article;
            index++;
        }
        return articles;
    }

}
