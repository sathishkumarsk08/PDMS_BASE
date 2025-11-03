package com.msp.pms.msppmsmodel;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "feature_master", schema = "mspms")
public class MSPFeatureMaster {
    private Integer id;
    private String name;
    private String menuName;
    private String parentId;
    private Integer hide;
    private Integer order;
    private String menuUrl;
    private String menuImage;
    private String menuType;
    private String markDefault;
    private Integer featureGroup;
    private Integer isMenu;

    @Column(name = "menu_url")
    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    @Id
    @Column(name = "feature_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column(name = "feature_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "menu_name")
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    @Column(name = "parant_id")
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    @Column(name = "hide")
    public Integer getHide() {
        return hide;
    }

    public void setHide(Integer hide) {
        this.hide = hide;
    }
    @Column(name = "feature_order")
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
    @Column(name = "menu_image")
    public String getMenuImage() {
        return menuImage;
    }

    public void setMenuImage(String menuImage) {
        this.menuImage = menuImage;
    }
    @Column(name = "menu_type")
    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }
    @Column(name = "mark_default")
    public String getMarkDefault() {
        return markDefault;
    }

    public void setMarkDefault(String markDefault) {
        this.markDefault = markDefault;
    }
    @Column(name = "feature_group")
    public Integer getFeatureGroup() {
        return featureGroup;
    }

    public void setFeatureGroup(Integer featureGroup) {
        this.featureGroup = featureGroup;
    }
    @Column(name = "is_menu")
    public Integer getIsMenu() {
        return isMenu;
    }

    public void setIsMenu(Integer isMenu) {
        this.isMenu = isMenu;
    }
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "role_feature",
            joinColumns = @JoinColumn(name = "feature_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<MSPRoles> roles = new HashSet<>();
}
