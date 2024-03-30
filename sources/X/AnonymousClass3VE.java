package X;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.HashSet;

/* renamed from: X.3VE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3VE implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass17Y A01;
    public final /* synthetic */ AnonymousClass1X4 A02;
    public final /* synthetic */ AnonymousClass3T1 A03;
    public final /* synthetic */ C19770wU A04;

    public /* synthetic */ AnonymousClass3VE(Activity activity, AnonymousClass17Y r2, AnonymousClass1X4 r3, AnonymousClass3T1 r4, C19770wU r5) {
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass3T1 r2 = this.A03;
        C19770wU r1 = this.A04;
        AnonymousClass1X4 r4 = this.A02;
        AnonymousClass17Y r3 = this.A01;
        Activity activity = this.A00;
        AnonymousClass00C.A0D(dialogInterface, 5);
        HashSet A16 = C36441kJ.A16();
        A16.add(r2);
        r1.Boy(new C1503474x((Object) r3, (Object) r4, (Object) A16, (Object) activity, 42));
        dialogInterface.dismiss();
    }
}
