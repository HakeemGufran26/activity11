package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fbkelasc.R;
import com.example.fbkelasc.database.Teman;

import java.util.ArrayList;

public class AdapterLihatTeman  extends RecyclerView.Adapter<AdapterLihatTeman.ViewHolder>{
    private ArrayList<Teman> daftarTeman;
    private Context context;

    public AdapterLihatTeman(ArrayList<Teman> daftarTeman, Context context) {
        this.daftarTeman = daftarTeman;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_teman,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String kode, nama, telpon ;
        kode = daftarTeman.get(position).getKode();
        nama = daftarTeman.get(position).getNama();
        telpon = daftarTeman.get(position).getTelpon();

        holder.tvNama.setText(nama);
    }

    @Override
    public int getItemCount() {
        return daftarTeman.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvNama;

        ViewHolder(View v){
            super(v);
            tvNama = (TextView) v.findViewById(R.id.tv_nama);
        }
    }
}

