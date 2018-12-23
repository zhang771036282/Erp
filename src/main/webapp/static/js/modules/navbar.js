/* Navbar */
layui.define(["element","common"],function(exports){var $=layui.jquery,layer=parent.layer===undefined?layui.layer:parent.layer,element=layui.element,common=layui.common,cacheName="tb_navbar";var Navbar=function(){this.config={elem:undefined,data:undefined,url:undefined,type:"GET",cached:false,spreadOne:false};this.v="2.4.5"};Navbar.prototype.render=function(){var _that=this;var _config=_that.config;if(typeof(_config.elem)!=="string"&&typeof(_config.elem)!=="object"){common.throwError("Navbar error: elem参数未定义或者设置出错，具体设置格式请参考文档API.")}var $container;if(typeof(_config.elem)==="string"){$container=$(""+_config.elem+"")}if(typeof(_config.elem)==="object"){$container=_config.elem}if($container.length===0){common.throwError("Navbar error: 找不到elem参数配置的容器。请检查.")}if(_config.data===undefined&&_config.url===undefined){common.throwError("Navbar error: 请为Navbar配置数据源.")}if(_config.data!==undefined&&typeof(_config.data)==="object"){var html=getHtml(_config.data);$container.html(html);element.init();_that.config.elem=$container}else{if(_config.cached){var cacheNavbar=layui.data(cacheName);if(cacheNavbar.navbar===undefined){$.ajax({type:_config.type,url:_config.url,async:false,dataType:"json",success:function(result,status,xhr){layui.data(cacheName,{key:"navbar",value:result});var html=getHtml(result);$container.html(html);element.init()},error:function(xhr,status,error){common.msgError("Navbar error:"+error)},complete:function(xhr,status){_that.config.elem=$container}})}else{var html=getHtml(cacheNavbar.navbar);$container.html(html);element.init();_that.config.elem=$container}}else{layui.data(cacheName,null);$.ajax({type:_config.type,url:_config.url,async:false,dataType:"json",success:function(result,status,xhr){var html=getHtml(result);$container.html(html);element.init()},error:function(xhr,status,error){common.msgError("Navbar error:"+error)},complete:function(xhr,status){_that.config.elem=$container}})}}if(_config.spreadOne){var $ul=$container.children("ul");$ul.find("li.layui-nav-item").each(function(){$(this).on("click",function(){$(this).siblings().removeClass("layui-nav-itemed")})})}return _that};Navbar.prototype.set=function(options){var that=this;that.config.data=undefined;$.extend(true,that.config,options);return that};Navbar.prototype.on=function(events,callback){var that=this;var _con=that.config.elem;if(typeof(events)!=="string"){common.throwError("Navbar error:事件名配置出错，请参考API文档.")}var lIndex=events.indexOf("(");var eventName=events.substr(0,lIndex);var filter=events.substring(lIndex+1,events.indexOf(")"));if(eventName==="click"){if(_con.attr("lay-filter")!==undefined){_con.children("ul").find("li").each(function(){var $this=$(this);if($this.find("dl").length>0){var $dd=$this.find("dd").each(function(){$(this).on("click",function(){var $a=$(this).children("a");var href=$a.data("url");var icon=$a.children("i:first").data("icon");var title=$a.children("cite").text();var data={elem:$a,field:{href:href,icon:icon,title:title}};callback(data)})})}else{$this.on("click",function(){var $a=$this.children("a");var href=$a.data("url");var icon=$a.children("i:first").data("icon");var title=$a.children("cite").text();var data={elem:$a,field:{href:href,icon:icon,title:title}};callback(data)})}})}}};Navbar.prototype.cleanCached=function(){layui.data(cacheName,null)};function getHtml(data){var ulHtml='<ul class="layui-nav layui-nav-tree beg-navbar">';for(var i=0;i<data.length;i++){if(data[i].spread){ulHtml+='<li class="layui-nav-item layui-nav-itemed">'}else{ulHtml+='<li class="layui-nav-item">'}if(data[i].children!==undefined&&data[i].children!==null&&data[i].children.length>0){ulHtml+='<a href="javascript:;">';if(data[i].icon!==undefined&&data[i].icon!==""){if(data[i].icon.indexOf("fa-")!==-1){ulHtml+='<i class="fa '+data[i].icon+'" aria-hidden="true" data-icon="'+data[i].icon+'"></i>'}else{ulHtml+='<i class="layui-icon" data-icon="'+data[i].icon+'">'+data[i].icon+"</i>"}}ulHtml+="<cite>"+data[i].title+"</cite>";ulHtml+="</a>";ulHtml+='<dl class="layui-nav-child">';for(var j=0;j<data[i].children.length;j++){ulHtml+=getChildrenNodes(data[i].children[j])}ulHtml+="</dl>"}else{var dataUrl=(data[i].href!==undefined&&data[i].href!=="")?'data-url="'+data[i].href+'"':"";ulHtml+='<a href="'+data[i].href+'"'+dataUrl+">";if(data[i].icon!==undefined&&data[i].icon!==""){if(data[i].icon.indexOf("fa-")!==-1){ulHtml+='<i class="fa '+data[i].icon+'" aria-hidden="true" data-icon="'+data[i].icon+'"></i>'}else{ulHtml+='<i class="layui-icon" data-icon="'+data[i].icon+'">'+data[i].icon+"</i>"}}ulHtml+="<cite>"+data[i].title+"</cite>";ulHtml+="</a>"}ulHtml+="</li>"}ulHtml+="</ul>";return ulHtml}function getChildrenNodes(childrenData){var ulHtmlNodes="";if(childrenData.children!==undefined&&childrenData.children!==null&&childrenData.children.length>0){ulHtmlNodes+='<dd title="'+childrenData.title+'">';ulHtmlNodes+='<a href="'+childrenData.href+'">';if(childrenData.icon!==undefined&&childrenData.icon!==""){if(childrenData.icon.indexOf("fa-")!==-1){ulHtmlNodes+='<i class="fa '+childrenData.icon+'" data-icon="'+childrenData.icon+'" aria-hidden="true"></i>'
}else{ulHtmlNodes+='<i class="layui-icon" data-icon="'+childrenData.icon+'">'+childrenData.icon+"</i>"}}ulHtmlNodes+="<cite>"+childrenData.title+"</cite>";ulHtmlNodes+="</a>";ulHtmlNodes+='<dl class="layui-nav-child">';for(var i=0;i<childrenData.children.length;i++){ulHtmlNodes+=getChildrenNodes(childrenData.children[i])}ulHtmlNodes+="</dl>";ulHtmlNodes+="</dd>"}else{ulHtmlNodes+='<dd title="'+childrenData.title+'">';ulHtmlNodes+='<a href="'+childrenData.href+'">';if(childrenData.icon!==undefined&&childrenData.icon!==""){if(childrenData.icon.indexOf("fa-")!==-1){ulHtmlNodes+='<i class="fa '+childrenData.icon+'" data-icon="'+childrenData.icon+'" aria-hidden="true"></i>'}else{ulHtmlNodes+='<i class="layui-icon" data-icon="'+childrenData.icon+'">'+childrenData.icon+"</i>"}}ulHtmlNodes+="<cite>"+childrenData.title+"</cite>";ulHtmlNodes+="</a>";ulHtmlNodes+="</dd>"}return ulHtmlNodes}var navbar=new Navbar();exports("navbar",function(options){return navbar.set(options)})});