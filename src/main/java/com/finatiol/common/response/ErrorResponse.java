package com.finatiol.common.response;

import java.time.LocalDateTime;

public class ErrorResponse {

    private String codigo;

    private String mensaje;

    private Integer status;

    private LocalDateTime fecha;

    public ErrorResponse(
            String codigo,
            String mensaje,
            Integer status) {

        this.codigo = codigo;
        this.mensaje = mensaje;
        this.status = status;
        this.fecha = LocalDateTime.now();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Integer getStatus() {
        return status;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
}
