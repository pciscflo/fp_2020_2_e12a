package com.upc.relaciones.demo.negocio;

import com.upc.relaciones.demo.entidades.Cliente;
import com.upc.relaciones.demo.entidades.Pedido;

import java.util.List;

public interface NegocioVentas {
    public Cliente obtenerCliente(String dni);
    public Cliente registrarCliente(Cliente cliente);
    public List<Pedido> obtenerPedidos();
    public Cliente obtenerCliente(Long codigoPedido);
    public List<Pedido> obtenerPedidosCliente(String dni);
    public Pedido realizarPedido(Pedido pedido);
    public List<Cliente> obtenerClientes();
}
