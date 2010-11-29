package net.loglesslove.tonton;

import java.util.ArrayList;
import java.util.Hashtable;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.Window;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class TontonActivity extends Activity {
	HorizontalScrollView  scrollView;
	LinearLayout linearLayout;
//	private Bitmap[] images;
	private Hashtable<Integer, Bitmap> images;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFormat(PixelFormat.TRANSLUCENT);

        int i = 0;
        Bitmap image;

		Resources r = getResources();
		images = new Hashtable<Integer, Bitmap>();
		image = BitmapFactory.decodeResource(r, R.drawable.i000);

		images.put(i++, BitmapFactory.decodeResource(r, R.drawable.i000));
		images.put(i++, BitmapFactory.decodeResource(r, R.drawable.i001));
		images.put(i++, BitmapFactory.decodeResource(r, R.drawable.i002));
		images.put(i++, BitmapFactory.decodeResource(r, R.drawable.i003));
		images.put(i++, BitmapFactory.decodeResource(r, R.drawable.i004));
		images.put(i++, BitmapFactory.decodeResource(r, R.drawable.i005));
		images.put(i++, BitmapFactory.decodeResource(r, R.drawable.i006));
		images.put(i++, BitmapFactory.decodeResource(r, R.drawable.i007));
		images.put(i++, BitmapFactory.decodeResource(r, R.drawable.i008));
		images.put(i++, BitmapFactory.decodeResource(r, R.drawable.i009));
//        images[0] = BitmapFactory.decodeResource(r, R.drawable.i000);
//        images[i++] = BitmapFactory.decodeResource(r, R.drawable.i001);
//        images[i++] = BitmapFactory.decodeResource(r, R.drawable.i002);
//        images[i++] = BitmapFactory.decodeResource(r, R.drawable.i003);
//        images[i++] = BitmapFactory.decodeResource(r, R.drawable.i004);
//        images[i++] = BitmapFactory.decodeResource(r, R.drawable.i005);
//        images[i++] = BitmapFactory.decodeResource(r, R.drawable.i006);
//        images[i++] = BitmapFactory.decodeResource(r, R.drawable.i007);
//        images[i++] = BitmapFactory.decodeResource(r, R.drawable.i008);
//        images[i++] = BitmapFactory.decodeResource(r, R.drawable.i009);
//        images[i++] = BitmapFactory.decodeResource(r, R.drawable.i010);

		int count = images.size();


//        //レイアウトの生成
//        FrameLayout layout=new FrameLayout(this);
//        layout.setBackgroundColor(Color.rgb(155,255,255));
// //       layout.setOrientation(LinearLayout.HORIZONTAL);
//        setContentView(layout);

        scrollView = new HorizontalScrollView(this);
        scrollView.setSmoothScrollingEnabled(false);

        linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);


        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(192,212);
     	layoutParams.setMargins(0, 0, 0, 0);

//        linearLayout.setLayoutParams(layoutParams);



//        scrollView.setHorizontalScrollBarEnabled(true);

        for (i = 0; i < count; i++) {
//
          ImageView imageView = new ImageView(this);
          imageView.setImageBitmap(images.get(i));


          linearLayout.addView(imageView, layoutParams);
        }

        // ScrollView に View を追加
        scrollView.addView(linearLayout);

        setContentView(scrollView);
//        setContentView(R.layout.main);
    }
}