/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vitor
 */
public class Verify {

    public static List<Object> algarismos = new ArrayList<>();
    public static List<Object> letras = new ArrayList<>();
    public static List<Object> simbolos = new ArrayList<>();

    public static List<Object> algarismos() {
        String alg = "0123456789";
        int algi = alg.length();

        for (int i = 0; i < algi; i++) {
            algarismos.add(alg.charAt(i));
        }
        return algarismos;
    }

    public static List<Object> letras() {
        String let = "abcdfghijklmnopqrstuvwxyz";
        int algi = let.length();

        for (int i = 0; i < algi; i++) {
            letras.add(let.charAt(i));
        }
        return letras;
    }
   
    public static List<Object> simbolos() {
        String let = "!@#$%¨&*()_+}{`^~; : /  / ? > < ¹²³£¢¬§ª°  |";
        int algi = let.length();

        for (int i = 0; i < algi; i++) {
            simbolos.add(let.charAt(i));
        }
        return simbolos;
    }

    public static boolean temLetra(String s) {
        boolean tem = false;
        char analise;
        for (int i = 0; i < s.length(); i++) {
            analise = s.charAt(i);
            if (letras().contains(analise)) {
                tem = true;
                break;
            }

        }

        return tem;
    }

    public static boolean temNumero(String s) {
        boolean tem = false;
        char analise;
        for (int i = 0; i < s.length(); i++) {
            analise = s.charAt(i);
            if (algarismos().contains(analise)) {
                tem = true;
                break;
            }

        }

        return tem;

    }
    public static boolean temSimbolo(String s) {
        boolean tem = false;
        char analise;
        for (int i = 0; i < s.length(); i++) {
            analise = s.charAt(i);
            if (simbolos().contains(analise)) {
                tem = true;
                break;
            }

        }

        return tem;

    }

}
