package kh.edu.rupp.ckcc.ckcc.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import kh.edu.rupp.ckcc.ckcc.R;
import kh.edu.rupp.ckcc.ckcc.datamodel.Article;

/**
 * CKCC
 * Created by leapkh on 4/25/17.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ArticleViewHolder> {

    private Article[] articles;

    public void setArticles(Article[] articles) {
        this.articles = articles;
    }

    @Override
    public ArticleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_article, parent, false);
        ArticleViewHolder viewHolder = new ArticleViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ArticleViewHolder holder, int position) {
        Article article = articles[position];
        holder.txtTitle.setText(article.getTitle());
        holder.txtDate.setText(article.getDate() + "");
    }

    @Override
    public int getItemCount() {
        return articles.length;
    }

    class ArticleViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgThumbnail;
        private TextView txtTitle;
        private TextView txtDate;

        public ArticleViewHolder(View itemView) {
            super(itemView);

            imgThumbnail = (ImageView) itemView.findViewById(R.id.img_thumbnail);
            txtTitle = (TextView)itemView.findViewById(R.id.txt_title);
            txtDate = (TextView)itemView.findViewById(R.id.txt_date);
        }
    }

}
