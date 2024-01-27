package sparta.com.sappun.domain.board.service;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import sparta.com.sappun.domain.board.dto.response.BoardGetRes;
import sparta.com.sappun.domain.board.dto.response.BoardToListGetRes;
import sparta.com.sappun.domain.board.dto.response.BoardToReportGetRes;
import sparta.com.sappun.domain.board.entity.Board;
import sparta.com.sappun.domain.comment.dto.response.CommentGetRes;
import sparta.com.sappun.domain.comment.entity.Comment;

@Mapper
public interface BoardServiceMapper {
    BoardServiceMapper INSTANCE = Mappers.getMapper(BoardServiceMapper.class);

    @Mapping(source = "user.nickname", target = "nickname")
    @Mapping(source = "user.profileUrl", target = "profileUrl")
    @Mapping(source = "user.id", target = "userId")
    BoardGetRes toBoardGetRes(Board board);

    @Mapping(source = "user.nickname", target = "nickname")
    @Mapping(source = "user.profileUrl", target = "profileUrl")
    @Mapping(source = "user.id", target = "userId")
    CommentGetRes toCommentGetRes(Comment comment);

    List<BoardToListGetRes> toBoardBestListGetRes(List<Board> boardList);

    @Mapping(source = "user.nickname", target = "nickname")
    BoardToListGetRes toBoardToListGetRes(Board board);

    @Mapping(source = "user.nickname", target = "nickname")
    BoardToReportGetRes toBoardUserListGetRes(Board board);
}
