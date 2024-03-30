package X;

import android.os.Message;

/* renamed from: X.73B  reason: invalid class name */
public final /* synthetic */ class AnonymousClass73B implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1NE A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ AnonymousClass73B(AnonymousClass1NE r1, String str, int i, boolean z) {
        this.A01 = r1;
        this.A03 = z;
        this.A00 = i;
        this.A02 = str;
    }

    public final void run() {
        AnonymousClass1NE r4 = this.A01;
        boolean z = this.A03;
        int i = this.A00;
        String str = this.A02;
        Message obtain = Message.obtain();
        obtain.arg1 = z ? 1 : 0;
        obtain.arg2 = i;
        obtain.obj = str;
        r4.A0A.A00(new C132636Up(obtain, "preview_call_link"));
    }
}
