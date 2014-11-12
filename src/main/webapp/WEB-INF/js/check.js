$(function(){
	var emailReg = /^[a-zA-Z][\w]*@[a-zA-Z1-9]+\.[a-zA-Z1-9]+/g;
	console.log(emailReg.test('aaa@bbb.com')); 
	$('.email').off('blur').on('blur',function(){
		console.log($(this).val());
	});
});