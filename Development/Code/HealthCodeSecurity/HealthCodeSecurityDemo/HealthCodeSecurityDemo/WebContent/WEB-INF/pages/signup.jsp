<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div id="registrationPannel">
  <h1>New User Registration</h1>
  <c:if test="${registrationFailed}">
   <div style="color: red">Registration Failed - User already exists!</div>
  </c:if>  
   
  <form method="post" class="signin" action="/healthcodesecuritydemo/signup.do">
   <table>
    <tr>
     <th><label for="username">Username</label></th>
     <td><input id="username" name="username" type="text" /></td>
    </tr>
    <tr>
     <th><label for="password">Password</label></th>
     <td><input id="password" name="password" type="password" /></td>
    </tr>
    <tr>
     <th><label for="roles">Roles</label></th>
     <td>
     <select size="3" name="roles" multiple>
		<option id="DOCTOR" selected>DOCTOR
		<option id="PATIENT">PATIENT
		<option id="LAB_TECHNICIAN">LAB_TECHNICIAN
	 </select> 
     </td>
    </tr>
    <tr>
     <th></th>
     <td><input name="commit" type="submit" value="Register" /></td>
    </tr>
   </table>
  </form>
</div>