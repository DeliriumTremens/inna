<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

<script type="text/javascript">
  function showEdit(id){
	  loadContent("operation/contract/setupEdit.do?contractId=0");
  }
</script>

<table class="styledTable" title="CONTRATOS"> 
  <thead> 
    <tr> 
      <th width="15%">CONTRATO</th> 
      <th width="10%">CUENTA</th> 
	  <th width="25%">TECNICO INSTALADOR</th> 
	  <th width="15%">FECHA INSTALACION</th>
	  <th width="33%">ZONA</th> 
	  <th width="2%"></th>
   </tr> 
  </thead> 
  <tbody> 
    <c:forEach items="${data}" var="data">
      <tr>
		<td>${data.contract}</td>
		<td>${data.account}</td>
		 <td>${data.workTeam[0].toUserName}</td>
		 <td>${data.openedDate}</td>
		 <td>${data.jobZoneDescription}</td>
		 <td><span class="ui-icon ui-icon-pencil" onclick="showEdit('${data.id}');" style="float:left"></span></td>
	  </tr>
    </c:forEach>
  </tbody> 
</table> 
<div id="pager"></div>
