;(function($){
	$('#navbarSupportedContent .nav-item').click(function() {
		$('#navbarSupportedContent .nav-item').removeClass( "active" );
		$( this ).addClass( "active" );
	});
})(jQuery)