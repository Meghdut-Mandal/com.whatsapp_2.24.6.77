package X;

import java.util.List;

/* renamed from: X.60s  reason: invalid class name and case insensitive filesystem */
public class C1256460s {
    public final /* synthetic */ C107795Qx A00;

    public C1256460s(C107795Qx r1) {
        this.A00 = r1;
    }

    public byte[] A00() {
        C107795Qx r2 = this.A00;
        C18740tg.A0C(r2.A00);
        List<Object> list = r2.A06;
        if (list.size() == 0) {
            return null;
        }
        int size = list.size();
        int i = r2.A03;
        byte[] bArr = new byte[(size * i)];
        int i2 = 0;
        for (Object arraycopy : list) {
            System.arraycopy(arraycopy, 0, bArr, i2, i);
            i2 += i;
        }
        return bArr;
    }
}
