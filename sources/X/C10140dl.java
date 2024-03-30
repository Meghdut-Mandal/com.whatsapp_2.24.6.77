package X;

import android.os.Bundle;

/* renamed from: X.0dl  reason: invalid class name and case insensitive filesystem */
public final class C10140dl implements C17610rh, C17620ri {
    public C17600rg A00;
    public final C06190Sq A01;
    public final boolean A02;

    public C10140dl(C06190Sq r1, boolean z) {
        this.A01 = r1;
        this.A02 = z;
    }

    public final void onConnected(Bundle bundle) {
        AnonymousClass006.A02(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.onConnected(bundle);
    }

    public final void onConnectionFailed(AnonymousClass0L0 r4) {
        AnonymousClass006.A02(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.Bxm(r4, this.A01, this.A02);
    }

    public final void onConnectionSuspended(int i) {
        AnonymousClass006.A02(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.onConnectionSuspended(i);
    }
}
