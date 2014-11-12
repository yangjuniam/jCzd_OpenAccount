var dynamicLoading = {
    loadCSS: function(path){
		if(!path || path.length === 0){
			throw new Error('argument "path" is required !');
		}
		var head = document.getElementsByTagName('head')[0];
        var link = document.createElement('link');
        link.href = path;
        link.rel = 'stylesheet';
        link.type = 'text/css';
        head.appendChild(link);
    },
    loadJS: function(path){
		if(!path || path.length === 0){
			throw new Error('argument "path" is required !');
		}
		var head = document.getElementsByTagName('head')[0];
        var script = document.createElement('script');
        script.src = path;
        script.type = 'text/javascript';
        head.appendChild(script);
    }
};
dynamicLoading.loadCSS('/static/valida/css/validate.css');

function enhanceValidator(form, errorContainer){
	var $form = $(form),
		$errorContainer = $(errorContainer),
		api = $form.validate();
	$.extend($form.validate().settings, {
		showErrors : function(errorMap, errorList){
			var i, elements;
			for ( i = 0; this.errorList[i]; i++ ) {
				var error = this.errorList[i];
				if ( this.settings.highlight ) {
					this.settings.highlight.call( this, error.element, this.settings.errorClass, this.settings.validClass );
				}
				this.showLabel( error.element, error.message );
			}
			if ( this.errorList.length ) {
				this.toShow = this.toShow.add( this.containers );
			}
			if ( this.settings.success ) {
				for ( i = 0; this.successList[i]; i++ ) {
					this.showLabel( this.successList[i] );
				}
			}
			if ( this.settings.unhighlight ) {
				for ( i = 0, elements = this.validElements(); elements[i]; i++ ) {
					this.settings.unhighlight.call( this, elements[i], this.settings.errorClass, this.settings.validClass );
				}
			}
			this.toHide = this.toHide.not( this.toShow );
			this.addWrapper( this.toHide ).addClass(this.settings.validClass);
			this.addWrapper( this.toShow ).show();
		},
		errorPlacement : function(error,element) {
			error.appendTo($errorContainer);
		}
	});
	for ( var c in $form.validate().settings.rules) {
		$('[name=' + c.toString() + ']').on('focus', function() {
			api.form();
		});
	};
	
	$(form).on('focus', 'input:not([type=submit]),select', function(){
		var top = $(this).offset().top + $(this).outerHeight()/2 - $errorContainer.outerHeight()/2;
		var left = $(this).offset().left + $(this).outerWidth() + 130;
		$errorContainer.show().css('top', top + 'px').css('left', left + 'px');
		$errorContainer.find(api.settings.wrapper).css('opacity', 0.5);
		$errorContainer.find('[for=' + api.idOrName(this) + ']').parent().css('opacity', 1);
	});
	$errorContainer.on('click', api.settings.errorElement + '[for]', function(){
		var target = $(this).attr('for');
		if(api.settings.groups[target]){
			target = api.settings.groups[target].split(' ')[0];
		}
		$('[name=' + target + ']').focus();
	});
}

//通过 addMethod 定义新的验证规则
jQuery.validator.addMethod('identifyCode', function(value, element) {
	var cardNo = /^[1-9]\d{5}19([0-8]\d|9[0-6])((0\d)|(1[0-2]))((0\d)|([1-2]\d)|(3[0-1]))\d{3}[\dx]$/i;
	return this.optional(element) || (cardNo.test(value));
}, '');

jQuery.validator.addMethod('mobilePhone', function(value, element) {
	var mobilePhoneReg = /^1[3|5|7|8]\d{9}$/i;
	return this.optional(element) || (mobilePhoneReg.test(value));
}, '');
		
//通过 addMethod 定义新的验证规则
jQuery.validator.addMethod('chineseChar', function(value, element) {
	var cardNo = /^[^x00-xff]+$/i;
	return this.optional(element) || (cardNo.test(value));
}, '');

//通过 addMethod 定义新的验证规则
jQuery.validator.addMethod('nativePlaceGroup', function(value, element) {
	var groups = this.settings.groups[this.groups[element.name]],
		result = true,
		pattern = null,
		self = this;
	$.each(groups.split(' '), function(key, name){
		pattern = self.settings.rules[name].nativePlaceGroup.pattern;
		result = result && pattern.test(self.findByName(name).val());
	});
	return result;
}, '户籍地址不能为空');

//通过 addMethod 定义新的验证规则
jQuery.validator.addMethod('confirmBankCode', function(value, element) {
	if($('[name=checkBankCard]').val() == '999'){
		return true;
	}else{
		if(/^\d{15,19}$/.test(value)){
			return true;
		}else{
			return false;
		}
	}
}, '银行卡号必须填写');

