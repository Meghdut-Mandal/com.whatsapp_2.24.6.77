package X;

import android.content.SharedPreferences;

/* renamed from: X.3EB  reason: invalid class name */
public final class AnonymousClass3EB {
    public int A00;
    public final C19420v0 A01;
    public final boolean A02;
    public final /* synthetic */ C20100x1 A03;

    public synchronized void A00(int i) {
        SharedPreferences.Editor editor;
        int i2 = this.A00 - 1;
        this.A00 = i2;
        if (this.A02 && i2 == 0) {
            this.A03.A09.A03("account_sync", (Long) null);
        }
        if (i == 1) {
            editor = C19420v0.A00(this.A01).remove("account_sync_status_num_retries");
        } else if (i == 2) {
            editor = C19420v0.A00(this.A01).remove("account_sync_picture_num_retries");
        } else if (i == 3) {
            editor = C19420v0.A00(this.A01).remove("account_sync_privacy_num_retries");
        } else if (i == 4) {
            editor = C19420v0.A00(this.A01).remove("account_sync_blocklist_num_retries");
        } else if (i == 7) {
            editor = C19420v0.A00(this.A01).remove("account_sync_text_status_num_retries");
        }
        editor.apply();
    }

    public AnonymousClass3EB(C19420v0 r1, C20100x1 r2, int i, boolean z) {
        this.A03 = r2;
        this.A01 = r1;
        this.A00 = i;
        this.A02 = z;
    }
}
