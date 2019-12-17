### 感谢 [yucccc](https://github.com/yucccc) 的开源 [vue-mall](https://github.com/yucccc/vue-mall) 项目提供前端页面及框架支持
和Exrick的搭建好的前台
- [极验验证码移除文档](https://github.com/Exrick/xmall/wiki/%E6%9E%81%E9%AA%8C%E7%A7%BB%E9%99%A4%E6%96%87%E6%A1%A3)
    
![](https://i.loli.net/2018/07/21/5b52e192366a0.jpg "首页")

![](https://i.loli.net/2018/07/22/5b5447c0f2b69.jpg "页脚")

![](https://i.loli.net/2018/07/22/5b5447e84edd9.jpg "搜索框组件")

![](https://i.loli.net/2018/07/22/5b5448040ff95.jpg "搜索结果")

![](https://i.loli.net/2018/07/22/5b54489e41551.jpg "分页")

![](https://i.loli.net/2018/07/22/5b54482cca360.jpg "订单详情")

![](https://i.loli.net/2018/07/22/5b5448494d6b6.jpg "订单进度")

![](https://i.loli.net/2018/07/22/5b54486109ade.jpg "登录界面")
npm 失败，必须安装python3以下版本
### 所用技术

- Vue 2.x
- Vuex
- Vue Router
- [Element UI](http://element.eleme.io/#/zh-CN)
- ES6
- webpack
- axios
- Node.js
- 第三方SDK
    - ~~[极验Test-button人机验证码](http://www.geetest.com/Test-button.html)~~ 因其收费详见[极验验证码移除文档](https://github.com/Exrick/xmall/wiki/%E6%9E%81%E9%AA%8C%E7%A7%BB%E9%99%A4%E6%96%87%E6%A1%A3)
- 第三方插件
    - [hotjar](https://github.com/Exrick/xmall/blob/master/study/hotjar.md)：一体化分析和反馈
    - ~~[搜狐畅言评论插件](http://changyan.kuaizhan.com/)~~ 垃圾广告评论插件 现已更换 [Gitment](https://github.com/imsun/gitment)

### 本地开发运行
- 启动后端 [xmall](https://github.com/Exrick/xmall) 项目后，在 `config/index.js` 中修改你的后端接口地址配置
- Gitment评论配置见 [Gitment](https://github.com/imsun/gitment) 使用到的页面为 `thanks.vue`
- 在项目根文件夹下先后执行命令 `npm install` 、 `npm run dev`
- 商城前台端口默认9999 http://localhost:9999
## 部署
- 先后执行命令 `npm install` 、 `npm run build` 将打包生成的 `dist` 静态文件放置服务器中，若使用Nginx等涉及跨域请配置路由代理
