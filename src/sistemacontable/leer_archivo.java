/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacontable;

import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class leer_archivo {
    
    public ArrayList leer_archivo_exel(String archivo){

ArrayList lista_libros = new ArrayList();

CsvReader reader = null;

try {

reader = new CsvReader(archivo,',');

} catch (FileNotFoundException ex) {
ex.printStackTrace();
JOptionPane.showInputDialog("en leer archivo");
}

try {

reader.readHeaders();

} catch (IOException ex) {
ex.printStackTrace();
}

try {
    

    factura_ingresar list;

    while (reader.readRecord())
    {

        list=new factura_ingresar();
        list.setFechaElab(reader.get("Fecha_de_Elaboracion"));
        list.setSer(reader.get("Serie"));
        list.setFact(reader.get("Factura"));
        list.setRazonSo(reader.get("Razon_Social"));
        list.setConcept(reader.get("Concepto"));
        list.setMont(reader.get("Monto"));
        list.setMon(reader.get("Moneda"));
        list.setRe(reader.get("Ret"));
        list.setReten(reader.get("Retencion"));
        list.setNeto(reader.get("Neto_a_Recibir"));
        list.setMontoPa(reader.get("Monto_Pagado"));
        list.setDi(reader.get("Dif"));
        list.setTipCam(reader.get("Tipo_de_Cambio"));
        list.setDepPe(reader.get("Deposito_Pesos"));
        list.setFechPag(reader.get("Fecha_de_Pago"));
        list.setEst(reader.get("Estatus"));
        lista_libros.add(list); 

}

} catch (IOException ex) {
    
    ex.printStackTrace();   
    System.err.println(" en while readrecord ");
}

reader.close();

return lista_libros; // retorna una objeto de ArrayList

}
    
    
    
}
