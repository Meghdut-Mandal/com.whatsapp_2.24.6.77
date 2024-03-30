package X;

import java.util.HashMap;

/* renamed from: X.6vd  reason: invalid class name and case insensitive filesystem */
public class C146456vd implements C160107kT {
    public final /* synthetic */ C101334xN A00;
    public final /* synthetic */ AnonymousClass1ST A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ void BW4(long j) {
    }

    public C146456vd(C101334xN r1, AnonymousClass1ST r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public void BW6(boolean z) {
        C101334xN r1;
        AnonymousClass1ST r4 = this.A01;
        HashMap hashMap = r4.A0R;
        synchronized (hashMap) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("mediadownloadmanager/queueexpresspathdownload Download canceled for media job: ");
            r1 = this.A00;
            A0u.append(r1);
            A0u.append(" enc hash: ");
            String str = this.A02;
            C36321k7.A1a(A0u, str);
            hashMap.remove(str);
        }
        AnonymousClass1ST.A04(r4, r1.A0f);
    }

    public void BW7(C133136Wx r6, C129166Fp r7) {
        C101334xN r1;
        AnonymousClass1ST r4 = this.A01;
        HashMap hashMap = r4.A0R;
        synchronized (hashMap) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("mediadownloadmanager/queueexpresspathdownload Download finishes for media job: ");
            r1 = this.A00;
            C36321k7.A1N(r1, A0u);
            hashMap.remove(this.A02);
        }
        AnonymousClass1ST.A04(r4, r1.A0f);
    }
}
