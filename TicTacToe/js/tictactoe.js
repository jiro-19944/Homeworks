table = new Object();
table.tb = function() {
	document.getElementById("points").style.display = "block";
	table.countRow = document.getElementById("countRow").value;
	table.state = new Array(table.countRow);
	table.play();
	if (table.countRow >= 3 && table.countRow <= 9) {
		$("#loading").hide();
		table.createTable();
	}

}
table.play = function() {
	for ( i = 0; i < table.countRow; i++) {
		table.state[i] = new Array(table.countRow);
		for ( j = 0; j < table.countRow; j++) {
			table.state[i][j] = 0;
		}
	}
}
table.reload = function() {

	location.reload();
}

table.createTable = function() {

	var body = document.getElementsByTagName('body')[0];
	var tbl = document.createElement('table');
	var tbdy = document.createElement('tbody');

	for (var i = 0; i < table.countRow; i++) {
		var tr = document.createElement('tr');
		for (var j = 0; j < table.countRow; j++) {

			var td = document.createElement('td');
			tr.appendChild(td);
			var id = "a" + i + j;
			td.id = id;
			id = td.id;
			var clickCount = 1;
			td.onclick = (function() {
				return function() {
					currentId = this.id.slice(1);
					i = currentId.slice(0, 1);
					j = currentId.slice(1);
					if (table.state[i][j] == 0) {
						if (clickCount % 2 == 0) {
							document.getElementById(this.id).innerHTML = "<img  src='images/o.png' />";
							table.state[i][j] = -1;
							document.getElementById("xo").innerHTML = "<img  src='images/x.png' />";
						} else {

							document.getElementById(this.id).innerHTML = "<img  src='images/x.png' />";
							table.state[i][j] = 1;
							document.getElementById("xo").innerHTML = "<img  src='images/o.png' />";
						}
						clickCount++;
						table.checkState(i, j, table.state[i][j]);

					}
				}
			})();

		}
		tbdy.appendChild(tr);
	}
	tbl.appendChild(tbdy);
	body.appendChild(tbl);

}

table.checkState = function(i, j, state) {
	var s = 0;
	var ss = 0;
	var sss = 0;
	var ssss = 0;
	parseInt(state);
	for (var k = 0; k <= table.state.length - 1; k++) {
		s = s + table.state[i][k];
		ss = ss + table.state[k][j];
		sss = sss + table.state[k][k];
		ssss = ssss + table.state[k][table.state.length - 1 - k];
	}

	if (s == table.state.length * state || ss == table.state.length * state || sss == table.state.length * state || ssss == table.state.length * state) {
		if (s > 0 || ss > 0 || sss > 0 || sss > 0) {
			alert("x");
			table.reload();

		} else {
			alert("y");
			table.reload();
		}
	}

}

