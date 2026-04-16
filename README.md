# Studi Kasus Pemrograman Lanjut (Java OOP)

## 1. Manusia.java
Kelas **Manusia** merupakan kelas induk dengan atribut dan method sebagai berikut:

### Atribut:
- `nama` : String  
- `jenisKelamin` : boolean *(true = laki-laki, false = perempuan)*  
- `nik` : String  
- `menikah` : boolean  

### Method:
- Setter dan Getter  
- `getTunjangan() : double`  
- `getPendapatan() : double`  
- `toString() : String`  

### Keterangan:
- Tunjangan:
  - Sudah menikah:
    - Laki-laki → $25  
    - Perempuan → $20  
  - Belum menikah → $15  

- `toString()` menampilkan:
  - Nama  
  - NIK  
  - Jenis kelamin  
  - Jumlah pendapatan  

---

## 2. MahasiswaFILKOM.java
Kelas **MahasiswaFILKOM** merupakan turunan dari **Manusia**.

### Atribut:
- `nim` : String  
- `ipk` : double  

### Method:
- Setter dan Getter  
- `getStatus() : String`  
- `getBeasiswa() : double`  
- `toString() : String`  

### Keterangan:
- Beasiswa:
  - IPK 3.0 – 3.5 → $50  
  - IPK 3.5 – 4.0 → $75  

- Format NIM:  
  `1651506XXXXXXX`

  Keterangan:
  - Digit ke-1 dan ke-2 → Angkatan  
  - Digit ke-7 → Kode prodi  

- Kode Prodi:
  - 2 → Teknik Informatika  
  - 3 → Teknik Komputer  
  - 4 → Sistem Informasi  
  - 6 → Pendidikan Teknologi Informasi  
  - 7 → Teknologi Informasi  

- Format output status:  
  **"Prodi, Tahun"**  
  Contoh: *Sistem Informasi, 2017*

- `toString()` menampilkan:
  - Atribut dari kelas induk  
  - NIM  
  - IPK  
  - Status  

---

## 3. Pekerja.java
Kelas **Pekerja** merupakan turunan dari **Manusia**.

### Atribut:
- `gaji` : double  
- `tahunMasuk` : LocalDate  
- `jumlahAnak` : int  

### Method:
- Setter dan Getter  
- `getBonus() : double`  
- `getGaji() : double`  
- `toString() : String`  

### Keterangan:
- Bonus berdasarkan lama kerja:
  - 0 – 5 tahun → 5% dari gaji  
  - 5 – 10 tahun → 10% dari gaji  
  - > 10 tahun → 15% dari gaji  

- Tunjangan tambahan:
  - $20 per anak  

- `toString()` menampilkan:
  - Atribut dari kelas induk  
  - Tahun masuk  
  - Jumlah anak  
  - Gaji  

---

## 4. Manager.java
Kelas **Manager** merupakan turunan dari **Pekerja**.

### Atribut:
- `departemen` : String  

### Method:
- Setter dan Getter  

### Keterangan:
- Mendapat tambahan tunjangan sebesar **10% dari gaji**  
- `toString()` menampilkan:
  - Atribut dari kelas induk  
  - Departemen  

---

## Test Case

Buatlah objek dan tampilkan (`toString()`) untuk kasus berikut:

### 1. Manusia
- Laki-laki telah menikah  
- Perempuan telah menikah  
- Belum menikah  

### 2. MahasiswaFILKOM (sesuai status Anda)
- IPK < 3  
- IPK 3 – 3.5  
- IPK 3.5 – 4  

### 3. Pekerja
- Lama bekerja 2 tahun, memiliki 2 anak  
- Lama bekerja 9 tahun  
- Lama bekerja 20 tahun, memiliki 10 anak  

### 4. Manager
- Lama bekerja 15 tahun  
- Gaji $7500  