## Micronaut 2.5.6 Documentation

- [User Guide](https://docs.micronaut.io/2.5.6/guide/index.html)
- [API Reference](https://docs.micronaut.io/2.5.6/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/2.5.6/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Feature data-jdbc documentation

- [Micronaut Data JDBC documentation](https://micronaut-projects.github.io/micronaut-data/latest/guide/index.html#jdbc)

## Feature jdbc-hikari documentation

- [Micronaut Hikari JDBC Connection Pool documentation](https://micronaut-projects.github.io/micronaut-sql/latest/guide/index.html#jdbc)

## Feature testcontainers documentation

- [https://www.testcontainers.org/](https://www.testcontainers.org/)

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

## 其他

### 构建本地程序

首先安装graalvm， 然后下载native-image

```shell
gu install native-image
```
然后执行如下命令:
```shell
./mvnw package -Dpackaging=native-image
```
### 普通打包
普通打包的最终类型为jar, 打包成native就是一个可执行文件。
```shell
./mvnw clean package -Dmaven.test.skip=true
```

经过对比后发现，可执行文件大约70M, jar文件大约20M

但是native文件启动速度飞快，占用内存较少。如果执行在一个小内存设备上可以
构建成一个本地文件，这样可以节约服务器成本。


