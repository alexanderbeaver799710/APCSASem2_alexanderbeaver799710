// JavaScript Document

window.onload = function(){
	playLoad();
	var i = 0;
	
	var interval = setInterval(function(){
		setAnimatedElementsToOpacity(i);
		i+= 0.01;
		if(i > 1){
			clearInterval(interval);
		}
	},10);
	menuLoad();
	

	

}

function setAnimatedElementsToOpacity(opacity){
	var elemToAnimateIn = document.getElementsByClassName("anim-in");
	
	for(var i = 0; i < elemToAnimateIn.length; i++){
		elemToAnimateIn[i].style.opacity = opacity;
	}

}

function menuLoad(){
	document.getElementById("nav-button").onclick = function(){
		window.location.href = "menu.html";
		
	}
	
}
function playLoad(){
	var animation = bodymovin.loadAnimation({
  container: document.getElementById('loader'),
  renderer: 'svg',
  loop: false,
  autoplay: true,
  path: 'https://s3-us-west-2.amazonaws.com/abvr-assets/lottie/Loader.json'
});
	animation.addEventListener('complete',goToHome);
}
function goToHome(){
	window.location = "home.html";
}