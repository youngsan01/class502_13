package exam01;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Member {
    private long USER_NO;
    private String USER_Id;
    private String USER_Pw;
    private String USER_Nm;
    private String MOBILE;
    private LocalDateTime REG_DT;
}
