package validationCookiesHeadParam;

public class AdPojo {
    private String comapny;
    private String URL;
    private String text;

    public String getComapny() {
        return comapny;
    }

    public void setComapny(String comapny) {
        this.comapny = comapny;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "AdPojo{" +
                "comapny='" + comapny + '\'' +
                ", URL='" + URL + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
