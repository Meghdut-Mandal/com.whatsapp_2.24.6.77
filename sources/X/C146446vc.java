package X;

import java.util.HashMap;

/* renamed from: X.6vc  reason: invalid class name and case insensitive filesystem */
public class C146446vc implements C160107kT {
    public final /* synthetic */ AnonymousClass1ST A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ void BW4(long j) {
    }

    public C146446vc(AnonymousClass1ST r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public void BW6(boolean z) {
        HashMap hashMap = this.A00.A0Q;
        synchronized (hashMap) {
            hashMap.remove(this.A01);
        }
    }

    public void BW7(C133136Wx r3, C129166Fp r4) {
        HashMap hashMap = this.A00.A0Q;
        synchronized (hashMap) {
            hashMap.remove(this.A01);
        }
    }
}
