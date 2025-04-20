
# Abstract Data Types

Latihan implementasi ADT

Current ADTs in this repo:

## 1. List
Kumpulan dari elemen yang memperbolehkan elemen duplikat. Jenis-jenisnya:
### a. Array List
List yang menggunakan struktur data Array.
### b. Linked List
List yang menggunakan Node yang bisa terhubung satu sama lain sebagai struktur datanya.

## 2. Queue
Sebuah abstraksi untuk merepresentasikan sebuah antrian elemen-elemen. Jenis-jenisnya: 
### a. Static Queue
Queue yang menggunakan Array biasa dengan panjang yang sudah ditentukan (statis).
### b. Dynamic Queue
Queue yang menggunakan struktur data Linked List yang ukurannya bisa berkembang secara dinamis.

## 3. Set
Merepresentasikan kumpulan elemen-elemen unik (tidak ada yang duplikat). Jenis-jenisnya:
### a. Static Set
Set yang menggunakan Array biasa dengan panjang yang sudah ditentukan (statis).
### b. Dynamic Set
Set yang menggunakan Array dinamis (Array List) yang ukurannya bisa berkembang secara dinamis.

## 4. Stack
Merepresentasikan tumpukan elemen-elemen. Jenis-jenisnya:
### a. Static Stack
Stack yang menggunakan Array biasa dengan panjang yang sudah ditentukan (statis).
### b. Dynamic Stack
Stack yang menggunakan Array dinamis (Array List) yang ukurannya bisa berkembang secara dinamis.

## 5. Tree
Merepresentasikan simpul-simpul (Nodes) yang bercabang seperti pohon yang bercabang. Jenis-jenisnya:
### a. Binary Search Tree (BSTree)
Tree yang tiap simpul induknya hanya bisa memiliki dua simpul anak. 

Setiap ada simpul baru, dia akan disimpan secara terurut mengikuti aturan Binary Search:

> Tiap simpul anak sebelah kiri lebih kecil dan tiap simpul anak sebelah kanan lebih besar dari simpul induknya.