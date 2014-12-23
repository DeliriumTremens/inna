<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

<script type="text/javascript">

</script>

<table class="styledTable" title="CONTRATOS"> 
  <thead> 
    <tr> 
      <th width="15%">CONTRATO</th> 
      <th width="10%">CUENTA</th> 
	  <th width="25%">TECNICO INSTALADOR</th> 
	  <th width="15%">FECHA INSTALACION</th>
	  <th width="25%">PRODUCTO</th>
	  <th width="10%">ESTATUS</th>  
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
