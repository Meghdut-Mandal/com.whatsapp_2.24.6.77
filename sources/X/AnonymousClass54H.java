package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.54H  reason: invalid class name */
public final class AnonymousClass54H extends AnonymousClass54I {
    public final C130876Mt A00;
    public final C199439fJ A01;
    public final C20310xM A02;
    public final AnonymousClass1A1 A03;
    public final AnonymousClass1K9 A04;
    public final C63553Km A05;
    public final AnonymousClass1KK A06;
    public final C1255460h A07;
    public final C18820ts A08;
    public final C20810yC A09;
    public final C203639oR A0A;
    public final AnonymousClass1L4 A0B;

    public String A05() {
        return "address_message";
    }

    public String A06(Context context, C206969uL r3) {
        AnonymousClass00C.A0D(context, 0);
        return C36361kB.A0m(context, R.string.f12nameremoved);
    }

    public boolean A0B(C20810yC r2, AnonymousClass8SX r3) {
        AnonymousClass00C.A0D(r2, 1);
        return r2.A0E(1538);
    }

    public void A0G(Activity activity, Jid jid, C206969uL r14, String str, String str2, long j) {
        UserJid userJid;
        Activity activity2 = activity;
        Activity A002 = C18860tw.A00(activity);
        if (A002 != null) {
            userJid = C36351kA.A0l(((C88834Uf) A002).getContact());
        } else {
            userJid = null;
        }
        this.A06.A0C(new C142916pg(activity2, A002, this, r14, str, str2, j), userJid);
    }

    public final void A0H(Activity activity, AnonymousClass11F r13, String str, String str2, HashMap hashMap, long j) {
        C207219uk BA8;
        C207089uX r0;
        String A0k = C90474aD.A0k(hashMap);
        AnonymousClass00C.A0E(activity, "null cannot be cast to non-null type com.whatsapp.conversation.ConversationInterface");
        ((AnonymousClass4V7) activity).Bpt(r13, str2, "address_message", A0k, (String) null, j);
        AnonymousClass3T1 A032 = this.A03.A03(new C64933Qa(r13, str, false));
        if (A032 != null && (BA8 = ((C23043B1o) A032).BA8()) != null && BA8.A00 == 5 && (r0 = BA8.A04) != null) {
            Iterator it = r0.A03.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C206569tc r1 = (C206569tc) it.next();
                if (AnonymousClass00C.A0J(r1.A01.A00, "address_message")) {
                    r1.A00 = true;
                    break;
                }
            }
            this.A02.A0k(A032);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f9, code lost:
        if (r1 == null) goto L_0x00fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.app.Activity r16, android.app.Activity r17, X.C207109uZ r18, X.AnonymousClass54H r19, X.C206969uL r20, java.lang.String r21, java.lang.String r22, long r23) {
        /*
            r7 = r17
            r8 = 0
            r12 = r19
            X.3Km r0 = r12.A05
            r2 = r18
            java.lang.String r1 = r0.A00(r2)
            X.AnonymousClass00C.A08(r1)
            java.lang.String r0 = "UNBLOCKED"
            boolean r0 = r0.equals(r1)
            r13 = r16
            if (r0 == 0) goto L_0x00cf
            X.0yC r1 = r12.A09
            r0 = 3572(0xdf4, float:5.005E-42)
            boolean r2 = r1.A0E(r0)
            r14 = r20
            r15 = r21
            r16 = r22
            r0 = r23
            if (r2 == 0) goto L_0x0049
            java.lang.String r2 = r14.A01
            java.util.HashMap r5 = X.C131866Qy.A01(r2)
            java.util.HashMap r4 = X.AnonymousClass001.A0J()
            java.lang.String r3 = "action"
            java.lang.String r2 = "start"
            r4.put(r3, r2)
            java.util.HashMap r18 = A00(r13, r12, r14, r5)
            r19 = r0
            r17 = r4
            r12.A0I(r13, r14, r15, r16, r17, r18, r19)
        L_0x0048:
            return
        L_0x0049:
            r17 = r12
            r18 = r13
            r19 = r8
            super.A0G(r18, r19, r20, r21, r22, r23)
            X.1L4 r2 = r12.A0B
            java.lang.String r6 = "address_message"
            X.00T r2 = r2.A01
            java.util.Map r2 = X.C90514aH.A16(r2)
            java.lang.Object r4 = r2.get(r6)
            X.5us r4 = (X.C122455us) r4
            if (r4 == 0) goto L_0x00cc
            boolean r2 = r4.A03
            if (r2 == 0) goto L_0x0048
            java.lang.String r9 = r4.A01
            X.AnonymousClass00C.A07(r9)
        L_0x006d:
            if (r7 == 0) goto L_0x0048
            X.0ts r12 = r12.A08
            r5 = r9
            if (r4 == 0) goto L_0x00b1
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = r4.A01
            r3.append(r2)
            java.lang.String r2 = r4.A02
            java.lang.String r5 = X.AnonymousClass000.A0q(r2, r3)
            long r3 = r4.A00
            r10 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r10
            r10 = 0
            int r2 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x00b4
            r10 = 0
        L_0x008f:
            android.content.Intent r4 = X.AnonymousClass190.A0U(r7, r10, r9, r8)
            X.4Uf r7 = (X.C88834Uf) r7
            java.lang.String r3 = X.C90494aF.A0a(r7)
            java.lang.String r2 = "chat_id"
            r4.putExtra(r2, r3)
            java.lang.String r2 = "message_id"
            r4.putExtra(r2, r15)
            java.lang.String r2 = "action_name"
            r4.putExtra(r2, r6)
            java.lang.String r2 = "message_row_id"
            r4.putExtra(r2, r0)
            r13.startActivity(r4)
            return
        L_0x00b1:
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
        L_0x00b4:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0v(r5)
            r2 = 58
            r5.append(r2)
            java.lang.String r2 = r12.A07()
            java.lang.String r5 = X.AnonymousClass000.A0q(r2, r5)
            r2 = 1
            X.6bn r10 = new X.6bn
            r10.<init>(r3, r5, r2)
            goto L_0x008f
        L_0x00cc:
            java.lang.String r9 = "com.bloks.www.whatsapp.commerce.address_message"
            goto L_0x006d
        L_0x00cf:
            X.9fJ r5 = r12.A01
            r0 = 1
            r4 = 2131886724(0x7f120284, float:1.9408035E38)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            if (r18 == 0) goto L_0x00fb
            com.whatsapp.jid.UserJid r2 = r2.A08
            if (r2 == 0) goto L_0x00fb
            X.185 r0 = r5.A01
            X.3L0 r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x0117
            java.lang.String r1 = r0.A08
        L_0x00e7:
            boolean r0 = X.AnonymousClass14B.A0F(r1)
            if (r0 == 0) goto L_0x00f9
            X.16D r0 = r5.A00
            X.141 r1 = r0.A0D(r2)
            X.171 r0 = r5.A02
            java.lang.String r1 = r0.A0H(r1)
        L_0x00f9:
            if (r1 != 0) goto L_0x00fd
        L_0x00fb:
            java.lang.String r1 = ""
        L_0x00fd:
            java.lang.String r0 = X.C36381kD.A0r(r13, r1, r3, r4)
            X.AnonymousClass00C.A08(r0)
            X.1qm r2 = X.AnonymousClass3LW.A00(r13)
            r2.A0p(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            X.6Z3 r0 = X.AnonymousClass6Z3.A00
            r2.A0h(r0, r1)
            X.C36341k9.A11(r2)
            return
        L_0x0117:
            r1 = 0
            goto L_0x00e7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54H.A01(android.app.Activity, android.app.Activity, X.9uZ, X.54H, X.9uL, java.lang.String, java.lang.String, long):void");
    }

    public final void A0I(Activity activity, C206969uL r21, String str, String str2, HashMap hashMap, Map map, long j) {
        HashMap hashMap2 = hashMap;
        Map map2 = map;
        this.A0A.A0B((AnonymousClass7hO) null, new C147636xX(activity, this, r21, map2.get("supported_actions"), str, str2, hashMap2, j), new C128166Be("address_message", (String) null, hashMap2), "", (String) null, map2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass54H(AnonymousClass1K9 r2, C130876Mt r3, C63553Km r4, AnonymousClass1KK r5, C199439fJ r6, C1255460h r7, C18820ts r8, C20310xM r9, C20810yC r10, AnonymousClass1A1 r11, AnonymousClass1L4 r12) {
        super(r7);
        C36321k7.A1B(r10, r2, r8, r9, r11);
        C36321k7.A14(r12, r4, r5);
        AnonymousClass00C.A0D(r6, 11);
        this.A09 = r10;
        this.A04 = r2;
        this.A08 = r8;
        this.A02 = r9;
        this.A03 = r11;
        this.A07 = r7;
        this.A00 = r3;
        this.A0B = r12;
        this.A05 = r4;
        this.A06 = r5;
        this.A01 = r6;
        this.A0A = r2.A00((AnonymousClass691) null);
    }

    public static final HashMap A00(Activity activity, AnonymousClass54H r1, C206969uL r2, Map map) {
        HashMap A0F = r1.A0F(activity, r2);
        C90484aE.A1I("country", A0F, map);
        boolean containsKey = map.containsKey("saved_addresses");
        if (containsKey) {
            List A0o = C90524aI.A0o("saved_addresses", map);
            if (A0o != null) {
                containsKey = C36401kF.A1a(A0o);
            } else {
                containsKey = false;
            }
        }
        A0F.put("has_saved_addresses", Boolean.valueOf(containsKey));
        A0F.put("has_validation_errors", Boolean.valueOf(map.containsKey("validation_errors")));
        return A0F;
    }
}
