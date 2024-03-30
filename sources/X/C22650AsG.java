package X;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/* renamed from: X.AsG  reason: case insensitive filesystem */
public class C22650AsG extends AnonymousClass121 {
    public byte[] A00;

    public int A0A() {
        int length = this.A00.length;
        return C201849kY.A01(length) + 1 + length;
    }

    public void A0D(C200179gm r3, boolean z) {
        r3.A04(this.A00, 23, z);
    }

    public boolean A0E() {
        return false;
    }

    public int hashCode() {
        return AnonymousClass124.A00(this.A00);
    }

    public String toString() {
        return AnonymousClass11q.A02(this.A00);
    }

    public boolean A0F(AnonymousClass121 r3) {
        if (!(r3 instanceof C22650AsG)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C22650AsG) r3).A00);
    }

    public String A0H() {
        StringBuilder A0u;
        String substring;
        String A02 = AnonymousClass11q.A02(this.A00);
        int indexOf = A02.indexOf(45);
        if (indexOf >= 0 || (indexOf = A02.indexOf(43)) >= 0) {
            if (indexOf == A02.length() - 3) {
                A02 = AnonymousClass000.A0q("00", AnonymousClass000.A0v(A02));
            }
            A0u = AnonymousClass000.A0u();
            if (indexOf == 10) {
                C165577te.A1O(A02, A0u, 0, 10);
                A0u.append("00GMT");
                C165577te.A1O(A02, A0u, 10, 13);
                A0u.append(":");
                substring = A02.substring(13, 15);
            } else {
                C165577te.A1O(A02, A0u, 0, 12);
                A0u.append("GMT");
                C165577te.A1O(A02, A0u, 12, 15);
                A0u.append(":");
                substring = A02.substring(15, 17);
            }
        } else {
            int length = A02.length();
            A0u = AnonymousClass000.A0u();
            if (length == 11) {
                C165577te.A1O(A02, A0u, 0, 10);
                substring = "00GMT+00:00";
            } else {
                C165577te.A1O(A02, A0u, 0, 12);
                substring = "GMT+00:00";
            }
        }
        return AnonymousClass000.A0q(substring, A0u);
    }

    public C22650AsG(String str) {
        this.A00 = AnonymousClass11q.A03(str);
        try {
            C129916Iz.A00(new SimpleDateFormat("yyMMddHHmmssz").parse(A0H()));
        } catch (ParseException e) {
            throw AnonymousClass001.A08(C36331k8.A0i("invalid date string: ", AnonymousClass000.A0u(), e));
        }
    }

    public C22650AsG(byte[] bArr) {
        byte b;
        if (bArr.length >= 2) {
            this.A00 = bArr;
            byte b2 = bArr[0];
            if (b2 < 48 || b2 > 57 || (b = bArr[1]) < 48 || b > 57) {
                throw AnonymousClass001.A08("illegal characters in UTCTime string");
            }
            return;
        }
        throw AnonymousClass001.A08("UTCTime string too short");
    }
}
