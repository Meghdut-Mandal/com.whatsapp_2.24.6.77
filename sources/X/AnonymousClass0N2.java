package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;

/* renamed from: X.0N2  reason: invalid class name */
public final class AnonymousClass0N2 extends AnonymousClass0N3 implements C17610rh, C17620ri {
    public static final AnonymousClass0JC A07 = AnonymousClass0S3.A01;
    public C16830qA A00;
    public C17580re A01;
    public final Context A02;
    public final Handler A03;
    public final AnonymousClass0JC A04;
    public final AnonymousClass0TT A05;
    public final Set A06;

    public AnonymousClass0N2(Context context, Handler handler, AnonymousClass0TT r5) {
        AnonymousClass0JC r1 = A07;
        this.A02 = context;
        this.A03 = handler;
        this.A05 = r5;
        this.A06 = r5.A05;
        this.A04 = r1;
    }

    public final void Bxq(AnonymousClass0K9 r3) {
        this.A03.post(new C11570gX(this, r3));
    }

    public final void onConnected(Bundle bundle) {
        this.A01.Bxt(this);
    }

    public final void onConnectionFailed(AnonymousClass0L0 r2) {
        this.A00.Bxw(r2);
    }

    public final void onConnectionSuspended(int i) {
        this.A01.B5X();
    }
}
