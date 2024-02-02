<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>



<body>

<h2>Please, enter your info</h2>

<form:form action="registrationComplete" modelAttribute="userdata">

    Name<br>
    <form:input  path="name"/>
    <br>
    <form:errors path="name"  cssStyle="color: red"/>
    <br>

    Surname<br>
    <form:input path="surname"/>
    <br>
    <form:errors path="surname"   cssStyle="color: red"/>
    <br>

    Password<br>
    <form:input path="password"/>
    <button type="button" id="toggleButton">Show</button>
    <script>
        // Получаем элементы DOM
        const passwordInput = document.getElementById('password');
        const toggleButton = document.getElementById('toggleButton');

        // Добавляем обработчик события для кнопки
        toggleButton.addEventListener('click', function() {
            // Изменяем тип поля ввода между 'password' и 'text'
            const currentType = passwordInput.getAttribute('type');
            passwordInput.setAttribute('type', currentType === 'password' ? 'text' : 'password');

            // Изменяем текст кнопки
            toggleButton.textContent = currentType === 'password' ? 'Hide' : 'Show';
        });
    </script>

    <br>
    <form:errors path="password" cssStyle="color: red"/>
    <br>

    Email<br>
    <form:input path="email"/>
    <br>
    <form:errors path="email" cssStyle="color: red"/>
    <br>

    Salary<br>
    <form:input path="salary"/>
    <br>
    <form:errors path="salary" cssStyle="color: red"/>
    <br>

    Phone Number<br>
    <form:input path="phoneNumber"/>
    <br>
    <form:errors path="phoneNumber" cssStyle="color: red"/>
    <br>
<input type="submit" value="Confirm">
</form:form>




</body>


</html>


