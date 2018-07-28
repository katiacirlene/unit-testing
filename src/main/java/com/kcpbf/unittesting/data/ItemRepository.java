package com.kcpbf.unittesting.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kcpbf.unittesting.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
