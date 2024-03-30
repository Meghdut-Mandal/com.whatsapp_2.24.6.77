package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.9Yd  reason: invalid class name and case insensitive filesystem */
public abstract class C196209Yd {
    public int A03() {
        return -1;
    }

    public Integer A04() {
        return null;
    }

    public void A07(Activity activity, Intent intent, C20310xM r3, C21010yW r4, AnonymousClass1A1 r5, C19770wU r6, int i) {
    }

    public void A0A(AnonymousClass3T1 r1, C206969uL r2, String str, JSONObject jSONObject) {
    }

    public static AnonymousClass00U A02(Object obj, int i) {
        return new AnonymousClass00U(new AnonymousClass96N(obj, i));
    }

    public String A05() {
        if (this instanceof C175198a0) {
            return "catalog_message";
        }
        return "view_product";
    }

    public String A06(Context context, C206969uL r6) {
        String str;
        if (this instanceof C175198a0) {
            AnonymousClass00C.A0D(context, 0);
            return C36361kB.A0m(context, R.string.f12nameremoved);
        }
        AnonymousClass00C.A0D(context, 0);
        String str2 = null;
        if (!(r6 == null || (str = r6.A01) == null || AnonymousClass098.A06(str))) {
            Object opt = C36441kJ.A1C(str).opt("display_text");
            if (opt instanceof String) {
                str2 = (String) opt;
            }
        }
        String A0m = C36361kB.A0m(context, R.string.f12nameremoved);
        if (str2 == null || AnonymousClass098.A06(str2)) {
            return A0m;
        }
        return str2;
    }

    public void A08(Activity activity, AnonymousClass3T1 r20, C206969uL r21, int i) {
        C46852bm r4;
        AnonymousClass3T1 r42 = r20;
        Activity activity2 = activity;
        if (this instanceof C175198a0) {
            C175198a0 r3 = (C175198a0) this;
            C206969uL r0 = r21;
            C36321k7.A16(activity2, r42, r0, 0);
            String A00 = C175198a0.A00(r3, r0.A01);
            if (A00 == null || AnonymousClass098.A06(A00)) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("malformed phone=");
                A0u.append(A00);
                ((C19700wN) r3.A01.getValue()).A0E("ViewCatalogAction/execute", AnonymousClass000.A0q(" passed through ViewCatalogAction::isValid", A0u), false);
                return;
            }
            ((C32691e2) r3.A02.getValue()).Bp7(activity2, Uri.parse(AnonymousClass3N4.A00(AnonymousClass000.A0p("c/", A00, AnonymousClass000.A0u())).A00.toString()), (AnonymousClass3T1) null);
            if (((C20800yB) r3.A00.getValue()).A0E(3754)) {
                C122445ur r32 = (C122445ur) r3.A03.getValue();
                C64933Qa r2 = r42.A1J;
                AnonymousClass00C.A07(r2);
                C1502274l.A00(r32.A03, r32, r2, A00, 42);
            }
        } else if (this instanceof C175188Zz) {
            C175188Zz r33 = (C175188Zz) this;
            C36321k7.A0v(activity2, 0, r42);
            if ((r42 instanceof C46852bm) && (r4 = (C46852bm) r42) != null) {
                UserJid userJid = r4.A01;
                if (userJid == null) {
                    ((AnonymousClass17Y) r33.A03.getValue()).A06(R.string.f12nameremoved, 0);
                    return;
                }
                ((AnonymousClass9Y1) r33.A01.getValue()).A01(3);
                boolean A0M = ((C19730wQ) r33.A04.getValue()).A0M(userJid);
                AnonymousClass3SM.A03(activity2, (AnonymousClass9XI) r33.A02.getValue(), (C199439fJ) r33.A00.getValue(), userJid, (Integer) null, (Integer) null, r4.A06, 1, A0M, A0M, false);
            }
        }
    }

    public void A09(Activity activity, AnonymousClass3T1 r3, C206969uL r4, Class cls) {
        if (this instanceof C175198a0) {
            AnonymousClass00C.A0D(activity, 0);
            C36321k7.A0x(r4, r3);
            A08(activity, r3, r4, 0);
            return;
        }
        AnonymousClass00C.A0D(activity, 0);
        C36321k7.A0x(r4, r3);
        A08(activity, r3, r4, 0);
    }

    public boolean A0B(C20810yC r2, AnonymousClass8SX r3) {
        int i;
        if (this instanceof C175198a0) {
            AnonymousClass00C.A0D(r2, 1);
            i = 3457;
        } else if (!(this instanceof C175188Zz)) {
            return false;
        } else {
            AnonymousClass00C.A0D(r2, 1);
            i = 7408;
        }
        return !r2.A0E(i);
    }

    public boolean A0C(C20810yC r2, AnonymousClass8SX r3) {
        int i;
        if (this instanceof C175198a0) {
            AnonymousClass00C.A0D(r2, 1);
            i = 3921;
        } else if (!(this instanceof C175188Zz)) {
            return false;
        } else {
            AnonymousClass00C.A0D(r2, 1);
            i = 7408;
        }
        return !r2.A0E(i);
    }

    public boolean A0D(C173078Qh r4, AnonymousClass91C r5) {
        if (this instanceof C175198a0) {
            C175198a0 r2 = (C175198a0) this;
            if (r5 == AnonymousClass91C.IMAGE && (r4.bitField0_ & 8) != 0) {
                C172718Ox r0 = r4.nativeFlowInfo_;
                if (r0 == null) {
                    r0 = C172718Ox.DEFAULT_INSTANCE;
                }
                String A00 = C175198a0.A00(r2, r0.paramsJson_);
                if (A00 == null || AnonymousClass098.A06(A00)) {
                    return false;
                }
                return true;
            }
            return false;
        } else if (this instanceof C175188Zz) {
            return AnonymousClass000.A1P(r4.bitField0_ & 8);
        } else {
            if (r5 == AnonymousClass91C.DOCUMENT || r5 == AnonymousClass91C.TEXT || r5 == AnonymousClass91C.VIDEO || r5 == AnonymousClass91C.IMAGE || r5 == AnonymousClass91C.EMPTY) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005e, code lost:
        if (r10 == null) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0E(X.AnonymousClass8SX r13, X.C21337AHp r14) {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.C175198a0
            if (r0 == 0) goto L_0x008d
            r4 = r12
            X.8a0 r4 = (X.C175198a0) r4
            r5 = 0
            X.00T r0 = r4.A00
            java.lang.Object r1 = r0.getValue()
            X.0yB r1 = (X.C20800yB) r1
            r0 = 3754(0xeaa, float:5.26E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x007e
            r9 = r13
            X.8SV r2 = X.C203099nI.A00(r13)
            X.AnonymousClass00C.A08(r2)
            int r1 = r2.interactiveMessageCase_
            r0 = 6
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            r10 = 0
            if (r0 == 0) goto L_0x0087
            X.8Q1 r0 = r2.A0u()
            X.B6c r0 = r0.buttons_
            X.AnonymousClass00C.A08(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0037:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0085
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.8P5 r0 = (X.AnonymousClass8P5) r0
            java.lang.String r1 = r0.name_
            java.lang.String r0 = "catalog_message"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0037
        L_0x004e:
            X.8P5 r2 = (X.AnonymousClass8P5) r2
            if (r2 == 0) goto L_0x007f
            int r0 = r2.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = r2.buttonParamsJson_
            java.lang.String r10 = X.C175198a0.A00(r4, r0)
            if (r10 != 0) goto L_0x0065
        L_0x0060:
            java.lang.String r0 = "ViewCatalogAction/isNeedToDropMessage: phone is null!"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0065:
            X.00T r0 = r4.A03
            java.lang.Object r8 = r0.getValue()
            X.5ur r8 = (X.C122445ur) r8
            if (r10 != 0) goto L_0x0071
            java.lang.String r10 = ""
        L_0x0071:
            X.0wU r0 = r8.A03
            r11 = 11
            X.74y r6 = new X.74y
            r7 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            r0.Boy(r6)
        L_0x007e:
            return r5
        L_0x007f:
            java.lang.String r0 = "ViewCatalogAction/extractBizPhone: cannot get phone number; either button or params json is not presented"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0060
        L_0x0085:
            r2 = r10
            goto L_0x004e
        L_0x0087:
            java.lang.String r0 = "ViewCatalogAction/extractBizPhone: cannot get phone number; no native flow message found"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0060
        L_0x008d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196209Yd.A0E(X.8SX, X.AHp):boolean");
    }
}
