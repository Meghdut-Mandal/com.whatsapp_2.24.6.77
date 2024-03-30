package X;

import android.content.DialogInterface;

/* renamed from: X.3VJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3VJ implements DialogInterface.OnClickListener {
    public final /* synthetic */ C225314u A00;
    public final /* synthetic */ AnonymousClass3DY A01;
    public final /* synthetic */ AnonymousClass1CF A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public /* synthetic */ AnonymousClass3VJ(C225314u r1, AnonymousClass3DY r2, AnonymousClass1CF r3, Runnable runnable, String str, String str2) {
        this.A00 = r1;
        this.A03 = runnable;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = str;
        this.A05 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C225314u r6 = this.A00;
        Runnable runnable = this.A03;
        AnonymousClass3DY r5 = this.A01;
        AnonymousClass1CF r1 = this.A02;
        String str = this.A04;
        String str2 = this.A05;
        AnonymousClass3SJ.A00(r6, 124);
        if (runnable != null) {
            runnable.run();
        }
        boolean A002 = r1.A00();
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass000.A1D("blocked +", str, str2, A0u);
        AnonymousClass3DY.A00(r6, r5, A0u.toString(), A002);
    }
}
