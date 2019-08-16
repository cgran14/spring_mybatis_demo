package com.qf.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

/**
 * Created by DELL on 2019/8/2.
 */

public class ModifyRoleMenuDTO {
    int roleId;
    ArrayList<Integer> menuIds;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public ArrayList<Integer> getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(ArrayList<Integer> menuIds) {
        this.menuIds = menuIds;
    }

    @Override
    public String toString() {
        return "ModifyRoleMenuDTO{" +
                "roleId=" + roleId +
                ", menuIds=" + menuIds +
                '}';
    }
}
