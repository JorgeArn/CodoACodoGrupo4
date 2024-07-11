document.addEventListener('DOMContentLoaded', function () {
    const loginForm = document.getElementById("loginForm");
    const emailInput = document.getElementById("loginEmail");
    const passwordInput = document.getElementById("login-pass");
    const emailHelp = document.getElementById("emailHelp");
    const fortSpan = document.getElementById('fort-login');

    passwordInput.disabled = true; // Disable password input initially

    const url = "http://localhost:8080";//llamada a la api

    const clearValidations = () => {
        emailInput.classList.remove('is-invalid');
        passwordInput.classList.remove('is-invalid');
        emailHelp.textContent = '';
    };

    const validateEmail = (email) => {
        const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return re.test(email);
    };

    const login = (email, clave) => {
        const usuario = {
            email: email,
            clave: clave,
        }

        const respuesta = fetch(url+'/login', {
            method: "POST",
            headers: {
                'Content-Type': "application/json"
            },
            body: JSON.stringify(usuario),
        });
        

        respuesta
            .then(response => {
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                return response.json();
            })
            .then(data => {
                if(data.nombre){
                    console.log('Usuario autenticado:', data.nombre);
                }else{
                    console.log('Usuario y/o contraseña incorrectos');
                }
                
                // Aquí puedes manejar la respuesta del servidor, por ejemplo, guardar el token de sesión en localStorage
            })
            .catch(err => console.error(err));

    }

    const validateForm = (event) => {
        event.preventDefault();
        clearValidations();

        let isValid = true;

        if (!emailInput.value.trim()) {
            emailInput.classList.add('is-invalid');
            emailHelp.textContent = 'Por favor, ingrese un correo electrónico válido.';
            isValid = false;
        } else if (!validateEmail(emailInput.value.trim())) {
            emailInput.classList.add('is-invalid');
            emailHelp.textContent = 'Por favor, ingrese un correo electrónico válido.';
            isValid = false;
        }

        if (!passwordInput.value.trim()) {
            passwordInput.classList.add('is-invalid');
            isValid = false;
        }

        if (isValid) {
            // Aquí puedes agregar la lógica para enviar el formulario si es válido
            // Ejemplo: loginForm.submit();
            login(emailInput.value.trim(),passwordInput.value.trim());
            // alert('Formulario válido. Aquí se podría enviar el formulario.');
        }
    };

    loginForm.addEventListener('submit', validateForm);

    emailInput.addEventListener('input', function () {
        const email = emailInput.value.trim();

        if (validateEmail(email)) {
            emailInput.classList.remove('is-invalid');
            emailHelp.textContent = '';
            passwordInput.disabled = false; // Enable password input if email is valid
        } else {
            emailInput.classList.add('is-invalid');
            emailHelp.textContent = 'Por favor, ingrese un correo electrónico válido.';
            passwordInput.disabled = true; // Disable password input if email is invalid
        }
    });

    passwordInput.addEventListener('input', function () {
        const password = passwordInput.value;
        let strength = 0;

        if (password.match(/[a-z]+/)) {
            strength += 1;
        }
        if (password.match(/[A-Z]+/)) {
            strength += 1;
        }
        if (password.match(/[0-9]+/)) {
            strength += 1;
        }
        if (password.length >= 8) {
            strength += 1;
        }

        let strengthText = '';
        let strengthColor = '';

        switch (strength) {
            case 0:
            case 1:
                strengthText = 'Débil';
                strengthColor = 'red';
                break;
            case 2:
                strengthText = 'Media';
                strengthColor = 'orange';
                break;
            case 3:
                strengthText = 'Fuerte';
                strengthColor = 'green';
                break;
            case 4:
                strengthText = 'Muy Fuerte';
                strengthColor = 'darkgreen';
                break;
        }

        fortSpan.textContent = strengthText;
        fortSpan.style.backgroundColor = strengthColor;
    });

    //registrarse
    const formRegister = document.getElementById("formRegister");

    formRegister.addEventListener('submit',event => createUser(event));

    function createUser(event){
        event.preventDefault();

        const nombre = document.getElementById('firstname').value;
        const apellido = document.getElementById('lastname').value;
        const email = document.getElementById('email').value;
        const clave = document.getElementById('register-pass').value;
        const fechaNacimiento = document.getElementById('birthdate').value;
        
        const select = document.getElementById('country');
        const pais = select.options[select.selectedIndex].text;
        
        const usuario = {
            nombre: nombre,
            apellido: apellido,
            email: email,
            clave: clave,
            pais: pais,
        }
        
     
        //llamada a la api
        const respuesta = fetch(url+'/addUsuario', {
            method: "POST",
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(usuario),
        });

        respuesta
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            console.log(response);
            
        })

        .catch(err => console.error(err));

    }

});
