class Empresa {
    const property nombre = null
    const property cuit = null
    const empleados = []

    method montoaReenbolzar(){
        return empleados.sum({e => e.sueldoNeto()})
    }

    method montoTotalSueldosBrutos(){
        return empleados.sum({e => e.sueldoBruto()})
    }

    method montoTotalRetenciones(){
        return empleados.sum({e => e.retenciones()})
    }

    method liquidacionSueldo(){
        empleados.forEach({e => self.generarRecibo(e)})
    }

    method generarRecibo(empleado){
        const hoy = new Date()
        const recibo = 
        ReciboHaberes.generarse(empleado.nombre(), empleado.direccion(), hoy, empleado.sueldoBruto(), empleado.sueldoNeto())
        empleado.guardarReciboSueldo(recibo)
        
    }
}

class Empleado{
    const nombre = null
    var property direccion = null
    var property casado = false
    const fecNac = null
    const sueldoBasico = 0
    const recibosSueldo = []

    //datos empleado

    method nombre(){
        return nombre
    }

    method edad(){
        const hoy = new Date()
        return hoy.year() - fecNac.year()
    }

    //sueldo:

    method sueldoNeto(){
        return self.sueldoBruto() - self.retenciones()
    }

    method sueldoBruto(){
        return sueldoBasico
    }

    //retenciones:

    method retenciones()

    method retencionAportes()

    method retencionObraSocial(){
        return self.sueldoBruto() * 0.10
    }

    //generar recibos de sueldo:

    method guardarReciboSueldo(recibo){
        recibosSueldo.add(recibo)
    }

    method conceptosDesueldoBruto()

    method conceptoRetenciones()
}

class EmpleadoPermanente inherits Empleado{
    var property cantidadHijos = 0
    var property antiguedad = 0
    const obraSocial = null

    //datos empleado:

    method obraSocial(){
        return obraSocial
    }

    //calculos de sueldo:

    override method sueldoBruto(){
        return 
        super() + self.salarioFamiliar() + self.asignacionPorConyuge() + self.bonoAntiguedad()
    }

    method salarioFamiliar(){
        return cantidadHijos * self.asignacionPorHijo()
    }

    method asignacionPorHijo(){
        return 150
    }

    method asignacionPorConyuge(){
        return 
        if(casado) 100 else 0
    }

    method bonoAntiguedad(){
        return antiguedad * self.correspondienteAntiguedad()
    }

    method correspondienteAntiguedad(){
        return 50
    }

    //calculos de retenciones:

    override method retenciones(){
        return self.retencionObraSocial() + self.retencionAportes()
    }

    override method retencionObraSocial(){
        return super() + 20 * cantidadHijos
    }

    override method retencionAportes(){
        return self.sueldoBruto() * 0.15
    }

    //explicacion conceptos

    override method conceptosDesueldoBruto(){
        return 
        "Sueldo Bruto =" + self.sueldoBruto() ": sueldo básico =" + sueldoBasico + ", salario familiar =" + self.salarioFamiliar() + ", asignación por conyuge =" + self.asignacionPorConyuge()
    }

    override method conceptoRetenciones(){
        return 
        "Retenciones: =" + self.retenciones() ": obra social =" + self.retencionObraSocial() + ", aportes jubilatorios =" + self.retencionAportes()
    }
}

class EmpleadoTemporal inherits Empleado{
    const fechaFinDesignacion = null
    const cantHorasExtras = 0
    var property yearsAportes = 0

    //datos empleado:

    method fechaFinDesignacion(){
        return fechaFinDesignacion
    }

    //calculos de sueldo:

    override method sueldoBruto(){
        return super() + self.gananciasHorasExtra()
    }

    method gananciasHorasExtra(){
        return cantHorasExtras * self.correspondienteHorasExtra()
    }

    method correspondienteHorasExtra(){
        return 40
    }

    //calculos de retenciones:

    override method retenciones(){
        return self.retencionObraSocial() + self.retencionAportes()
    }

    override method retencionObraSocial(){
        return super() + self.correspondienteEdad()
    }

    method correspondienteEdad(){
        return 
        if(self.edad() > 50) 25 else 0
    }

    override method retencionAportes(){
        return self.sueldoBruto() + self.correspondienteRetencionesHorasExtra()
    }

    method correspondienteRetencionesHorasExtra(){
        return 5 * cantHorasExtras
    }

    //explicacion conceptos

    override method conceptosDesueldoBruto(){
        return
        "Sueldo Bruto =" + self.sueldoBruto() + ": sueldo básico =" + sueldoBasico + ", horas extra =" + self.gananciasHorasExtra()
    }

    override method conceptoRetenciones(){
        return
        "Retenciones =" + self.retenciones() + ": obra social =" + self.retencionObraSocial() + ", aportes jubilatorios =" + self.retencionAportes()
    }
}

class ReciboHaberes{
    const nombreEmpleado = null
    const direccion = null
    const fechaEmision = null
    const sueldoBruto = null
    const sueldoNeto = null

    method desgloceConceptos(empleado){
        self.infromacionBasica(empleado)
        empleado.conceptosDesueldoBruto()
        empleado.conceptoRetenciones()
    } 

    method infromacionBasica(empleado){
        return
        "Nombre:" + nombreEmpleado +
        "Dirección:" + direccion +
        "Fecha de emisión:" + fechaEmision +
        "Sueldo Bruto:" + sueldoBruto
        "Sueldo Neto:" + sueldoNeto + "(sueldo bruto - retenciones)" 
    }

    method generarse(n,e,f,sb,sn){
        const nuevoRecibo = 
        new ReciboHaberes(
                nombreEmpleado = n,
                direccion = e,
                fechaEmision = f,
                sueldoBruto = sb,
                sueldoNeto =sn
            )
        return nuevoRecibo
    }
}

class EmpleadoContratado inherits Empleado{
    const property numeroContrato = null
    var property medioDePago = null

    override method sueldoBruto(){
        return sueldoBasico
    }

    override method retenciones(){
        return 50
    }

    override method conceptosDesueldoBruto(){
        return 
        "Sueldo Bruto =" + self.sueldoBruto() + ": sueldo básico =" + sueldoBasico

    }

    override method conceptoRetenciones(){
        return 
        "Retenciones: =" + self.retenciones() + ": Gastos Administrativos Contractuales =" + self.retenciones()
    }

}