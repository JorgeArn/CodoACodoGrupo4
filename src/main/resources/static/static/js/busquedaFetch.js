
const formulario = document.getElementById('formulario');
const inputBusqueda = document.getElementById('inputBusqueda');

formulario.addEventListener('submit', (event) => {
  event.preventDefault(); // Evita el envío predeterminado del formulario

  const valorBusqueda = inputBusqueda.value;
  const urlRedireccion = `http://localhost:8080/templates/articulosIndex.html?categoria=${valorBusqueda}`;

  window.location.href = urlRedireccion; // Redirección con la URL dinámica
});
