public final class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOS() {
        return os;
    }

    public void setOS(String os) {
        this.os = os;
    }

    public boolean equals(Object o) {
        return super.equals(o);
    }

}