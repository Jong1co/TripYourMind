package ClovaSpringBoot.dto;

import ClovaSpringBoot.domain.Plan;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddPlanRequest {
    private Long groupId;
    private String realday;
    private String email;
    private String time;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    public Plan toEntity(){
        return Plan.builder()
                .groupid(groupId)
                .realday(realday)
                .email(email)
                .time(time)
                .content(content)
                .createdAt(createdAt)
                .updatedAt(updatedAt)
                .build();
    }
}