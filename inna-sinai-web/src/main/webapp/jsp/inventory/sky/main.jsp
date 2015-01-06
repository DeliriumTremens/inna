<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

 <script>
 $(function() {
	  $('#skyInventoryTable').jqGrid('setGridParam', {rowNum: 100});
	  $('#skyInventoryTable').jqGrid('setGridHeight', 450).trigger("reloadGrid");
   });
</script>

<div id="pageContent" class="pageContent">
  <div id ="pageTitle" class="pageTitle">Registro de Inventario SKY</div>
  <div class="messageArea"></div>
     <form:form id="addForm" action="inventory/sky/add.do" cssClass="validableForm">

         <table class="styledTable" title="INVENTARIO SKY" id="skyInventoryTable"> 
              <thead> 
                   <tr>  
	                  <th width="30%">TIPO</th> 
	                  <th width="40%">NUMERO DE SERIE</th>
                  </tr> 
              </thead> 
              <tbody> 
                <c:forEach var="i" begin="1" end="50">
                  <tr>
		            <td><select style="width:98%">
		                     <option value="0">SELECCIONE</option>
                             <option value="1">Tarjeta Inteligente</option>
                             <option value="2">IRD</option>
                        </select></td>
		            <td><input value="" style="width:98%" /></td>
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
