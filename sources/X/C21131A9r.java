package X;

import com.whatsapp.util.Log;

/* renamed from: X.A9r  reason: case insensitive filesystem */
public class C21131A9r implements C27471Oi {
    public final /* synthetic */ C21159AAt A00;

    public void BJj(C192519Hh r4, String str, int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ContactQuerySync/result sid=");
        A0u.append(str);
        C36321k7.A1T(" index=", A0u, 0);
        this.A00.A0A.put(str, r4);
    }

    public C21131A9r(C21159AAt aAt) {
        this.A00 = aAt;
    }

    public void BJi(C108515Tu r5, String str, int i, int i2, long j) {
        if (j > 0) {
            C21159AAt aAt = this.A00;
            long A002 = C19970wo.A00(aAt.A07) + j;
            AnonymousClass1O6 r3 = aAt.A06;
            r3.A03(A002);
            if (i2 == 503) {
                Log.e("ContactQuerySync/handleSyncContactError need global backoff");
                r3.A02(A002);
            }
        }
    }

    public void BJk(int i, int i2, String str, long j) {
        throw AnonymousClass001.A0D();
    }
}
