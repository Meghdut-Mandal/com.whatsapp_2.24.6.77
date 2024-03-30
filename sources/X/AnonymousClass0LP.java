package X;

import java.lang.ref.WeakReference;

/* renamed from: X.0LP  reason: invalid class name */
public abstract class AnonymousClass0LP extends AnonymousClass0LQ {
    public static final WeakReference A01 = AnonymousClass001.A0F((Object) null);
    public WeakReference A00 = A01;

    public final byte[] A03() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.A00.get();
            if (bArr == null) {
                bArr = A04();
                this.A00 = AnonymousClass001.A0F(bArr);
            }
        }
        return bArr;
    }

    public abstract byte[] A04();

    public AnonymousClass0LP(byte[] bArr) {
        super(bArr);
    }
}
