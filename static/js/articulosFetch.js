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
    .then(response => renderAbrigos(response))
    .catch(err => console.error(err));


// Función que crea la card de abrigos
function renderAbrigos(response) {
    const abrigos = response.results;
    let card = '';
    for (let abrigo of abrigos) {
        card += `
        <div class="card">
            <img src="${abrigo.thumbnail}"
                class="card-img-top" alt="...">
            <div class="card-body">
                <h5 class="card-title">${abrigo.title}</h5>
                <p class="card-text">
                </p>
                <a href="abrigo2.html" class="btn btn-primary">Ver mas</a>
            </div>
        </div>
        `
    }

    document.querySelector('.cards').innerHTML = card;
}