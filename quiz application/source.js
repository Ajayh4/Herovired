const q=["RGB stands for?","what comes after abcd?","How many types of styling are present?","p tag stands for?"]
const op1=["red ghostblue","g","2","para"];
const op2=["red green blue","f","1","parcel"];
const op3=["red green bold","e","4","parameter"];
const op4=["red ghostblue blue","h","3","page"];
const o=[1,2,3,4,1]
let c=0;
let sc=0;
function fun()
{
	if(c<5){
	var x=1;
	if(document.getElementById('ot1').checked)
	{
		if(o[c]==x)
			sc+=1;
		document.getElementById('ot1').checked=false;
	}
	x+=1;
	if(document.getElementById('ot2').checked)
	{
		if(o[c]==x)
			sc+=1;
		document.getElementById('ot2').checked=false;
	}
	x+=1;
	if(document.getElementById('ot3').checked)
	{
		if(o[c]==x)
			sc+=1;
		document.getElementById('ot3').checked=false;
	}
	x+=1;
	if(document.getElementById('ot4').checked)
	{
		if(o[c]==x)
			sc+=1;
		document.getElementById('ot4').checked=false;
	}
	if(c!=4){
	document.getElementById('q').innerHTML=q[c];
	document.getElementById('o1').innerHTML=op1[c];
	document.getElementById('o2').innerHTML=op2[c];
	document.getElementById('o3').innerHTML=op3[c];
	document.getElementById('o4').innerHTML=op4[c];
	}
	c+=1;
}
if(c==5)
{
	document.getElementById('res').innerHTML="your score is: "+sc;
	document.getElementById('rl').style.display="block";
	document.getElementById('st').style.display="none";
}
}
function fun1()
{
	sc=0;
	c=0;
	document.getElementById('q').innerHTML="HTML stands for?";
	document.getElementById('o1').innerHTML="Hyper text markup language";
	document.getElementById('o2').innerHTML="Hyper text mark language";
	document.getElementById('o3').innerHTML="Hyper text markup lang";
	document.getElementById('o4').innerHTML="Hyper texted markup language";
	document.getElementById('res').innerHTML="";
	document.getElementById('rl').style.display="none";
	document.getElementById('st').style.display="block";
}


