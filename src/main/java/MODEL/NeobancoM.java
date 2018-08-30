package MODEL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
//Configuracion de la tabla con anotaciones para postgresss por hibernate
@Table(name= "NeobancoM")
public class NeobancoM
{
@Id @GeneratedValue
@Column (name="id")
private int neobancoId; 

@Column (name="nombre_banco")
private String nombre_banco;

@Column (name="direccion")
private String direccion;

@Column (name="correo")
private String correo;

@Column (name="telefono")
private int telefono;

@Column (name="rif")
private String rif;

//Metodos setters y getters
public  NeobancoM(){}

public int getId(){
return neobancoId;
}
public void setId(int neobancoId){
this.neobancoId=neobancoId;
}

public String getNombre_banco(){
return nombre_banco;
}
public void setNombre_banco(String nombre_banco){
this.nombre_banco=nombre_banco;
}

public String getDireccion(){
return direccion;
}
public void setDireccion(String direccion){
this.direccion=direccion;
}

public int getTelefono(){
return telefono;
}
public void setTelefono(int telefono){
this.telefono=telefono;
}

public String getRif(){
return rif;
}
public void setRif(String rif){
this.rif=rif;
}
public String getCorreo(){
return correo;
}
public void setCorreo(String correo){
this.correo=correo;
}
}