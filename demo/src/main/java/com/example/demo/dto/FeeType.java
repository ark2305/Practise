package com.example.demo.dto;

public enum FeeType {

    SANCTION_FEE("Sanction Fee"),
    PROCESSING_FEE("Processing Fee"),
    DOCUMENTATION_FEE("Documentation Fee"),
    VALUATION_FEE("Valuation Fee");

    private String name;

    FeeType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
