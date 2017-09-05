function onClickConvert(){
    var romanNumeral = document.getElementById("romanNumeralInput").value;
    renderResult(convertRomanToNumeric(romanNumeral));
 }

function renderResult(result){
    resultDiv = document.getElementById("result");
    if(resultDiv == null){
       resultDiv = document.createElement("div");
       resultDiv.id = "result";
       document.body.append(resultDiv);
    }
    resultDiv.innerHTML = result;
}
