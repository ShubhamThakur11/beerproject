package pref.com.beerproject;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by kumar on 7/31/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    public static final String name ="beername";
    public static final String style="beerstyle";
    public static final String id="beerid";

    private List<ListItem> listItems;
   private Context context;


    public MyAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final ListItem listItem=listItems.get(position);
        holder.name.setText(listItem.getName());
        holder.style.setText(listItem.getStyle());
        holder.idfetch.setText(listItem.getId());
        holder.linearLay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,show_content.class);
                intent.putExtra(name,listItem.getName());
                intent.putExtra(style,listItem.getStyle());
                intent.putExtra(id,listItem.getId());
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements pref.com.beerproject.ViewHolder {

        public TextView name;
        public TextView style;
        public TextView idfetch;
        public  LinearLayout linearLay;

        public ViewHolder(View itemView) {
            super(itemView);

            name= (TextView) itemView.findViewById(R.id.txtName);
            style=(TextView)itemView.findViewById(R.id.txtStyle);
            idfetch=(TextView)itemView.findViewById(R.id.txtID);
             linearLay=(LinearLayout)itemView.findViewById(R.id.linearLayout);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos=getLayoutPosition();
                    ListItem listItem=listItems.get(pos);
                    Toast.makeText(context,"name: "+listItem.getName(),Toast.LENGTH_LONG).show();
                }
            });
        }

    }
}