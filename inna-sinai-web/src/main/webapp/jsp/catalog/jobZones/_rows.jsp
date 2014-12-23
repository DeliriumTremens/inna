<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

<script type="text/javascript">
   function showEditForm(id){
	 loadModalForm("catalog/template/setupUpdate.do",{id:id, templateName : '${config.name}'});
   }
</script>

<table class="styledTable" title="REGISTROS"> 
  <thead> 
    <tr> 
      <th width="3%">
        <input type="checkbox"/>
      </th> 
      <th width="3%">ID</th> 
      <th width="20%">UNIDAD DE NEGOCIO</th> 
	  <th width="20%">NOMBRE</th> 
	  <th width="55%">DESCRIPCION</th>
	  <th width="2%"></th>
   </tr> 
  </thead> 
  <tbody> 
    <c:forEach items="${data}" var="row">
      <tr>
        <td><input type="checkbox" value ="${row.id}"/></td>
		<td>${row.id}</td>
		<td>${row.businessUnitDescription}</td>
		<td>${row.name}</td>
		<td>${row.description}</td>
		<td><span class="ui-icon ui-icon-pencil" onclick="showEditForm('${row.id}');" style="float:left"></span></td>
	  </tr>
    </c:forEach>
  </tbody> 
</table> 
<div id="pager"></div>
