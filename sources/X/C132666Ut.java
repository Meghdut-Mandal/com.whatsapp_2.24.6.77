package X;

import android.app.Activity;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Ut  reason: invalid class name and case insensitive filesystem */
public final class C132666Ut {
    public boolean A00;
    public final AnonymousClass17Y A01;
    public final AnonymousClass1UA A02;
    public final AnonymousClass1UC A03;
    public final C120405rS A04;
    public final C1025250j A05;
    public final AnonymousClass1U9 A06;
    public final AnonymousClass005 A07;

    public static final void A00(Activity activity, C132666Ut r5) {
        r5.A01.A0H(new C1501674f(activity, 2));
        C1025250j r52 = r5.A05;
        r52.A00.flowCancelAtPoint(r52.A00, "SEE_AC_LOAD_ERROR", "user_cancelled");
        r52.A00 = -1;
    }

    public static final void A01(AnonymousClass01L r18, AnonymousClass7fP r19, AnonymousClass33N r20, C132666Ut r21, String str, String str2, List list) {
        C132666Ut r6 = r21;
        C124395y7 r1 = (C124395y7) r6.A07.get();
        AnonymousClass01L r9 = r18;
        boolean A0A = AnonymousClass1RC.A0A(r9);
        StringBuilder A0i = C90524aI.A0i("{\"server_params\":{");
        Map map = r20.A00;
        Iterator A0y = AnonymousClass000.A0y(map);
        int i = 0;
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            String A0f = C90494aF.A0f(A11);
            String A10 = C90514aH.A10(A11);
            A0i.append("\"");
            A0i.append(A0f);
            AnonymousClass000.A1D("\":\"", A10, "\"", A0i);
            C90504aG.A1O(A0i, map, i);
            i++;
        }
        String A0q = AnonymousClass000.A0q("}}", A0i);
        AnonymousClass00C.A08(A0q);
        C142526p1 r0 = new C142526p1(r9, r19, r6);
        String str3 = str;
        AnonymousClass0YM.A02(str3, "App id cannot be null");
        AnonymousClass01z supportFragmentManager = r9.getSupportFragmentManager();
        C120335rL r15 = r1.A07;
        AnonymousClass65A r8 = new AnonymousClass65A(r9, supportFragmentManager, r1.A00, r1.A01, r1.A05, r1.A06, r15, str2, (Map) null, A0A);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C593333n r3 = (C593333n) it.next();
                r8.A00.put(r3.A00, r3.A01);
            }
        }
        r1.A04.A00(r9, r1.A02, r8);
        r1.A03.A03((C134906bn) null, new C163787ql(r9, r0, r1, r8, 0), (Boolean) null, str3, A0q, (String) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass01L r20, X.AnonymousClass7fP r21, X.AnonymousClass33N r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.util.List r27) {
        /*
            r19 = this;
            r8 = r22
            r10 = 0
            java.lang.String r1 = "flow"
            if (r22 != 0) goto L_0x000c
            X.33N r8 = new X.33N
            r8.<init>()
        L_0x000c:
            java.util.Map r0 = r8.A00
            r11 = r24
            r0.put(r1, r11)
            X.6p0 r7 = new X.6p0
            r6 = r19
            r0 = r21
            r7.<init>(r0, r6)
            java.lang.String r0 = "WfalLauncherProxy/launch Start Launching"
            X.AnonymousClass3TI.A01(r0)
            X.1UA r5 = r6.A02
            X.6P0 r4 = X.C113435fX.A00
            X.6OQ r0 = r5.A00(r4)
            if (r0 == 0) goto L_0x0157
            X.6c7 r0 = r0.A04
            java.lang.Object r0 = r0.A00
            X.C18740tg.A06(r0)
        L_0x0032:
            r2 = 0
            boolean r9 = X.AnonymousClass000.A1V(r0)
            X.1UC r0 = r6.A03
            r18 = r0
            java.lang.Boolean r0 = r18.A08()
            if (r0 == 0) goto L_0x0045
            boolean r2 = r0.booleanValue()
        L_0x0045:
            X.5rS r14 = r6.A04
            java.lang.String r12 = "entrypoint"
            boolean r0 = r14.A00
            if (r0 == 0) goto L_0x005b
            X.0zE r13 = r14.A01
            r3 = 551491402(0x20df174a, float:3.779308E-19)
            r1 = 87
            java.lang.String r0 = "MARKER_STARTED_BEFORE_PREVIOUS_ENDED"
            r13.BPH(r3, r3, r1, r0)
            r14.A00 = r10
        L_0x005b:
            X.0zE r3 = r14.A01
            r1 = 551491402(0x20df174a, float:3.779308E-19)
            r3.markerStart(r1, r1)
            java.lang.String r0 = "TRIGGER_OPEN"
            r3.markerPoint((int) r1, (int) r1, (java.lang.String) r0)
            r3.markerAnnotate((int) r1, (int) r1, (java.lang.String) r12, (java.lang.String) r11)
            java.lang.String r0 = "is_post_consent"
            r3.markerAnnotate((int) r1, (int) r1, (java.lang.String) r0, (boolean) r9)
            java.lang.String r0 = "is_paused"
            r3.markerAnnotate((int) r1, (int) r1, (java.lang.String) r0, (boolean) r2)
            X.50j r2 = r6.A05
            java.lang.String r0 = "com.bloks.www.fxcal.waffle.router.async"
            r9 = r23
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0153
            java.lang.String r13 = "TAP_XPOST_UPSELL"
        L_0x0083:
            r0 = 924663622(0x371d3f46, float:9.372661E-6)
            r2.A01()
            X.1UP r15 = r2.A00
            long r0 = X.C90474aD.A0A(r10, r0)
            r2.A00 = r0
            X.66V r14 = new X.66V
            r12 = r25
            r14.<init>(r12, r10)
            r15.B7S(r14, r0)
            X.1UP r14 = r2.A00
            long r0 = r2.A00
            r14.flowMarkPoint(r0, r13)
            int r0 = r11.hashCode()
            switch(r0) {
                case 554361336: goto L_0x0147;
                case 949197458: goto L_0x013b;
                case 975802643: goto L_0x012f;
                case 1709381253: goto L_0x0123;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            java.lang.String r1 = "UNSUPPORTED_FLOW"
        L_0x00ab:
            java.lang.String r0 = "flow_type"
            r2.A02(r0, r1)
            java.lang.String r0 = "ui_entrypoint"
            r2.A02(r0, r12)
            java.lang.String r0 = "bloks_app_id"
            r2.A02(r0, r9)
            java.lang.String r0 = "wa_crosspost_status_privacy_settings"
            if (r11 != r0) goto L_0x00d4
            boolean r0 = r18.A0B()
            if (r0 != 0) goto L_0x0115
            X.6Oy r11 = new X.6Oy
            r11.<init>(r10, r10)
        L_0x00c9:
            boolean r0 = r11.A00
            if (r0 == 0) goto L_0x0112
            java.lang.String r1 = "on"
        L_0x00cf:
            java.lang.String r0 = "init_autoshare_state"
            r2.A02(r0, r1)
        L_0x00d4:
            r6.A00 = r10
            X.17Y r10 = r6.A01
            r0 = 3
            X.74f r2 = new X.74f
            r2.<init>(r6, r0)
            r0 = 400(0x190, double:1.976E-321)
            r10.A0I(r2, r0)
            r1 = 551491402(0x20df174a, float:3.779308E-19)
            java.lang.String r0 = "FETCH_ASYNC_ACTION"
            r3.markerPoint((int) r1, (int) r1, (java.lang.String) r0)
            r2 = 1
            java.lang.String r0 = "com.bloks.www.fxcal.playground.whatsapp_link"
            boolean r0 = r0.equals(r9)
            r11 = r20
            r16 = r26
            r17 = r27
            if (r0 != 0) goto L_0x015a
            X.6OQ r0 = r5.A00(r4)
            if (r0 == 0) goto L_0x010a
            java.lang.Boolean r1 = r18.A08()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            if (r1 != r0) goto L_0x015a
        L_0x010a:
            r15 = r9
            r13 = r8
            r14 = r6
            r12 = r7
            A01(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0112:
            java.lang.String r1 = "off"
            goto L_0x00cf
        L_0x0115:
            boolean r1 = X.AnonymousClass1UC.A04(r18)
            boolean r0 = X.AnonymousClass1UC.A05(r18)
            X.6Oy r11 = new X.6Oy
            r11.<init>(r1, r0)
            goto L_0x00c9
        L_0x0123:
            java.lang.String r0 = "wa_crosspost_new_status"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x00a9
            java.lang.String r1 = "LINKING_FLOW"
            goto L_0x00ab
        L_0x012f:
            java.lang.String r0 = "wa_crosspost_status_privacy_settings"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x00a9
            java.lang.String r1 = "STATUS_PRIVACY_SETTINGS_FLOW"
            goto L_0x00ab
        L_0x013b:
            java.lang.String r0 = "wa_crosspost_existing_status"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x00a9
            java.lang.String r1 = "CAL_FLOW"
            goto L_0x00ab
        L_0x0147:
            java.lang.String r0 = "wa_settings"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x00a9
            java.lang.String r1 = "AC_ENTRY_FLOW"
            goto L_0x00ab
        L_0x0153:
            java.lang.String r13 = "TAP_AL_ENTRY_POINT"
            goto L_0x0083
        L_0x0157:
            r0 = 0
            goto L_0x0032
        L_0x015a:
            X.1U9 r0 = r6.A06
            X.6u2 r10 = new X.6u2
            r15 = r9
            r13 = r8
            r14 = r6
            r12 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r0.A01(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132666Ut.A02(X.01L, X.7fP, X.33N, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void");
    }

    public C132666Ut(AnonymousClass17Y r1, AnonymousClass1UA r2, AnonymousClass1UC r3, C120405rS r4, C1025250j r5, AnonymousClass1U9 r6, AnonymousClass005 r7) {
        C36321k7.A18(r1, r3, r7, r2);
        C36321k7.A10(r5, r4);
        this.A01 = r1;
        this.A03 = r3;
        this.A07 = r7;
        this.A02 = r2;
        this.A06 = r6;
        this.A05 = r5;
        this.A04 = r4;
    }
}
