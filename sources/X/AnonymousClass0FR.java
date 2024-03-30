package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.0FR  reason: invalid class name */
public class AnonymousClass0FR extends C03190Dn {
    public C000700i A00;
    public C10890fO A01;
    public int[][] A02;

    public void A07() {
        this.A00 = this.A00.clone();
        this.A01 = this.A01.clone();
    }

    public Drawable newDrawable(Resources resources) {
        return new AnonymousClass0FS(resources, this);
    }

    public AnonymousClass0FR(Resources resources, AnonymousClass0FR r3, AnonymousClass0FS r4) {
        super(resources, r3, r4);
        int[][] iArr;
        C10890fO r0;
        if (r3 != null) {
            iArr = r3.A02;
        } else {
            iArr = new int[this.A0X.length][];
        }
        this.A02 = iArr;
        if (r3 != null) {
            this.A00 = r3.A00;
            r0 = r3.A01;
        } else {
            this.A00 = new C000700i();
            r0 = new C10890fO();
        }
        this.A01 = r0;
    }

    public void A04(int i, int i2) {
        super.A04(i, i2);
        int[][] iArr = new int[i2][];
        System.arraycopy(this.A02, 0, iArr, 0, i);
        this.A02 = iArr;
    }

    public Drawable newDrawable() {
        return new AnonymousClass0FS((Resources) null, this);
    }
}
