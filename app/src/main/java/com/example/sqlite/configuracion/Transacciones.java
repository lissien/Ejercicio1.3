package com.example.sqlite.configuracion;

public class Transacciones
{
    //Nombre de la Base de Datos
    public static final String NameDatabase = "PM011DB";
    /*Tablas de Base de Datos*/
    public static final String tablaPersonas = "personas";

    /*Campos de la tabla personas*/
    public static final String id="id";
    public static final String nombres="nombres";
    public static final String apellidos="apellidos";
    public static final String edad="edad";
    public static final String correo="correo";

    /* Transacciones DDL tabla personas*/
    public static final String CreateTablePersonas = "CREATE TABLE personas (id INTEGER PRIMARY KEY AUTOINCREMENT,"+
            "nombres TEXT, apellidos TEXT, edad INTEGER , correo TEXT)";

    public static final String DROPTABLEPersonas ="DROP TABLE IF EXISTS personas";

}
