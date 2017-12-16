var rg=$("#range").val()
var val=$("#value").val(rg)
$("#range").change(function() {
	var rg2=$("#range").val()
	$("#value").val(rg2)
})

 $("#value").keyup(function() {
	var val2=$("#value").val()
	$("#range").val(val2)
})