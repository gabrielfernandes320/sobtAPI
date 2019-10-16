package com.sobt.repository;

import com.sobt.ItemType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemTypeRepository extends JpaRepository<ItemType,Long> {

    ItemType findById(long id);

}
