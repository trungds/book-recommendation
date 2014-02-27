/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import Entity.Book;
import Manager.BookManager;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Trung
 */
public class BookAction extends ActionSupport implements ModelDriven<Book> {

    private Book book = new Book();
    private List<Book> books = new ArrayList<Book>();
    private BookManager manager = new BookManager();

    public BookAction() {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String SelectAll() throws SQLException {
        this.books = manager.SelectAll();
        return (this.books != null) ? SUCCESS : ERROR;
    }

    public String SelectRow() throws SQLException {
        int id = Integer.valueOf(ServletActionContext.getRequest().getParameter("id"));
        this.book = manager.SelectRow(id);
        return (this.book != null) ? SUCCESS : ERROR;
    }

    public String Insert() throws SQLException {
        return (manager.Insert(this.book) > 0) ? SUCCESS : ERROR;
    }

    @Override
    public Book getModel() {
        return this.book;
    }

}
