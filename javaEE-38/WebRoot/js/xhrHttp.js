function getxhr() {
		//���� �˱���������
		var xmlHttp;
		try {
			// Firefox, Opera 8.0+, Safari IE �ĸ߰汾 �ȸ�
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
					alert("�����������֧��AJAX��");
					return false;
				}
			}
		}
	}