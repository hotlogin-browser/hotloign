# 火云浏览器API示例集合

这个项目包含了火云浏览器API的完整示例，支持多种编程语言和工具。

##用途 
- 账户配置
- 浏览器控制
- 自动化操作

##特点
- 支持Selenium和Puppeteer集成
- 访问频率限制：1请求/秒
- 支持无界面api-key模式

## 结构
nodejs-demo/
├── js/                    # JavaScript示例
│   ├── browser/          # 浏览器管理API
│   │   ├── api-status.js        # API状态检查
│   │   ├── start-env.js         # 启动环境
│   │   ├── close-env.js         # 关闭环境
│   │   ├── close-all-env.js     # 关闭所有环境
│   │   ├── check-env-status.js  # 检查环境状态
│   │   ├── check-open-status.js # 检查开放状态
│   │   └── arrange-windows.js   # 排列窗口
│   ├── env/              # 环境管理API
│   ├── group/            # 分组管理API
│   └── proxy/            # 代理管理API
├── python/               # Python示例
│   ├── browser/          # 浏览器管理API
│   ├── env/              # 环境管理API
│   ├── group/            # 分组管理API
│   └── proxy/            # 代理管理API
├── java/                 # Java示例
│   ├── browser/          # 浏览器管理API
│   ├── env/              # 环境管理API
│   ├── group/            # 分组管理API
│   └── proxy/            # 代理管理API
└── curl/                 # Shell/Curl示例
    ├── browser/          # 浏览器管理API
    ├── env/              # 环境管理API
    ├── group/            # 分组管理API
    └── proxy/            # 代理管理API
```

## API模块

### 1. 浏览器管理模块 (`/api/v2/env/`)

#### 基础操作
- **API状态检查**: `GET /api/v2/status`
- **启动环境**: `POST /api/v2/env/start`
- **关闭环境**: `POST /api/v2/env/close`
- **关闭所有环境**: `POST /api/v2/env/closeAll`
- **检查环境状态**: `POST /api/v2/env/checkStatus`
- **检查开放状态**: `GET /api/v2/env/checkOpenStatus`
- **排列窗口**: `POST /api/v2/env/arrangeWindows`

#### 环境管理
- **获取环境列表**: `POST /api/v2/env/list`
- **添加环境**: `POST /api/v2/env/add`
- **更新环境**: `POST /api/v2/env/update`
- **删除环境**: `POST /api/v2/env/delete`
- **获取环境详情**: `POST /api/v2/env/detail`
- **更新环境分组**: `POST /api/v2/env/updateGroup`
- **清除环境缓存**: `POST /api/v2/env/clearCache`
- **获取环境Cookie**: `POST /api/v2/env/getCookie`

### 2. 分组管理模块 (`/api/v2/group/`)

- **添加分组**: `POST /api/v2/group/add`
- **删除分组**: `POST /api/v2/group/delete`
- **更新分组**: `POST /api/v2/group/update`
- **获取分组列表**: `POST /api/v2/group/list`

### 3. 代理管理模块 (`/api/v2/proxy/`)

- **添加代理**: `POST /api/v2/proxy/add`
- **删除代理**: `POST /api/v2/proxy/delete`
- **更新代理**: `POST /api/v2/proxy/update`
- **获取代理列表**: `POST /api/v2/proxy/list`

## 4. 快速开始
所有示例文件中的API地址配置：
- **默认地址**: `http://localhost:60000/api/v2`
实际地址以app地址为主


## 注意事项
- 当前示例只做为参考，实际使用请根据需求重构
- 请确保火云浏览器服务已启动
- 根据实际环境修改API地址
- 某些功能可能需要特定的权限或配置
- 建议在测试环境中先验证API调用



更多详细信息请到  
https://hotlogin.yuque.com/huzv5rki1ozw api文档