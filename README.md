<h1>Login Form Application in Java 🖥️</h1>
This is a simple Login Form application created using Java Swing. The application provides a basic graphical user interface (GUI) where users can input their username and password to simulate a login process.

<h1>Description 📋</h1>
The Login Form application consists of a window with the following key features:

<h3>Username Field: </h3>A text field where users can enter their username.
<h3>Password Field: </h3>A password field to securely enter the password.
<h3>Login Button: </h3>A button that users can click to trigger the login action.
Upon clicking the Login button, the application will display the entered username and password in the console.

<h1>Key Features 🌟</h1>
<h3>Username Input:</h3> The user can type their username into a text box.
<h3>Password Input: </h3>The user types the password into a password field that hides the entered text.
<h3>Login Button: </h3>A button that simulates a login attempt by printing the entered username and password in the console.
<h3>Basic GUI Design: </h3>The form is designed using absolute positioning (setLayout(null)), placing components at specific coordinates to create the form layout.
How the Application Works ⚙️
<h3>User Interface:</h3> The application creates a simple window using Java Swing components: two JLabels for the username and password prompts, a JTextField for the username input, a JPasswordField for the password input, and a JButton for submitting the form.
<h3>Login Action:</h3> When the Login button is clicked, the actionPerformed() method is called, and the username and password entered by the user are printed to the console.
<h3>Button Interaction:</h3> The button uses a hand cursor to indicate that it is clickable, making the user experience more intuitive.


<h1>Example Usage 🏃‍♂️</h1>
Run the Application:

Open the project in a Java IDE (like IntelliJ IDEA or Eclipse).
Run the Login_Form class.
Enter Credentials:

Enter your username and password in the respective fields.
Click the Login Button:

After clicking the Login button, the username and password will be printed to the console.


<h1>Future Enhancements 🚀</h1>
While this is a simple login form, you can extend its functionality in various ways, including:

<h3>Input Validation:</h3> Check if the username and password fields are filled before submitting.
<h3>User Feedback:</h3> Provide error messages or success feedback when the login button is clicked.
<h3>GUI Improvements:</h3> Use layout managers (like GridBagLayout or FlowLayout) for a more polished interface.
<h3>Authentication:</h3> Integrate the form with an actual authentication system or database for user validation.
