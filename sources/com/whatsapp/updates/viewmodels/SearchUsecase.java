package com.whatsapp.updates.viewmodels;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass08S;
import X.AnonymousClass098;
import X.AnonymousClass099;
import X.AnonymousClass11F;
import X.AnonymousClass16D;
import X.AnonymousClass2YD;
import X.AnonymousClass3JR;
import X.AnonymousClass3UC;
import X.AnonymousClass4EV;
import X.AnonymousClass4UA;
import X.AnonymousClass4YZ;
import X.AnonymousClass8fQ;
import X.C001700s;
import X.C005502l;
import X.C023409w;
import X.C178228fO;
import X.C20810yC;
import X.C21854Abe;
import X.C30131Zi;
import X.C32241dD;
import X.C36321k7;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C44072La;
import X.C48022gZ;
import X.C48142gm;
import X.C51902oZ;
import X.C61863Ds;
import X.C65963Ud;
import X.C86464La;
import java.util.ArrayList;
import java.util.List;

public final class SearchUsecase implements AnonymousClass4UA {
    public AnonymousClass11F A00;
    public AnonymousClass2YD A01;
    public C61863Ds A02;
    public CharSequence A03;
    public final AnonymousClass08S A04;
    public final C001700s A05;
    public final AnonymousClass16D A06;
    public final C20810yC A07;
    public final C30131Zi A08;
    public final C32241dD A09;
    public final AnonymousClass3UC A0A;
    public final AnonymousClass00T A0B = C36431kI.A1I(new AnonymousClass4EV(this));
    public final C005502l A0C;

    public final void A04(C44072La r8) {
        AnonymousClass00C.A0D(r8, 0);
        C001700s r5 = this.A05;
        List<C48142gm> A0w = C36401kF.A0w(r5);
        if (A0w != null) {
            ArrayList A0J = C36321k7.A0J(A0w);
            for (C48142gm r2 : A0w) {
                if (AnonymousClass00C.A0J(r2.A02.A0J(), r8.A0J())) {
                    r2 = new C48142gm(r8, r2.A00, false);
                }
                A0J.add(r2);
            }
            r5.A0C(A0J);
        }
    }

    public /* synthetic */ void BWf(C21854Abe abe, String str) {
    }

    public void Bmz(String str, List list) {
        AnonymousClass00C.A0D(list, 0);
        C001700s r5 = this.A05;
        ArrayList<C44072La> A0I = AnonymousClass001.A0I();
        for (Object next : list) {
            if (((C44072La) next).A0N()) {
                A0I.add(next);
            }
        }
        ArrayList A0J = C36321k7.A0J(A0I);
        for (C44072La r2 : A0I) {
            A0J.add(new C48142gm(r2, this.A06.A0D(r2.A0J()), false));
        }
        r5.A0C(A0J);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.updates.viewmodels.SearchUsecase r8, X.C023509x r9) {
        /*
            boolean r0 = r9 instanceof X.C82653z3
            if (r0 == 0) goto L_0x0066
            r6 = r9
            X.3z3 r6 = (X.C82653z3) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0066
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r7 = 1
            if (r0 == 0) goto L_0x0023
            if (r0 != r7) goto L_0x006c
            X.AnonymousClass0AN.A00(r1)
        L_0x0020:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0023:
            X.AnonymousClass0AN.A00(r1)
            X.2YD r0 = r8.A01
            if (r0 == 0) goto L_0x002d
            r0.cancel()
        L_0x002d:
            X.3Ds r0 = r8.A02
            if (r0 == 0) goto L_0x0037
            java.lang.Object r1 = r0.A01
            monitor-enter(r1)
            r0.A00 = r7     // Catch:{ all -> 0x0071 }
            monitor-exit(r1)
        L_0x0037:
            java.lang.String r0 = r8.A03()
            X.3Ds r4 = new X.3Ds
            r4.<init>(r0)
            r8.A02 = r4
            r0 = 0
            X.0tG r3 = new X.0tG
            r3.<init>(r4, r0)
            r0 = 0
            com.whatsapp.updates.viewmodels.SearchUsecase$fetchRemoteNewsletterResults$2$1 r1 = new com.whatsapp.updates.viewmodels.SearchUsecase$fetchRemoteNewsletterResults$2$1
            r1.<init>(r8, r0)
            r0 = 5
            X.0tH r2 = new X.0tH
            r2.<init>((X.C009003v) r1, (X.AnonymousClass05H) r3, (int) r0)
            r1 = 21
            X.4Z8 r0 = new X.4Z8
            r0.<init>(r8, r1)
            r6.L$0 = r4
            r6.label = r7
            java.lang.Object r0 = r2.B36(r6, r0)
            if (r0 != r5) goto L_0x0020
            return r5
        L_0x0066:
            X.3z3 r6 = new X.3z3
            r6.<init>(r8, r9)
            goto L_0x0012
        L_0x006c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0071:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.viewmodels.SearchUsecase.A00(com.whatsapp.updates.viewmodels.SearchUsecase, X.09x):java.lang.Object");
    }

    public static final void A02(C51902oZ r3, SearchUsecase searchUsecase, boolean z) {
        List A0w;
        AnonymousClass08S r2 = searchUsecase.A04;
        if (r2.A04() != null && (A0w = C36401kF.A0w(searchUsecase.A05)) != null) {
            r2.A0C(new AnonymousClass3JR(r3, A0w, z));
        }
    }

    public final String A03() {
        String obj;
        CharSequence charSequence = this.A03;
        if (charSequence == null || (obj = charSequence.toString()) == null) {
            return "";
        }
        return obj;
    }

    public final boolean A05() {
        CharSequence charSequence = this.A03;
        if (charSequence == null || !(!AnonymousClass098.A06(charSequence))) {
            return false;
        }
        return true;
    }

    public void BWe(C21854Abe abe) {
        C51902oZ r1;
        if (abe instanceof C178228fO) {
            r1 = C51902oZ.ERROR_CONNECTION;
        } else if (abe instanceof AnonymousClass8fQ) {
            r1 = C51902oZ.ERROR_SERVER;
        } else {
            r1 = C51902oZ.ERROR_UNKNOWN;
        }
        A02(r1, this, false);
    }

    public SearchUsecase(AnonymousClass16D r7, C20810yC r8, C30131Zi r9, C32241dD r10, AnonymousClass3UC r11, C005502l r12) {
        C36321k7.A1B(r8, r10, r7, r9, r11);
        AnonymousClass00C.A0D(r12, 6);
        this.A07 = r8;
        this.A09 = r10;
        this.A06 = r7;
        this.A08 = r9;
        this.A0A = r11;
        this.A0C = r12;
        C51902oZ r5 = C51902oZ.DONE;
        C001700s A0S = C36431kI.A0S();
        this.A05 = A0S;
        AnonymousClass08S A0Y = C36441kJ.A0Y();
        this.A04 = A0Y;
        C023409w r2 = C023409w.A00;
        A0S.A0D(r2);
        A0Y.A0D(new AnonymousClass3JR(r5, r2, false));
        C65963Ud.A02(A0S, A0Y, new C86464La(this), 38);
    }

    public static final List A01(SearchUsecase searchUsecase, List list) {
        ArrayList A0I = AnonymousClass001.A0I();
        for (Object next : list) {
            String A0J = ((C48022gZ) next).A00.A0J();
            if (A0J != null && AnonymousClass099.A0O(A0J, searchUsecase.A03(), true)) {
                A0I.add(next);
            }
        }
        return AnonymousClass4YZ.A00(A0I, searchUsecase, 14);
    }
}
