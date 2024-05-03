package com.example.demo.mappers;

import com.example.demo.DTOS.*;
import com.example.demo.DTOS.records.LoginDTO;
import com.example.demo.DTOS.records.SignUpDTO;
import com.example.demo.model.Entities.CartEntity;
import com.example.demo.model.Entities.ProductEntity;
import com.example.demo.model.Entities.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    @Bean
    public ModelMapper modelMapper(){
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        modelMapper.getConfiguration().setFieldMatchingEnabled(true);

        modelMapper.createTypeMap(ProductEntity.class, ProductDTO.class);
        modelMapper.createTypeMap(UserEntity.class, UserDTO.class);
        modelMapper.createTypeMap(UserEntity.class, LoginDTO.class);
        modelMapper.createTypeMap(UserEntity.class, SignUpDTO.class);
        modelMapper.createTypeMap(CartEntity.class, CartDTO.class);
        return modelMapper;
    }
}
