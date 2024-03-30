package X;

import android.graphics.Bitmap;

/* renamed from: X.4iV  reason: invalid class name and case insensitive filesystem */
public final class C94614iV extends C128906Eb {
    public float A00;
    public int A01 = 1;
    public C114365h6 A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final C23085B3v A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C94614iV) {
                C94614iV r8 = (C94614iV) obj;
                if (!(AnonymousClass00C.A0J(this.A06, r8.A06) && this.A04 == r8.A04 && this.A05 == r8.A05 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C94614iV(C23085B3v b3v) {
        int i;
        int i2;
        long j = AnonymousClass6TU.A01;
        Bitmap bitmap = ((C137406g5) b3v).A00;
        long A0J = C90484aE.A0J(bitmap.getWidth(), bitmap.getHeight());
        this.A06 = b3v;
        this.A04 = j;
        this.A05 = A0J;
        if (((int) (j >> 32)) < 0 || ((int) (j & 4294967295L)) < 0 || (i = (int) (A0J >> 32)) < 0 || (i2 = (int) (A0J & 4294967295L)) < 0 || i > bitmap.getWidth() || i2 > bitmap.getHeight()) {
            throw AnonymousClass001.A08("Failed requirement.");
        }
        this.A03 = A0J;
        this.A00 = 1.0f;
    }

    public int hashCode() {
        return C36321k7.A00(this.A05, C36321k7.A00(this.A04, C36391kE.A0A(this.A06))) + this.A01;
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BitmapPainter(image=");
        A0u.append(this.A06);
        A0u.append(", srcOffset=");
        long j = this.A04;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append('(');
        A0u2.append(C90494aF.A08(j));
        C90504aG.A1M(A0u2);
        A0u.append(C36321k7.A0G(A0u2, C90474aD.A03(j)));
        A0u.append(", srcSize=");
        long j2 = this.A05;
        StringBuilder A0u3 = AnonymousClass000.A0u();
        A0u3.append(C90494aF.A08(j2));
        A0u3.append(" x ");
        A0u.append(C36381kD.A10(A0u3, C90474aD.A03(j2)));
        A0u.append(", filterQuality=");
        if (this.A01 == 0) {
            str = "None";
        } else {
            str = "Low";
        }
        return AnonymousClass000.A0m(str, A0u);
    }
}
