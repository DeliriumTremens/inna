<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

<div id="pageContent" class="pageContent">
  <div id ="pageTitle" class="pageTitle">Contratos</div>
  <div class="messageArea"></div>
  <div id="searchArea" class="searchArea">
     <form:form modelAttribute="toSearch" id="searchForm" target="ajax:result" action="operation/seach.do" cssClass="validableForm">
         <form:hidden path="workTeam[0].typeId" value="1" />
         <table class="fullWidthTable">
               <tr>
                  <td align="left" class="label" width="60%" colspan="2">Nombre de T�cnico</td>
                  <td align="left" class="label" >N�mero de contrato</td>
               </tr>
               <tr>
                 <td align="left" colspan="2"><form:input path="workTeam[0].toUserName" style="width:97%" /></td>
                 <td align="left"><form:input path="contract" style="width:97%" /></td>
               </tr>
               <tr>
                  <td align="left" class="label">Fecha inicial</td>
                  <td align="left" class="label">Fecha Final</td>
                  <td align="left" class="label">Estatus</td>
               </tr>
               <tr>
                 <td align="left"><form:input path="openedDate" style="width:94%" /></td>
                 <td align="left"><form:input path="endOpenedDate" style="width:94%" /></td>
                 <td align="left">
                    <form:select path="statusId" id="statusId"  style="width:98%" >
                       <form:option value="">SELECCIONE</form:option>
                       <form:options items="${status}"  
                               itemValue="id"
                               itemLabel="name"/>
                    </form:select></td>
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
     <%@ include file="./_contractTable.jsp"%>
  </div>
  <div >
    <table class="fullWidthTable">
          <tr>
             <td align="right"><button class="button styledButton" type="button" onclick="showCreate()">Nuevo</button></td>
          </tr>
    </table>
  </div>
</div>
