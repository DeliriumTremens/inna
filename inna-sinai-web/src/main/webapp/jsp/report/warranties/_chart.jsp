<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>
    <!--Load the AJAX API-->
    
    <script type="text/javascript">
    
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
   Total de registros: 125
</div>
<div id="chartTabs">
	<ul>
		<li>
			<a href="#chart2">Tecnico Instalador</a>
		</li>
	</ul>
	<div id="chart2" style="width: 900px; height: 350px;">
		<div id="installers" style="width: 900px; height: 350px;"></div>
	</div>
</div>


