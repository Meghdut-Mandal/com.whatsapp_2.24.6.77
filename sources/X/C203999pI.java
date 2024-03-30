package X;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;

/* renamed from: X.9pI  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C203999pI implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Uri A01;
    public final /* synthetic */ AnonymousClass9c5 A02;

    public /* synthetic */ C203999pI(Context context, Uri uri, AnonymousClass9c5 r3) {
        this.A02 = r3;
        this.A00 = context;
        this.A01 = uri;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass9c5 r3 = this.A02;
        r3.A00.A06(this.A00, C36391kE.A0G(this.A01));
    }
}
