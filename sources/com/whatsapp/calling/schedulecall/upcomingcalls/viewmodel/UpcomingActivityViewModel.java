package com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass04R;
import X.AnonymousClass11F;
import X.AnonymousClass16D;
import X.AnonymousClass17X;
import X.AnonymousClass3KV;
import X.C144166rk;
import X.C144176rl;
import X.C1501574e;
import X.C159407jJ;
import X.C162797pA;
import X.C163677qa;
import X.C18820ts;
import X.C19730wQ;
import X.C19770wU;
import X.C19970wo;
import X.C233117z;
import X.C24511Cs;
import X.C26211Jh;
import X.C31031bA;
import X.C34661hR;
import X.C34831hi;
import X.C36441kJ;
import X.C90504aG;
import java.util.ArrayList;

public class UpcomingActivityViewModel extends AnonymousClass04R {
    public final C19730wQ A00;
    public final C18820ts A01;
    public final AnonymousClass17X A02;
    public final C34831hi A03 = C36441kJ.A0s(AnonymousClass001.A0I());
    public final C19770wU A04;
    public final AnonymousClass16D A05;
    public final C19970wo A06;
    public final C26211Jh A07;
    public final C24511Cs A08;
    public final C233117z A09;
    public final C34661hR A0A;
    public final C31031bA A0B;

    public static void A01(UpcomingActivityViewModel upcomingActivityViewModel, AnonymousClass11F r11, String str, int i, long j) {
        if (i != 0) {
            C34831hi r8 = upcomingActivityViewModel.A03;
            ArrayList A0t = C90504aG.A0t(r8);
            ArrayList A0I = AnonymousClass001.A0I();
            int i2 = 0;
            for (int i3 = 0; i3 < A0t.size(); i3++) {
                C159407jJ r2 = (C159407jJ) A0t.get(i3);
                if (r2 instanceof C144166rk) {
                    i2 = i3;
                } else {
                    C144176rl r10 = (C144176rl) r2;
                    if (r10.A01.A02 != j) {
                        AnonymousClass3KV r1 = r10.A01;
                        if (r1.A04.equals(r11)) {
                            if (!r1.A07.equals(str)) {
                            }
                        }
                    }
                    A0I.add(r2);
                    if (i3 - 1 == i2 && (i3 == A0t.size() - 1 || (A0t.get(i3 + 1) instanceof C144166rk))) {
                        A0I.add(A0t.get(i2));
                    }
                }
            }
            A0t.removeAll(A0I);
            r8.A0D(A0t);
            return;
        }
        upcomingActivityViewModel.A04.Bp1(new C1501574e(upcomingActivityViewModel, 23));
    }

    public void A0R() {
        this.A0B.unregisterObserver(this.A0A);
        this.A09.unregisterObserver(this.A08);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0082, code lost:
        if (r0.A0D(r4) != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008b, code lost:
        if (r2 < java.lang.System.currentTimeMillis()) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008d, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008e, code lost:
        r3 = new X.C121445t9();
        r3.A01 = r8;
        r2 = r5.A00;
        r0 = com.whatsapp.R.drawable.ic_action_call;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009b, code lost:
        if (r2 != 2) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009d, code lost:
        r0 = com.whatsapp.R.drawable.ic_action_videocall;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a0, code lost:
        r3.A00 = r0;
        r3.A02 = r4;
        r1 = new X.C1269866m();
        r1.A01 = r8;
        r1.A00 = r0;
        r1.A02 = r4;
        r6.add(new X.C144176rl(r1, r5, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        if (X.AnonymousClass6XI.A04(r7.getTimeInMillis(), r2) == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0S() {
        /*
            r13 = this;
            X.1Jh r0 = r13.A07
            java.util.ArrayList r0 = r0.A04()
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.Iterator r12 = r0.iterator()
            r7 = 0
        L_0x000f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r5 = r12.next()
            X.3KV r5 = (X.AnonymousClass3KV) r5
            long r2 = r5.A03
            if (r7 == 0) goto L_0x00b9
            long r0 = r7.getTimeInMillis()
            boolean r0 = X.AnonymousClass6XI.A04(r0, r2)
            if (r0 != 0) goto L_0x005b
        L_0x0029:
            r7.setTimeInMillis(r2)
            X.0ts r9 = r13.A01
            java.util.Locale r4 = X.C36401kF.A0x(r9)
            java.lang.String r1 = "EEEE"
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>(r1, r4)
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            java.lang.String r4 = r0.format(r8)
            java.util.Locale r1 = X.C36401kF.A0x(r9)
            r0 = 2
            java.text.DateFormat r0 = java.text.DateFormat.getDateInstance(r0, r1)
            java.lang.String r0 = r0.format(r8)
            X.6A0 r1 = new X.6A0
            r1.<init>(r4, r0)
            X.6rk r0 = new X.6rk
            r0.<init>(r1)
            r6.add(r0)
        L_0x005b:
            X.16D r0 = r13.A05
            X.11F r1 = r5.A04
            X.141 r9 = r0.A0D(r1)
            X.0ts r0 = r13.A01
            java.lang.String r8 = X.AnonymousClass3UM.A00(r0, r2)
            X.3Sl r0 = X.AnonymousClass147.A01
            X.147 r4 = X.C65533Sl.A03(r1)
            X.0wQ r1 = r13.A00
            com.whatsapp.jid.UserJid r0 = r5.A05
            boolean r0 = r1.A0M(r0)
            if (r0 != 0) goto L_0x0084
            X.17X r0 = r13.A02
            X.C18740tg.A06(r4)
            boolean r0 = r0.A0D(r4)
            if (r0 == 0) goto L_0x008d
        L_0x0084:
            long r10 = java.lang.System.currentTimeMillis()
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            r4 = 1
            if (r0 >= 0) goto L_0x008e
        L_0x008d:
            r4 = 0
        L_0x008e:
            X.5t9 r3 = new X.5t9
            r3.<init>()
            r3.A01 = r8
            int r2 = r5.A00
            r1 = 2
            r0 = 2131231779(0x7f080423, float:1.8079649E38)
            if (r2 != r1) goto L_0x00a0
            r0 = 2131231867(0x7f08047b, float:1.8079827E38)
        L_0x00a0:
            r3.A00 = r0
            r3.A02 = r4
            X.66m r1 = new X.66m
            r1.<init>()
            r1.A01 = r8
            r1.A00 = r0
            r1.A02 = r4
            X.6rl r0 = new X.6rl
            r0.<init>(r1, r5, r9)
            r6.add(r0)
            goto L_0x000f
        L_0x00b9:
            java.util.Calendar r7 = java.util.Calendar.getInstance()
            goto L_0x0029
        L_0x00bf:
            X.1hi r0 = r13.A03
            r0.A0C(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel.A0S():void");
    }

    public UpcomingActivityViewModel(C19730wQ r4, AnonymousClass16D r5, C19970wo r6, C18820ts r7, AnonymousClass17X r8, C26211Jh r9, C233117z r10, C31031bA r11, C19770wU r12) {
        C163677qa r2 = new C163677qa(this, 0);
        this.A0A = r2;
        C162797pA r1 = new C162797pA(this, 0);
        this.A08 = r1;
        this.A06 = r6;
        this.A00 = r4;
        this.A04 = r12;
        this.A05 = r5;
        this.A01 = r7;
        this.A07 = r9;
        this.A0B = r11;
        this.A02 = r8;
        this.A09 = r10;
        r11.registerObserver(r2);
        r10.registerObserver(r1);
    }
}
