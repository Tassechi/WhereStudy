package pruebafinal.com.pruebafinal;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by orimu on 03/03/2018.
 */

class AdaptadorPersonajes
        extends RecyclerView.Adapter<AdaptadorPersonajes.ViewHolderPersonajes>
        implements View.OnClickListener{




    List<PersonajeVo> listaPersonajes;
    private View.OnClickListener listener;
    private ArrayList<PersonajeVo> personajes;

    public AdaptadorPersonajes(Main2Activity main2Activity, ArrayList<PersonajeVo> listaPersonajes) {
        Log.e("personajes", String.valueOf(listaPersonajes.size()));
        this.listaPersonajes = listaPersonajes;
    }

    //recyclerviewadapter -- inicio
    @Override
    public AdaptadorPersonajes.ViewHolderPersonajes onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolderPersonajes(view);

    }

    @Override
    public void onBindViewHolder(AdaptadorPersonajes.ViewHolderPersonajes holder, int position) {

        PersonajeVo personajesVo = listaPersonajes.get(position);
        if (personajesVo.getNombre() != null && !personajesVo.getNombre().isEmpty()){
            Log.e("personaje", personajesVo.getNombre());
        }
        holder.etiNombre.setText(personajesVo.getNombre());
        holder.foto.setImageResource(personajesVo.getFoto());
    }

    @Override
    public int getItemCount() {
        return listaPersonajes.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;

    }

    @Override
    public void onClick(View v) {

        if(listener!=null){
            listener.onClick(v);
        }

    }

    public void setPersonajes(List<PersonajeVo> personajes) {
        this.listaPersonajes = personajes;
        Log.e("newPersonajes", String.valueOf(personajes.size()));
        notifyDataSetChanged();
    }

    //recyclerviewadapter -- fin
    public class ViewHolderPersonajes extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView etiNombre;
        ImageView foto;


        public ViewHolderPersonajes(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            etiNombre = (TextView) itemView.findViewById(R.id.texto);
            foto = (ImageView) itemView.findViewById(R.id.idImagen);


        }

        @Override
        public void onClick(View v) {



        }
    }
}
