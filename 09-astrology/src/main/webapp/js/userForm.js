$(document).ready(function() {
		// Open modal when clicking the button
		$("#openModal").click(function() {
			$("#popupForm").modal('show');
		});

		// Close modal when clicking cancel
		$("#closeModal").click(function() {
			$("#popupForm").modal('hide');
		});
	});
	
    $(document).ready(function() {
        $('.ui.radio.checkbox').checkbox();
    });