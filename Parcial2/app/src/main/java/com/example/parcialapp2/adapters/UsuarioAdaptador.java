package com.example.parcialapp2.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parcialapp2.R;
import com.example.parcialapp2.classes.Usuario;
import com.squareup.picasso.Picasso;

import java.util.List;

public class UsuarioAdaptador extends RecyclerView.Adapter<UsuarioAdaptador.ViewHolder> {

    private List<Usuario> datos;

    public UsuarioAdaptador(List<Usuario> datos){
        this.datos = datos;
    }

    @NonNull
    @Override
    public UsuarioAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioAdaptador.ViewHolder holder, int position) {
        Usuario dato = datos.get(position);
        holder.bind(dato);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txt_nombre_usuario, txt_profesion_usuario, txt_apodo_usuario;

        ImageView img_user;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_nombre_usuario = itemView.findViewById(R.id.txt_nombre_usuario);
            txt_profesion_usuario = itemView.findViewById(R.id.txt_profesion_usuario);
            txt_apodo_usuario = itemView.findViewById(R.id.txt_apodo_usuario);
            img_user = itemView.findViewById(R.id.img_user);
        }

        public void bind(Usuario dato){
            txt_nombre_usuario.setText(dato.getNombre());
            txt_profesion_usuario.setText(dato.getProfesion());
            txt_apodo_usuario.setText(dato.getApodo());
            Picasso.get().load(dato.getImagen()).into(img_user);
        }

    }
}
