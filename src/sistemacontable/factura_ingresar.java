
package sistemacontable;



public class factura_ingresar {
    
    private String Fecha_de_Elaboracion;
    private String Serie;
    private String Factura;
    private String Razon_Social;
    private String Concepto;
    private String Monto;
    private String Moneda;
    private String Ret;
    private String Retencion;
    private String Neto_a_Recibir;
    private String Monto_pagado;
    private String Dif;
    private String Tipo_de_cambio;
    private String Depisito_Pesos;
    private String Fecha_de_Pago;
    private String Estatus;
    
    public factura_ingresar() {
    }

    public String getFechaElab() {
        return Fecha_de_Elaboracion;
    }

    public void setFechaElab(String FechaElab) {
        this.Fecha_de_Elaboracion = FechaElab;
    }

    public String getSer() {
        return Serie;
    }

    public void setSer(String Ser) {
        this.Serie = Ser;
    }

    public String getFact() {
        return Factura;
    }

    public void setFact(String Fact) {
        this.Factura = Fact;
    }

    public String getRazonSo() {
        return Razon_Social;
    }

    public void setRazonSo(String RazonSo) {
        this.Razon_Social = RazonSo;
    }

    public String getConcept() {
        return Concepto;
    }

    public void setConcept(String Concept) {
        this.Concepto = Concept;
    }

    public String getMont() {
        return Monto;
    }

    public void setMont(String Mont) {
        this.Monto = Mont;
    }
    
    public String getMon() {
        return Moneda;
    }

    public void setMon(String Mon) {
        this.Moneda = Mon;
    }
    
    public String getRe() {
        return Ret;
    }

    public void setRe(String Re) {
        this.Ret = Re;
    }
    
    public String getReten() {
        return Retencion;
    }

    public void setReten(String Reten) {
        this.Retencion = Reten;
    }
    
    public String getNeto() {
        return Neto_a_Recibir;
    }

    public void setNeto(String Neto) {
        this.Neto_a_Recibir = Neto;
    }
    
    public String getMontoPa() {
        return Monto_pagado;
    }

    public void setMontoPa(String MontoPa) {
        this.Monto_pagado = MontoPa;
    }
    
    public String getDi() {
        return Dif;
    }

    public void setDi(String Di) {
        this.Dif = Di;
    }
    
    public String getTipCam() {
        return Tipo_de_cambio;
    }

    public void setTipCam(String TipCam) {
        this.Tipo_de_cambio = TipCam;
    }
    
    public String getDepPe() {
        return Depisito_Pesos;
    }

    public void setDepPe(String DepPe) {
        this.Depisito_Pesos = DepPe;
    }
    
    public String getFecPag() {
        return Fecha_de_Pago;
    }

    public void setFechPag(String FecPag) {
        this.Fecha_de_Pago = FecPag;
    }
    
    public String getEst() {
        return Estatus;
    }

    public void setEst(String Est) {
        this.Estatus = Est;
    }
        
}




