<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Document</title>
  </head>
  <body>
    <form action="addUser">
      <input type="text" name="id" /> <br />

      <input type="text" name="name" /> <br />

      <input type="submit" />
    </form>

    <h2>DISPLAY USER INFORMATION</h2>
    <form action="getUser">
      <input type="text" name="id" /> <br />
      <input type="submit" />
    </form>

    <h2>Enter Details to delete</h2>
    <form action="deleteUser">
      <input type="text" name="id" /> <br />
      <input type="submit" />
    </form>

    <h2>Enter Details to update</h2>
    <form action="updateUser">
      Enter Id <input type="text" name="id" /> <br />
      <input type="submit" />
    </form>
  </body>
</html>
