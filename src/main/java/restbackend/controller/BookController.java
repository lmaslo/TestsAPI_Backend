package restbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import restbackend.domain.BookInfo;
import restbackend.domain.LoginInfo;
import restbackend.domain.UserInfo;
import restbackend.exeption.InvalidUserNameExeption;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


// добавить книгу, автора
// найти книгу по автору,
// получить все книги определенного автора

@RestController
public class BookController {

     List<BookInfo> books = List.of(
            BookInfo.builder()
                    .id(1)
                    .name("Капитанская Дочка")
                    .author("Пушкин")
                    .build(),
            BookInfo.builder()
                    .id(2)
                    .name("Тарас Бульба")
                    .author("Гоголь")
                    .build(),
            BookInfo.builder()
                    .id(3)
                    .name("Сказка")
                    .author("Пушкин")
                    .build()
    );

    @GetMapping ("book/status")
    public String showStatus() {
        return "server ok";
    }

    @GetMapping("book/getbooks")
    public List<BookInfo> getBooksInfo() {
        List<BookInfo> result = new ArrayList<>();
        for (BookInfo books : books) {
            result.add(books);
            System.out.println(result);
        }
        return result;
    }





}
