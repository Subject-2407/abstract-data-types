# 📦 Abstract Data Types (ADT)

_Repo ini berisi latihan implementasi berbagai **Abstract Data Types (ADT)** dalam Java._

---

## 📚 Daftar ADT yang Diimplementasikan

### 1. 📝 List  
Struktur data yang merepresentasikan kumpulan elemen **(boleh duplikat)**.  
#### Jenis-jenis:
- **Array List**  
  Menggunakan struktur data **array** untuk menyimpan elemen secara berurutan.
- **Linked List**  
  Menggunakan **node-node** yang saling terhubung sebagai strukturnya.

---

### 2. ⏳ Queue  
Merepresentasikan **antrian elemen** dengan prinsip **FIFO** (_First In, First Out_).  
#### Jenis-jenis:
- **Static Queue**  
  Menggunakan **array statis** dengan ukuran tetap.
- **Dynamic Queue**  
  Menggunakan **linked list** sehingga ukurannya bisa bertambah atau berkurang secara dinamis.

---

### 3. 🚫 Set  
Kumpulan elemen **unik** (tidak mengizinkan duplikat).  
#### Jenis-jenis:
- **Static Set**  
  Menggunakan **array statis**.
- **Dynamic Set**  
  Menggunakan **array list dinamis** yang dapat menyesuaikan ukuran sesuai kebutuhan.

---

### 4. 📚 Stack  
Merepresentasikan **tumpukan elemen** dengan prinsip **LIFO** (_Last In, First Out_).  
#### Jenis-jenis:
- **Static Stack**  
  Dibangun dengan **array statis**.
- **Dynamic Stack**  
  Dibangun dengan **array list dinamis**.

---

### 5. 🌳 Tree  
Struktur data hierarkis yang merepresentasikan **simpul-simpul (nodes) yang bercabang** seperti pohon.  
#### Jenis:
- **Binary Search Tree (BST)**  
  Tree di mana setiap simpul induk hanya memiliki **maksimal dua anak**, dengan aturan:

  > Setiap simpul baru akan disisipkan secara terurut:  
  > - Simpul anak **sebelah kiri** selalu **lebih kecil** dari induknya.  
  > - Simpul anak **sebelah kanan** selalu **lebih besar** dari induknya.

---