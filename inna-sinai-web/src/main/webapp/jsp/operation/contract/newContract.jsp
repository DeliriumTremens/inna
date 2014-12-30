<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

 <script>

</script>

<div id="pageContent" class="pageContent">
  <div id ="pageTitle" class="pageTitle">Nuevo Contrato</div>
  <div class="messageArea"></div>
  <div id="searchArea" class="searchArea">
     <form:form modelAttribute="newRow" id="searchForm" action="operation/create.do" cssClass="validableForm">
         <table class="fullWidthTable">
               <tr>
                  <td align="left" class="label" >Numero de Contrato<em>*</em></td>
                  <td align="left" class="label" >Número de cuenta</td>
                  <td align="left" class="label" >Fecha de Captura<em>*</em></td>
               </tr>
               <tr>
                 <td align="left"><form:input path="contract" style="width:97%" /></td>
                 <td align="left"><form:input path="account" style="width:97%" /></td>
                 <td align="left"><form:input path="openedDate" style="width:97%" readonly="true"/></td>
               </tr>
               <tr>
                  <td align="left" class="label" colspan="2">Nombre del cliente<em>*</em></td>
                  <td align="left" class="label">Producto<em>*</em></td>
               </tr>
               <tr>
                 <td align="left" colspan="2"><form:input path="clientName" style="width:97%" /></td>
                 <td align="left">
                   <form:select path="jobSpecId" id="jobSpecId"  style="width:98%" >
                       <form:option value="">SELECCIONE</form:option>
                       <form:options items="${jobSpecs}"  
                               itemValue="id"
                               itemLabel="name"/>
                    </form:select>
                 </td>
               </tr>
               <tr>
                  <td align="left" class="label" >Fuerza de venta<em>*</em></td>
                  <td align="left" class="label" >Lugar / Fecha de activación<em>*</em></td>
                  <td align="left" class="label" >Lugar / Fecha de prospecto<em>*</em></td>
               </tr>
               <tr>
                 <td align="left">
                   <form:select path="salesForceId" id="salesForceId"  style="width:98%" >
                       <form:option value="">SELECCIONE</form:option>
                       <form:options items="${saleForces}"  
                               itemValue="id"
                               itemLabel="name"/>
                    </form:select>
                 </td>
                 <td align="left">
                   <form:select path="activationPlaceId" id="activationPlaceId"  style="width:65%" >
                       <form:option value="">SELECCIONE</form:option>
                       <form:options items="${activityPlaces}"  
                               itemValue="id"
                               itemLabel="name"/>
                    </form:select> <form:input path="activationDate" id="activationDate" style="width:30%" />
                 </td>
                 <td align="left">
                   <form:select path="prospectionPlaceId" id="prospectionPlaceId"  style="width:65%" >
                       <form:option value="">SELECCIONE</form:option>
                       <form:options items="${activityPlaces}"  
                               itemValue="id"
                               itemLabel="name"/>
                    </form:select> <form:input path="prospectDate" id="prospectDate" style="width:30%" />
                 </td>
               </tr>
              <tr>
                 <td colspan="3" align="right">
                    <button class="button styledButton" type="submit">Guardar</button>
                 </td>
              </tr>
         </table>
      </form:form>
  </div>
</div>
