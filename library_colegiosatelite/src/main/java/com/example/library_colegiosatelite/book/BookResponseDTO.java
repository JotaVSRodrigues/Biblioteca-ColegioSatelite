package com.example.library_colegiosatelite.book;

public record BookResponseDTO(Long id, String title, String gender,
                              String author,
                              String dataRelease,
                              String coverImg,
                              Integer pages,
                              Integer classification) {

}
