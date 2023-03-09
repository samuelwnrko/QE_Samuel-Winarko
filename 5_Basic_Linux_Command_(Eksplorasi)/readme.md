# (5) Basic Linux Command (Eksplorasi)

## Mengapa menggunakan linux command?
linux command sering digunakan karena command pada line yang ada semua berbasis text,
sehingga lebih efisien digunakan karena lebih cepat jika dibandingkan dengan menggunakan GUI.

Linux command juga diduga tidak menggunakan terlalu banyak resource, lebih mudah untuk tugas yang
bersifat repetitif (mengulang-ulang) dan juga sangat kuat untuk digunakan.

## Command
terdapat beberapa command pada linux, terdapat basic command yang dapat memperlihatkan kalender 
dengan command `cal` serta command `date` yang dapat memperlihatkan tanggal serta jam saat command
tersebut diketik. Selain basic command, juga terdapat command untuk sistemasi pada file. Command tersebut
diantaranya adalah :
1. `touch` yang digunakan untuk membuat file
2. `cat` yang digunakan untuk membaca isi file
3. `cp` yang digunakan untuk melakukan copy
4. `mv` yang digunakan untuk melakukan pemindahan (move)
5. `rm` yang digunakan untuk menghapus (remove)
6. `mkdir` yang digunakan untuk membuat directory atau folder
7. `pwd` yang digunakan untuk menunjukkan lokasi saat ini

selain beberapa command untuk sistemasi file diatas, juga terdapat command untuk control terhadap process di linux
contohnya adalah `top` yang berfungsi untuk menunjukkan proses linux yang sedang berjalan, 
`clear` yang digunakan untuk menghapus window pada linux agar seperti awal (bersih dari command sebelumnya) 
dan ada `history` yang menunjukkan riwayat command yang kita lakukan pada linux.

Selain itu juga terdapat command untuk permission dengan `chmod` untuk change modifier dan `chown` untuk change owner.

## Shell Script
Shell merupakan sebuah program yang menjadi jembatan antara user dan juga kernel, sedangkan untuk shell script merupakan
sebuah bahasa pemrograman yang dikompile berbasis linux command. Shell Script terkesan simpel namun kuat.

Terdapat beberapa command yang digunakan, yaitu command `echo` untuk menampilkan, kemudian juga terdapat command
`./` yang digunakan untuk menjalankan file bash. Contoh ingin melakukan running pada file myscript.sh, maka command yang
digunakan adalah `./myscript.sh`. Selain itu juga terdapat text editor sederhana yang dapat digunakan pada linux command
bernama "nano".