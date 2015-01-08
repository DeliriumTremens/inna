<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>


 <script>
     $(function() {
       $( "#initialDate" ).datepicker();
       $( "#finalDate" ).datepicker();
     });
</script>

<div id="pageContent" class="pageContent">
  <div id ="pageTitle" class="pageTitle">Reporte Inventario</div>
  <div class="messageArea"></div>
  <div id="searchArea" class="searchArea">
     <form:form modelAttribute="toSearch" id="searchForm" target="ajax:result" action="report/inventory/search.do" cssClass="validableForm">
     
	
         <table class="fullWidthTable" >
               <tr>
                  <td>
	                    <p>
		                  Fechas:
		                  <form:input path="initialDate" cssClass="miniInput" /> - 
		                  <form:input path="finalDate" cssClass="miniInput" />
	                    </p>
                  </td>
               </tr>
              <tr>
                 <td colspan="3" align="right">
                    <button class="button styledButton" type="submit">Buscar</button>
                 </td>
              </tr>
         </table>
      </form:form>
  </div>
  <div id="result" class="result">
  </div>
</div>




