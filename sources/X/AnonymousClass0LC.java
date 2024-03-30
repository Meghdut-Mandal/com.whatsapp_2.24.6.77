package X;

import android.content.Intent;

/* renamed from: X.0LC  reason: invalid class name */
public final class AnonymousClass0LC extends AnonymousClass0ZQ {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ C17270r0 A01;

    public AnonymousClass0LC(Intent intent, C17270r0 r2) {
        this.A00 = intent;
        this.A01 = r2;
    }

    public final void A00() {
        Intent intent = this.A00;
        if (intent != null) {
            this.A01.startActivityForResult(intent, 2);
        }
    }
}
