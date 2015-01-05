<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

<script type="text/javascript">

</script>

<table class="styledTable" title="CONTRATOS"> 
  <thead> 
    <tr> 
      <th width="15%">CONTRATO</th>
      <th width="15%">FECHA APERTURA</th> 
      <th width="10%">TIPO</th> 
	  <th width="25%">TECNICO INSTALADOR</th> 
	  <th width="15%">TECNICO ASIGNADO</th>
	  <th width="18%">ESTATUS</th> 
	  <th width="2%"></th>
   </tr> 
  </thead> 
  <tbody> 
    <c:forEach items="${data}" var="data">
      <tr>
		<td>${data.contract.contract}</td>
		<td>${data.openedDate}</td>
		<td>${data.typeDescription}</td>
		 <td>${data.contract.workTeam[0].toUserName}</td>
		 <td>${data.contract.workTeam[1].toUserName}</td>
		 <td>${data.statusDescription}</td>
		 <td><span class="ui-icon ui-icon-pencil" onclick="showEditUserInformation('${data.id}');" style="float:left"></span></td>
	  </tr>
    </c:forEach>
  </tbody> 
</table> 
<div id="pager"></div>
