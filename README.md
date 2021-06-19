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


