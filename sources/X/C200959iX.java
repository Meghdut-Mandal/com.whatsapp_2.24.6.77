package X;

import java.io.UnsupportedEncodingException;

/* renamed from: X.9iX  reason: invalid class name and case insensitive filesystem */
public class C200959iX {
    public C198799eD A00;
    public AnonymousClass9SR A01;
    public final AnonymousClass17Y A02;
    public final C19600wD A03;
    public final C19630wG A04;
    public final C29221Vu A05;
    public final AnonymousClass9SJ A06;
    public final C200049gU A07;
    public final C24611Dc A08 = C165597tg.A0S("PaymentPinHelper");
    public final AnonymousClass6VG A09;
    public final C196039Xk A0A;

    public static void A00(C22973AzP azP, C22974AzQ azQ, C200959iX r4, String str) {
        AF3 A012 = r4.A07.A01(str, "PIN");
        if (A012 == null) {
            r4.A01.A00(new C21254AEk(azP, azQ), str);
        } else {
            azP.BfA(new C194449Pt(A012));
        }
    }

    public static byte[] A01(Object... objArr) {
        int length = objArr.length;
        byte[][] bArr = new byte[length][];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            try {
                if (objArr[i] == null) {
                    bArr[i] = new byte[0];
                } else if (objArr[i] instanceof Long) {
                    bArr[i] = String.valueOf(C165587tf.A0C(objArr, i)).getBytes(C19430v1.A0B);
                } else if (objArr[i] instanceof Integer) {
                    bArr[i] = String.valueOf(AnonymousClass000.A0I(objArr[i])).getBytes(C19430v1.A0B);
                } else if (objArr[i] instanceof byte[]) {
                    bArr[i] = objArr[i];
                } else if (objArr[i] instanceof String) {
                    bArr[i] = objArr[i].getBytes(C19430v1.A0B);
                } else {
                    throw AnonymousClass001.A08(C24611Dc.A01("PaymentPinHelper", "constructPayload: should only accept long, byte[], and String args"));
                }
                i2 += bArr[i].length;
                i++;
            } catch (UnsupportedEncodingException e) {
                C165577te.A1M("PaymentPinHelper", AnonymousClass000.A0l(e, " UTF-8 not supported: ", AnonymousClass000.A0u()));
                throw new Error(e);
            }
        }
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            byte[] bArr3 = bArr[i4];
            System.arraycopy(bArr3, 0, bArr2, i3, bArr3.length);
            i3 += bArr3.length;
        }
        return bArr2;
    }

    public C200959iX(AnonymousClass17Y r8, C19730wQ r9, C19600wD r10, C19970wo r11, C19630wG r12, C29221Vu r13, C29121Vk r14, AnonymousClass9SJ r15, C200049gU r16, AnonymousClass6VG r17, C196039Xk r18) {
        this.A04 = r12;
        this.A02 = r8;
        this.A06 = r15;
        this.A0A = r18;
        this.A03 = r10;
        this.A05 = r13;
        this.A09 = r17;
        C200049gU r5 = r16;
        this.A07 = r5;
        this.A00 = new C198799eD(r9, r11, r14);
        this.A01 = new AnonymousClass9SR(r12.A00, r8, r13, r14, r5, "PIN");
    }
}
