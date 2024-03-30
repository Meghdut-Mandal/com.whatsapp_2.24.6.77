package X;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.9g5  reason: invalid class name and case insensitive filesystem */
public class C199829g5 {
    public int A00;
    public int A01;
    public ArrayList A02;
    public Map A03;

    public C194619Ql A00(short s) {
        int intValue;
        Number A0b = C90524aI.A0b(Short.valueOf(s), this.A03);
        if (A0b == null || (intValue = A0b.intValue()) >= this.A00) {
            return null;
        }
        return (C194619Ql) this.A02.get(intValue);
    }

    public C199829g5(byte[] bArr) {
        int length = bArr.length;
        this.A03 = AnonymousClass001.A0J();
        int i = 0;
        this.A01 = 0;
        this.A00 = 0;
        ArrayList A0I = AnonymousClass001.A0I();
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        while (i < length) {
            short s = wrap.getShort();
            int A002 = C203439o1.A00(wrap);
            byte[] bArr2 = new byte[A002];
            wrap.get(bArr2);
            A0I.add(new C194619Ql(bArr2, s));
            C36421kH.A1M(Short.valueOf(s), this.A03, this.A00);
            this.A00++;
            i += A002 + 4;
        }
        if (i == length) {
            this.A01 = i;
            this.A02 = AnonymousClass001.A0I();
            this.A02 = C36441kJ.A15(A0I);
            return;
        }
        throw C165567td.A0E("Error while parsing extension", (byte) 80);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("extensions{extensions=");
        C90514aH.A1T(A0u, this.A02.toArray());
        A0u.append(", idx=");
        A0u.append(this.A00);
        A0u.append(", totalNetworkBytes=");
        A0u.append(this.A01);
        return AnonymousClass000.A0s(A0u);
    }

    public C199829g5() {
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = AnonymousClass001.A0I();
    }
}
