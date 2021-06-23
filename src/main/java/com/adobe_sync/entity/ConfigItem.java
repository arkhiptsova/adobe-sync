package com.adobe_sync.entity;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "config_status_items")
public class ConfigItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id_config_item;

    private String item_name;

    private String item_value;

    public Integer getIdConfig() {
        return id_config_item;
    }

    public void setIdConfig(Integer id_config_item) {

        this.id_config_item = id_config_item;
    }

    public String getItemName() {
        return item_name;
    }

    public void setItemName(String item_name) {

        this.item_name = item_name;
    }

    public String getItemValue() {
        return item_value;
    }

    public void setItemValue(String item_value) {
        this.item_value = item_value;
    }

    public ConfigItem() {}

    public ConfigItem(Integer id_config_item, String item_name, String item_value
                      ) {
        this.id_config_item = id_config_item;
        this.item_name = item_name;
        this.item_value = item_value;

    }
}
