pover = () =>{
	var i=document.getElementById('pa');
	i.style.color="red";
}
pout = () =>
{
	var i=document.getElementById('pa');
	i.style.color="black";
}
bover = () =>{
	var i=document.getElementById('ba');
	i.innerHTML="I Said No";
}
bout = () =>
{
	var i=document.getElementById('ba');
	i.innerHTML="Don't Hover";
}
inc = () =>
{
	var i=document.getElementById('inp');
	var v=document.getElementById('pa').innerHTML;
	i.value=v;
}
c1over = () =>{
	var i=document.getElementById('c1');
	i.style.color="blue";
	i.style.fontWeight="bold";
}
c1out = () =>{
	var i=document.getElementById('c1');
	i.style.color="black";
	i.style.fontStyle="times new roman";
	i.style.fontWeight="revert";
}
c2over = () =>{
	var i=document.getElementById('c2');
	i.style.color="blue";
	i.style.fontWeight="bold";
}
c2out = () =>{
	var i=document.getElementById('c2');
	i.style.color="black";
	i.style.fontStyle="times new roman";
	i.style.fontWeight="revert";
}
c3over = () =>{
	var i=document.getElementById('c3');
	i.style.color="blue";
	i.style.fontWeight="bold";
}
c3out = () =>{
	var i=document.getElementById('c3');
	i.style.color="black";
	i.style.fontStyle="times new roman";
	i.style.fontWeight="revert";
}
