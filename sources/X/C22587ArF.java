package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.ArF  reason: case insensitive filesystem */
public class C22587ArF extends C22651AsH {
    public C22587ArF(C202169lB r1) {
        super(r1);
    }

    public int A0A() {
        return A08().length;
    }

    public void A0D(C200179gm r7, boolean z) {
        ByteArrayOutputStream A0Q = C90524aI.A0Q();
        C22651AsH.A02(A0Q, "DL", this.A02);
        C22651AsH.A02(A0Q, "DL", this.A01);
        C22651AsH.A02(A0Q, "DL", this.A03);
        A0Q.write(new C22680Ask(this.A04, this.A00, true).A09("DL"));
        byte[] byteArray = A0Q.toByteArray();
        r7.A02(32, 8, z);
        int length = byteArray.length;
        r7.A01(length);
        r7.A00.write(byteArray, 0, length);
    }
}
