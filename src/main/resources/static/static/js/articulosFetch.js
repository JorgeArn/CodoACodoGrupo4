// Obtener el valor de "categoria" en la url del menú
const urlParams = new URLSearchParams(window.location.search);
const categoria = urlParams.get('categoria');

// Cartel de cargando... hasta que regresa el llamado de la api
document.querySelector('.cards').innerHTML = `
<h1 class="text-center fs-1 fw-bold text-white bg-dark rounded-pill">CARGANDO...</h1>`;

// Llamada a la api                                           acá toma el valor que tiene "categoria" en la url
const respuesta = fetch(`http://localhost:8080/buscarPorCat/${categoria}`)
respuesta
    .then(res => res.json())
    .then(response => renderArticulos(response))
    .catch(err => console.error(err));


// Función que crea la card de articulos
function renderArticulos(response) {
    const articulos = response;
    let card = '';
    for (let articulo of articulos) {
        card += `
        <div class="card">
            <img src="${articulo.foto}"
                class="card-img-top" alt="...">
            <div class="card-body">
                <h5 class="card-title">${articulo.nombre}</h5>
                <p class="card-text">
                </p>
                <a href="articuloInfo.html?id=${articulo.id}" class="btn btn-primary" onclick="obtenerID()">Ver mas</a>
            </div>
        </div>
        `
        console.log(articulo);
    }

    document.querySelector('.cards').innerHTML = card;

}

