const imgProducto = document.getElementById('imagen');
const imgPreview = document.getElementById('previewImagen');

imgProducto.addEventListener("change",function(){
    if (this.files && this.files[0]) {
        // Crear un objeto FileReader para leer el contenido del archivo
        const reader = new FileReader();

        // Definir qué hacer cuando se cargue el archivo
        reader.onload = function(e) {
            // Asignar la URL de la imagen al src de la etiqueta img
            imgPreview.src = e.target.result;
        };

        // Leer el contenido del archivo como una URL de datos
        reader.readAsDataURL(this.files[0]);
    }
});



