package com.whatsapp.mediaview;

import X.AnonymousClass001;
import X.AnonymousClass0FM;
import X.AnonymousClass11F;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17V;
import X.AnonymousClass17X;
import X.AnonymousClass17Y;
import X.AnonymousClass185;
import X.AnonymousClass1A1;
import X.AnonymousClass1AW;
import X.AnonymousClass1CF;
import X.AnonymousClass1DW;
import X.AnonymousClass1EL;
import X.AnonymousClass1EO;
import X.AnonymousClass1H2;
import X.AnonymousClass1X4;
import X.AnonymousClass3O0;
import X.AnonymousClass3SH;
import X.AnonymousClass3T1;
import X.AnonymousClass3UJ;
import X.C18820ts;
import X.C19420v0;
import X.C19460v5;
import X.C19770wU;
import X.C19970wo;
import X.C20810yC;
import X.C21010yW;
import X.C220412q;
import X.C235618y;
import X.C36351kA;
import X.C36371kC;
import X.C36441kJ;
import X.C64933Qa;
import X.C87444Ov;
import X.C87454Ow;
import X.C88304Se;
import X.C89444Wo;
import X.C89954Yn;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class DeleteMessagesDialogFragment extends Hilt_DeleteMessagesDialogFragment {
    public C19460v5 A00;
    public AnonymousClass17Y A01;
    public AnonymousClass1X4 A02;
    public AnonymousClass16D A03;
    public AnonymousClass185 A04;
    public AnonymousClass171 A05;
    public C235618y A06;
    public C19970wo A07;
    public C19420v0 A08;
    public C220412q A09;
    public AnonymousClass17X A0A;
    public AnonymousClass1DW A0B;
    public AnonymousClass1H2 A0C;
    public C21010yW A0D;
    public AnonymousClass17V A0E;
    public AnonymousClass1EL A0F;
    public AnonymousClass1CF A0G;
    public AnonymousClass3O0 A0H;
    public AnonymousClass1AW A0I;
    public AnonymousClass1EO A0J;
    public AnonymousClass1A1 A0K;
    public C19770wU A0L;
    public final C88304Se A0M = new C89444Wo(this, 1);
    public final C87454Ow A0N = new C89954Yn(this, 4);

    public static DeleteMessagesDialogFragment A03(AnonymousClass11F r6, List list) {
        DeleteMessagesDialogFragment deleteMessagesDialogFragment = new DeleteMessagesDialogFragment();
        Bundle A072 = AnonymousClass001.A07();
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1.A0A(A0I2, it);
        }
        AnonymousClass3UJ.A0A(A072, A0I2);
        if (r6 != null) {
            C36371kC.A1B(A072, r6);
        }
        A072.putBoolean("is_revokable", true);
        deleteMessagesDialogFragment.A17(A072);
        return deleteMessagesDialogFragment;
    }

    public Dialog A1a(Bundle bundle) {
        ArrayList A052;
        Bundle bundle2 = this.A0A;
        if (!(bundle2 == null || A1D() == null || (A052 = AnonymousClass3UJ.A05(bundle2)) == null)) {
            LinkedHashSet A17 = C36441kJ.A17();
            Iterator it = A052.iterator();
            while (it.hasNext()) {
                AnonymousClass3T1 A032 = this.A0K.A03((C64933Qa) it.next());
                if (A032 != null) {
                    A17.add(A032);
                }
            }
            AnonymousClass11F A0i = C36351kA.A0i(bundle2, "jid");
            boolean z = bundle2.getBoolean("is_revokable");
            String A012 = AnonymousClass3SH.A01(A1D(), this.A03, this.A05, A0i, A17);
            Context A1D = A1D();
            C19970wo r28 = this.A07;
            C20810yC r27 = this.A02;
            AnonymousClass17Y r26 = this.A01;
            C19770wU r24 = this.A0L;
            C21010yW r21 = this.A0D;
            AnonymousClass1H2 r20 = this.A0C;
            AnonymousClass1X4 r22 = this.A02;
            AnonymousClass16D r23 = this.A03;
            AnonymousClass1DW r18 = this.A0B;
            AnonymousClass171 r25 = this.A05;
            C18820ts r17 = this.A01;
            C235618y r15 = this.A06;
            AnonymousClass1EL r14 = this.A0F;
            AnonymousClass1CF r13 = this.A0G;
            AnonymousClass17V r12 = this.A0E;
            C19460v5 r9 = this.A00;
            AnonymousClass185 r8 = this.A04;
            C19420v0 r7 = this.A08;
            AnonymousClass17X r6 = this.A0A;
            AnonymousClass3O0 r5 = this.A0H;
            C88304Se r4 = this.A0M;
            C87454Ow r3 = this.A0N;
            AnonymousClass1AW r2 = this.A0I;
            AnonymousClass1EO r1 = this.A0J;
            C19460v5 r172 = r9;
            AnonymousClass0FM A002 = AnonymousClass3SH.A00(A1D, r172, r4, (C87444Ov) null, r3, r26, r22, r23, r8, r25, r15, r28, r7, r17, this.A09, r6, r18, r20, r27, r21, r12, r14, r13, r5, r2, r1, r24, A012, A17, z);
            if (A002 != null) {
                return A002;
            }
        }
        A1c();
        return super.A1a(bundle);
    }
}
