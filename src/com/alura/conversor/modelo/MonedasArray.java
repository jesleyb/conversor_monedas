/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.conversor.modelo;

/**
 * Arreglo estatico que contiene la informacion del tipo de cambio de divisas
 * Informacion tomada de BANXICO del dia 03 de febrero de 2023
 * https://www.banxico.org.mx/SieInternet/consultarDirectorioInternetAction.do?accion=consultarCuadroAnalitico&idCuadro=CA113&sector=6&locale=es&formatoXLS.x=1
 * Consulta_20230203-105628436.xlsx
 * @author Sony
 */
public class MonedasArray {

    private static final Moneda[] MONEDAS;

    static {
        MONEDAS = new Moneda[]{
            new Moneda("Arabia Saudita", "Riyal", 0.2665f),
            new Moneda("Argelia", "Dinar", 0.0074f),
            new Moneda("Argentina", "Peso", 0.0054f),
            new Moneda("Australia", "Dólar", 0.70435f),
            new Moneda("Bahamas", "Dólar", 1f),
            new Moneda("Barbados", "Dólar", 0.5f),
            new Moneda("Belice", "Dólar", 0.5f),
            new Moneda("Bermuda", "Dólar", 1f),
            new Moneda("Bolivia", "Boliviano", 0.1448f),
            new Moneda("Brasil", "Real", 0.1965f),
            new Moneda("Canadá", "Dólar", 0.7495f),
            new Moneda("Chile", "Peso", 0.00125f),
            new Moneda("China", "Yuan continental", 0.14804f),
            new Moneda("China", "Yuan extracontinental 2/", 0.148f),
            new Moneda("Colombia", "Peso 3/", 0.21551f),
            new Moneda("Corea del Sur", "Won 3/", 0.8116f),
            new Moneda("Costa Rica", "Colón", 0.00181f),
            new Moneda("Cuba", "Peso", 0.0417f),
            new Moneda("Dinamarca", "Corona", 0.14598f),
            new Moneda("Ecuador", "Dólar", 1f),
            new Moneda("Egipto", "Libra", 0.0331f),
            new Moneda("El Salvador", "Colón", 0.1143f),
            new Moneda("Emiratos Árabes Unidos", "Dirham", 0.2723f),
            new Moneda("Estados Unidos de América", "Dólar", 1f),
            new Moneda("Federación Rusa", "Rublo", 0.01423f),
            new Moneda("Fiyi", "Dólar", 0.4614f),
            new Moneda("Filipinas", "Peso", 0.0183f),
            new Moneda("Gran Bretaña", "Libra esterlina", 1.2307f),
            new Moneda("Guatemala", "Quetzal", 0.1273f),
            new Moneda("Guyana", "Dólar", 0.00476f),
            new Moneda("Honduras", "Lempira", 0.0406f),
            new Moneda("Hong Kong", "Dólar", 0.12758f),
            new Moneda("Hungría", "Forint", 0.00278f),
            new Moneda("India", "Rupia", 0.01222f),
            new Moneda("Indonesia", "Rupia 3/", 0.06671f),
            new Moneda("Irak", "Dinar", 0.00069f),
            new Moneda("Israel", "Shekel", 0.28943f),
            new Moneda("Jamaica", "Dólar", 0.0065f),
            new Moneda("Japón", "Yen", 0.00769f),
            new Moneda("Kenia", "Chelín", 0.008f),
            new Moneda("Kuwait", "Dinar", 3.274f),
            new Moneda("Malasia", "Ringgit", 0.2342f),
            new Moneda("Marruecos", "Dirham", 0.0979f),
            new Moneda("Mexico", "Peso", 0.0532f),
            new Moneda("Nicaragua", "Cordoba", 0.0273f),
            new Moneda("Nigeria", "Naira", 0.00217f),
            new Moneda("Noruega", "Corona", 0.1001f),
            new Moneda("Nueva Zelanda", "Dólar", 0.64605f),
            new Moneda("Panamá", "Balboa", 1f),
            new Moneda("Paraguay", "Guarani 3/", 0.1366f),
            new Moneda("Perú", "Sol", 0.26013f),
            new Moneda("Polonia", "Esloti", 0.2305f),
            new Moneda("Puerto Rico", "Dólar", 1f),
            new Moneda("Rep. Checa", "Corona", 0.04563f),
            new Moneda("Rep. de Sudáfrica", "Rand", 0.05744f),
            new Moneda("Rep. Dominicana", "Peso", 0.0176f),
            new Moneda("Rumania", "Leu", 0.2207f),
            new Moneda("Singapur", "Dólar", 0.7608f),
            new Moneda("Suecia", "Corona", 0.09548f),
            new Moneda("Suiza", "Franco", 1.0886f),
            new Moneda("Tailandia", "Baht", 0.03041f),
            new Moneda("Taiwán", "Nuevo dólar", 0.03329f),
            new Moneda("Trinidad Y Tobago", "Dólar", 0.1472f),
            new Moneda("Turquía", "Lira", 0.05316f),
            new Moneda("Ucrania", "Hryvna", 0.0271f),
            new Moneda("Unión Monetaria Europea", "Euro 4/", 1.08595f),
            new Moneda("Uruguay", "Peso", 0.0259f),
            new Moneda("Venezuela", "Bolívar digital 5/", 0.04582f),
            new Moneda("Vietnam", "Dong 3/", 0.04264f)
        };
    }

    /**
     * Obtiene el array
     * @return 
     */
    public static Moneda[] getMonedas() {
        return MONEDAS;
    }
}
