package X;

import android.content.Intent;
import android.content.IntentSender;

/* renamed from: X.0gu  reason: invalid class name and case insensitive filesystem */
public class C11730gu implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IntentSender.SendIntentException A01;
    public final /* synthetic */ AnonymousClass01X A02;

    public C11730gu(IntentSender.SendIntentException sendIntentException, AnonymousClass01X r2, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = sendIntentException;
    }

    public void run() {
        this.A02.A06(new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.A01), this.A00, 0);
    }
}
