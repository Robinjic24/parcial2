package com.example.parcialapp2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parcialapp2.classes.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Segunda_pantalla extends AppCompatActivity {

    RecyclerView rcv_usuarios;

    List<Usuario> listaUsuarios = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.segunda_pantalla);

        rcv_usuarios = findViewById(R.id.rcv_usuarios);

        Usuario usu1 = new Usuario("https://ih1.redbubble.net/image.4108176410.3851/flat,750x,075,f-pad,750x1000,f8f8f8.jpg", "Travis Scott", "Artist", "Cactus Jack");
        Usuario usu2 = new Usuario("https://i.pinimg.com/originals/5c/54/b9/5c54b968384c83550d26cf9bdcaf9f8f.jpg", "Drake", "Artist", "Champagne Papi");
        Usuario usu3 = new Usuario("https://images.fineartamerica.com/images/artworkimages/mediumlarge/3/jackboys-poster-oliver-jager.jpg", "Cristiano Ronaldo", "Futbolista", "El bicho");

    }
}
