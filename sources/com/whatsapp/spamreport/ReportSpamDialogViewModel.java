package com.whatsapp.spamreport;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass08X;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass1A1;
import X.C001700s;
import X.C005502l;
import X.C1503274v;
import X.C18820ts;
import X.C20810yC;
import X.C220412q;
import X.C26151Jb;
import X.C32681e1;
import X.C32881eL;
import X.C36321k7;
import X.C36391kE;
import X.C36431kI;
import X.C63633Ku;
import android.app.Application;
import android.text.SpannableStringBuilder;

public final class ReportSpamDialogViewModel extends AnonymousClass08X {
    public final Application A00;
    public final C001700s A01 = C36431kI.A0S();
    public final C001700s A02 = C36431kI.A0S();
    public final AnonymousClass16D A03;
    public final AnonymousClass171 A04;
    public final C63633Ku A05;
    public final C18820ts A06;
    public final C26151Jb A07;
    public final C220412q A08;
    public final AnonymousClass17X A09;
    public final C20810yC A0A;
    public final C32881eL A0B;
    public final AnonymousClass1A1 A0C;
    public final C005502l A0D;
    public final C32681e1 A0E;

    public static final SpannableStringBuilder A01(ReportSpamDialogViewModel reportSpamDialogViewModel, int i) {
        C32681e1 r4 = reportSpamDialogViewModel.A0E;
        Application application = reportSpamDialogViewModel.A00;
        return r4.A02(application, new C1503274v(reportSpamDialogViewModel), C36391kE.A0v(application, "learn-more", AnonymousClass001.A0L(), 0, i), "learn-more");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.AnonymousClass11F r6, com.whatsapp.spamreport.ReportSpamDialogViewModel r7, X.C023509x r8) {
        /*
            boolean r0 = r8 instanceof X.C82523yq
            if (r0 == 0) goto L_0x0038
            r5 = r8
            X.3yq r5 = (X.C82523yq) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0038
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0024
            if (r0 != r3) goto L_0x003e
            X.AnonymousClass0AN.A00(r1)
        L_0x0020:
            X.AnonymousClass00C.A0A(r1)
            return r1
        L_0x0024:
            X.AnonymousClass0AN.A00(r1)
            X.02l r2 = r7.A0D
            r1 = 0
            com.whatsapp.spamreport.ReportSpamDialogViewModel$getContact$2 r0 = new com.whatsapp.spamreport.ReportSpamDialogViewModel$getContact$2
            r0.<init>(r6, r7, r1)
            r5.label = r3
            java.lang.Object r1 = X.AnonymousClass0A2.A00(r5, r2, r0)
            if (r1 != r4) goto L_0x0020
            return r4
        L_0x0038:
            X.3yq r5 = new X.3yq
            r5.<init>(r7, r8)
            goto L_0x0012
        L_0x003e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.spamreport.ReportSpamDialogViewModel.A02(X.11F, com.whatsapp.spamreport.ReportSpamDialogViewModel, X.09x):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogViewModel(Application application, AnonymousClass16D r3, AnonymousClass171 r4, C63633Ku r5, C18820ts r6, C26151Jb r7, C220412q r8, AnonymousClass17X r9, C20810yC r10, C32881eL r11, AnonymousClass1A1 r12, C32681e1 r13, C005502l r14) {
        super(application);
        C36321k7.A1B(application, r10, r13, r8, r3);
        C36321k7.A13(r11, r4, r6);
        AnonymousClass00C.A0D(r12, 10);
        C36321k7.A15(r5, r9, r14);
        this.A00 = application;
        this.A0A = r10;
        this.A0E = r13;
        this.A08 = r8;
        this.A03 = r3;
        this.A0B = r11;
        this.A04 = r4;
        this.A06 = r6;
        this.A07 = r7;
        this.A0C = r12;
        this.A05 = r5;
        this.A09 = r9;
        this.A0D = r14;
    }
}
