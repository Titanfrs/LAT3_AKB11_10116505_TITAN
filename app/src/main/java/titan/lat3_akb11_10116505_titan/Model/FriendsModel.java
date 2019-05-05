package titan.lat3_akb11_10116505_titan.Model;

public class FriendsModel {
    private int mImageResource;
    private String namaGambar;

    public FriendsModel(int ImageResource, String namagambar){
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
