// Obtener el valor de "categoria" en la url del menú
const urlParams = new URLSearchParams(window.location.search);
const idArticulo = urlParams.get('id');

// Cartel de cargando... hasta que regresa el llamado de la api
document.querySelector('.card').innerHTML = `
<h1 class="text-center fs-1 fw-bold text-white bg-dark rounded-pill">CARGANDO...</h1>`;

// Llamada a la api             acá toma el valor que tiene "id" en la url del nav
const respuesta = fetch(`https://api.mercadolibre.com/items/${idArticulo}`);

respuesta
    .then(res => res.json())
    .then(response => renderArticulo(response))
    .catch(err => console.error(err));

// Función que crea la card
function renderArticulo(response) {
    const articulo = response;
    const card =  `  
    <img src="${articulo.thumbnail}" class="card-img-top" alt="${articulo.title}">
    <div class="card-body">
        <h5 class="card-title">${articulo.title}</h5>
        <p class="card-text"></p>
    </div>
    <ul class="list-group list-group-flush">     
    ${articulo.attributes ? 
        articulo.attributes
            .filter(caracteristica => caracteristica.id === "BRAND" || caracteristica.id === "MAIN_MATERIAL")
            .map(caracteristica => `<li class="list-group-item">${caracteristica.name} : ${caracteristica.value_name}</li>`)
            .join('') 
        : ''}
    
        <li class="list-group-item"><b>$ ${articulo.price}</b></li>
    </ul>
    <div class="card-body">
        <a href="#" class="card-link"
            onclick="alert('Opción no disponible, estamos trabajando en ello.')">Comprar</a>
        <a href="#" class="card-link"
            onclick="alert('Opción no disponible, estamos trabajando en ello.')">Agregar al carrito</a>
    </div>`;

    document.querySelector(".card").innerHTML = card;

}

// con esto se muestran todas las caracteristicas del articulo

/* <ul class="list-group list-group-flush">     
${articulo.attributes ? 
    articulo.attributes
        .filter(caracteristica => caracteristica.value_name !== null && caracteristica.value_name !== '')
        .map(caracteristica => `<li class="list-group-item">${caracteristica.name} : ${caracteristica.value_name}</li>`)
        .join('') 
    : ''}

    <li class="list-group-item"><b>$ ${articulo.price}</b></li>
</ul> */

