package X;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.6Yy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C133546Yy implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass1Z2 A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C133546Yy(Context context, AnonymousClass1Z2 r2, Runnable runnable, String str) {
        this.A01 = r2;
        this.A03 = str;
        this.A00 = context;
        this.A02 = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass1Z2 r1 = this.A01;
        String str = this.A03;
        Context context = this.A00;
        Runnable runnable = this.A02;
        r1.A01.A0E(context, str, (String) null, (AnonymousClass00S) null, 1, false, false, false);
        if (runnable != null) {
            runnable.run();
        }
    }
}
