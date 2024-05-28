// Obtener el valor de "categoria" en la url del menú
const urlParams = new URLSearchParams(window.location.search);
const categoria = urlParams.get('categoria');

// Cartel de cargando... hasta que regresa el llamado de la api
document.querySelector('.cards').innerHTML = `
<h1 class="text-center fs-1 fw-bold text-white bg-dark rounded-pill">CARGANDO...</h1>`;

// Llamada a la api                                                        acá toma el valor que tiene "categoria" en la url del nav
const respuesta = fetch(`https://api.mercadolibre.com/sites/MLA/search?q=${categoria}&limit=3#json`);

respuesta
    .then(res => res.json())
    .then(response => renderArticulos(response))
    .catch(err => console.error(err));


// Función que crea la card de articulos
function renderArticulos(response) {
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