function startInitFlow() {
	Ext.Ajax.request({
	   url: '/actions/auth/isapplicationinitialized.groovy',
	   success: function(response, opts) {
	      var obj = Ext.decode(response.responseText);
	      console.dir(obj);
	   },
	   failure: function(response, opts) {
		   showError('Unable to detect whether the server was initialized successfully.');
	   }
	});
}

function showError(message) {
	Ext.MessageBox.show({
        title: 'Error',
        msg: message
    });
}