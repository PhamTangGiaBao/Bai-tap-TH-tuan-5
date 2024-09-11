package btCongNhan;

public class CongNhan {
    private String maCN;
    private String mHo;
    private int mSoSP;
    private double donGia;

    public CongNhan() {}

    public CongNhan(String maCN, String mHo, int mSoSP) {
        this.maCN = maCN;
        this.mHo = mHo;
        setmSoSP(mSoSP);
    }

    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }

    public String getmHo() {
        return mHo;
    }

    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    public int getmSoSP() {
        return mSoSP;
    }

    public void setmSoSP(int mSoSP) {
        if (mSoSP > 0) {
            this.mSoSP = mSoSP;
            setDonGia();
        } else {
            throw new IllegalArgumentException("Số sản phẩm phải lớn hơn 0");
        }
    }

    public double getDonGia() {
        return donGia;
    }

    private void setDonGia() {
        if (mSoSP <= 199) {
            this.donGia = 0.5;
        } else if (mSoSP >= 200 && mSoSP <= 399) {
            this.donGia = 0.55;
        } else if (mSoSP >= 400 && mSoSP <= 599) {
            this.donGia = 0.6;
        } else {
            this.donGia = 0.65;
        }
    }

    public double tinhLuong() {
        return mSoSP * donGia;
    }

    @Override
    public String toString() {
        return String.format(
            "Cong Nhan: [%s, %s, %d, %.2f, %.2f]",
            maCN, mHo, mSoSP, donGia, tinhLuong()
        );
    }
}
