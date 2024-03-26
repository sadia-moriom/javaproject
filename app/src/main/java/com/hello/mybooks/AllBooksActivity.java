package com.hello.mybooks;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {

    private RecyclerView booksRecView;
    private BookRecViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);
        //somechange

        adapter = new BookRecViewAdapter(this);
        booksRecView = findViewById(R.id.booksRecView);

        booksRecView.setAdapter(adapter);
        booksRecView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1,"1Q84","Haruki Murakami",1350,"https://www.lenottibianche.eu/wp-content/uploads/sites/4/2015/07/1Q84-Copertina.jpg","A work of maddening brilliance","Long Description"));
        books.add(new Book(2,"The Myth of Sisyphus","Albert Camus",250,"https://f4.bcbits.com/img/a2184270591_10.jpg","One of the most influential works of this century","Long Description"));


        adapter.setBooks(books);

    }
}