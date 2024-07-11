const imgProducto = document.getElementById('imagen');
const imgPreview = document.getElementById('previewImagen');

const nuevoArticulo = document.getElementById('formNuevoArticulo');



imgProducto.addEventListener("change", function () {
    imgPreview.src = this.value;

});

nuevoArticulo.addEventListener("submit", (event) => {
    event.preventDefault();

    const nombre = document.getElementById('nombre').value;
    const categoria = document.getElementById('categoria').value;
    const precio = document.getElementById('precio').value;
    const stock = document.getElementById('stock').value;
    const descuento = document.getElementById('descuento').value;
    const foto = document.getElementById('imagen').value;

    //lamada a la api
    const articulo = {
        nombre: nombre,
        categoria: categoria,
        precio:precio,
        stock:stock,
        descuento:descuento,
        foto:foto,
    }

    const respuesta = fetch(url+'/addArticulo', {
        method: "POST",
        headers: {
            'Content-Type': "application/json"
        },
        body: JSON.stringify(articulo),
    });

    respuesta
    .then(response => {okIns(response)})//fulfilled
    .catch(error => dibujarError(error))//rejected
}
)

function okIns(response) {  
    
    $('#agregarModal').modal('hide');

      Swal.fire({
        title: "Agregado!",
        text: "El artículo se agrego correctamente.",
        icon: "success"
    }); 

    getArticulos();
    limpiarModal();
 
}

function dibujarError(error) {
    document.getElementById('articulos').innerHTML = error;
}

function limpiarModal(){
    document.getElementById('nombre').value = '';
    document.getElementById('categoria').value = '';
    document.getElementById('precio').value= '';
    document.getElementById('stock').value= '';
    document.getElementById('descuento').value= '';
    document.getElementById('imagen').value= '';
}





