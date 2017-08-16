package baway.com.finaldomew;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Administrator on 2017/8/15.
 */

public class MyLine extends RecyclerView.ItemDecoration {
    public MyLine() {
    }
    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.set(8,8,8,8);
    }
}
