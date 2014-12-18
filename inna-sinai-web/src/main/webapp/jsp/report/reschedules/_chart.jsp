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
                                                   ['Instalador', 'No. Instalaciones'],
                                                   ['Instalador 1',  1000],
                                                   ['Instalador 2',  1170],
                                                   ['Instalador 3',  660],
                                                   ['Instalador 4',  1030],
                                                   ['Instalador 5',  1000],
                                                   ['Instalador 6',  1170],
                                                   ['Instalador 7',  660],
                                                   ['Instalador 8',  1030],
                                                   ['Instalador 9',  1000],
                                                   ['Instalador 10',  1170],
                                                   ['Instalador 11',  660],
                                                   ['Instalador 12',  1030],
                                                   ['Instalador 14',  1000],
                                                   ['Instalador 15',  1000],
                                                   ['Instalador 16',  1000],
                                                   ['Instalador 17',  1000],
                                                   ['Instalador 18',  1000],
                                                   ['Instalador 19',  1000],
                                                   ['Instalador 20',  1000],
                                                   ['Instalador 21',  1000],
                                                   ['Instalador 22',  1000],
                                                   ['Instalador 23',  1000],
                                                   ['Instalador 24',  1170]]);
 

var chart = new google.visualization.ColumnChart(document.getElementById('installers'));

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
			<a href="#chart2">Tecnico Instalador</a>
		</li>
	</ul>
	<div id="chart1">
		<div id="zones" style="width: 900px; height: 350px;"></div>
	</div>
	<div id="chart2" style="width: 900px; height: 350px;">
		<div id="installers" style="width: 900px; height: 350px;"></div>
	</div>
</div>


