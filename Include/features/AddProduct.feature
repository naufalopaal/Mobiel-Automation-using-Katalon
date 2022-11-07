@AddProduct
Feature: Add new Product
  User want to Add new Product

  @AddProductPositive
  Scenario Outline: User want to Add new Product using registered Account
    Given User login using registered account
    When User click Add button
    And User input Nama <nama> Produk
    And User input Harga <harga> Produk
    And User choose Kategori <kategori>
    And User input Lokasi <lokasi>
    And User input Deskripsi <deskripsi>
    And User click Terbitkan button
    Then Product successfully added

    Examples: 
      | nama | harga  | kategori   | lokasi         | deskripsi   |
      | Vape | 500123 | Elektronik | Bandar Lampung | Testing 123 |

  @AddProductNegative
  Scenario Outline: User want to Add new Product using registered Account
    Given User login using registered account
    When User click Add button
    And User input Nama <nama> Produk
    And User input Harga <harga> Produk
    And User choose Kategori <kategori>
    And User input Lokasi <lokasi>
    And User input Deskripsi <deskripsi>
    And User click Terbitkan button
    Then Product successfully added
    
    Examples: 
      | nama | harga  | kategori   | lokasi         | deskripsi   |
      |      | 500123 | Elektronik | Bandar Lampung | Testing 123 |