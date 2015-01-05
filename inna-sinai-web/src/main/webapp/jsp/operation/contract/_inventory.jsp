<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

<script>
 $(function() {
	 $( "#cardSelectable" ).selectable();
	 $( "#irdSelectable" ).selectable();
   });
 
</script>

<table style="width:100%; height:150px">
                               <tr>
                                   <td width="50%">Tarjeta Inteligente</td>
                                   <td width="50%">IRD</td>
                               </tr>
                               <tr>
                                  <td>
                                      <ol id="cardSelectable" class="selectable">
                                        <li class="ui-state-default">623530714</li>
                                        <li class="ui-state-default">623530715</li>
                                        <li class="ui-state-default">623530716</li>
                                        <li class="ui-state-default">623530717</li>
                                        <li class="ui-state-default">623530718</li>
                                        <li class="ui-state-default">623530719</li>
                                        <li class="ui-state-default">623530720</li>
                                      </ol>               
                                  </td>
                                  <td>
                                       <ol id="irdSelectable" class="selectable">
                                        <li class="ui-state-default">CE0B1421463905095</li>
                                        <li class="ui-state-default">CE0B1421463905096</li>
                                        <li class="ui-state-default">CE0B1421463905097</li>
                                        <li class="ui-state-default">CE0B1421463905098</li>
                                        <li class="ui-state-default">CE0B1421463905099</li>
                                        <li class="ui-state-default">CE0B1421463905100</li>
                                        <li class="ui-state-default">CE0B1421463905101</li>
                                      </ol>           
                                  </td>
                               </tr>
                         </table>