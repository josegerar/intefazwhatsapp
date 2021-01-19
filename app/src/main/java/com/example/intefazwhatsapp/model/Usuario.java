package com.example.intefazwhatsapp.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Usuario {

    private Integer id;
    private String nombres;
    private String appelidos;
    private String email;
    private String website;
    private String urlavatar;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombres;
    }

    public String getEmail() {
        return email;
    }

    public String getWebsite() {
        return website;
    }

    public String getAppelidos() {
        return appelidos;
    }

    public void setAppelidos(String appelidos) {
        this.appelidos = appelidos;
    }

    public void setNombre(String nombre) {
        this.nombres = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setUrlavatar(String urlavatar) {
        this.urlavatar = urlavatar;
    }

    public String getUrlavatar() {
        return urlavatar;
    }

    public Usuario(JSONObject a) throws JSONException {
        nombres =  a.getString("first_name").toString() + " " + a.getString("last_name").toString();

        email =  a.getString("email").toString() ;
        website =  a.getString("avatar").toString() ;
        urlavatar = a.getString("avatar").toString() ;


    }

    public static ArrayList<Usuario> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        for (int i = 0; i < datos.length(); i++) {
            usuarios.add(new Usuario(datos.getJSONObject(i)));
        }
        return usuarios;
    }
}
