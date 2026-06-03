package com.finatiol.common.response;

import java.time.LocalDateTime;

public class SuccessResponse<T> {

    private String codigo;

    private String mensaje;

    private Integer status;

    private LocalDateTime fecha;

    private T data;

    public SuccessResponse(
            String codigo,
            String mensaje,
            Integer status,
            T data) {

        this.codigo = codigo;
        this.mensaje = mensaje;
        this.status = status;
        this.fecha = LocalDateTime.now();
        this.data = data;
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

    public T getData() {
        return data;
    }
}
