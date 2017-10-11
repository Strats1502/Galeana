package mx.gob.galeana.adapters;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import mx.gob.galeana.R;
import mx.gob.galeana.fragments.DetalleRegionFragment;
import mx.gob.galeana.model.Region;

/**
 * Created by esva on 25/04/17.
 */

public class RVRegionAdapter extends RecyclerView.Adapter<RVRegionAdapter.RegionViewHolder>{
    private List<Region> regiones;
    private Context context;

    public RVRegionAdapter(Context context, List<Region> regiones) {
        this.context = context;
        this.regiones = regiones;
    }

    @Override
    public RegionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_region, parent, false);
        RegionViewHolder rvh = new RegionViewHolder(v);
        return rvh;
    }

    @Override
    public void onBindViewHolder(RegionViewHolder holder, int position) {
        holder.tvNombreRegion.setText(regiones.get(position).getNombre());
        holder.tvDireccionRegion.setText(regiones.get(position).getDireccion());
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return regiones.size();
    }

    public class RegionViewHolder extends RecyclerView.ViewHolder {
        TextView tvNombreRegion;
        TextView tvDireccionRegion;

        RegionViewHolder(View itemView) {
            super(itemView);
            tvNombreRegion = (TextView) itemView.findViewById(R.id.tv_nombre_region);
            tvDireccionRegion = (TextView) itemView.findViewById(R.id.tv_direccion_region);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    DetalleRegionFragment f = DetalleRegionFragment.newInstance(regiones.get(getAdapterPosition()).getIdRegion());
                    FragmentManager fragmentManager = ((AppCompatActivity)context).getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.segunda_fragment_container, f).addToBackStack(null).commit();
                }
            });
        }
    }
}
