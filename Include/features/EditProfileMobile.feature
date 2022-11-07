@EditProfile
Feature: Edit Profile
  I want to Edit My Profile

  @EditProfilePositive
  Scenario Outline: Edit Profile for Binar4
    Given User laucnh Profile Page
    When User click edit button
    And User click Nama
    And User clear Nama
    And User input Nama <nama>
    And User click Simpan
    And User click NomorHP
    And User clear NomorHP
    And User input NomorHP <nomorhp>
    And User click Simpan2
    Then Page show successfully

    Examples: 
      | nama     | nomorhp      |
      | Binar 41 | 081317560669 |
      
    @EditProfileNegative
  Scenario Outline: Edit Profile for Binar4
    Given User laucnh Profile Page
    When User click edit button
    And User click Nama
    And User clear Nama
    And User input Nama <nama>
    And User click Simpan
    And User click NomorHP
    And User clear NomorHP
    And User input NomorHP <nomorhp>
    And User click Simpan2
    Then Page show successfully

    Examples: 
      | nama     | nomorhp      |
      | Binar 41 | -             |
