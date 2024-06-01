系统需要使用JSON接受前端请求，并将字段转义后再调用外部三方系统。

例如，使用`cityCode`接受请求，使用`outCode`调用三方系统

前端输入为

`{"cityCode":"123456"}`

定义的DTO为

```java
import lombok.Data;

@Data
public class City {
    private String cityCode;
}
```

转义后调用三方时，应将输入转为

`{"outCode":"123456"}`