package sparta.com.sappun.domain.board.dto.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BoardListGetRes {
    private List<BoardGetRes> boards;
}
