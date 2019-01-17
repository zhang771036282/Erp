var btn=document.getElementById('confirm-into');
var div=document.getElementById('layui-background');
var close=document.getElementById('confirm');

btn.onclick=function show(){
	div.style.display="flex";
}
close.onclick=function close(){
	div.style.display="none";
}
window.onclick = function close(e){
	if(e.target == div){
	div.style.display = "none";		
	}
}





