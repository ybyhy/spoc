window.onload = function(){
    var oDiv=document.getElementById("click");
    var aInput=oDiv.getElementsByTagName("li");
    var aClass=document.getElementsByClassName("content-right-middle");
    for(var i=0;i<aInput.length;i++){
        aInput[i].index=i;
        aInput[i].onclick=function (){
            for(var i=0;i<aInput.length;i++){
                aInput[i].className="";
                aClass[i].style.display="none";
                aInput[i].getElementsByTagName("a")[0].style.color="grey";
            }
            this.className="active";
            this.getElementsByTagName("a")[0].style.color="#0B66C1";
            aClass[this.index].style.display="block";
        }
    }
}