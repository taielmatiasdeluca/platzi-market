package com.platzi.market.persitence.mapper;

import com.platzi.market.domain.Category;
import com.platzi.market.persitence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")

public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria" ,target =  "categoryId"),
            @Mapping(source = "estado" ,target =  "active"),
            @Mapping(source = "descripcion" ,target =  "category"),
    })

    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos",ignore = true)
    Categoria toCategoria(Category category);
}
