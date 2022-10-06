const name = document.getElementById('name')
const password = document.getElementById("password")
const form = document.getElementById('form')

form.addEventListener('submit',(e) =>{
    let messages = []

    if(name.value == '' || name.value == null){
        messages.push('Name is requried')
    }
    if (password.value.length <= 6){
        messages.push('Password must be longer that 6 characters')
    }
    if(messages.length > 0){
        e.preventDefault()
        errorElement.innerText = messages.join(',')
    }
})
