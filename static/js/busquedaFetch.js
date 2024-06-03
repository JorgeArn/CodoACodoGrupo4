// Este código JavaScript se utiliza para buscar productos en Mercado Libre
// y mostrar los resultados en la página.

// Obtengo los elementos del DOM
const formulario = document.getElementById('formulario');
const inputBusqueda = document.getElementById('inputBusqueda');

// Manejo del evento de submit del formulario
formulario.addEventListener('submit', (event) => {
    event.preventDefault();

    // Construcción de la URL para el llamado a la API dentro de la categoría Ropa y Accesorios, pidienso limite de 3 productos.
    const terminoBusqueda = inputBusqueda.value;
    const url = `https://api.mercadolibre.com/sites/MLA/search?q=${terminoBusqueda}&category=MLA1430&limit=3#json`;

    fetch(url)
        .then(respuesta => respuesta.json())
        .then(response => renderArticulos(response))

    // Función borrar y crear
    function renderArticulos(response) {

        // Borro cada seccion que tiene la clase .sectionABorrar
        const secciones = document.querySelectorAll(".sectionABorrar");
        for (const seccion of secciones) {
            seccion.parentNode.removeChild(seccion);
        }

        // Renderizo los artículos
        const articulos = response.results;
        let card = '';
        for (let articulo of articulos) {
            card += `
                <div class="card">
                    <img src="${articulo.thumbnail}"
                        class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">${articulo.title}</h5>
                        <p class="card-text">
                        </p>
                        <a href="articuloInfo.html?id=${articulo.id}" class="btn btn-primary" >Ver mas</a>
                    </div>
                </div>
                `
            console.log(articulo);
        }
        document.querySelector('.cards').innerHTML = card;
    }
});