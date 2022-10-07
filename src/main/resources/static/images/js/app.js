const form = document.getElementById('form')
const name = document.getElementById('firstname')
const password = document.getElementById("lastname")
const email = document.getElementById("email")
const password = document.getElementById("password")
const cpassword = document.getElementById("cpassword")



form.addEventListener('submit',(e) =>{
    e.preventDefault();
    checkInputs();
});

function checkInputs(){
    const firstnameValue = firstname.value.trime();
    const lastnameValue = lastname.value.trim();
    const emailValue = email.value.trim();
    const passwordValue = password.value.trim();
    const cpasswordValue = cpassword.value.trim();

    if(firstnameValue === ''){
        setErrorFor(firstname , 'firstname cannot be blank')
    }else {
        setSuccessFor(firstname);

    }
    if(lastnameValue === ''){
        setErrorFor(lastname , 'firstname cannot be blank')
    }else {
        setSuccessFor(lastname);}

        function setErrorFor(input, message) {
            const formControl = input.parentElement;
            const small = formControl.querySelector('small');

            small.innerText = message;

            formControl.className = 'Form-control error';
        }

        function setSuccessFor(input) {
            const formControl = input.parentElement;
            formControl.className = 'form-control success';
        }


    }

