<!DOCTYPE html>
<html>
<head>
    <title>Animal List</title>
</head>
<body>
    <h1>Animal List</h1>
    <form method="post" action="/your-web-app-context/animals">
        <label for="animalType">Animal Type:</label>
        <select name="animalType">
            <option value="dog">Dog</option>
            <option value="cat">Cat</option>
        </select>
        <label for="name">Name:</label>
        <input type="text" name="name">
        <button type="submit">Add Animal</button>
    </form>
    <ul>
        <c:forEach items="${animals}" var="animal">
            <li>${animal.getName()} says: ${animal.makeSound()}</li>
        </c:forEach>
    </ul>
</body>
</html>