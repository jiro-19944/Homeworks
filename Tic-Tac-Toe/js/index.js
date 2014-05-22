function tb() {
	var countRow = document.getElementById("countRow").value;
	createTable(countRow);
}

function createTable(countRow) {

	var body = document.getElementsByTagName('body')[0];
	var tbl = document.createElement('table');
	var tbdy = document.createElement('tbody');

	for (var i = 0; i < countRow; i++) {
		var tr = document.createElement('tr');
		for (var j = 0; j < countRow; j++) {

			var td = document.createElement('td');
			tr.appendChild(td);
			var id = "a" + i + j;
			td.id = id;
			id=td.id;
			td.onclick = (function() {
            var cnt = i; 
            return function() {
              document.getElementById(id).innerHTML="<img  src='images/o.jpeg' />";
            }    
        })(j);
			  


		}
		tbdy.appendChild(tr);
	}
	tbl.appendChild(tbdy);
	body.appendChild(tbl);
}

window.onload = function() { createTabl();}