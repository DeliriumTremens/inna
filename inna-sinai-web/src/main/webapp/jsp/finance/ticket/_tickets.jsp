<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

<script type="text/javascript">
   function showEditForm(id){
	 loadModalForm("catalog/inventoryTypes/setupUpdate.do",{id:id});
   }
</script>

<table class="styledTable" title="REGISTROS"> 
  <thead> 
    <tr> 
      <th width="3%">ID</th> 
	  <th width="15%">FECHA</th> 
	  <th width="67%">DESCRIPCION</th>
	  <th width="15%">MONTO</th>
   </tr> 
  </thead> 
  <tbody> 
      <tr>
        <td>1</td>
		<td>09/01/2015</td>
		<td>COSTO DE INSTALACION POR CONTRATOS 542125482, 254877456, 256845266, 5847782266</td>
		<td>$800</td>
	  </tr>
	  <tr>
        <td>2</td>
		<td>09/01/2015</td>
		<td>VALE PARA GASOLINA</td>
		<td>$400</td>
	  </tr>
  </tbody> 
</table> 
