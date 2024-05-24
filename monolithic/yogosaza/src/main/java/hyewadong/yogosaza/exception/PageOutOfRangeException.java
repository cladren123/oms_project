package hyewadong.yogosaza.exception;


import lombok.AllArgsConstructor;
import lombok.Data;


public class PageOutOfRangeException extends RuntimeException {

    private int requestPage;
    private int totalPages;

    public PageOutOfRangeException(int requestPage, int totalPages) {
        super("페이지 번호가 유효 범위를 벗어났습니다. 총 페이지 수 : " + totalPages + " 입력된 페이지 : " + requestPage);
        this.requestPage = requestPage;
        this.totalPages = totalPages;
    }



}
