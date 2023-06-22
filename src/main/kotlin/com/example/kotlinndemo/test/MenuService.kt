//package com.example.kotlinndemo.test
//
//import mm.com.dagon.foodcourt.database.model.Menu
//import mm.com.dagon.foodcourt.database.repo.MenuRepository
//import mm.com.dagon.foodcourt.payload.request.MenuCreateDTO
//import mm.com.dagon.foodcourt.payload.request.MenuUpdateDTO
//import mm.com.dagon.foodcourt.payload.response.ResponseFactory.*
//import org.modelmapper.ModelMapper
//import org.springframework.http.ResponseEntity
//import org.springframework.stereotype.Service
//import java.util.*
//
//
//@Service
//class MenuService(menuRepository: MenuRepository, modelMapper: ModelMapper) : IMenuService {
//    private val menuRepository: MenuRepository
//    private val modelMapper: ModelMapper
//
//    init {
//        this.menuRepository = menuRepository
//        this.modelMapper = modelMapper
//    }
//
//    fun createMenu(createDTO: MenuCreateDTO?): ResponseEntity<*> {
//        return try {
//            val menu: Menu = modelMapper.map(createDTO, Menu::class.java)
//            menuRepository.save(menu)
//            val responseMap: MutableMap<String, String> = HashMap()
//            responseMap["menuId"] = menu.getId()
//            onSuccessWithMessage(responseMap, "000", "Menu successfully created")
//        } catch (e: Exception) {
//            onFailDefault()
//        }
//    }
//
//    fun getMenuById(id: String?): ResponseEntity<*> {
//        return try {
//            val menuOptional: Optional<Menu?> = menuRepository.findById(id)
//            onSuccessWithMessage(menuOptional.orElse(null), "000", "Menu detail data fetched")
//        } catch (e: Exception) {
//            onFailDefault()
//        }
//    }
//
//    val allMenus: ResponseEntity<*>
//        get() = try {
//            val menuList: List<Menu> = menuRepository.findAll()
//            onSuccessWithMessage(menuList, "000", "Menu data fetched")
//        } catch (e: Exception) {
//            onFailDefault()
//        }
//
//    fun getAllMenusForOneShop(id: String?): ResponseEntity<*> {
//        return try {
//            val menuList: List<Menu> = menuRepository.findByShopId(id)
//            onSuccessWithMessage(menuList, "000", "Menu data fetched")
//        } catch (e: Exception) {
//            onFailDefault()
//        }
//    }
//
//    @Throws(Exception::class)
//    fun updateMenu(id: String?, updateDTO: MenuUpdateDTO?): ResponseEntity<*> {
//        val menu: Menu = menuRepository.findById(id).orElse(null)
//                ?: return onFailWithMessage("198", "Menu with the given id cannot be found")
//        modelMapper.map(updateDTO, menu)
//        menuRepository.save(menu)
//        return onSuccessWithMessage(menu, "000", "Successfully updated menu")
//    }
//
//    fun deleteMenu(id: String?): ResponseEntity<*> {
//        return if (menuRepository.existsById(id)) {
//            menuRepository.deleteById(id)
//            onSuccessWithMessage(null, "001", "Menu deleted")
//        } else {
//            onFailWithMessage("198", "Menu with the given id cannot be found")
//        }
//    }
//}