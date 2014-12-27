<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

<script type="text/javascript">
   function showEditForm(id){
	 loadModalForm("catalog/jobSpecs/setupUpdate.do",{id:id});
   }
</script>

<table class="styledTable" title="REGISTROS"> 
  <thead> 
    <tr> 
      <th width="3%">
        <input type="checkbox"/>
      </th> 
      <th width="3%">ID</th> 
	  <th width="20%">NOMBRE</th> 
	  <th width="25%">DESCRIPCION</th>
	  <th width="20%">COSTO INSTALACION</th>
	  <th width="20%">COSTO TRANSFERENCIA</th>
	  <th width="13%">ACTIVO</th>
	  <th width="2%"></th>
   </tr> 
  </thead> 
  <tbody> 
    <c:forEach items="${data}" var="row">
      <tr>
        <td><input type="checkbox" value ="${row.id}"/></td>
        <td>${row.id}</td>
		<td>${row.name}</td>
		<td>${row.description}</td>
		<td>${row.jobCost}</td>
		<td>${row.transferCost}</td>
		<td>${row.isActive}</td>
		<td><span class="ui-icon ui-icon-pencil" onclick="showEditForm('${row.id}');" style="float:left"></span></td>
	  </tr>
    </c:forEach>
  </tbody> 
</table> 
<div id="pager"></div>
