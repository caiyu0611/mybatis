package com.njzhenghou.entity;

public class Key {
    private Integer kid;
    private String keyName;

    public Key() {
    }

    public Key(Integer kid, String keyName) {
        this.kid = kid;
        this.keyName = keyName;
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    @Override
    public String toString() {
        return "Key{" +
                "kid=" + kid +
                ", keyName='" + keyName + '\'' +
                '}';
    }
}
