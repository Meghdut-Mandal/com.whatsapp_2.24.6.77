package X;

import android.content.Intent;
import android.content.IntentSender;

/* renamed from: X.0Tx  reason: invalid class name and case insensitive filesystem */
public final class C06520Tx {
    public int A00;
    public int A01;
    public Intent A02;
    public IntentSender A03;

    public C08770bI A00() {
        return new C08770bI(this.A02, this.A03, this.A00, this.A01);
    }

    public C06520Tx(IntentSender intentSender) {
        this.A03 = intentSender;
    }
}
