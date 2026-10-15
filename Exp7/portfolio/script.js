function validateForm(event) {
    // Prevent the form from refreshing the page automatically
    event.preventDefault();

    let name = document.getElementById('name').value.trim();
    let email = document.getElementById('email').value.trim();
    let message = document.getElementById('message').value.trim();
    let successMessage = document.getElementById('successMessage');

    // Simple validation logic
    if (name === "" || email === "" || message === "") {
        alert("Error: Please fill out all required fields before submitting!");
    } else {
        successMessage.innerText = "Thank you, " + name + "! Your message has been sent successfully.";
        
        // Reset form inputs after successful submission
        document.getElementById('contactForm').reset();
    }
}