package com.example.amazon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.amazon.adapter.*
import com.example.amazon.model.*

class MainActivity : AppCompatActivity() {
    lateinit var rv_font: RecyclerView
    lateinit var rv_sneakers: RecyclerView
    lateinit var rv_camera: RecyclerView
    lateinit var rv_books: RecyclerView
    lateinit var rv_department: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        rv_font = findViewById(R.id.rv_font)
        rv_font.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        refreshFonts(getAllFonts())

        rv_sneakers = findViewById(R.id.rv_sneakers)
        rv_sneakers.layoutManager = GridLayoutManager(this, 2)
        refreshSneakers(getAllSneakers())


        rv_camera = findViewById(R.id.rv_camera)
        rv_camera.layoutManager = GridLayoutManager(this, 2)
        refreshCamera(getAllCamera())


        rv_books = findViewById(R.id.rv_books)
        rv_books.layoutManager = GridLayoutManager(this, 1)
        refreshBooks(getAllBooks())



        rv_department = findViewById(R.id.rv_department)
        rv_department.layoutManager = GridLayoutManager(this, 2)
        refreshDepartment(getAllDepartment())

    }

    fun refreshFonts(fonts: ArrayList<Font>) {
        var adapter = FontAdapter(this, fonts)
        rv_font.adapter = adapter
    }

    fun getAllFonts(): ArrayList<Font> {
        var fonts = ArrayList<Font>()

        fonts.add(Font("Mashina 1", R.drawable.car_1))
        fonts.add(Font("Mashina 3", R.drawable.car_2))
        fonts.add(Font("Mashina 4", R.drawable.car_3))
        fonts.add(Font("Mashina 5", R.drawable.car_5))
        fonts.add(Font("Mashina 6", R.drawable.car_4))
        fonts.add(Font("Mashina 7", R.drawable.car_7))
        fonts.add(Font("Mashina 8", R.drawable.car_6))

        return fonts
    }


    fun refreshSneakers(sneaker: ArrayList<Sneaker>) {
        var adapter = SneakerAdapter(this, sneaker)
        rv_sneakers.adapter = adapter
    }

    fun getAllSneakers(): ArrayList<Sneaker> {
        var sneaker = ArrayList<Sneaker>()

        sneaker.add(Sneaker(R.drawable.sneaker_1))
        sneaker.add(Sneaker(R.drawable.sneaker_2))
        sneaker.add(Sneaker(R.drawable.sneaker_3))
        sneaker.add(Sneaker(R.drawable.sneaker_4))

        return sneaker
    }


    fun refreshCamera(camera: ArrayList<Camera>) {
        var adapter = CameraAdapter(this, camera)
        rv_camera.adapter = adapter
    }

    fun getAllCamera(): ArrayList<Camera> {
        var camera = ArrayList<Camera>()

        camera.add(Camera(R.drawable.camera_1))
        camera.add(Camera(R.drawable.camera_2))
        camera.add(Camera(R.drawable.camera_3))
        camera.add(Camera(R.drawable.camera_4))


        return camera
    }


    fun refreshBooks(books: ArrayList<Book>) {
        var adapter = BookAdapter(this, books)
        rv_books.adapter = adapter
    }

    fun getAllBooks(): ArrayList<Book> {
        var books = ArrayList<Book>()

        books.add(Book(R.drawable.book_1, "Book 1", "12", "12", "3.12"))
        books.add(Book(R.drawable.book_2, "Book 2", "13", "18", "6.05"))
        books.add(Book(R.drawable.book_3, "Book 3", "16", "11", "5.54"))

        return books
    }

    fun refreshDepartment(department: ArrayList<Department>) {

        var adapter = DepartmentAdapter(this, department)
        rv_department.adapter = adapter
    }

    fun getAllDepartment(): ArrayList<Department> {
        var department = ArrayList<Department>()

        department.add(Department(R.drawable.book_1, "Book"))
        department.add(Department(R.drawable.camera_2, "Camera"))
        department.add(Department(R.drawable.sneaker_3, "Sneaker"))
        department.add(Department(R.drawable.book_4, "Book"))
        department.add(Department(R.drawable.camera_3, "Camera"))
        department.add(Department(R.drawable.sneaker_2, "Sneaker"))


        return department
    }


}