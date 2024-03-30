package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: X.3VA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3VA implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ C65373Ru A02;
    public final /* synthetic */ C33771fu A03;

    public /* synthetic */ AnonymousClass3VA(Activity activity, C65373Ru r2, C33771fu r3, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = activity;
        this.A03 = r3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C65373Ru r4 = this.A02;
        int i2 = this.A00;
        Activity activity = this.A01;
        C33771fu r2 = this.A03;
        C65373Ru.A01(r4, C36381kD.A0m(), 1, (long) i2, r4.A00.A01().getTime());
        AnonymousClass3SJ.A00(activity, 115);
        Intent A0C = C36431kI.A0C();
        A0C.setData(r2.A00());
        activity.startActivity(A0C);
    }
}
