package com.roa.market.persistence.mapper;

import com.roa.market.domain.Category;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active"),

    })
    Category toCategory(Category categoria);
    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Category toCategoria(Category category);
}
