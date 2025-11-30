package com.example.lunchtray.datasource

import com.example.lunchtray.model.MenuItem.AccompanimentItem
import com.example.lunchtray.model.MenuItem.EntreeItem
import com.example.lunchtray.model.MenuItem.SideDishItem

object DataSource {

    val entreeMenuItems = listOf(
        EntreeItem(
            name = "Nasi Goreng Ayam",
            description = "Nasi digoreng dengan bumbu spesial, suwiran ayam, dan telur mata sapi",
            price = 15.00,
        ),
        EntreeItem(
            name = "Sate Ayam Madura",
            description = "10 tusuk sate ayam bakar bumbu kacang khas Madura, disajikan dengan lontong",
            price = 20.00,
        ),
        EntreeItem(
            name = "Gado-Gado Komplit",
            description = "Campuran sayuran segar, lontong, tahu, tempe, dan telur, disiram saus kacang pedas",
            price = 14.50,
        ),
        EntreeItem(
            name = "Soto Betawi Daging",
            description = "Soto dengan kuah santan kaya rasa, potongan daging sapi, kentang, dan emping",
            price = 18.00,
        )
    )

    val sideDishMenuItems = listOf(
        SideDishItem(
            name = "Kerupuk Udang",
            description = "Kerupuk renyah rasa udang, pelengkap wajib",
            price = 2.00,
        ),
        SideDishItem(
            name = "Perkedel Kentang",
            description = "Kentang tumbuk yang digoreng garing di luar, lembut di dalam",
            price = 4.00,
        ),
        SideDishItem(
            name = "Tumis Kangkung Terasi",
            description = "Kangkung segar ditumis dengan terasi dan sedikit cabai",
            price = 7.50,
        ),
        SideDishItem(
            name = "Telur Dadar Bawang",
            description = "Telur ayam didadar tebal dengan irisan daun bawang",
            price = 5.00,
        )
    )

    val accompanimentMenuItems = listOf(
        AccompanimentItem(
            name = "Es Teh Manis",
            description = "Minuman teh dingin yang manis dan menyegarkan",
            price = 3.50,
        ),
        AccompanimentItem(
            name = "Air Mineral",
            description = "Air putih kemasan dingin",
            price = 2.00,
        ),
        AccompanimentItem(
            name = "Sambal Terasi",
            description = "Tambahan sambal terasi pedas khas rumahan",
            price = 1.00,
        )
    )
}