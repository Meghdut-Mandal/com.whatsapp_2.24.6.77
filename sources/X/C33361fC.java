package X;

import android.view.ViewGroup;
import com.whatsapp.suggestions.SuggestionsEngine;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1fC  reason: invalid class name and case insensitive filesystem */
public final class C33361fC extends C33351fB {
    public C33371fD A00 = C33371fD.NOT_STARTED;
    public C33381fE A01 = new C33381fE(this);
    public boolean A02;
    public final AnonymousClass19J A03;
    public final C20810yC A04;
    public final SuggestionsEngine A05;
    public final C005502l A06;
    public final AnonymousClass040 A07;
    public final AnonymousClass01I A08;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C33361fC(X.AnonymousClass01I r16, X.AnonymousClass19J r17, X.AnonymousClass1NG r18, X.AnonymousClass16D r19, X.AnonymousClass171 r20, X.AnonymousClass16K r21, X.AnonymousClass1RY r22, com.whatsapp.conversationslist.ConversationsFragment r23, X.C18820ts r24, X.C20810yC r25, X.C21010yW r26, com.whatsapp.suggestions.SuggestionsEngine r27, X.C19770wU r28, X.C005502l r29, X.AnonymousClass040 r30) {
        /*
            r15 = this;
            r0 = 1
            r14 = r28
            X.AnonymousClass00C.A0D(r14, r0)
            r0 = 2
            r13 = r26
            X.AnonymousClass00C.A0D(r13, r0)
            r0 = 3
            r1 = r25
            X.AnonymousClass00C.A0D(r1, r0)
            r0 = 4
            r7 = r19
            X.AnonymousClass00C.A0D(r7, r0)
            r0 = 5
            r8 = r20
            X.AnonymousClass00C.A0D(r8, r0)
            r0 = 6
            r12 = r24
            X.AnonymousClass00C.A0D(r12, r0)
            r0 = 7
            r6 = r18
            X.AnonymousClass00C.A0D(r6, r0)
            r0 = 9
            r9 = r21
            X.AnonymousClass00C.A0D(r9, r0)
            r0 = 10
            r10 = r22
            X.AnonymousClass00C.A0D(r10, r0)
            r0 = 12
            r2 = r29
            X.AnonymousClass00C.A0D(r2, r0)
            r0 = 14
            r4 = r17
            X.AnonymousClass00C.A0D(r4, r0)
            r0 = 15
            r3 = r27
            X.AnonymousClass00C.A0D(r3, r0)
            r5 = r15
            r11 = r23
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.A04 = r1
            r0 = r16
            r15.A08 = r0
            r0 = r30
            r15.A07 = r0
            r15.A06 = r2
            r15.A03 = r4
            r15.A05 = r3
            X.1fD r0 = X.C33371fD.NOT_STARTED
            r15.A00 = r0
            X.1fE r0 = new X.1fE
            r0.<init>(r15)
            r15.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33361fC.<init>(X.01I, X.19J, X.1NG, X.16D, X.171, X.16K, X.1RY, com.whatsapp.conversationslist.ConversationsFragment, X.0ts, X.0yC, X.0yW, com.whatsapp.suggestions.SuggestionsEngine, X.0wU, X.02l, X.040):void");
    }

    public static final void A01(C33361fC r12, ArrayList arrayList, int i) {
        ViewGroup viewGroup;
        String str;
        if (r12.A00 != null) {
            AnonymousClass01I r2 = r12.A08;
            r12.A0B(r2, arrayList, i);
            if (arrayList.size() > 1 && (viewGroup = r12.A00) != null) {
                super.A0A(viewGroup, r2, arrayList, i);
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                StringBuilder sb4 = new StringBuilder();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass141 r10 = (AnonymousClass141) it.next();
                    String str2 = "0";
                    if (r10.A0o) {
                        str = "1";
                    } else {
                        str = "\\";
                    }
                    String str3 = str2;
                    if (r10.A0l) {
                        str3 = "1";
                    }
                    String str4 = str2;
                    if (r10.A0m) {
                        str4 = "1";
                    }
                    if (r10.A0g) {
                        str2 = "1";
                    }
                    sb.append(str);
                    sb2.append(str3);
                    sb3.append(str2);
                    sb4.append(str4);
                }
                AnonymousClass2QO r1 = new AnonymousClass2QO();
                r1.A02 = sb.toString();
                r1.A00 = sb2.toString();
                r1.A03 = sb3.toString();
                r1.A01 = sb4.toString();
                r12.A07.Bly(r1);
            }
        }
    }

    public void A08() {
        super.A08();
        this.A03.unregisterObserver(this.A01);
    }

    public AnonymousClass2RI A09(AnonymousClass141 r3, Long l, int i) {
        AnonymousClass2RI A09 = super.A09(r3, l, i);
        if (r3 != null) {
            A09.A01 = Boolean.valueOf(r3.A0m);
            A09.A00 = Boolean.valueOf(r3.A0l);
            A09.A02 = Boolean.valueOf(r3.A0o);
            A09.A03 = Boolean.valueOf(r3.A0g);
        }
        return A09;
    }
}
