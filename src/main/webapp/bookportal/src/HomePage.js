import React from 'react'
import * as BooksAPI from './BooksAPI'
import Header from './header';
import Book from './Book';

class HomePage extends React.Component {
    constructor(props) {
        super(props)
        this.state = ({ inputValue: "", books: [] })
        this.handleChange = this.handleChange.bind(this) 
        this.showBook = this.showBook.bind(this) 

    }
    handleChange(event) {
        var value = event.target.value
        var name = event.target.name
        this.setState({ [name]: value });
    }

    componentDidMount() {
        BooksAPI.search("t", 100).then((books) => {
            if (!books || books.hasOwnProperty('error')) {
                this.setState({ books: [] });
            } else {
                this.setState({ books: books });
            }
            console.log(books)
        });

    }

    showBook(value) {
        BooksAPI.search(value, 100).then((books) => {
            if (!books || books.hasOwnProperty('error')) {
                this.setState({ books: [] });
            } else {
                this.setState({ books: books });
            }
            console.log(books)
        });
    }


    render() {
        return (
            <div>
                <Header clickMethod={this.showBook} vl={this.state.inputValue} inputMethod={this.handleChange} />
                <div className="container">
                    <div className="row">
                        {this.state.books.map(function (book, id) {
                            return (

                                <Book key={id} imgLink={book.imageLinks.thumbnail} title={book.title} authors={book.authors} />
                            )
                        })}

                    </div>
                </div>
            </div>
        )
    }
}
export default HomePage;