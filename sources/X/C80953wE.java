package X;

import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.3wE  reason: invalid class name and case insensitive filesystem */
public class C80953wE implements Runnable {
    public boolean A00;
    public boolean A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public long A07;
    public boolean A08;
    public final PhotoView A09;

    public void A00(float f, float f2, float f3, float f4, long j) {
        if (!this.A00) {
            this.A02 = f3;
            this.A03 = f4;
            this.A05 = f2;
            this.A07 = System.currentTimeMillis();
            this.A04 = f;
            this.A08 = AnonymousClass000.A1R((f2 > f ? 1 : (f2 == f ? 0 : -1)));
            this.A06 = (f2 - f) / ((float) j);
            this.A00 = true;
            this.A01 = false;
            this.A09.post(this);
        }
    }

    public void run() {
        if (!this.A01) {
            float currentTimeMillis = this.A04 + (this.A06 * ((float) (System.currentTimeMillis() - this.A07)));
            PhotoView photoView = this.A09;
            PhotoView.A03(photoView, currentTimeMillis, this.A02, this.A03);
            float f = this.A05;
            if (currentTimeMillis == f || this.A08 == AnonymousClass000.A1R((currentTimeMillis > f ? 1 : (currentTimeMillis == f ? 0 : -1)))) {
                PhotoView.A03(photoView, f, this.A02, this.A03);
                this.A00 = false;
                this.A01 = true;
            }
            if (!this.A01) {
                photoView.post(this);
            }
        }
    }

    public C80953wE(PhotoView photoView) {
        this.A09 = photoView;
    }
}
