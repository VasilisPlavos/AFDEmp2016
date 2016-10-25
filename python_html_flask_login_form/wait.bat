echo wait 5 seconds!
PING 127.0.0.1 -n 5 >NUL 2>&1
start http://localhost:5000/new
exit
