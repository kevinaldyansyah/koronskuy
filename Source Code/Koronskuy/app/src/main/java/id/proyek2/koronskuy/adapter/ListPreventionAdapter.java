package id.proyek2.koronskuy.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import id.proyek2.koronskuy.R;
import id.proyek2.koronskuy.model.Prevention;

public class ListPreventionAdapter extends RecyclerView.Adapter<ListPreventionAdapter.ListViewHolder> {
    private ArrayList<Prevention> listPrevention;

    public ListPreventionAdapter(ArrayList<Prevention> list) {
        this.listPrevention = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_preven, viewGroup, false);
        return new ListViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Prevention hero = listPrevention.get(position);
        Glide.with(holder.itemView.getContext())
            .load(hero.getPhoto())
            .apply(new RequestOptions().override(55, 55))
            .into(holder.imgPhoto);
        holder.tvName.setText(hero.getName());
        holder.tvDetail.setText(hero.getDetail());
    }

    @Override
    public int getItemCount() {
        return listPrevention.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
