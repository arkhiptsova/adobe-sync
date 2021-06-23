package com.adobe_sync.entity;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "groups")

public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id_group;

    private Integer id_district;

    private String adobe_group_name;

    private String ldap_group_name;

    private String group_status;

    public Integer getIdGroup() {
        return id_group;
    }

    public void setIdGroup(Integer id_group) {
        this.id_group = id_group;
    }

    public Integer getIdDistrict() {
        return id_district;
    }

    public void setIdDistrict(Integer id_district) {
        this.id_district = id_district;
    }

    public String getAdobeGroupName() {
        return adobe_group_name;
    }

    public void setAdobeGroupName(String adobe_group_name) {
        this.adobe_group_name = adobe_group_name;
    }

    public String getLdapGroupName() {
        return ldap_group_name;
    }

    public void setLdapGroupName(String ldap_group_name) {

        this.ldap_group_name = ldap_group_name;
    }

    public String getGroupStatus() {
        return group_status;
    }

    public void setGroupStatus(String group_status) {

        this.group_status = group_status;
    }

    public Group() {}

    public Group(Integer id_group, String adobe_group_name,
                 String ldap_group_name, String group_status, Integer id_district) {
        this.id_group = id_group;
        this.id_district = id_district;
        this.adobe_group_name = adobe_group_name;
        this.ldap_group_name = ldap_group_name;
    }
}
