# (3) Testing Documentation & Test Case & Tracking Management Tools

## Testing Documentation
### Test Scenario
Pada Test Scenario memberikan ide terhadap apa yang akan dilakukan atau apa yang harus di test.
Test scenario dapat dikatakan sebagai test case dengan level yang tinggi.
Contoh dari test scenario adalah melakukan pengecekan pada fungsi login, lupa email, dan membuat akun baru
pada menu login di Gmail.

### Test Case
Test case dibuat dengan langkah yang dapat dieksekusi berupa positif dan negatif dari suatu test scenario.
Test case berisi kondisi awal, langkah-langkah, hasil yang diharapkan dan status serta hasil sebenarnya.
Contoh test scenario : melakukan pengecekkan pada fungsi login =
1. test case pertama : memasukkan email dan password yang benar
2. test case kedua : memasukkan email yang benar dan password yang salah
3. test case ketiga : memasukkan email yang salah dan password yang benar
4. test case keempat : memasukkan email dan password yang salah

### Perbedaan test scenario dan test case
Test scenario dapat dikatakan sebagai awal mula dalam melakukan pengujian pada suatu software.
Sehingga test case dapat dibentuk berdasarkan test scenario yang ada. Test scenario seperti mengajukan
apa yang harus ditest, sedangkan test case mengajukan cara melakukan pengujian.

## Test Case Management Tools
### Definisi
Test case management merupakan sebuah alat yang digunakan untuk menjaga banyak dokumen-dokumen yang berisi 
kumpulan test case.

### Mengapa perlu menggunakan test case?
#### 1. Perencanaan dan Estimasi
    Sebuah testplan dapat dikatakan sebagai sebuah dokumen yang berisi fitur yang akan ditest, yang tidak
    ditest, sumber dan jadwal dari aktivitas pengujian.Perkiraan merupakan salah satu hal yang penting pada
    Test Management.
#### 2. Monitoring dan Controlling
    Monitoring merupakan sebuah proses yang melakukan penerimaan, perekaman, dan memberikan informasi tentang aktivitas
    project yang perlu diketahui oleh project manager dan stakeholder.
    Sedangkan Controlling merupakan proses untuk menggunakan data dari aktivitas saat monitoring untuk menghadirkan performa
    yang sebenarnya sampai performa yang diinginkan.
### Tools yang digunakan (TestRail)
Terdapat beberapa tools yang digunakan seperti : TestRail, TestLink, Zephyr, TCLab dan sebagainya. Tetapi yang digunakan adalah
TestRail. Berikut ini merupakan cara menggunakan TestRail =
1. Melakukan signup pada testrail
2. Membuat Test Project Management
3. Mengisi field yang dibutuhkan
4. Membuat milestones
5. Membuat testrun
6. Membuat test plan
7. Membuat test case berdasarkan test plan
8. Muncul test report

## Tracking Management Tools
### Tools Jira
Jira merupakan sebuah alat yang digunakan oleh para developer untuk melakukan pengecekkan terhadap
bug, issue, serta untuk manajemen pada proyek. Tools jira ini dapat digunakan secara gratis.

### Langkah-langkah yang perlu dilakukan dengan Jira
Yang pertama kita harus membuat proyek baru. Pada proyek baru terdapat panel To Do yang berisi story yang akan 
dikerjakan dan sudah dijadikan prioritas saat planning. Story teratas adalah prioritas utama. Setelah To Do, 
terdapat panel In Progress yang berisi story yang sedang dikerjakan Software Engineer. Setelah itu ada Finish
yang berisi panel yang telah selesai dikerjakan, tetapi belum siap untuk dilakukan pengujian. Kemudian ada panel
Deliver merupakan panel yang siap memasukki tahap testing oleh QE. Kemudian terdapat panel need fix yang berisi hasil
proses testing tetapi tidak lolos kriteria, dan yang terakhir adalah panel done (semua metode Scrum). Sedangkan untuk
metode Kanban berisi To DO, In Progress dan Done saja tetapi dapat ditambahkan panel lainnya.

### Issue pada Jira
Issue merupakan hal yang paling utama pada Jira. Terdapat 4 tipe issue, yaitu :
1. Story, digunakan untuk membuat fitur baru
2. Task, digunakan untuk melakukan perincian terhadap tugas yang dikerjakan
3. Bug, digunakan saat ada penemuan bug pada proses testing oleh QE
4. Epic, digunakan untuk melakukan pengelompokkan pada suatu task

QE harus memperhatikan saat terjadi penemuan bug, QE memberikan issue baru bertipe bug saat menemukan ada yang tidak
sesuai terhadap kriteria. Selain itu QE juga harus memindahkan fitur yang berkaitan dengan bug ke panel In Progress.