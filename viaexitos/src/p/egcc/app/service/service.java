package p.egcc.app.service;

import p.egcc.app.principal.dto.PagoDto;

public class service {
    //PagoDto dto = new PagoDto();
    public void Procesar(PagoDto dto){
       double ingresos, renta, neto;
    
    ingresos = dto.getHorasDia() * dto.getDias() * dto.getPagoHora();
    if (ingresos > 1500){
    renta = ingresos * 0.08;
    }else{
    renta = 0.0;
}
    neto = ingresos - renta;
    //REporte
    dto.setIngresos(ingresos);
    dto.setRenta(renta);
    dto.setNeto(neto);
    }
    
}
