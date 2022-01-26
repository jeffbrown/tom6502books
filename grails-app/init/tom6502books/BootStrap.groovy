package tom6502books

class BootStrap {
    AuthorService authorService
    def init = { servletContext ->
        authorService.save(new Author(name: 'Bob', book: new Book(publisher: 'First Publisher', propOne: 'alpha', propTwo: 'beta')))
        authorService.save(new Author(name: 'Sally', book: new Book(publisher: 'First Publisher', propOne: 'gamma', propTwo: 'delta')))
        authorService.save(new Author(name: 'Hank', book: new Book(publisher: 'Second Publisher', propOne: 'epsilon', propTwo: 'zeta')))
    }
    def destroy = {
    }
}
