<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

 <script>
 $(function() {
	 $('#activationDate').timepicker({
		    showPeriodLabels: false,
		});
	 $('#prospectDate').timepicker({
		    showPeriodLabels: false,
		});
   });
 
</script>

<div id="pageContent" class="pageContent">
  <div id ="pageTitle" class="pageTitle">Captura de Contrato</div>
  <div class="messageArea"></div>
  <div id="searchArea" class="searchArea">
     <form:form modelAttribute="newRow" id="searchForm" action="operation/create.do" cssClass="validableForm">
         <table class="fullWidthTable" >
              <tr>
                  <td align="left" class="label" >Numero de Contrato<em>*</em></td>
                  <td align="left" class="label" >Número de cuenta</td>
               </tr>
               <tr>
                 <td align="left"><form:input path="contract" style="width:97%" /></td>
                 <td align="left"><form:input path="account" style="width:65%" /></td>
               </tr>
               <tr>
                  <td align="left" class="label" ><br></td>
               </tr>
               <tr>
                  <td align="right" class="label" colspan="3">Datos Generales</td>
               </tr>
               <tr>
                 <td align="left" colspan="3"><hr></td>
               </tr>
               <tr>
                  <td align="left" class="label" >Número de cuenta</td>
                  <td align="left" class="label" >Tecnico<em>*</em></td>
                  <td align="left" class="label" >Zona<em>*</em></td>
               </tr>
               <tr>
                 <td align="left"><form:input path="account" style="width:97%" /></td>
                 <td align="left">
                   <form:select path="jobZoneId" id="jobZoneId"  style="width:98%" >
                       <form:option value="">SELECCIONE</form:option>
                       <form:options items="${jobZones}"  
                               itemValue="id"
                               itemLabel="name"/>
                    </form:select>
                 </td>
                 <td align="left">
                   <form:select path="jobZoneId" id="jobZoneId"  style="width:98%" >
                       <form:option value="">SELECCIONE</form:option>
                       <form:options items="${jobZones}"  
                               itemValue="id"
                               itemLabel="name"/>
                    </form:select>
                 </td>
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
                  <td align="left" class="label" colspan="2">Nombre del vendedor<em>*</em></td>
                  <td align="left" class="label">Medio de pago<em>*</em></td>
               </tr>
               <tr>
                 <td align="left" colspan="2"><form:input path="sellerName" style="width:97%" /></td>
                 <td align="left">
                   <form:select path="paymentTypeId" id="paymentTypeId"  style="width:98%" >
                       <form:option value="">SELECCIONE</form:option>
                       <form:options items="${paymentTypes}"  
                               itemValue="id"
                               itemLabel="name"/>
                    </form:select>
                 </td>
               </tr>
               <tr>
                  <td align="left" class="label" >Fuerza de venta<em>*</em></td>
                  <td align="left" class="label" >Lugar / Hora de activación<em>*</em></td>
                  <td align="left" class="label" >Lugar / Hora de prospecto<em>*</em></td>
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
                   <form:select path="activationPlaceId" id="activationPlaceId"  style="width:85%" >
                       <form:option value="">SELECCIONE</form:option>
                       <form:options items="${activityPlaces}"  
                               itemValue="id"
                               itemLabel="name"/>
                    </form:select> <form:input path="activationDate" id="activationDate" style="width:10%" />
                 </td>
                 <td align="left">
                   <form:select path="prospectionPlaceId" id="prospectionPlaceId"  style="width:85%" >
                       <form:option value="">SELECCIONE</form:option>
                       <form:options items="${activityPlaces}"  
                               itemValue="id"
                               itemLabel="name"/>
                    </form:select> <form:input path="prospectDate" id="prospectDate" style="width:10%" />
                 </td>
               </tr>
               <tr>
                  <td align="left" class="label" ><br></td>
               </tr>
               <tr>
                  <td align="right" class="label" colspan="3">Ubicación</td>
               </tr>
               <tr>
                 <td align="left" colspan="3"><hr></td>
               </tr>
               <tr>
                  <td align="left" class="label" >Codigo Postal<em>*</em></td>
                  <td align="left" class="label" >Municipio<em>*</em></td>
                  <td align="left" class="label" >Colonia<em>*</em></td>
               </tr>
               <tr>
                 <td align="left"><form:input path="sellerName" style="width:97%" /></td>
                 <td align="left">
                   <form:select path="paymentTypeId" id="paymentTypeId"  style="width:98%" >
                       <form:option value="">SELECCIONE</form:option>
                       <form:options items="${paymentTypes}"  
                               itemValue="id"
                               itemLabel="name"/>
                    </form:select>
                 </td>
                 <td align="left">
                   <form:select path="paymentTypeId" id="paymentTypeId"  style="width:98%" >
                       <form:option value="">SELECCIONE</form:option>
                       <form:options items="${paymentTypes}"  
                               itemValue="id"
                               itemLabel="name"/>
                    </form:select>
                 </td>
               </tr>
               <tr>
                  <td align="left" class="label" ><br></td>
               </tr>
               <tr>
                  <td align="right" class="label" colspan="3">Equipos</td>
               </tr>
               <tr>
                 <td align="left" colspan="3"><hr></td>
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
