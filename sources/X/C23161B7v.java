package X;

import android.media.Image;

/* renamed from: X.B7v  reason: case insensitive filesystem */
public class C23161B7v implements B3E {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06 = 1;

    public C23161B7v(C124845yt r3, C22775Avl[] avlArr) {
        this.A01 = avlArr.length;
        this.A02 = r3.A03;
        this.A00 = r3.A00;
        this.A03 = new BAL(avlArr, 3);
        this.A05 = new BAL(avlArr, 5);
        this.A04 = new BAL(avlArr, 4);
    }

    public C23161B7v(Image image) {
        this.A01 = image.getPlanes().length;
        this.A02 = image.getWidth();
        this.A00 = image.getHeight();
        this.A03 = new BAL(image, 0);
        this.A05 = new BAL(image, 2);
        this.A04 = new BAL(image, 1);
    }
}
