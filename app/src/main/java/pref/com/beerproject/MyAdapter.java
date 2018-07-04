package pref.com.beerproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kumar on 7/31/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

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

        ListItem listItem=listItems.get(position);
        holder.name.setText(listItem.getName());
        holder.style.setText(listItem.getStyle());
        holder.idfetch.setText(listItem.getId());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public TextView style;
        public TextView idfetch;


        public ViewHolder(View itemView) {
            super(itemView);

            name= (TextView) itemView.findViewById(R.id.txtName);
            style=(TextView)itemView.findViewById(R.id.txtStyle);
            idfetch=(TextView)itemView.findViewById(R.id.txtID);
        }
    }
}