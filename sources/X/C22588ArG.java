package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.ArG  reason: case insensitive filesystem */
public class C22588ArG extends C22651AsH {
    public C22588ArG(C22654AsK asK, AnonymousClass122 r2, AnonymousClass121 r3, AnonymousClass121 r4, int i) {
        super(asK, r2, r3, r4, i);
    }

    public int A0A() {
        return A08().length;
    }

    public AnonymousClass121 A0B() {
        return this;
    }

    public void A0D(C200179gm r7, boolean z) {
        ByteArrayOutputStream A0Q = C90524aI.A0Q();
        C22651AsH.A02(A0Q, "DER", this.A02);
        C22651AsH.A02(A0Q, "DER", this.A01);
        C22651AsH.A02(A0Q, "DER", this.A03);
        A0Q.write(new C22681Asl(this.A04, this.A00, true).A09("DER"));
        byte[] byteArray = A0Q.toByteArray();
        r7.A02(32, 8, z);
        int length = byteArray.length;
        r7.A01(length);
        r7.A00.write(byteArray, 0, length);
    }
}
