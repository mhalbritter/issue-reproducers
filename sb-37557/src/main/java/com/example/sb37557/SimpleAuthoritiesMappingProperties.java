package com.example.sb37557;

public class SimpleAuthoritiesMappingProperties {
    /**
     * JSON path of the claim(s) to map with this properties
     */
    private String path;

    /**
     * What to prefix authorities with (for instance "ROLE_" or "SCOPE_")
     */
    private String prefix;


    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        return "SimpleAuthoritiesMappingProperties{" +
                "path='" + path + '\'' +
                ", prefix='" + prefix + '\'' +
                '}';
    }
}
