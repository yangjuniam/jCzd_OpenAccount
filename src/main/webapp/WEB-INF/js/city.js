$.getScript("/static/js/provinces.js",function(){
	provinceInstance();
});
$.getScript("/static/js/citys.js");
$.getScript("/static/js/areas.js");
function provinceInstance(){
	clearProvince();
	for(var i=0; i<provinceList.length; i++){
		$('[name=province]').append('<option value="'+provinceList[i].provinceName+'" seleted>'+provinceList[i].provinceName+'</option>');
	}
	$('[name=province]').off('change').on('change',function(){
		clearCity();
		clearArea();
		for(var i=0; i<cityList.length; i++){
			if(cityList[i].provinceName==$(this).val()){
				for(var j=0; j<cityList[i].citys.length; j++){
					$('[name=city]').append('<option value="'+cityList[i].citys[j].cityName+'" seleted>'+cityList[i].citys[j].cityName+'</option>');
				}
			}
		}
		$('[name=city]').off('change').on('change',function(){
			clearArea();
			for(var i=0; i<areaList.length; i++){
				if(areaList[i].cityName==$(this).val()){
					for(var j=0; j<areaList[i].areas.length; j++){
						$('[name=area]').append('<option value="'+areaList[i].areas[j].areaName+'" seleted>'+areaList[i].areas[j].areaName+'</option>');
					}
				}
			}
		});
	});
}
function clearArea(){
	$('[name=area]').empty();
	$('[name=area]').append('<option value="" seleted>请选择</option>');
}
function clearCity(){
	$('[name=city]').empty();
	$('[name=city]').append('<option value="" seleted>请选择</option>');
}
function clearProvince(){
	$('[name=province]').empty();
	$('[name=province]').append('<option value="" seleted>请选择</option>');
}