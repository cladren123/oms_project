package hyewadong.yogosaza.config;


import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@Data
@ConfigurationProperties(prefix = "app.pagination")
public class PaginationConfig {

    private Integer pageSize;

}
