package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3my  reason: invalid class name and case insensitive filesystem */
public class C75283my implements C160437l0 {
    public final /* synthetic */ C19720wP A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ void BUJ(String str) {
    }

    public C75283my(C19720wP r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public void BWo(String str) {
        C36321k7.A1P("app/CrashLogs/uploadCrashData/error received: ", str, AnonymousClass000.A0u());
        C19720wP.A08(this.A00, "upload-error-from-server", this.A01);
    }

    public void Bez(String str, Map map) {
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            A0y.next();
        }
    }

    public void BVA(long j) {
    }
}
