<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
  
     <div class="card">
                  
                  <div class="card text-white bg-secondary">
                     <div class="card-header">
                        Modifier un produit
                    </div>
                   </div>
               <form action="/update" method="post">
               
                    <div class="form-group">
                    
                          <label class="form-label">nom :</label>
                          <input type="text" name="nom" class="form-control car"><br>
                          <label class="form-label">prix :</label>
                          <input type="text" name="prix" class="form-control car"><br>
                          
                          <label class="form-label">Categorie</label>
                          <select name="ca">
                               <c:forEach items="${categorie}" var="x">
                                   <option value="${x.id}">"${x.nom}"</option>
                                </c:forEach>
                          </select>
                             <input type="submit" name="action" value="ajouter"class="btn btn-success">
                          
                      </div>
                </form>
         </div>
    </div>

</body>
</html>