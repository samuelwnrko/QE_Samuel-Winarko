# 12 - Fundamental Performance Test & Performance Testing with JMeter (Eksplorasi)

## Pengenalan Performance Test
Performance Test adalah sebuah teknik testing yang bersifat non fungsional untuk menentukan sistem pada berbagai load. Performance
Testing mengukur stabilitas, ketahanan (reliability) serta penggunaan sumber dayanya. Contoh dari pengukuran tersebut adalah :
1. Response time saat menjalankan request dengan jumlah yang banyak
2. Melihat sistem berinteraksi dengan jumlah data yang besar
3. Mengukur performa aplikasi sampai batas tertentu
4. Dan masih banyak lagi

Performance Testing jarang sekali dilakukan karena walaupun dapat dijadikan tolak ukur pada sebuah sistem untuk mengakomodasi traffic, 
Performance Testing bisa dikatakan mahal. Mahal karena pengetesannya memerlukan berbagai persiapan seperti membuat environment terpisah 
agar data test dan data production tidak tercampur.

## Contoh kasus
Contoh pada kasus performance test :
Terdapat sebuah sistem, tetapi sebelum dilaunch akan dijalankan performance test agar dapat mengetahui throughput serta response time 
sistem tersebut. Endpoint yang akan ditest :
1. login
2. beli-pulsa
3. cek-out

Dari kasus diatas, hal yang dapat dilakukan adalah :
1. Membuat testplan
2. Membuat script test
3. Melakukan performance test
4. Menganalisa hasil performance test

## Metode Performance Test
1. Membuat testplan : kenali yang dibutuhkan oleh setiap endpoint yang ingin digunakan, 
   1. Endpoint `login` membutuhkan username dan password
   2. `beli-pulsa` membutuhkan produk serta nomor
   3. `cek-out` membutuhkan metode pembayaran
   yang akan digunakan
2. Menentukan metode testing : Untuk mengetahui kondisi awal sistem, selalu awali dengan load test. Kemudian terdapat berbagai
macam metode test seperti berikut =
   1. Smoke testing : melakukan verify script yang telah dibuat, apakah sistem dapat menangani minimal load tanpa masalah (biasanya hanya 1-2 VUs).
   2. Load testing : pengujian paling sederhana untuk memahami sistem pada keadaan load tertentu.
   3. Stress testing : mengamati kemampuan dan kestabilan sistem pada saat kondisi ekstrim.
   4. Spike testing : mirip dengan stress testing, tetapi kenaikan langsung melebihi puncaknya pada waktu yang singkat. Contohnya ada pada
   flash sale dalam e-commerce.
   5. Soak testing : mengetahui reliability saat dalam tekanan di bawah puncak dalam jangka waktu yang panjang, dan dapat mengetahui
   apakah terdapat bug (test ini dapat dilakukan pada saat waktu aplikasi terdapat minim user).

