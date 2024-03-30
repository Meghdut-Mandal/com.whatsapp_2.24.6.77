package X;

import android.text.TextUtils;

/* renamed from: X.01V  reason: invalid class name */
public class AnonymousClass01V implements Runnable {
    public final /* synthetic */ AnonymousClass01G A00;

    public AnonymousClass01V(AnonymousClass01G r1) {
        this.A00 = r1;
    }

    public void run() {
        try {
            AnonymousClass01V.super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        }
    }
}
