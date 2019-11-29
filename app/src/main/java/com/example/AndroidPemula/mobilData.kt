package com.example.AndroidPemula

object mobilData {
    private var data = arrayOf(
        arrayOf(
            "Honda Brio",
            "https://upload.wikimedia.org/wikipedia/commons/b/b7/Honda_Brio_S_1.3_-_Front_view_-_February_2_2014.jpg",
            "Brio\n"+
                    "2012\n" +
                    "White, Silver, Red and Black\n" +
                    "+62 (274) 123 456"
        ),
        arrayOf(
            "Daihatsu Terios",
            "https://upload.wikimedia.org/wikipedia/commons/8/83/Daihatsu_Terios_2006_vr_steel_EMS.jpg",
            "Terios\n" +
                    "2006\n" +
                    "White, Silver and Black\n" +
                    "+62 (274) 111 222"
        ),
        arrayOf(
            "Nissan Tera",
            "https://upload.wikimedia.org/wikipedia/commons/e/e2/Nissan_Terra_001.jpg",
            "Tera\n" +
                    "2018\n" +
                    "White, Silver and Black\n" +
                    "+62 (21) 777 0000"
        ),
        arrayOf(
            "Nissan Livina",
            "https://upload.wikimedia.org/wikipedia/commons/a/a2/GrandLivina15XV2013White.jpg",
            "Livina\n" +
                    "2006\n" +
                    "White, Silver and Black\n" +
                    "+62 (341) 575 814"
        ),
        arrayOf(
            "Toyota Fortuner",
            "https://upload.wikimedia.org/wikipedia/id/thumb/0/09/Logo_Almamater_UPI.svg/600px-Logo_Almamater_UPI.svg.png",
            "Fortuner\n" +
                    "2005\n" +
                    "White, Silver and Black\n" +
                    "+62 (22) 222 3333"

        ),
        arrayOf(
            "Toyota Kijang Innova",
            "https://upload.wikimedia.org/wikipedia/id/6/67/Kijang_Innova.png",
            "Innova\n" +
                    "2004\n" +
                    "White, Silver and Black\n" +
                    "+62 (24) 111 0000"
        ),
        arrayOf(
            "Honda HRV",
            "Indonesia Rank 7\nWorld Rank 595",
            "https://upload.wikimedia.org/wikipedia/commons/e/e2/2018_Honda_HR-V_VTi-S_wagon_%282018-08-27%29_01.jpg",
            "HRV\n" +
                    "2014\n" +
                    "White, Silver and Black\n" +
                    "+62 (31) 222 1111"
        ),
        arrayOf(
            "Daihatsu Calya",
            "https://upload.wikimedia.org/wikipedia/id/b/bc/Calya.png",
            "Cayla\n" +
                    "2016\n" +
                    "White, Silver and Black\n" +
                    "+62 (251) 333 111"
        ),
        arrayOf(
            "Toyota Avanza Veloz",
            "https://upload.wikimedia.org/wikipedia/id/7/7e/New_Avanza.png",
            "Avanza\n" +
                    "2003\n" +
                    "White, Silver and Black\n" +
                    "+62 (721) 000 111"
        )
    )

    val listData: ArrayList<mobil>
    get() {
        val list = ArrayList<mobil>()
        for (aData in data) {
            val univ = mobil()
            univ.name = aData[0]
            univ.photo = aData[2]
            univ.overview = aData[3]
            univ.identity = aData[4]

            list.add(univ)
        }
        return list
    }
}