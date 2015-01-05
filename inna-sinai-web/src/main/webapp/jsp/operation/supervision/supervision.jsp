<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

 <script>
     $(function() {
       $( "#openedDate" ).datepicker();
       $( "#endOpenedDate" ).datepicker();
     });
     
     function showNew(){
    	 loadContent("operation/supervisions/setupCreate.do");
     }
</script>

<div id="pageContent" class="pageContent">
  <div id ="pageTitle" class="pageTitle">Supervisiones</div>
  <div class="messageArea"></div>
  <div id="searchArea" class="searchArea">
     <form:form modelAttribute="toSearch" id="searchForm" target="ajax:result" action="operation/serviceOrder/seach.do" cssClass="validableForm">
         <table class="fullWidthTable">
               <tr>
                  <td align="left" class="label" width="60%" colspan="2">Nombre del Supervisor</td>
                  <td align="left" class="label" >Zona de Trabajo</td>
               </tr>
               <tr>
                 <td align="left" colspan="2"><form:input path="contract.workTeam[0].toUserName" style="width:97%" /></td>
                 <td align="left">
                    <form:select path="jobZoneId" id="jobZoneId"  style="width:98%" >
                       <form:option value="">SELECCIONE</form:option>
                       <form:options items="${jobZones}"  
                               itemValue="id"
                               itemLabel="name"/>
                    </form:select></td>
               </tr>
               <tr>
                  <td align="left" class="label">Fecha inicial</td>
                  <td align="left" class="label">Fecha Final</td>
               </tr>
               <tr>
                 <td align="left"><form:input path="openedDate" style="width:94%" /></td>
                 <td align="left"><form:input path="openedDate" id="endOpenedDate" style="width:94%" /></td>
              <tr>
                 <td colspan="3" align="right">
                    <button class="button styledButton" type="submit">Buscar</button>
                 </td>
              </tr>
         </table>
      </form:form>
  </div>
  <div id="result" class="result">
     <%@ include file="./_supervisionTable.jsp"%>
  </div>
  <div >
        <table class="fullWidthTable">
          <tr>
             <td align="right"><button class="button styledButton" onClick="showNew()">Nuevo</button></td>
          </tr>
        </table>
  </div>
</div>
