package com.james;

import java.util.Objects;

public class Equipment {
    public Equipment(Integer cost, String name, Integer total) {
        this.cost = cost;
        this.name = name;
        this.total = total;
    }

    private Integer cost;
    private String name;
    private Integer total;

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Equipment() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return Objects.equals(cost, equipment.cost) && Objects.equals(name, equipment.name) && Objects.equals(total, equipment.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, name, total);
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", total=" + total +
                '}';
    }
}

