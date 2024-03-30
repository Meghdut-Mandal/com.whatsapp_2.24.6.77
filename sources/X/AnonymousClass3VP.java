package X;

import android.content.Context;
import android.content.DialogInterface;
import com.whatsapp.R;
import java.util.Set;

/* renamed from: X.3VP  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3VP implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C88304Se A03;
    public final /* synthetic */ C87454Ow A04;
    public final /* synthetic */ AnonymousClass1X4 A05;
    public final /* synthetic */ C19420v0 A06;
    public final /* synthetic */ AnonymousClass1DW A07;
    public final /* synthetic */ C21010yW A08;
    public final /* synthetic */ AnonymousClass17V A09;
    public final /* synthetic */ AnonymousClass11F A0A;
    public final /* synthetic */ AnonymousClass3O0 A0B;
    public final /* synthetic */ AnonymousClass1AW A0C;
    public final /* synthetic */ AnonymousClass1EO A0D;
    public final /* synthetic */ Integer A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ Set A0G;
    public final /* synthetic */ boolean A0H;
    public final /* synthetic */ boolean A0I;

    public /* synthetic */ AnonymousClass3VP(Context context, C88304Se r3, C87454Ow r4, AnonymousClass1X4 r5, C19420v0 r6, AnonymousClass1DW r7, C21010yW r8, AnonymousClass17V r9, AnonymousClass11F r10, AnonymousClass3O0 r11, AnonymousClass1AW r12, AnonymousClass1EO r13, Integer num, String str, Set set, int i, int i2, boolean z, boolean z2) {
        this.A03 = r3;
        this.A0H = z;
        this.A0I = z2;
        this.A06 = r6;
        this.A01 = i;
        this.A02 = context;
        this.A0F = str;
        this.A0B = r11;
        this.A08 = r8;
        this.A07 = r7;
        this.A09 = r9;
        this.A0G = set;
        this.A0C = r12;
        this.A0D = r13;
        this.A05 = r5;
        this.A04 = r4;
        this.A0A = r10;
        this.A0E = num;
        this.A00 = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C88304Se r14 = this.A03;
        boolean z = this.A0H;
        boolean z2 = this.A0I;
        C19420v0 r11 = this.A06;
        int i2 = this.A01;
        Context context = this.A02;
        String str = this.A0F;
        AnonymousClass3O0 r7 = this.A0B;
        C21010yW r28 = this.A08;
        AnonymousClass1DW r18 = this.A07;
        AnonymousClass17V r17 = this.A09;
        Set set = this.A0G;
        AnonymousClass1AW r5 = this.A0C;
        AnonymousClass1EO r4 = this.A0D;
        AnonymousClass1X4 r3 = this.A05;
        C87454Ow r2 = this.A04;
        AnonymousClass11F r1 = this.A0A;
        Integer num = this.A0E;
        int i3 = this.A00;
        r14.BeZ();
        if (z != z2) {
            C36331k8.A0w(C19420v0.A00(r11), "pref_delete_media", z);
        }
        if (i2 >= 1) {
            C18740tg.A06(str);
            String A0v = C36391kE.A0v(context, str, new Object[1], 0, R.string.f12nameremoved);
            if (r7.A03 && r7.A00 == 3) {
                r7.A00 = 4;
                AnonymousClass3O0.A00(r7, 5);
            }
            C87454Ow r15 = r2;
            AnonymousClass1X4 r16 = r3;
            AnonymousClass1DW r172 = r18;
            C21010yW r182 = r28;
            AnonymousClass3BA r13 = new AnonymousClass3BA(r14, r15, r16, r172, r182, r17, r1, r7, r5, r4, num, set, i3, z);
            C39001qm A002 = AnonymousClass3LW.A00(context);
            AnonymousClass4XL A003 = AnonymousClass4XL.A00(r13, 12);
            AnonymousClass3VW r12 = AnonymousClass3VW.A00;
            A002.A0Z(A0v);
            C36401kF.A11(A003, r12, A002, R.string.f12nameremoved);
            A002.A0a(true);
            C36341k9.A11(A002);
            return;
        }
        AnonymousClass3SH.A02(r18, r28, r17, r5, r4, set, 1);
        r3.A0d(set, z);
        if (r7.A03 && r7.A00 == 3) {
            r7.A00 = 5;
            AnonymousClass3O0.A00(r7, 3);
        }
        r2.BVJ();
        if (num != null) {
            r14.Bgh(r1, num.intValue());
        }
    }
}
