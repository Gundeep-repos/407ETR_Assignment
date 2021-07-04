<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
<script src="jquery-1.12.2.min.js" type="text/javascript"></script>
<script src="js/bootstrap.js" type="text/javascript"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>407 ETR Systems</title>
<script>


function fetchCD(){
	
	
	var startingReference = document.getElementById("startingPoint").value;
	var destinationReference = document.getElementById("destinationPoint").value;
	var xhr = new XMLHttpRequest;
	

    xhr.open("GET", "./ServiceClass?start="+startingReference+"&end="+destinationReference, true);


    //for response receiving
    xhr.onreadystatechange = function ()
    {
    	
    	if(xhr.readyState == 4 && xhr.status == 200){
    		var res = xhr.responseText.trim();
                
                console.log(res);                

                var mainObj = JSON.parse(res);
                
                if(mainObj["status"] == "null"){
                	alert("Start Destination and End Destination should have some value");
                }else if(mainObj["status"] == "fail"){
                	alert("Incorrect Spellings for either Start/ End Destination");
                }else if(mainObj["status"] == "success"){
                	document.getElementById("distance").innerHTML=mainObj["tripDistance"]+" kms";
                    document.getElementById("cost").innerHTML=mainObj["costOfTrip"]+" CAD";	
                }
                
                
    	}
       
    };

    	xhr.send("Sent dete");
		
}

</script>
</head>
<body>

<div style="center">
<table class="table table-bordered table-striped">
<tr>
<th>Enter the Starting Point</th>
<th>Enter the Destination Point</th>
<th>Distance</th>
<th>Cost</th>
</tr>
<tr>
<td><input type="text" id="startingPoint"/></td>
<td><input type="text" id="destinationPoint"/></td>
<td id = "distance"></td>
<td id = "cost"></td>
</tr>
</table>
</div>
<center><button style="color: blueviolet" class="btn btn-largs" onclick="fetchCD()">Get Cost</button></center>
</body>
</html>