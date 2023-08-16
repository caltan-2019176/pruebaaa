/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Compra;
import modelo.CompraDAO;
import modelo.Empleado;
import modelo.EmpleadoDAO;
import modelo.Empleados_has_Servicios;
import modelo.Empleados_has_ServiciosDAO;
import modelo.Empresa;
import modelo.EmpresaDao;
import modelo.Equipo;
import modelo.EquipoDAO;
import modelo.Equipo_has_Empleado;
import modelo.Equipo_has_EmpleadoDAO;
import modelo.MedioTransporte;
import modelo.MedioTransporteDAO;
import modelo.Proveedor;
import modelo.ProveedorDAO;
import modelo.Proveedor_has_EquipoDAO;
import modelo.Servicio;
import modelo.ServicioDAO;
import modelo.Servicio_has_Compra;
import modelo.Servicio_has_CompraDAO;
import modelo.TipoEmpleado;
import modelo.TipoEmpleadoDAO;

/**
 *
 * @author colin
 */
public class Controlador extends HttpServlet {

    MedioTransporte medioTransporte = new MedioTransporte();
    MedioTransporteDAO medioTransporteDAO = new MedioTransporteDAO();
    Servicio servicio = new Servicio();
    ServicioDAO servicioDAO = new ServicioDAO();
    Equipo equipo = new Equipo();
    EquipoDAO equipoDAO = new EquipoDAO();
    Empresa empresa = new Empresa();
    EmpresaDao empresaDao = new EmpresaDao();
    Empleado empleado = new Empleado();
    EmpleadoDAO empleadoDAO = new EmpleadoDAO();
    Compra compra = new Compra();
    CompraDAO compraDAO = new CompraDAO();
    Proveedor_has_EquipoDAO proveedor_has_EquipoDAO = new Proveedor_has_EquipoDAO();
    Proveedor_has_EquipoDAO proveedor_has_EquipoDAO1 = new Proveedor_has_EquipoDAO();
    Servicio_has_Compra servicio_has_Compra = new Servicio_has_Compra();
    Servicio_has_CompraDAO servicio_has_CompraDAO = new Servicio_has_CompraDAO();
    Proveedor proveedor = new Proveedor();
    ProveedorDAO proveedorDAO = new ProveedorDAO();
    Equipo_has_Empleado equipo_has_empleado = new Equipo_has_Empleado();
    Equipo_has_EmpleadoDAO equipo_has_EmpleadoDAO = new Equipo_has_EmpleadoDAO();
    Empleados_has_Servicios empleados_has_servicios = new Empleados_has_Servicios();
    Empleados_has_ServiciosDAO empleados_has_serviciosDAO = new Empleados_has_ServiciosDAO();
    TipoEmpleado tipoEmpleado = new TipoEmpleado();
    TipoEmpleadoDAO tipoEmpleadoDAO = new TipoEmpleadoDAO();
    int codCompra;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        if (menu.equals("Principal")) {
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        } else if (menu.equals("MedioTransporte")) {
            switch (accion) {
                case "Listar":
                    List listaMedioTransporte = medioTransporteDAO.listar();
                    request.setAttribute("medioTransportes", listaMedioTransporte);
                    break;
                case "Agregar":

                    break;
                case "Editar":

                    break;
                case "Actualizar":

                    break;
                case "Eliminar":

                    break;
            }
            request.getRequestDispatcher("MedioTransporte.jsp").forward(request, response);
        }else if (menu.equals("Empleado")){
            switch(accion){
                
                case "Listar":
                    List listaEmpleados = empleadoDAO.listar();
                    request.setAttribute("empleados", listaEmpleados);
                    break;
                case "Agregar":
                
                    break;
                case "Editar":
                
                    break;
                case "Actualizar":
                
                    break;
                case "Eliminar":
                
                    break;
            }
            request.getRequestDispatcher("Empleado.jsp").forward(request, response); 
        } else if (menu.equals("Compra")) {
            switch(accion){
                case "Listar":
                    List listaCompras = compraDAO.listar();
                    request.setAttribute("compras", listaCompras);
                    break;
                case "Agregar":
                    break;
                case "Editar":
                    break;
                case "Actualizar":
                    break;
                case "Eliminar":
                    break;
            }
            request.getRequestDispatcher("Compra.jsp").forward(request, response);
        } else if (menu.equals("Empresa")) {
            switch (accion) {
                case "Listar":
                    List listaEmpresa = empresaDao.listar();
                    request.setAttribute("empresas", listaEmpresa);
                    break;
                case "Agregar":

                    break;
                case "Editar":

                    break;
                case "Actualizar":

                    break;
                case "Eliminar":

                    break;
            }
            request.getRequestDispatcher("Empresa.jsp").forward(request, response);
        } else if (menu.equals("Proveedor")) {
            switch(accion){
                case "Listar":
                   List listaProveedor = proveedorDAO.listar();
                   request.setAttribute("proveedores", listaProveedor);
                   break;
               case "Agregar":
                   break;
               case "Editar":
                   break;
               case "Eliminar":
                   break;
            }
            request.getRequestDispatcher("Proveedor.jsp").forward(request, response);
            
        } else if (menu.equals("Equipo")) {
            switch (accion){
                case "Listar":
                    List listaEquipo = equipoDAO.listar();
                    request.setAttribute("equipos", listaEquipo);
                    break;
                case "Agregar":
                    
                    break;
                case "Editar":
                    
                    break;
                case "Actualizar":
                    
                    break;
                case "Eliminar":
                    
                    break;
            }
            request.getRequestDispatcher("Equipo.jsp").forward(request, response);
        }else if (menu.equals("Servicio")) {
            switch (accion) {
                case "Listar":
                    List listaServicio = servicioDAO.listar();
                    request.setAttribute("servicios", listaServicio);
                    break;
                case "Agregar":

                    break;
                case "Editar":

                    break;
                case "Actualizar":

                    break;
                case "Eliminar":

                    break;
            }
            request.getRequestDispatcher("Servicio.jsp").forward(request, response);
        } else if (menu.equals("TipoServicio")) {
            request.getRequestDispatcher("TipoServicio.jsp").forward(request, response);
        } else if (menu.equals("TipoEmpleado")) {
            switch (accion) {
                case "Listar":
                    List listaTiposEmpleados = tipoEmpleadoDAO.Listar();
                    request.setAttribute("tiposEmpleados", listaTiposEmpleados);
                    break;
                case "Agregar":
                    
                    break;
                case "Editar":
                    
                    break;
                case "Actualizar":
                    
                    break;
                case "Eliminar":
                    
                    break;            
            }request.getRequestDispatcher("TipoEmpleado.jsp").forward(request, response);
        } else if (menu.equals("ServicioCompra")) {
            switch (accion) {
                case "Listar":
                    List listaServicioCompra = servicio_has_CompraDAO.listar();
                    request.setAttribute("servicioCompras", listaServicioCompra);
                    break;
                case "Agregar":
                    
                    break;
                case "Editar":
                    
                    break;
                case "Actualizar":
                    
                    break;
                case "Eliminar":
                    
                    break;
            }
            request.getRequestDispatcher("ServicioCompra.jsp").forward(request, response);
        } else if (menu.equals("ProveedorEquipo")) {
            switch (accion){
                case "Listar":
                    List listaProveedorEquipo = proveedor_has_EquipoDAO.listar();
                    request.setAttribute("proveedorEquipos", listaProveedorEquipo);
                    break;
                case "Agregar":
                    
                    break;
                case "Editar":
                    
                    break;
                case "Actualizar":
                    
                    break;
                case "Eliminar":
                    
                    break;
            }
            request.getRequestDispatcher("ProveedorEquipo.jsp").forward(request, response);
        } else if (menu.equals("EquipoEmpleado")) {
            switch(accion){
                case "Listar":
                    List listaEquipoEmpleado = equipo_has_EmpleadoDAO.listar();
                    request.setAttribute("equipoEmpleados", listaEquipoEmpleado);
                    break;
                case "Agregar":
                     break;
                 case "Editar":
                     break;
                 case "Actualizar":     
                    break;
                 case "Eliminar":    
                    break;       
            }
             request.getRequestDispatcher("EquipoEmpleado.jsp").forward(request, response);
             
             
        } else if (menu.equals("EmpleadoServicio")) {
            switch (accion){
                case "Listar":
                    List listaEmpleados_has_Servicios = empleados_has_serviciosDAO.listar();
                    request.setAttribute("empleadoServicios", listaEmpleados_has_Servicios);
                    break;
                case "Agregar":
                    
                    break;
                case "Editar":
                    
                    break;
                case "Actualizar":
                    
                    break;
                case "Eliminar":
                    
                    break;
            }
            request.getRequestDispatcher("EmpleadoServicio.jsp").forward(request, response);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
