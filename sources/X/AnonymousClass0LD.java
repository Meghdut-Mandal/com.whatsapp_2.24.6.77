package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.0LD  reason: invalid class name */
public final class AnonymousClass0LD extends AnonymousClass0ZQ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ Intent A02;

    public AnonymousClass0LD(Activity activity, Intent intent, int i) {
        this.A02 = intent;
        this.A01 = activity;
        this.A00 = i;
    }

    public final void A00() {
        Intent intent = this.A02;
        if (intent != null) {
            this.A01.startActivityForResult(intent, this.A00);
        }
    }
}
