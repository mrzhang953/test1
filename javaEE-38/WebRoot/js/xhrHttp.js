function getxhr() {
		//声明 了变量的名称
		var xmlHttp;
		try {
			// Firefox, Opera 8.0+, Safari IE 的高版本 谷歌
			xmlHttp = new XMLHttpRequest();
			return xmlHttp;
		} catch (e) {
			// Internet Explorer 6.0 
			try {
				xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
				return xmlHttp;

			} catch (e) {
				try {
					//IE 5.5
					xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
					return xmlHttp;
				} catch (e) {
					alert("您的浏览器不支持AJAX！");
					return false;
				}
			}
		}
	}