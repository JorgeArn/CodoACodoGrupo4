// Obtener el valor de "categoria" en la url del menú

const urlParams = new URLSearchParams(window.location.search);
const id = urlParams.get('id');
console.log(id);

//const urlParams = new URLSearchParams(window.location.search);
//const id = urlParams.get('id');

// Cartel de cargando... hasta que regresa el llamado de la api
document.querySelector('.card').innerHTML = `
<h1 class="text-center fs-1 fw-bold text-white bg-dark rounded-pill">CARGANDO...</h1>`;

const URL = `http://localhost:8080`;
// Llamada a la api             acá toma el valor que tiene "id" en la url del nav
//const respuesta = fetch(`https://api.mercadolibre.com/items/${idArticulo}`);
const respuesta = fetch(URL + `/artInfo/${id}`);

respuesta
    .then(res => res.json())
    .then(response => renderInfo(response))
    .catch(err => console.error(err));

// Función que crea la card
function renderInfo(response) {
    const articulo = response;
    const card = `  
    <img src="${articulo.imagen}" class="card-img-top" alt="${articulo.nombre}">
    <div class="card-body">
        <h5 class="card-title">${articulo.nombre}</h5>
        <p class="card-text"> El stock es: ${articulo.stock}</p>
    </div>
    <ul class="list-group list-group-flush">     
        <li class="list-group-item"><b>$ ${articulo.precio}</b></li>
    </ul>
    <div class="card-body">
        <a href="#" class="card-link"
            onclick="alert('Opción no disponible, estamos trabajando en ello.')">Comprar</a>
        <a href="#" class="card-link"
            onclick="alert('Opción no disponible, estamos trabajando en ello.')">Agregar al carrito</a>
    </div>`

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



/*${articulo.attributes ? 
    articulo.attributes
        .filter(caracteristica => caracteristica.id === "BRAND" || caracteristica.id === "MAIN_MATERIAL")
        .map(caracteristica => `<li class="list-group-item">${caracteristica.name} : ${caracteristica.value_name}</li>`)
        .join('') 
    : ''}
*/
