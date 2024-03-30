package X;

import android.graphics.Matrix;
import java.util.ArrayList;

/* renamed from: X.0Ba  reason: invalid class name and case insensitive filesystem */
public class C02580Ba extends AnonymousClass0BZ {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public String A08;
    public int[] A09;
    public final Matrix A0A;
    public final Matrix A0B;
    public final ArrayList A0C;

    public C02580Ba(AnonymousClass008 r6, C02580Ba r7) {
        C03870Ie r1;
        this.A0B = new Matrix();
        this.A0C = new ArrayList();
        this.A02 = 0.0f;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 0.0f;
        this.A06 = 0.0f;
        Matrix matrix = new Matrix();
        this.A0A = matrix;
        this.A08 = null;
        this.A02 = r7.A02;
        this.A00 = r7.A00;
        this.A01 = r7.A01;
        this.A03 = r7.A03;
        this.A04 = r7.A04;
        this.A05 = r7.A05;
        this.A06 = r7.A06;
        this.A09 = r7.A09;
        String str = r7.A08;
        this.A08 = str;
        this.A07 = r7.A07;
        if (str != null) {
            r6.put(str, this);
        }
        matrix.set(r7.A0A);
        ArrayList arrayList = r7.A0C;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C02580Ba) {
                this.A0C.add(new C02580Ba(r6, (C02580Ba) obj));
            } else {
                if (obj instanceof C03860Id) {
                    r1 = new C03860Id((C03860Id) obj);
                } else if (obj instanceof C03850Ic) {
                    r1 = new C03850Ic((C03850Ic) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.A0C.add(r1);
                String str2 = r1.A02;
                if (str2 != null) {
                    r6.put(str2, r1);
                }
            }
        }
    }

    public boolean A01() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0C;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AnonymousClass0BZ) arrayList.get(i)).A01()) {
                return true;
            }
            i++;
        }
    }

    public boolean A02(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.A0C;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((AnonymousClass0BZ) arrayList.get(i)).A02(iArr);
            i++;
        }
    }

    public static void A00(C02580Ba r4) {
        Matrix matrix = r4.A0A;
        matrix.reset();
        matrix.postTranslate(-r4.A00, -r4.A01);
        matrix.postScale(r4.A03, r4.A04);
        matrix.postRotate(r4.A02, 0.0f, 0.0f);
        matrix.postTranslate(r4.A05 + r4.A00, r4.A06 + r4.A01);
    }

    public void setPivotX(float f) {
        if (f != this.A00) {
            this.A00 = f;
            A00(this);
        }
    }

    public void setPivotY(float f) {
        if (f != this.A01) {
            this.A01 = f;
            A00(this);
        }
    }

    public void setRotation(float f) {
        if (f != this.A02) {
            this.A02 = f;
            A00(this);
        }
    }

    public void setScaleX(float f) {
        if (f != this.A03) {
            this.A03 = f;
            A00(this);
        }
    }

    public void setScaleY(float f) {
        if (f != this.A04) {
            this.A04 = f;
            A00(this);
        }
    }

    public void setTranslateX(float f) {
        if (f != this.A05) {
            this.A05 = f;
            A00(this);
        }
    }

    public void setTranslateY(float f) {
        if (f != this.A06) {
            this.A06 = f;
            A00(this);
        }
    }

    public String getGroupName() {
        return this.A08;
    }

    public Matrix getLocalMatrix() {
        return this.A0A;
    }

    public float getPivotX() {
        return this.A00;
    }

    public float getPivotY() {
        return this.A01;
    }

    public float getRotation() {
        return this.A02;
    }

    public float getScaleX() {
        return this.A03;
    }

    public float getScaleY() {
        return this.A04;
    }

    public float getTranslateX() {
        return this.A05;
    }

    public float getTranslateY() {
        return this.A06;
    }

    public C02580Ba() {
        this.A0B = new Matrix();
        this.A0C = new ArrayList();
        this.A02 = 0.0f;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 0.0f;
        this.A06 = 0.0f;
        this.A0A = new Matrix();
        this.A08 = null;
    }
}
