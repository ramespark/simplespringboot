package com.learning.simplerestuser

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity.status
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.MockMvcBuilder
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*
import sun.awt.shell.ShellFolder.get
import java.lang.reflect.Array.get
import javax.swing.UIManager.get

@SpringBootTest
@AutoConfigureMockMvc
class SimplerestuserApplicationTests {

    @Autowired
    private lateinit var mvc: MockMvc

    @Test
    fun getRoot() {
        mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk)
                .andExpect(content().string(equalTo("Welcome to user app")))
    }

    @Test
    fun getUser() {
        mvc.perform(MockMvcRequestBuilders.get("/user").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk)
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.age", equalTo(18)))
                .andExpect(jsonPath("$.name", equalTo("TestUser")))
    }
}
