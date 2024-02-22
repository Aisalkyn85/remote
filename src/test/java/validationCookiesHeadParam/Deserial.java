package validationCookiesHeadParam;

import java.util.List;

public class Deserial {


    private String page;
    private String per_page;
    private String total;
    private String total_pages;

    public List<DataPojo> getData() {
        return data;
    }

    public void setData(List<DataPojo> data) {
        this.data = data;
    }

    private List<DataPojo> data;


    public AdPojo getAd() {
        return ad;
    }

    public void setAd(AdPojo ad) {
        this.ad = ad;
    }

    private AdPojo ad;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPer_page() {
        return per_page;
    }

    public void setPer_page(String per_page) {
        this.per_page = per_page;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(String total_pages) {
        this.total_pages = total_pages;
    }



    @Override
    public String toString() {
        return "Deserial{" +
                "page='" + page + '\'' +
                ", per_page='" + per_page + '\'' +
                ", total='" + total + '\'' +
                ", total_pages='" + total_pages + '\'' +
                ", data=" + data +
                '}';
    }
}
