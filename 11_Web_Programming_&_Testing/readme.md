# (11) Web Programming & Testing

## Web Programming
### HTML
HTML merupakan sebuah singkatan dari Hypertext Markup Language yang juga menjadi sebuah
standar dalam menampilkan halaman web secara luas.
Fungsi HTML : 
1. dapat digunakan untuk membuat struktur website
2. mengatur tampilan dan isi halaman web
3. membuat tabel dengan tag HTML table
4. membuat form HTML
5. dan masih banyak lagi

HTML sendiri dapat digunakan dengan notepad, visual studio code, dan masih banyak lagi dengan ekstensi .html
Dokumentasi diawali dengan <! DOCTYPE html> dan menggunakan </> untuk menutupnya, contoh :
<body> ditutup dengan </body>

### CSS
CSS atau Cascading Style Sheets digunakan untuk menghias halaman web baik ukuran, warna, posisi, dan lainnya.
CSS digunakan agar web menjadi lebih bagus.

### Bootstrap
Bootstrap merupakan salah satu framework front-end yang dapat digunakan secara gratis dan responsif 
serta mudah diakses pada berbagai jenis perangkat dan layar. Bootstrap juga menyediakan CSS dan JavaScript yang siap digunakan 
mengembangkan tampilan website. Pada bootstrap juga menyediakan menu navigasi, tombol, tabel, form, dan banyak lagi.

## Web Testing

### Pengenalan Serenity BDD
Serenity adalah sebuah framework BDD yang bersifat open source atau dapat digunakan secara gratis yang bisa membantu penulisan
sehingga struktur menjadi bagus dan dapat digunakan untuk testing automation. Saat menggunakan serenity ini, terdapat beberapa kebutuhan yang
harus diimplementasikan seperti user stories dengan beberapa kriteria yang dapat diterima untuk membantu mengklarifikasi kebutuhan. Contoh
dari kriteria tersebut adalah feature sehingga dapat dijalankan oleh serenity.

### BDD dengan Cucumber
Terdapat step-step atau langkah yang digunakan :
1. Menulis sebuah Story (Gherkin Syntax: Given, When, Then)
2. Konfigurasi Story
3. Interaksi terhadap browser
4. Menjalankan Story
5. Melihat report atau hasil

### Scenario Penulisan
Dengan menggunakan Serenity ini, langkah yang dapat dilakukan adalah
1. Membuat test scenario
2. Membuat atau menulis Story (menggunakan feature yang berisi Gherkin Syntax)
3. Membuat test class dan step definitions nya
4. Menjalankan Story
5. Melihat report atau hasil dari test pada Web tersebut