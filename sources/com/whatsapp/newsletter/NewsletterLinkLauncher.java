package com.whatsapp.newsletter;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass00U;
import X.AnonymousClass012;
import X.AnonymousClass03N;
import X.AnonymousClass1GQ;
import X.AnonymousClass1SL;
import X.AnonymousClass3UC;
import X.AnonymousClass4PA;
import X.C003101g;
import X.C18740tg;
import X.C20810yC;
import X.C225314u;
import X.C24671Di;
import X.C24801Dv;
import X.C28641Tl;
import X.C28651Tm;
import X.C28661Tn;
import X.C28671To;
import X.C28681Tp;
import X.C28691Tq;
import X.C28701Tr;
import X.C28711Ts;
import X.C28981Uw;
import X.C32241dD;
import X.C51592o4;
import X.C86884Mq;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.ConditionVariable;
import java.lang.ref.WeakReference;

public final class NewsletterLinkLauncher implements C003101g {
    public AnonymousClass4PA A00;
    public final AnonymousClass1SL A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;
    public final AnonymousClass005 A07;
    public final AnonymousClass005 A08;
    public final AnonymousClass005 A09;
    public final AnonymousClass005 A0A;
    public final AnonymousClass005 A0B;
    public final AnonymousClass005 A0C;
    public final AnonymousClass005 A0D;
    public final AnonymousClass005 A0E;
    public final AnonymousClass005 A0F;
    public final AnonymousClass00T A0G = new AnonymousClass00U(new C28641Tl(this));
    public final AnonymousClass00T A0H = new AnonymousClass00U(new C28691Tq(this));
    public final AnonymousClass00T A0I = new AnonymousClass00U(new C28701Tr(this));
    public final AnonymousClass00T A0J = new AnonymousClass00U(new C28661Tn(this));
    public final AnonymousClass00T A0K = new AnonymousClass00U(new C28681Tp(this));
    public final AnonymousClass00T A0L = new AnonymousClass00U(new C28671To(this));
    public final AnonymousClass00T A0M = new AnonymousClass00U(new C28651Tm(this));

    public NewsletterLinkLauncher(AnonymousClass1SL r17, AnonymousClass005 r18, AnonymousClass005 r19, AnonymousClass005 r20, AnonymousClass005 r21, AnonymousClass005 r22, AnonymousClass005 r23, AnonymousClass005 r24, AnonymousClass005 r25, AnonymousClass005 r26, AnonymousClass005 r27, AnonymousClass005 r28, AnonymousClass005 r29, AnonymousClass005 r30, AnonymousClass005 r31) {
        AnonymousClass005 r14 = r18;
        AnonymousClass00C.A0D(r14, 1);
        AnonymousClass005 r13 = r19;
        AnonymousClass00C.A0D(r13, 2);
        AnonymousClass005 r12 = r20;
        AnonymousClass00C.A0D(r12, 3);
        AnonymousClass1SL r15 = r17;
        AnonymousClass00C.A0D(r15, 4);
        AnonymousClass005 r11 = r21;
        AnonymousClass00C.A0D(r11, 5);
        AnonymousClass005 r10 = r22;
        AnonymousClass00C.A0D(r10, 6);
        AnonymousClass005 r9 = r23;
        AnonymousClass00C.A0D(r9, 7);
        AnonymousClass005 r8 = r24;
        AnonymousClass00C.A0D(r8, 8);
        AnonymousClass005 r7 = r25;
        AnonymousClass00C.A0D(r7, 9);
        AnonymousClass005 r6 = r26;
        AnonymousClass00C.A0D(r6, 10);
        AnonymousClass005 r5 = r27;
        AnonymousClass00C.A0D(r5, 11);
        AnonymousClass005 r4 = r28;
        AnonymousClass00C.A0D(r4, 12);
        AnonymousClass005 r3 = r29;
        AnonymousClass00C.A0D(r3, 13);
        AnonymousClass005 r1 = r30;
        AnonymousClass00C.A0D(r1, 14);
        AnonymousClass005 r0 = r31;
        AnonymousClass00C.A0D(r0, 15);
        this.A02 = r14;
        this.A08 = r13;
        this.A05 = r12;
        this.A01 = r15;
        this.A0B = r11;
        this.A0C = r10;
        this.A03 = r9;
        this.A04 = r8;
        this.A0D = r7;
        this.A0A = r6;
        this.A09 = r5;
        this.A0F = r4;
        this.A07 = r3;
        this.A06 = r1;
        this.A0E = r0;
        ConditionVariable conditionVariable = C18740tg.A00;
    }

    public final void A00(Context context, Uri uri) {
        C225314u r4;
        AnonymousClass00C.A0D(context, 0);
        AnonymousClass00T r2 = this.A0I;
        AnonymousClass1GQ r1 = (AnonymousClass1GQ) r2.getValue();
        if (AnonymousClass1GQ.A02(r1, 3877) || AnonymousClass1GQ.A02(r1, 3878)) {
            ((C24671Di) this.A0H.getValue()).A07(context);
        } else if (!((AnonymousClass1GQ) r2.getValue()).A04()) {
            C24671Di r12 = (C24671Di) this.A0H.getValue();
            AnonymousClass00C.A08(r12);
            r12.A08(context, uri, C51592o4.CREATE, false);
        } else {
            Activity A002 = C24801Dv.A00(context);
            if ((A002 instanceof C225314u) && (r4 = (C225314u) A002) != null) {
                AnonymousClass3UC r3 = (AnonymousClass3UC) this.A0L.getValue();
                AnonymousClass00C.A08(r3);
                C20810yC r22 = r3.A02;
                String A092 = r22.A09(3834);
                AnonymousClass00C.A08(A092);
                int parseInt = Integer.parseInt(A092);
                String A093 = r22.A09(3835);
                AnonymousClass00C.A08(A093);
                r3.A07(r4, parseInt, Integer.parseInt(A093), false);
            }
        }
    }

    public final void A01(Context context, Uri uri, C28981Uw r21, C28711Ts r22, Long l, String str, int i, long j) {
        Context context2 = context;
        AnonymousClass00C.A0D(context2, 0);
        AnonymousClass00T r2 = this.A0I;
        if (AnonymousClass1GQ.A02((AnonymousClass1GQ) r2.getValue(), 3877)) {
            C24671Di r0 = (C24671Di) this.A0H.getValue();
            AnonymousClass00C.A08(r0);
            r0.A07(context2);
        } else if (!AnonymousClass1GQ.A01((AnonymousClass1GQ) r2.getValue(), 3877)) {
            C24671Di r1 = (C24671Di) this.A0H.getValue();
            AnonymousClass00C.A08(r1);
            r1.A08(context2, uri, C51592o4.VIEW, false);
        } else {
            Activity A002 = C24801Dv.A00(context2);
            AnonymousClass00C.A0E(A002, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
            C225314u r13 = (C225314u) A002;
            WeakReference weakReference = new WeakReference(r13);
            C28711Ts r4 = r22;
            int A003 = r4.A00();
            AnonymousClass3UC r12 = (AnonymousClass3UC) this.A0L.getValue();
            AnonymousClass00C.A08(r12);
            r12.A09(r13, (C28981Uw) null, (String) null, new C86884Mq(r21, r4, this, l, str, weakReference, i, j), A003);
        }
    }

    public final void A02(Context context, Uri uri, boolean z) {
        C225314u r3;
        AnonymousClass00C.A0D(context, 0);
        AnonymousClass00T r2 = this.A0I;
        AnonymousClass1GQ r1 = (AnonymousClass1GQ) r2.getValue();
        if (AnonymousClass1GQ.A02(r1, 3877) || AnonymousClass1GQ.A02(r1, 3879)) {
            ((C24671Di) this.A0H.getValue()).A07(context);
        } else if (!((AnonymousClass1GQ) r2.getValue()).A06()) {
            C24671Di r12 = (C24671Di) this.A0H.getValue();
            AnonymousClass00C.A08(r12);
            r12.A08(context, uri, C51592o4.DIRECTORY, false);
        } else {
            Activity A002 = C24801Dv.A00(context);
            if ((A002 instanceof C225314u) && (r3 = (C225314u) A002) != null) {
                AnonymousClass00T r22 = this.A0J;
                C32241dD r13 = (C32241dD) r22.getValue();
                int i = 3;
                if (z) {
                    r13.A05(5);
                    r13 = (C32241dD) r22.getValue();
                    i = 4;
                }
                r13.A06(i);
                AnonymousClass3UC r14 = (AnonymousClass3UC) this.A0L.getValue();
                AnonymousClass00C.A08(r14);
                r14.A0B(r3, true);
            }
        }
    }

    public final void A03(Context context, C28981Uw r12, C28711Ts r13, int i, long j) {
        AnonymousClass00C.A0D(context, 0);
        A01(context, (Uri) null, r12, r13, (Long) null, (String) null, i, j);
    }

    public /* synthetic */ void BVQ(AnonymousClass012 r1) {
    }

    public /* synthetic */ void BcJ(AnonymousClass012 r1) {
    }

    public /* synthetic */ void BfS(AnonymousClass012 r1) {
    }

    public /* synthetic */ void BhA(AnonymousClass012 r1) {
    }

    public void Bhq(AnonymousClass012 r2) {
        C225314u r22;
        AnonymousClass00C.A0D(r2, 0);
        if ((r2 instanceof C225314u) && (r22 = (C225314u) r2) != null) {
            A04(r22);
        }
    }

    public final void A04(C225314u r3) {
        AnonymousClass4PA r0 = this.A00;
        if (r0 != null) {
            r0.cancel();
            A05(r3);
            this.A06.get();
            try {
                r3.Bnv();
            } catch (Throwable th) {
                new AnonymousClass03N(th);
            }
        }
    }

    public final void A05(C225314u r3) {
        try {
            r3.A06.A05(this);
        } catch (Throwable th) {
            new AnonymousClass03N(th);
        }
    }
}
