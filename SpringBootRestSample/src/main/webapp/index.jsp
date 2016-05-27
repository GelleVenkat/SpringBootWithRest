<!DOCTYPE html>
<html>
<head>
    <title>Contact Information</title>
</head>
<body>
<script>
	function addContact(){
		document.test.action = "/addContact";
		return true;
	}
	function listContact(){
		document.test.action = "/contact";
		return true;
	}
	function deleteContact(){
		document.test.action = "/delete";
		return true;
	}
</script>
<div>
	<br><br>
	<form name="test"  action="" >
		<table>
	        <tr> <td width="100">Contact Id </td> <td><input type="text" name="id" placeholder="Enter Id"></td></tr>
            <tr> <td width="100">Contact Name </td><td><input type="text" name="contactName" placeholder="Enter Your Name"></td></tr>
            <tr> <td width="100">Email Id </td><td><input type="email" name="email" placeholder="Enter your email"></td></tr>
            <tr> <td width="100">Profession </td><td><input type="text" name="profession" placeholder="Enter Profession Details"></td></tr>
            <tr> <td width="100"><input type="submit" name="Add" value="Add/Update" onclick="addContact();"></td></tr>
	        <tr> <td width="30"><input type="submit" name="list" value="List" onclick="listContact();"></td></tr>
	        <tr><td width="30"><input type="submit" name="Delete" value ="Delete" onclick="deleteContact();"></td></tr>
        </table>
		</form>
</div>
</body>
</html>