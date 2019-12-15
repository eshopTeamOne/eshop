主要架构就是通过spring cloud的consul建立服务注册中心
consul 使用说明：	
	1、下载 https://www.consul.io/downloads_tools.html 设置环境变量 
	2、开启服务
		设置环境变量 %CONSUL_LOGS
		consul agent -server -bind 127.0.0.1 -client 0.0.0.0 -bootstrap-expect 1 -data-dir %CONSUL_LOGS% -node server1 -ui
		或者 consul agent -dev  
	3、访问服务注册中心
		http://127.0.0.1:8500