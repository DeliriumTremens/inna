<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

 <script>
 $(function() {
	  $('#localInventoryTable').jqGrid('setGridParam', {rowNum: 100});
	  $('#localInventoryTable').jqGrid('setGridHeight', 450).trigger("reloadGrid");
   });
</script>

<div id="pageContent" class="pageContent">
  <div id ="pageTitle" class="pageTitle">Registro de Inventario Local</div>
  <div class="messageArea"></div>
     <form:form modelAttribute="types" id="addForm" action="inventory/local/add.do" cssClass="validableForm">

         <table class="styledTable" title="INVENTARIO LOCAL" id="localInventoryTable"> 
              <thead> 
                   <tr>  
	                  <th width="30%">NOMBRE</th> 
	                  <th width="40%">DESCRIPCION</th>
	                  <th width="15%">COSTO UNITARIO</th>
	                  <th width="15%">CANTIDAD</th>
                  </tr> 
              </thead> 
              <tbody> 
                <c:forEach items="${types}" var="row">
                  <tr>
		            <td>${row.name}</td>
		            <td>${row.description}</td>
		            <td>$ <input value="${row.cost}" style="width:85%" /></td>
		            <td><input value="${row.quantity}" style="width:85%" /></td>
	             </tr>
              </c:forEach>
  </tbody> 
</table> 
<div >
        <table class="fullWidthTable">
          <tr>
             <td align="right"><button class="button styledButton" type="submit">Guardar</button></td>
          </tr>
        </table>
  </div>
      </form:form>
</div>
