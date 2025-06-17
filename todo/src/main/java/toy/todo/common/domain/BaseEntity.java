package toy.todo.common.domain;

import jdk.jfr.Description;
import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Getter
public class BaseEntity {
    @Description("생성일")
    @CreatedDate
    private LocalDateTime createdAT;

    @Description("생성자")
    //@CreatedBy
    private String createdBy;

    @Description("수정일")
    @LastModifiedDate
    private LocalDateTime updatedAt;

    @Description("수정자")
    //@LastModifiedBy
    private String updatedBy;
}
