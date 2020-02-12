package com.app.uabc.main;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {

        Gson gson=new Gson();
        Persona persona=new Persona();
        persona.setEdad(33);
        persona.setNombre("Rosendo R. Sosa");
        persona.setOtaku(true);

        String json=gson.toJson(persona);
        System.err.println(json);
    String jsonRevege="{\"nombre\":\"Jaime Solis\"," +
            "\"edad\":45,\"otaku\":false,\"diasVivo\": 7}\n";

      Persona zombie=  gson.fromJson(jsonRevege,Persona.class);

        System.err.println(zombie.getNombre());
        System.err.println(zombie.getEdad());
        System.err.println(zombie.getDiasVivo());

    }

}
