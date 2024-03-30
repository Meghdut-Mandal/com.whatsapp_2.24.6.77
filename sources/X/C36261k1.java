package X;

import com.facebook.msys.mci.DefaultCrypto;
import com.facebook.msys.mci.DefaultUUID;
import com.facebook.msys.util.Provider;

/* renamed from: X.1k1  reason: invalid class name and case insensitive filesystem */
public class C36261k1 implements Provider {
    public Object A00;
    public final int A01;

    public C36261k1(C220812u r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object get() {
        if (this.A01 != 0) {
            return DefaultUUID.mUUID;
        }
        return DefaultCrypto.mCrypto;
    }
}
