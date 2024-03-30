package X;

import android.content.DialogInterface;

/* renamed from: X.3VH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3VH implements DialogInterface.OnClickListener {
    public final /* synthetic */ C24801Dv A00;
    public final /* synthetic */ C225314u A01;
    public final /* synthetic */ AnonymousClass4P4 A02;
    public final /* synthetic */ C33751fs A03;
    public final /* synthetic */ C20380xT A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ AnonymousClass3VH(C24801Dv r1, C225314u r2, AnonymousClass4P4 r3, C33751fs r4, C20380xT r5, boolean z) {
        this.A02 = r3;
        this.A05 = z;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass4P4 r5 = this.A02;
        boolean z = this.A05;
        C33751fs r4 = this.A03;
        C225314u r3 = this.A01;
        C20380xT r2 = this.A04;
        C24801Dv r1 = this.A00;
        r5.BeZ();
        if (!z) {
            r4.A01(r3, "how-to-delete-messages");
        } else {
            r1.A06(r3, C36381kD.A0F(r2.A02("251090924134584")));
        }
    }
}
