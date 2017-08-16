package baway.com.finaldomew;

import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

/**
 * Created by Administrator on 2017/8/15.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    List<User.美女Bean> list;
    public MyAdapter(List<User.美女Bean> list) {
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        switch (viewType){
//            case 0:
//                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item01, parent, false);
//                MyViewHolder holder = new MyViewHolder(view);
//                return holder;
//            case 0:
                View view1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item02, parent, false);
                TwoViewHolder holder1 = new TwoViewHolder(view1);
                return holder1;
//           default:
//                View view2= LayoutInflater.from(parent.getContext()).inflate(R.layout.item03, parent, false);
//               ThreeViewHolder holder2 = new ThreeViewHolder(view2);
//                return holder2;

        }

//    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            if (holder instanceof MyViewHolder){
                MyViewHolder my= (MyViewHolder) holder;
                my.textView.setText("多条目我来啦！");
            }else  if (holder instanceof TwoViewHolder){
                TwoViewHolder two= (TwoViewHolder) holder;
//                two.t_name.setText(list.get(position).getTitle());
                x.image().bind(two.t_img,list.get(position).getImg());

            }else  if (holder instanceof ThreeViewHolder){
                ThreeViewHolder three= (ThreeViewHolder) holder;
                three.s_name.setText(list.get(position).getTitle());
                x.image().bind(three.s_left,list.get(position).getImg());
                x.image().bind(three.s_right,list.get(position).getImgsrc());
            }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
//写一个方法
public User.美女Bean getItem(int position) {
    return list.get(position);
}

    static  class MyViewHolder extends RecyclerView.ViewHolder{
        @ViewInject(R.id.one_font)
        TextView textView;
        public MyViewHolder(View itemView) {
            super(itemView);
            x.view().inject(this,itemView);
        }
    }

    static  class TwoViewHolder extends RecyclerView.ViewHolder{
        @ViewInject(R.id.two_font)
        TextView t_name;
        @ViewInject(R.id.two_img)
        ImageView t_img;

        public TwoViewHolder(View itemView) {
            super(itemView);
            x.view().inject(this,itemView);
        }
    }
    static  class ThreeViewHolder extends RecyclerView.ViewHolder{
        @ViewInject(R.id.three_font)
        TextView s_name;
        @ViewInject(R.id.three_img)
       ImageView s_left;
        @ViewInject(R.id.three_imgs)
        ImageView s_right;
        public ThreeViewHolder(View itemView) {
            super(itemView);
            x.view().inject(this,itemView);
        }
    }
}
