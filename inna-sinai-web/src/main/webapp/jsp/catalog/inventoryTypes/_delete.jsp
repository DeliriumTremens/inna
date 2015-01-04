<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

<script type="text/javascript">
   function removeRow(){
	   actionConfirmed("catalog/inventoryTypes/delete.do","result"
		  ,{rowIds:getSelectedRows("REGISTROS")}
	      , "modalConfirmDelete");
   }
</script>
	

<table id="modalConfirmDelete" class=stylizedModalConfirmation title="Eliminar">
    <tr>
      <td colspan="2"> 
	      <span class="ui-icon ui-icon-alert" style="float:left;"></span>
	      Los registros seleccionados serán eliminados permanentemente. Desea continuar ?
	  </td>
	</tr>
	<tr>
      <td colspan="2">
         <br/> 
      </td>
    </tr>
	<tr>
	  <td><button class="litleButton styledButton" type="button" onclick="closeModalForm('modalConfirmDelete')">Cancelar</button></td>
	  <td><button class="litleButton styledButton" type="button" onclick="removeRow()">Aceptar</button></td>
	</tr>
</table>