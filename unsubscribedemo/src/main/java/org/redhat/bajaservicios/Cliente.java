package org.redhat.bajaservicios;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(d6cb16eb5593187714e2164ab675f75c)
 */
@org.kie.api.definition.type.Label(value = "Cliente")
public class Cliente  implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "Agrupacion")
    @org.kie.api.definition.type.Position(value = 5)
    private org.redhat.bajaservicios.Agrupacion agrupacion;
    
    @org.kie.api.definition.type.Label(value = "Apellido1")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String apellido1;
    
    @org.kie.api.definition.type.Label(value = "IdCliente")
    @org.kie.api.definition.type.Position(value = 3)
    private java.lang.String idCliente;
    
    @org.kie.api.definition.type.Label(value = "Nombre")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String nombre;
    
    @org.kie.api.definition.type.Label(value = "Portal")
    @org.kie.api.definition.type.Position(value = 4)
    private org.redhat.bajaservicios.Portal portal;
    
    @org.kie.api.definition.type.Label(value = "Segmento")
    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.String segmento;

    public Cliente() {
    }

    public Cliente(java.lang.String nombre, java.lang.String apellido1, java.lang.String segmento, java.lang.String idCliente, org.redhat.bajaservicios.Portal portal, org.redhat.bajaservicios.Agrupacion agrupacion) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.segmento = segmento;
        this.idCliente = idCliente;
        this.portal = portal;
        this.agrupacion = agrupacion;
    }


    
    public org.redhat.bajaservicios.Agrupacion getAgrupacion() {
        return this.agrupacion;
    }

    public void setAgrupacion(org.redhat.bajaservicios.Agrupacion agrupacion) {
        this.agrupacion = agrupacion;
    }
    
    public java.lang.String getApellido1() {
        return this.apellido1;
    }

    public void setApellido1(java.lang.String apellido1) {
        this.apellido1 = apellido1;
    }
    
    public java.lang.String getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(java.lang.String idCliente) {
        this.idCliente = idCliente;
    }
    
    public java.lang.String getNombre() {
        return this.nombre;
    }

    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }
    
    public org.redhat.bajaservicios.Portal getPortal() {
        return this.portal;
    }

    public void setPortal(org.redhat.bajaservicios.Portal portal) {
        this.portal = portal;
    }
    
    public java.lang.String getSegmento() {
        return this.segmento;
    }

    public void setSegmento(java.lang.String segmento) {
        this.segmento = segmento;
    }
}
