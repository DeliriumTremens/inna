<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

<script type="text/javascript">
   function showEditUserInformation(userId){
	 loadModalForm("usersAdministration/setupUpdate.do",{userId:userId});
   }
</script>

<table class="styledTable" title="USUARIOS"> 
  <thead> 
    <tr> 
      <th width="3%">
        <input type="checkbox"/>
      </th> 
      <th width="3%">ID</th> 
	  <th width="32%">NOMBRE</th> 
	  <th width="15%">NICK</th>
	  <th width="13%">PERFIL</th>  
	  <th width="22%">E-MAIL</th>
	  <th width="10%">ACCESO</th>
	  <th width="2%"></th>
   </tr> 
  </thead> 
  <tbody> 
    <c:forEach items="${masterUsers}" var="masterUser">
      <tr>
        <td><input type="checkbox" value ="${masterUser.user.id}"/></td>
		<td>${masterUser.user.id}</td>
		<td>${masterUser.user.name} ${masterUser.user.lastName} ${masterUser.user.middleName}</td>
		 <td>${masterUser.credential.nickName}</td>
		 <td>${masterUser.profile.name}</td>
		 <td>${masterUser.user.mail}</td>
		 <td>${masterUser.credential.lastLogon}</td>
		 <td><span class="ui-icon ui-icon-pencil" onclick="showEditUserInformation('${masterUser.user.id}');" style="float:left"></span></td>
	  </tr>
    </c:forEach>
  </tbody> 
</table> 
<div id="pager"></div>
