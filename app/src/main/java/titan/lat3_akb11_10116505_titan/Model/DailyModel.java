package titan.lat3_akb11_10116505_titan.Model;

public class DailyModel {

    private int mImageResource;
    private String namaGambar;

    public DailyModel(int ImageResource, String namagambar){
        mImageResource = ImageResource;
        namaGambar = namagambar;

    }

    public int getmImageResource(){
        return mImageResource;
    }

    public String getNamaGambar(){
        return namaGambar;
    }
}
