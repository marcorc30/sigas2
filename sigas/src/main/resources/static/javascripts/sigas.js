$(function(){
	

	inputCpf = $('.js-input-cpf');
	inputCpf.mask("000.000.000-00");
	
	
	inputTelefone = $('.js-formatar-telefone');
	
		var maskBehavior = function (val) {
			  return val.replace(/\D/g, '').length === 11 ? '(00) 00000-0000' : '(00) 0000-00009';
			}
		var	options = {
			  onKeyPress: function(val, e, field, options) {
			      field.mask(maskBehavior.apply({}, arguments), options);
			    }
			};
		inputTelefone.mask(maskBehavior, options);		
		
		
	inputCep = $('.js-input-cep');
	inputCep.mask('00000-000');	
	
	inputStatus = $('.js-status');
	inputStatus.bootstrapSwitch();
	
	inputStatus2 = $('.js-status2');
	inputStatus2.bootstrapSwitch();
	 
	
})


/*$(function(){
	
	inputTelefone = $('.js-formatar-telefone');
	
		var maskBehavior = function (val) {
			  return val.replace(/\D/g, '').length === 11 ? '(00) 00000-0000' : '(00) 0000-00009';
			}
		var	options = {
			  onKeyPress: function(val, e, field, options) {
			      field.mask(maskBehavior.apply({}, arguments), options);
			    }
			};
		inputTelefone.mask(maskBehavior, options);		
	
})

*//*var Sigas = Sigas || {};

Sigas.FormatarCpf = (function(){
	
	function FormatarCpf(){
		this.inputCpf = $('.js-input-cpf');
	}
	
	FormatarCpf.prototype.iniciar = function(){
		this.inputCpf.mask("000.000.000-00");
	}
	
	return FormatarCpf;
	
})();

Sigas.FormatarTelefone = (function(){

	function FormatarTelefone(){
		this.inputTelefone = $('.js-formatar-telefone');
	}
	
	FormatarTelefone.prototype.iniciar = function(){
		var maskBehavior = function (val) {
			  return val.replace(/\D/g, '').length === 11 ? '(00) 00000-0000' : '(00) 0000-00009';
			}
		var	options = {
			  onKeyPress: function(val, e, field, options) {
			      field.mask(maskBehavior.apply({}, arguments), options);
			    }
			};
		this.inputTelefone.mask(maskBehavior, options);		
	}
	
	return FormatarTelefone;
	
})();*/