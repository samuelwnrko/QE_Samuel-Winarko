# (10) RESTful API Testing With REST Assured

## Konsep API
Seperti yang sudah dibahas pada materi Restful API, API dapat dikatakan sebagai pelayan yang mendapatkan
request dari client dan menyampaikannya kepada chef (server) dan menerima response serta meneruskannya kepada klien.

## Fundamental API
Fundamental dari API sendiri dimulai dari mobile app, kemudian API Server, Extension Process, dan API Testing.
Untuk Test Process dimulai dari :
1. record dan mendefinisikan informasi API
2. filter, parsing, dan record API data yang kemudian di extract
3. rekonstruksi API call dan meneruskannya dari simulasi klien
4. validasi test

## Practical Pyramid Test
Pyramid Test API dibagi menjadi 3
1. UI : menguji interaksi keseluruhan dengan interface dari user dan bersifat End to End
2. Integration dan Component : Integrasi menguji interaksi 2 modul atau subsistem dengan kontrak API, sedangkan
komponen menguji modul spesifik atau sub sistem dengan API
3. UNIT : menguji bagian terkecil sebuah aplikasi dengan metode