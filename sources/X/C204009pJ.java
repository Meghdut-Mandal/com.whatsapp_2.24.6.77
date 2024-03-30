package X;

import android.content.DialogInterface;

/* renamed from: X.9pJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C204009pJ implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass155 A00;
    public final /* synthetic */ AH2 A01;
    public final /* synthetic */ C23043B1o A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C204009pJ(AnonymousClass155 r1, AH2 ah2, C23043B1o b1o, String str) {
        this.A01 = ah2;
        this.A02 = b1o;
        this.A03 = str;
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AH2 ah2 = this.A01;
        C23043B1o b1o = this.A02;
        String str = this.A03;
        AnonymousClass155 r3 = this.A00;
        C21302AGg aGg = ah2.A02;
        aGg.A0O.A03(b1o, aGg.A08, 17);
        r3.startActivity(C36331k8.A04(str));
    }
}
