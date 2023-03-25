# (8) RESTful API Introduction & Testing

## Restful API Introduction
### API
API merupakan singkatan dari Application Programming Interface yang memungkinkan untuk
melakukan komunikasi atau pertukaran data diantara 2 atau lebih software yang terpisah satu dengan yang lain.
Jika dianalogikan dalam kehidupan sehari-hari, API adalah sebuah pelayan restoran yang menerima request dari client
dan memberikan request kepada chef yang menjadi sistem atau servernya. Kemudian Chef akan memberikan response kembali kepada
pelayan atau API dan diteruskan ke client.

### REST API
REST API, dengan REST yang merupakan singkatan dari Representational State Transfer yang menggunakan HTTP Method.
Komponen REST API adalah Method, URL, Header, dan Body. Selain itu juga terdapat beberapa macam response code
HTTP seperti : 200 (OK), 201 (Created), 400 (Bad Request), 404 (Not Found), dan masih banyak lagi.

Terdapat 4 metode dari HTTP Method, yaitu :
1. `GET` untuk membaca data
2. `POST` untuk membuat data
3. `PUT` untuk mengubah data
4. `DELETE` untuk menghapus data

### JSON
JSON merupakan Java Script Object Notation yang merupakan format ringkas dari pertukaran data pada komputer.
Basis JSON sendiri adalah text dan biasanya terdiri dari key serta value, contoh :
first name dan followers menjadi key dan "Samuel" serta angka 567 menjadi valuenya.
`{
"first name": "Samuel",
"followers": 567
};`

---------
## REST API TESTING
### Testing API
API Test dapat dikatakan berbeda dengan GUI karena API TEST mengirim request dan mendapatkan response dari request
yang dikirim tersebut. Testing ini dilakukan untuk memverifikasi response yang benar dan melakukan error handling.
Terdapat 3 macam API testing, yaitu Functionality Test, Load Test, dan Security Test.

Proses Test API
1. Melakukan review secara spesifik
2. Mengembangkan spesifikasi
3. Mengembangkan framework
4. Mengembangkan test case
5. Melakukan eksekusi dan report

### Best Practice dan Bug
Best practice untuk rest API testing sebaiknya mengelompokkan test case menjadi beberapa kategori, memberi judul yang sesuai
untuk setiap testcasenya, berhati-hati saat menghapus sesuatu, dan memikirkan segala kombinasi input pada API saat membuat test
case.

Bug atau kesalahan yang seringkali ditemukan pada Testing REST API :
1. Gagal melakukan error handling
2. Kesulitan tersambung serta mendapat respon API
3. Isu-isu keamanan
4. Isu performa
5. Error
6. Struktur data tidak benar

### Keuntungan dan Challenge
Keuntungan : waktu menjadi efisien, bahasa independen, biaya testing dan resiko jadi berkurang.

Challenge : kombinasi dan pilihan parameter, tidak ada GUI, harus lebih dulu mengetahui parameter, mengetest
error handling dari setiap API.
