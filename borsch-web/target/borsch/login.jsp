<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>

<body>
<form action="login" method="post" id="form_login">
    <table>
        <tr>
            <td>
                <p>Username: </p>
            </td>
            <td>
                <input type="text" id="j_username" name="j_username" value="admin">
            </td>
        </tr>
        <tr>
            <td>
                <p>Password: </p>
            </td>
            <td>
                <input type="password" id="j_password" name="j_password" value="admin">
            </td>
        </tr>
    </table>

    <button type="submit">Log In</button>
</form>
</body>
</html>