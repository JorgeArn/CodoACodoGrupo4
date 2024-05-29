// document.addEventListener('DOMContentLoaded', function() {
//     const loginForm = document.getElementById("loginForm");
//     const emailInput = document.getElementById("exampleInputEmail1");
//     const passwordInput = document.getElementById("exampleInputPassword1");
//     const emailHelp = document.getElementById("emailHelp");
//     const passwordHelp = document.getElementById("passwordHelp");

//     passwordInput.disabled = true; // Disable password input initially

//     const clearValidations = () => {
//         emailInput.classList.remove('is-invalid');
//         passwordInput.classList.remove('is-invalid');
//         emailHelp.textContent = '';
//         passwordHelp.textContent = '';
//     };

//     const validateEmail = (email) => {
//         const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
//         return re.test(email);
//     };

//     const validateForm = (event) => {
//         event.preventDefault();
//         clearValidations();

//         let isValid = true;

//         if (!emailInput.value.trim()) {
//             emailInput.classList.add('is-invalid');
//             emailHelp.textContent = 'Por favor, ingrese un correo electrónico válido.';
//             isValid = false;
//         } else if (!validateEmail(emailInput.value.trim())) {
//             emailInput.classList.add('is-invalid');
//             emailHelp.textContent = 'Por favor, ingrese un correo electrónico válido.';
//             isValid = false;
//         }

//         if (!passwordInput.value.trim()) {
//             passwordInput.classList.add('is-invalid');
//             passwordHelp.textContent = 'Por favor, ingrese su contraseña.';
//             isValid = false;
//         }

//         if (isValid) {
//             // Aquí puedes agregar la lógica para enviar el formulario si es válido
//             // Ejemplo: loginForm.submit();
//             alert('Formulario válido. Aquí se podría enviar el formulario.');
//         }
//     };

//     loginForm.addEventListener('submit', validateForm);

//     emailInput.addEventListener('input', function() {
//         const email = emailInput.value.trim();

//         if (validateEmail(email)) {
//             emailInput.classList.remove('is-invalid');
//             emailHelp.textContent = '';
//             passwordInput.disabled = false; // Enable password input if email is valid
//         } else {
//             emailInput.classList.add('is-invalid');
//             emailHelp.textContent = 'Por favor, ingrese un correo electrónico válido.';
//             passwordInput.disabled = true; // Disable password input if email is invalid
//         }
//     });

//     passwordInput.addEventListener('input', function() {
//         const password = passwordInput.value;
//         let strength = 0;

//         if (password.match(/[a-z]+/)) {
//             strength += 1;
//         }
//         if (password.match(/[A-Z]+/)) {
//             strength += 1;
//         }
//         if (password.match(/[0-9]+/)) {
//             strength += 1;
//         }
//         if (password.length >= 8) {
//             strength += 1;
//         }

//         let strengthText = '';
//         let strengthColor = '';

//         switch (strength) {
//             case 0:
//             case 1:
//                 strengthText = 'Débil';
//                 strengthColor = 'red';
//                 break;
//             case 2:
//                 strengthText = 'Media';
//                 strengthColor = 'orange';
//                 break;
//             case 3:
//                 strengthText = 'Fuerte';
//                 strengthColor = 'green';
//                 break;
//             case 4:
//                 strengthText = 'Muy Fuerte';
//                 strengthColor = 'darkgreen';
//                 break;
//         }

//         document.getElementById('fort').textContent = strengthText;
//         document.getElementById('fort').style.backgroundColor = strengthColor;
//     });
// });
document.addEventListener('DOMContentLoaded', function() {
    const loginForm = document.getElementById("loginForm");
    const emailInput = document.getElementById("loginEmail");
    const passwordInput = document.getElementById("login-pass");
    const emailHelp = document.getElementById("emailHelp");
    const fortSpan = document.getElementById('fort-login');

    passwordInput.disabled = true; // Disable password input initially

    const clearValidations = () => {
        emailInput.classList.remove('is-invalid');
        passwordInput.classList.remove('is-invalid');
        emailHelp.textContent = '';
    };

    const validateEmail = (email) => {
        const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return re.test(email);
    };

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
            alert('Formulario válido. Aquí se podría enviar el formulario.');
        }
    };

    loginForm.addEventListener('submit', validateForm);

    emailInput.addEventListener('input', function() {
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

    passwordInput.addEventListener('input', function() {
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
});
