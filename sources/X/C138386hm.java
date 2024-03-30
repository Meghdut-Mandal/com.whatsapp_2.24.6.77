package X;

import android.os.Bundle;

/* renamed from: X.6hm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C138386hm implements AnonymousClass05T {
    public final /* synthetic */ C134606bJ A00;
    public final /* synthetic */ AnonymousClass6NO A01;
    public final /* synthetic */ C134746bX A02;

    public /* synthetic */ C138386hm(C134606bJ r1, AnonymousClass6NO r2, C134746bX r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void BYP(String str, Bundle bundle) {
        AnonymousClass6NO r4 = this.A01;
        C134746bX r3 = this.A02;
        C134606bJ r2 = this.A00;
        C36331k8.A1G(str, 3, bundle);
        if (str.hashCode() == -661782138 && str.equals("text.option.selection.request.key")) {
            int i = bundle.getInt("text.option.selection.result");
            AnonymousClass6NO.A00(r4);
            r4.A05.BKz(r2, r3, i);
        }
    }
}
