package X;

import android.content.Intent;

/* renamed from: X.0ca  reason: invalid class name and case insensitive filesystem */
public final class C09570ca implements C17050qd {
    public final int A00;
    public final Intent A01;
    public final /* synthetic */ AnonymousClass0DY A02;

    public C09570ca(Intent intent, AnonymousClass0DY r2, int i) {
        this.A02 = r2;
        this.A01 = intent;
        this.A00 = i;
    }

    public void B3D() {
        this.A02.stopSelf(this.A00);
    }

    public Intent getIntent() {
        return this.A01;
    }
}
