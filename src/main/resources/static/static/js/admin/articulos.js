
const url = "http://localhost:8080";//llamada a la api


//LISTAR ARTICULOS

function getArticulos() {
    const respuesta = fetch(url + '/listarArticulos');

    respuesta
        .then(response => response.json())
        .then(response => renderArticulos(response))//fulfilled
        .catch(error => dibujarError(error))//rejected
}

function renderArticulos(response) {
    const articulos = response;

    let rows = '';
    for (let articulo of articulos) {
        rows += `
        <tr>
             <td>
              <img src="${articulo.foto}" alt="" class="img-small">
            </td>
            <td>${articulo.nombre}</td>
            <td>${articulo.categoria}</td>
            <td>${articulo.precio}</td>
            <td>${articulo.descuento}</td>
    
            <td>
              <button type="button" class="btn btn-danger" title="eliminar" onclick="delArticulo(${articulo.id})">Eliminar</button>
            </td>
        </tr>
        `
    }

    document.getElementById('articulos').innerHTML = rows;

}

//ELIMINAR ARTICULOS
function delArticulo(id) {

    Swal.fire({
        title: "¿Está seguro que quiere eliminar este articulo?",
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
        console.log(url + `/delArticulo/${id}`);
            const respuesta = fetch(url + `/delArticulo/${id}`, {
                method: 'DELETE',
            });

            respuesta
                .then(response => {okDel(response)})//fulfilled
                .catch(error => dibujarError(error))//rejected
           
        }
    });

}

function okDel(response) {
    getArticulos();
    
    Swal.fire({
        title: "Eliminado!",
        text: "El artículo se elimino correctamente.",
        icon: "success"
    });
}

function dibujarError(error) {
    document.getElementById('articulos').innerHTML = error;
}

//CREAR ARTICULO


getArticulos();
