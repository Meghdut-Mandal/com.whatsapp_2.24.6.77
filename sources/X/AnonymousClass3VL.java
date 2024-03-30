package X;

import android.content.DialogInterface;

/* renamed from: X.3VL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3VL implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass17Y A00;
    public final /* synthetic */ AnonymousClass1XY A01;
    public final /* synthetic */ AnonymousClass1X4 A02;
    public final /* synthetic */ C20310xM A03;
    public final /* synthetic */ C26171Jd A04;
    public final /* synthetic */ C590032g A05;
    public final /* synthetic */ C19770wU A06;

    public /* synthetic */ AnonymousClass3VL(AnonymousClass17Y r1, AnonymousClass1XY r2, AnonymousClass1X4 r3, C20310xM r4, C26171Jd r5, C590032g r6, C19770wU r7) {
        this.A05 = r6;
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = r7;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C590032g r0 = this.A05;
        AnonymousClass17Y r7 = this.A00;
        AnonymousClass1XY r8 = this.A01;
        C19770wU r2 = this.A06;
        AnonymousClass1X4 r9 = this.A02;
        C20310xM r6 = this.A03;
        C26171Jd r5 = this.A04;
        for (Object r4 : r0.A00) {
            r2.Boy(new AnonymousClass75A(r4, r5, r6, r7, r8, r9, 12));
        }
        dialogInterface.dismiss();
    }
}
