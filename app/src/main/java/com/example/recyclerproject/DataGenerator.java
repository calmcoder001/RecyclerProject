package com.example.recyclerproject;

import android.content.Context;
import android.support.v4.content.res.ResourcesCompat;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {

    public static List<Post> getData(Context context) {

        List<Post> posts = new ArrayList<>();
        for (int i = 1; i < 5; i++) {

            Post post = new Post();

            post.setId(i);
            post.setTitle("جملات انگیزشی");
            switch (i) {

                case 1:
                    post.setContent("سخت کار کنید، ارزوهای بزرگ کنید،و هرگز تسلیم نشوید .اگر میخواهید انسان های بزرگی شوید و به  موفقیت دست یابید ");
                    post.setDate("1ساعت پیش نوشته شده توسط calmcoder001");
                    post.setPostImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.a1, null));
                    break;
                case 2:
                    post.setContent(" هدفمند بیدار شوید. با خوشنودی برختخواب بروید");
                    post.setDate("2ساعت پیش نوشته شده توسط calmcoder001");
                    post.setPostImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.a2, null));
                    break;

                case 3:
                    post.setContent(" موفقیت به سمت شما نمی اید...شما باید به سمت ان حرکت کنید!!!");
                    post.setDate("3ساعت پیش نوشته شده توسط calmcoder001");
                    post.setPostImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.a3, null));
                    break;

                case 4:
                    post.setContent("وقتی زندگی سخت تر میشود شما نیز قویتر شوید.. ");
                    post.setDate("1ساعت پیش نوشته شده توسط calmcoder001");
                    post.setPostImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.a4, null));
                    break;
            }

            posts.add(post);
        }
        return posts;
    }
}
