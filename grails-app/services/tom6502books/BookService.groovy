package tom6502books

import grails.gorm.services.Service

@Service(Book)
interface BookService {

    Book get(Serializable id)

    List<Book> list(Map args)

    Long count()

    void delete(Serializable id)

    Book save(Book book)

    List<Book> listByPublisher(String publisher)

}
