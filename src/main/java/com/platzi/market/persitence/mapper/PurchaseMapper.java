package com.platzi.market.persitence.mapper;


import com.platzi.market.domain.Purchase;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import com.platzi.market.persistence.entity.Compra;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring",uses = {PurchaseMapper.class})
public interface PurchaseMapper {

    @Mappings({
            @Mapping(source = "idCompra",target = "purchaseId"),
            @Mapping(source = "idClient",target = "clientId"),
            @Mapping(source = "fecha",target = "date"),
            @Mapping(source = "medioPago",target = "paymentMethod"),
            @Mapping(source = "comentario",target = "comment"),
            @Mapping(source = "estado",target = "state"),
            @Mapping(source = "productos",target = "items"),
    })
    Purchase toPurchase(Compra compra);

    List<Purchase> toPurchases(List<Compra> compras);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "cliente",ignore = true)
    })
    Compra toCompra(Purchase purchase);
}
