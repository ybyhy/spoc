window.onload = function(){
    var oDiv=document.getElementById("choose");
    var aLi=oDiv.getElementsByTagName("li");
    var aClass=document.getElementsByClassName("content-right-item");
    for(var i=0;i<aLi.length;i++){
        aLi[i].index=i;
        aLi[i].onclick=function (){
            for(var j=0;j<aLi.length;j++){
                aLi[j].className = '';
            }
            this.className = 'active';
            for(var j=0;j<aLi.length;j++){
                aClass[j].style.display = '';
            }
            aClass[this.index].style.display = 'block';
        }
    }
}