<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Redis Operate Page</title>
    <#--<script type="text/javascript" src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>-->
</head>
<body>
<h1>Redis Operate Page</h1>

<form action="/redis/get" method="get">
    <input type="text" name="k"/> <input type="submit" value="Get Submit">
</form>
<hr/>
<form action="/redis/set" method="get">
    <input type="text" name="k"/> <input type="submit" value="Set Submit">
</form>


</html>