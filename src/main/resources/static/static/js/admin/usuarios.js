
const url = "http://localhost:8080";//llamada a la api


//LISTAR Usuarios

function getUsuarios() {
    const respuesta = fetch(url + '/listarUsuarios');

    respuesta
        .then(response => response.json())
        .then(response => renderUsuarios(response))//fulfilled
        .catch(error => dibujarError(error))//rejected
}

function renderUsuarios(response) {
    const usuarios = response;

    let rows = '';
    for (let usuario of usuarios) {
        rows += `
        <tr>
            
            <td>${usuario.nombre}</td>
            <td>${usuario.apellido}</td>
            <td>${usuario.email}</td>
            <td>${usuario.fechaDeNacimiento}</td>
            <td>${usuario.pais}</td>
            <td>${usuario.admin}</td>
    
            <td>
              <button type="button" class="btn btn-danger" title="eliminar" onclick="delUsuario(${usuario.id})">Eliminar</button>
            </td>
        </tr>
        `
    }

    document.getElementById('usuarios').innerHTML = rows;

}

//ELIMINAR Usuarios
function delUsuario(id) {

    Swal.fire({
        title: "¿Está seguro que quiere eliminar este usuario?",
        text: "¡No puedes revertir eso!",
        icon: "warning",
        showCancelButton: true,
        confirmButtonColor: "#3085d6",
        cancelButtonColor: "#d33",
        confirmButtonText: "¡Si, eliminarlo!",
        cancelButtonText: "Cancelar"
    }).then((result) => {
        if (result.isConfirmed) {

        //llamada a la api para eliminar
        console.log(url + `/delUsuario/${id}`);
            const respuesta = fetch(url + `/delUsuario/${id}`, {
                method: 'DELETE',
            });

            respuesta
                .then(response => {okDel(response)})//fulfilled
                .catch(error => dibujarError(error))//rejected
           
        }
    });

}

function okDel(response) {
    Swal.fire({
        title: "Eliminado!",
        text: "El usuario se elimino correctamente.",
        icon: "success"
    });

    getUsuarios();
}

function dibujarError(error) {
    document.getElementById('usuarios').innerHTML = error;
}

//CREAR ARTICULO


getUsuarios();
