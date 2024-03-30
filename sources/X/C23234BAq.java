package X;

import java.security.Provider;
import java.security.Signature;

/* renamed from: X.BAq  reason: case insensitive filesystem */
public class C23234BAq implements B0K {
    public Object A00;
    public Object A01;
    public final int A02;

    public C23234BAq(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public Signature B4w(String str) {
        if (this.A02 != 0) {
            Provider provider = (Provider) this.A01;
            if (provider != null) {
                return Signature.getInstance(str, provider);
            }
            return Signature.getInstance(str);
        }
        Provider provider2 = (Provider) this.A01;
        String str2 = ((C21875Ac1) this.A00).A00;
        if (provider2 != null) {
            return Signature.getInstance(str2, provider2);
        }
        return Signature.getInstance(str2);
    }
}
