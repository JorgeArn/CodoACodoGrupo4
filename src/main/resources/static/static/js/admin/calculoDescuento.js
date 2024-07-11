document.addEventListener('DOMContentLoaded', (event) => {
    const precioInput = document.getElementById('precio');
    const descuentoInput = document.getElementById('descuento');
    const precioDescuentoInput = document.getElementById('precio_descuento');

    function calcularPrecioDescuento() {
        const precio = parseFloat(precioInput.value);
        const descuento = parseFloat(descuentoInput.value);
        
        if (!isNaN(precio) && !isNaN(descuento)) {
            const precioDescuento = precio - (precio * (descuento / 100));
            precioDescuentoInput.value = precioDescuento.toFixed(2);
        } else {
            precioDescuentoInput.value = '';
        }
    }

    precioInput.addEventListener('input', calcularPrecioDescuento);
    descuentoInput.addEventListener('input', calcularPrecioDescuento);
});