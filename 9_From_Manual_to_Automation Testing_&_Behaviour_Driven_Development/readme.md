# (9) From Manual to Automation Testing & Behaviour Driven Development

## From Manual to Automation Testing

### Manual Testing
Manual testing berarti pengujian yang bersifat atau dilakukan secara manual. Semua test case yang ada
dieksekusi atau dilakukan oleh penguji manusia atau software, tujuan dari manual testing ini tentunya adalah
eksplorasi lebih luas dan observasi sendiri oleh manusia. Manual Testing sendiri dilakukan karena lebih luas dalam eksplorasi,
 cepat dan berfungsi dengan baik.

### Automation Testing
Kebalikan dari manual testing, automation testing merupakan pengujian yang dilakukan secara otomatis. Pengujian ini dilakukan
dengan automation tools untuk melakukan testcase yang ada, automation testing juga dikatakan lebih efisien dan aman. Automation testing
jika dibanding testing secara manual memang lebih fleksibel, efisien, aman, dan juga dapat menghindari error.

### Perbandingan
#### Manual Testing :
(+) 
1. lebih cepat dan akurat terhadap feedback secara visual
2. lebih murah
3. ketika melakukan pengujian terhadap hal kecil akan lebih cepat karena automation testing membutuhkan waktu untuk koding

(-)
1. sering terjadi kesalahan atau error
2. tidak dapat direkam

#### Automation Testing :
(+)
1. bagus untuk testcase yang diuji berulang
2. bagus untuk testcase yang sulit diuji secara manual
3. bagus untuk testcase yang lama jika diuji secara manual

(-)
1. kurang bagus untuk test case yang baru dan belum pernah diuji secara manual
2. kurang bagus untuk test case yang kebutuhannya sering diubah

- - -

## BDD (Behavior Driven Development)
### BDD ?
BDD atau Behavior Driven Development adalah sebuah pengembangan berdasarkan perilaku. Selain BDD juga ada TDD yaitu 
Test Driven Development yang merupakan pengembangan berdasarkan test, TDD sendiri berproses dengan cara menulis test yang gagal,
 membuat test tersebut lolos, dan melakukan refactor. BDD tidak hanya membantu mengembangkan software yang benar, tetapi juga
meyakinkan pengembangan software yang benar dengan menggunakan Gherkin language. BDD sendiri memiliki format :
1. user story
2. as a [x], i want [y], so that [z]
3. scenario
4. given, when, dan then
### Cucumber ?
BDD dengan cucumber menuliskan story dengan Gherkin syntax (given, when, dan then), kemudian map steps dengan java, konfigurasi
story yang dibuat, menjalankan story dan melihat reportnya.

### BDD dengan cucumber
BDD dengan cucumber membutuhkan java, maven, dan IDE Intellij untuk menjalankannya dengan menggunakan Gherkin Syntax.
Selain itu juga terdapat tools serenity yang dapat digunakan sebagai BDD.
