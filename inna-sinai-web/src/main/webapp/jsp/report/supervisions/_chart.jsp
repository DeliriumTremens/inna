<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>
    <!--Load the AJAX API-->
    
    <script type="text/javascript">
    
    var data = google.visualization.arrayToDataTable([
                                                      ['Zona', 'No. Instalaciones'],
                                                      ['CHIMALHUACAN',  1000],
                                                      ['COYOACAN',  1170],
                                                      ['GAM',  660],
                                                      ['IZTAPALAPA',  1030],
                                                      ['PLAZA ORIENTE',  1000],
                                                      ['S-CUAUTITLAN IZTALLI',  1170],
                                                      ['S-DOCTORES',  660],
                                                      ['S-ECATEPEC',  1030],
                                                      ['S-IZTAPALAPA',  1000],
                                                      ['S-IZTAPALAPA CENTRO',  1170],
                                                      ['S-LOS REYES',  660],
                                                      ['S-NEZAHUALCOYOTL',  1030],
                                                      ['S-NICOLAS ROMERO',  1000],
                                                      ['S-PLAZA HIDALGO',  1170]
                                                    ]);


  var chart = new google.visualization.ColumnChart(document.getElementById('zones'));
  chart.draw(data);
  
  
  var data = google.visualization.arrayToDataTable([
                                                    ['Rubro', 'Contratos'],
                                                    ['Contratos',     1000],
                                                    ['Supervisiones',      152]
                                                  ]);



  var chart = new google.visualization.PieChart(document.getElementById('contracts'));


  chart.draw(data);
  
 
$(document).ready(function() {
	$( "#chartTabs" ).tabs();
	});
    </script>


<div align="left">
   Total de registros: 876
</div>
<div id="chartTabs">
	<ul>
		<li>
			<a href="#chart1">Zona de Trabajo</a>
		</li>
		<li>
			<a href="#chart2">Contratos</a>
		</li>
	</ul>
	<div id="chart1">
		<div id="zones" style="width: 900px; height: 350px;"></div>
	</div>
	<div id="chart2">
		<div id="contracts" style="width: 900px; height: 350px;"></div>
	</div>
</div>


