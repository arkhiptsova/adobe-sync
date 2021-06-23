package com.adobe_sync.entity;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "districts")

public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id_district;

    private String district_name;

    private String ldap_host_uri;

    private String ldap_base_dn;

    private String ldap_username;

    private String ldap_password;

    private String sync_mode;

    public Integer getIdDistrict() {
        return id_district;
    }

    public void setIdDistrict(Integer id_district) {
        this.id_district = id_district;
    }

    public String getDistrictName() {
        return district_name;
    }

    public void setDistrictName(String district_name) {
        this.district_name = district_name;
    }

    public String getLdapHostUri() {
        return ldap_host_uri;
    }

    public void setLdapHostUri(String ldap_host_uri) {

        this.ldap_host_uri = ldap_host_uri;
    }
    public String getLdapHostDn() {
        return ldap_base_dn;
    }

    public void setLdapBaseDn(String ldap_base_dn) {

        this.ldap_base_dn = ldap_base_dn;
    }
    public String getLdapUsername() {
        return ldap_username;
    }

    public void setLdapUsername(String ldap_username) {

        this.ldap_username = ldap_username;
    }
    public String getLdapPassword() {
        return ldap_password;
    }

    public void setLdapPassword(String ldap_password) {

        this.ldap_password = ldap_password;
    }
    public String getSyncMode() {
        return sync_mode;
    }

    public void setSyncMode(String sync_mode) {

        this.sync_mode = sync_mode;
    }

    public District() {}

    public District(Integer id_district, String district_name, String ldap_host_uri,
                    String ldap_base_dn, String ldap_username, String ldap_password,
                    String sync_mode) {
        this.id_district = id_district;
        this.district_name = district_name;
        this.ldap_host_uri = ldap_host_uri;
        this.ldap_base_dn = ldap_base_dn;
        this.ldap_username = ldap_username;
        this.ldap_password = ldap_password;
        this.sync_mode = sync_mode;


    }

}
