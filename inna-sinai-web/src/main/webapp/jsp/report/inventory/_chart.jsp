<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>
    <!--Load the AJAX API-->
    
    <script type="text/javascript">
    
    var data = new google.visualization.DataTable();
    data.addColumn('string', 'Tipo');
    data.addColumn('number', 'En Stock');
    data.addColumn('number', 'Asignado');
    data.addColumn('number', 'Total');
    data.addRows([
      ['LNB SENCILLO',  {v: 185, f: '185'}, {v: 300, f: '300'}, {v: 485, f: '485'}],
      ['PAIRING BRIDGE 2X2',  {v: 485, f: '485'}, {v: 120, f: '120'}, {v: 625, f: '625'}],
      ['SPLITTER 1X2 2PV',  {v: 582, f: '582'}, {v: 80, f: '80'}, {v: 662, f: '662'}],
      ['LNB ONE CABLE GENERAL',  {v: 152, f: '152'}, {v: 150, f: '150'}, {v: 302, f: '302'}],
      ['PAIRING BRIDGE 4X4',  {v: 58, f: '58'}, {v: 180, f: '180'}, {v: 138, f: '138'}],
      ['SPLITTER 1X4 4PV',  {v: 125, f: '125'}, {v: 160, f: '160'}, {v: 285, f: '285'}],
      ['SPLITTER O DIVISOR PARA SKY + HD',  {v: 80, f: '80'}, {v: 215, f: '215'}, {v: 315, f: '315'}],
      ['BOBINA CABLE RG6 500 MTS CARRETE',  {v: 30, f: '30'}, {v: 125, f: '125'}, {v: 155, f: '155'}],
      ['CINCHOS DE PLASTICO DE 19CM',  {v: 541, f: '541'}, {v: 100, f: '100'}, {v: 341, f: '641'}],
      ['LNB SENCILLO',  {v: 185, f: '185'}, {v: 300, f: '300'}, {v: 485, f: '485'}],
      ['PAIRING BRIDGE 2X2',  {v: 485, f: '485'}, {v: 120, f: '120'}, {v: 625, f: '625'}],
      ['SPLITTER 1X2 2PV',  {v: 582, f: '582'}, {v: 80, f: '80'}, {v: 662, f: '662'}],
      ['LNB ONE CABLE GENERAL',  {v: 152, f: '152'}, {v: 150, f: '150'}, {v: 302, f: '302'}],
      ['PAIRING BRIDGE 4X4',  {v: 58, f: '58'}, {v: 180, f: '180'}, {v: 138, f: '138'}]
    ]);
    
    
    var data1 = new google.visualization.DataTable();
    data1.addColumn('string', 'Tipo');
    data1.addColumn('number', 'En Stock');
    data1.addColumn('number', 'Asignado');
    data1.addColumn('number', 'Total');
    data1.addRows([
      ['TARJETA INTELIGENTE',  {v: 185, f: '185'}, {v: 300, f: '300'}, {v: 485, f: '485'}],
      ['IRD',  {v: 485, f: '485'}, {v: 120, f: '120'}, {v: 625, f: '625'}]
    ]);


    var chart = new google.visualization.Table(document.getElementById('local'));
    var chart1 = new google.visualization.Table(document.getElementById('sky'));
    


chart.draw(data);
chart1.draw(data1);

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
			<a href="#chart2">Inventario Local</a>
		</li>
		<li>
			<a href="#chart3">Inventario SKY</a>
		</li>
	</ul>
	<div id="chart2" style="width: 900px; height: 350px;">
		<div id="local" style="width: 900px; height: 350px;"></div>
	</div>
	<div id="chart3" style="width: 900px; height: 350px;">
		<div id="sky" style="width: 900px; height: 350px;"></div>
	</div>
</div>


