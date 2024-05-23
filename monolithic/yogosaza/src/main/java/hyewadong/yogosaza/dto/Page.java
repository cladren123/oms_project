package hyewadong.yogosaza.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Page<T> {

    private int currentPage;
    private int totalPages;
    private int totalContents;
    private List<T> contents;


}
