function LoginValidation(){
	
	type=document.getElementById('type').value;
	if(type.selectedIndex<0){
		document.getElementById('selecterror').innerHTML="please select type";
		return false;
	}
	
	email=document.getElementById('email').value;
	if(email==""){
		document.getElementById('emailerror').innerHTML="please Enter EmailId";
		return false;
	}
	
	pass=document.getElementById('pass').value;
	if(pass==""){
		document.getElementById('passerror').innerHTML="please Enter Password";
		return false;
	}
	
	return true;
	
}

function ChangePassValidation(){
	
	type=document.getElementById('type').value;
	if(type.selectedIndex<0){
		document.getElementById('selecterror').innerHTML="please select type";
		return false;
	}
	
	email=document.getElementById('email').value;
	if(email==""){
		document.getElementById('emailerror').innerHTML="please Enter EmailId";
		return false;
	}
	
	pass=document.getElementById('pass').value;
	if(pass==""){
		document.getElementById('passerror').innerHTML="please Enter Password";
		return false;
	}
	
	npass=document.getElementById('npass').value;
	if(npass==""){
		document.getElementById('npasserror').innerHTML="please Enter New Password";
		return false;
	}
	
	cpass=document.getElementById('cpass').value;
	if(cpass==""){
		document.getElementById('cpasserror').innerHTML="please Re-Enter Password";
		return false;
	}
	
	return true;
	
}

function AddCustValidation(){
	
	Name=document.getElementById('cname').value;
	if(Name==""){
		document.getElementById('cnameerror').innerHTML="please Enter Name";
		return false;
	}
	
	email=document.getElementById('email').value;
	if(email==""){
		document.getElementById('emailerror').innerHTML="please Enter EmailId";
		return false;
	}
	
	pass=document.getElementById('pass').value;
	if(pass==""){
		document.getElementById('passerror').innerHTML="please Enter Password";
		return false;
	}
	
	adr=document.getElementById('adr').value;
	if(adr==""){
		document.getElementById('adrerror').innerHTML="please Enter Address";
		return false;
	}
	
	con=document.getElementById('cNo').value;
	if(con==""){
		document.getElementById('cNoerror').innerHTML="please Enter ContactNo";
		return false;
	}
	
	if(con.length!=10){
		document.getElementById('cNoerror').innerHTML="please Enter Valid ContactNo";
		return false;
	}
	
	return true;
}

function AddFoodValidation(){
	
	Name=document.getElementById('fname').value;
	if(Name==""){
		document.getElementById('fnameerror').innerHTML="please Enter FoodName";
		return false;
	}
	
	type=document.getElementById('ftype').value;
	if(type==""){
		document.getElementById('ftypeerror').innerHTML="please Enter FoodType";
		return false;
	}
	
	quan=document.getElementById('fquan').value;
	if(quan==""){
		document.getElementById('fquanerror').innerHTML="please Enter Quantity";
		return false;
	}
	
	price=document.getElementById('fprice').value;
	if(price==""){
		document.getElementById('fpriceerror').innerHTML="please Enter Price";
		return false;
	}
	
	return true;
}

function UpdateFoodValidation(){
	
	id=document.getElementById('fid').value;
	if(id==""){
		document.getElementById('fiderror').innerHTML="please Enter FoodId";
		return false;
	}
	
	Name=document.getElementById('fname').value;
	if(Name==""){
		document.getElementById('fnameerror').innerHTML="please Enter FoodName";
		return false;
	}
	
	type=document.getElementById('ftype').value;
	if(type==""){
		document.getElementById('ftypeerror').innerHTML="please Enter FoodType";
		return false;
	}
	
	quan=document.getElementById('fquan').value;
	if(quan==""){
		document.getElementById('fquanerror').innerHTML="please Enter Quantity";
		return false;
	}
	
	price=document.getElementById('fprice').value;
	if(price==""){
		document.getElementById('fpriceerror').innerHTML="please Enter Price";
		return false;
	}
	
	return true;
}

function UpdateCustValidation(){
	
	Name=document.getElementById('cname').value;
	if(Name==""){
		document.getElementById('cnameerror').innerHTML="please Enter Name";
		return false;
	}
	
	email=document.getElementById('email').value;
	if(email==""){
		document.getElementById('emailerror').innerHTML="please Enter EmailId";
		return false;
	}
	
	pass=document.getElementById('pass').value;
	if(pass==""){
		document.getElementById('passerror').innerHTML="please Enter Password";
		return false;
	}
	
	adr=document.getElementById('adr').value;
	if(adr==""){
		document.getElementById('adrerror').innerHTML="please Enter Address";
		return false;
	}
	
	con=document.getElementById('cNo').value;
	if(con==""){
		document.getElementById('cNoerror').innerHTML="please Enter ContactNo";
		return false;
	}
	
	if(con.length!=10){
		document.getElementById('cNoerror').innerHTML="please Enter Valid ContactNo";
		return false;
	}
	
	return true;
}

function AddFeedValidation(){
	
	Name=document.getElementById('cname').value;
	if(Name==""){
		document.getElementById('cnameerror').innerHTML="please Enter Name";
		return false;
	}
	
	email=document.getElementById('email').value;
	if(email==""){
		document.getElementById('emailerror').innerHTML="please Enter EmailId";
		return false;
	}
	
	review=document.getElementById('review').value;
	if(review==""){
		document.getElementById('reviewerror').innerHTML="please Enter Review";
		return false;
	}
	
	rank=document.getElementById('rank').value;
	if(rank==""){
		document.getElementById('rankerror').innerHTML="please Enter Rank";
		return false;
	}
	
	sug=document.getElementById('sug').value;
	if(sug==""){
		document.getElementById('sugerror').innerHTML="please Enter Suggestion";
		return false;
	}
	
	return true;
}

function AddCartValidation(){
	
	id=document.getElementById('fid').value;
	if(id==""){
		document.getElementById('fiderror').innerHTML="please Enter FoodId";
		return false;
	}
	
	email=document.getElementById('email').value;
	if(email==""){
		document.getElementById('emailerror').innerHTML="please Enter EmailId";
		return false;
	}
	
	Name=document.getElementById('fname').value;
	if(Name==""){
		document.getElementById('fnameerror').innerHTML="please Enter FoodName";
		return false;
	}
	quan=document.getElementById('fquan').value;
	if(quan==""){
		document.getElementById('fquanerror').innerHTML="please Enter Quantity";
		return false;
	}
	
	price=document.getElementById('fprice').value;
	if(price==""){
		document.getElementById('fpriceerror').innerHTML="please Enter Price";
		return false;
	}
	
	tprice=document.getElementById('tprice').value;
	if(tprice==""){
		document.getElementById('tpriceerror').innerHTML="please Enter TotalPrice";
		return false;
	}
	
	return true;
}