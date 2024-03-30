package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: X.7vC  reason: invalid class name and case insensitive filesystem */
public class C166157vC extends ResultReceiver {
    public final /* synthetic */ AnonymousClass9JV A00;
    public final /* synthetic */ C202289lT A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166157vC(AnonymousClass9JV r2, C202289lT r3) {
        super((Handler) null);
        this.A01 = r3;
        this.A00 = r2;
    }

    public void onReceiveResult(int i, Bundle bundle) {
        C202289lT r6 = this.A01;
        AnonymousClass9JV r5 = this.A00;
        long j = r5.A01;
        Object[] A0L = AnonymousClass001.A0L();
        C90474aD.A1S(A0L, j);
        C200599hh.A02("id [%d]: release", A0L);
        r6.A0V.A02(j, false);
        C192379Gt r1 = r5.A00;
        if (r1 != null) {
            r1.A01.release();
            r1.A00.release();
        }
    }
}
