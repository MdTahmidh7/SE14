
function flag(){
    console.log("Flag button is clicked");
    document.getElementById("flag").style.display = "block";
    document.getElementById("flower").style.display = "none";
}
function flower(){
    document.getElementById("flower").style.display = "block";
    document.getElementById("flag").style.display = "none";
}