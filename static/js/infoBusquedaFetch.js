const formulario = document.getElementById('formulario');
const inputBusqueda = document.getElementById('inputBusqueda');


formulario.addEventListener('submit', (event) => {
    event.preventDefault();

    const terminoBusqueda = inputBusqueda.value;
    const url = `https://api.mercadolibre.com/sites/MLA/search?q=${terminoBusqueda}&limit=3#json`;

    fetch(url)
        .then(respuesta => respuesta.json())
        .then(response => renderArticulos(response))

    function renderArticulos(response) {
        const articulos = response.results;
        const sectionABorrar = document.getElementById("sectionABorrar");

        sectionABorrar.parentNode.removeChild(sectionABorrar);

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