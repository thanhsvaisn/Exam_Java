<%@ page import="java.util.List" %>
<%@ page import="com.example.model.Player" %>
<html>
<head>
    <title>Player Management</title>
</head>
<body>
<h1>Player List</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Full Name</th>
        <th>Age</th>
        <th>Actions</th>
    </tr>
    <% List<Player> players = (List<Player>) request.getAttribute("players");
        for (Player p : players) { %>
    <tr>
        <td><%= p.getPlayerId() %></td>
        <td><%= p.getName() %></td>
        <td><%= p.getFullName() %></td>
        <td><%= p.getAge() %></td>
        <td>
            <a href="editPlayer.jsp?id=<%= p.getPlayerId() %>">Edit</a>
            <a href="deletePlayer?id=<%= p.getPlayerId() %>">Delete</a>
        </td>
    </tr>
    <% } %>
</table>
<a href="addPlayer.jsp">Add New Player</a>
</body>
</html>
