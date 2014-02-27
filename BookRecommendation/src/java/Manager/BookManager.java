/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Entity.Book;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trung
 */
public class BookManager {

    Connection conn = null;

    public List<Book> SelectAll() throws SQLException {
        List<Book> books = new ArrayList<Book>();
        try {
            conn = DBConnector.getConnect();
            CallableStatement cs = conn.prepareCall("{call sp_tblBook_SelectAll}");
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                books.add(new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
        return books;
    }

    public Book SelectRow(int id) throws SQLException {
        Book book = null;
        try {
            conn = DBConnector.getConnect();
            CallableStatement cs = conn.prepareCall("{call sp_tblBook_SelectRow(?)}");
            cs.setInt(1, id);
            ResultSet rs = cs.executeQuery();
            if (rs.next()) {
                book = new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
        return book;
    }

    public int Insert(Book book) throws SQLException {
        int result = 0;
        try {
            conn = DBConnector.getConnect();
            CallableStatement cs = conn.prepareCall("{call sp_tblBook_Insert(?,?,?,?,?,?,?)}");
            cs.setString(1, book.getSender());
            cs.setString(2, book.getTitle());
            cs.setString(3, book.getAuthor());
            cs.setString(4, book.getCategory());
            cs.setString(5, book.getCover());
            cs.setInt(6, book.getRating());
            cs.setString(7, book.getComment());
            result = cs.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
        return result;
    }

//    public static void main(String[] args) throws SQLException {
//        List<Book> books = new BookManager().SelectAll();
//        for (Book b : books) {
//            System.out.println(b);
//        }
//    }
}
