<%-- 
    Document   : Proveedor
    Created on : 12/08/2023, 05:25:24 PM
    Author     : carlo
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

        <title>Proveedor</title>
         <style>

        body {
            background-color:  #ffffffa0;
        }
        .card-form {
            width: 750px;
            height: 400;
            left: 25%;
            margin-right: -150;
            margin-top: 15px;
            background-color: #b8f4f4;
        }
        .card-table {
            margin: 35px;
        }
        .action-btns {
            display: flex;
            justify-content: space-between;
        }
        .colorLabel{
            color: rgb(0, 0, 0);
        }
        .table-hover{
            text-align: center;

        }
        .btn{
            background-color: #ffffff;
            color: rgb(0, 0, 0);
        }


    </style>
    </head>
    <body>
        <div>
            <div class="card col-sm-11.5 card-form">
        <div class="card-body">
            <form action="Controlador?menu=Proveedor" method="POST">
                <div class="form-group">
                    <label class="colorLabel" for="dato">CódigoProveedor</label>
                    <input type="text" id="codigoProveedor" name="codigoProveedor" class="form-control">
                </div>
                <div class="form-group">
                    <label class="colorLabel" for="dato">NombreProveedor</label>
                    <input type="text" id="nombreProveedor" name="nombreProveedor" class="form-control">
                </div>
                <div class="form-group">
                    <label class="colorLabel" for="dato">DireccióProveedor</label>
                    <input type="text" id="direccionProveedor" name="direccionProveedor" class="form-control">
                </div>
                <div class="form-group">
                    <label class="colorLabel" for="dato">TeléfonoProveedor</label>
                    <input type="text" id="telefonoProveedor" name="telefonoProveedor" class="form-control">
                </div>
                <div class="action-btns">
                    <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                    <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                </div>
            </form>
        </div>
    </div>
    <div class="col-sm-11.5 card-table">
        <table class="table table-hover">
            <thead class="thead thead-hover">
                <tr>
                    <td ><strong>CódigoProveedor</strong></td>
                    <td><strong>NombreProveedor</strong></td>
                    <td><strong>DirecciónProveedor</strong></td>
                    <td><strong>TeléfonoProveedor</strong></td>
                    <td><strong>Acciones</strong></td>                   
                </tr>
            </thead>
            <tbody>
                <c:forEach var="proveedor" items="${proveedores}">
                    <tr>
                        <td>${proveedor.getCodigoProveedor()}</td>
                        <td>${proveedor.getNombreProveedor()}</td>
                        <td>${proveedor.getDireccionProveedor()}</td>
                        <td>${proveedor.getTelefonoProveedor()}</td>
                        <td>
                            <a class="btn btn-warning" href="">Editar</a>
                            <a class="btn btn-danger" href="">Eliminar</a>
                        </td>
                    </tr>
                 </c:forEach>   
            </tbody>
        </table>
    </div>
   </div>
    </body>
</html>

