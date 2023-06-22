//package com.example.kotlinndemo.test
//
//
//import org.springframework.http.ResponseEntity
//
//
//
//interface IMenuService {
//
//
//    fun createMenu(createDTO: MenuCreateDTO?): ResponseEntity<*>?
//    fun getMenuById(id: String?): ResponseEntity<*>?
//    val allMenus: ResponseEntity<*>?
//
//    fun getAllMenusForOneShop(id: String?): ResponseEntity<*>?
//
//    @Throws(Exception::class)
//    fun updateMenu(id: String?, updateDTO: MenuUpdateDTO?): ResponseEntity<*>?
//    fun deleteMenu(id: String?): ResponseEntity<*>?
//}