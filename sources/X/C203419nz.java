package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9nz  reason: invalid class name and case insensitive filesystem */
public abstract class C203419nz {
    public static final C203419nz $redex_init_class = null;

    public static String A02(int i) {
        return i != 6 ? i != 7 ? i != 8 ? (i == 100 || i == 200) ? "p2m" : "p2p" : "withdrawal" : "refund" : "deposit";
    }

    /* JADX WARNING: Removed duplicated region for block: B:137:0x013f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(int r9, int r10) {
        /*
            r0 = 1
            java.lang.String r8 = "SENT_TO_SELLER"
            java.lang.String r7 = "FAILED_DA"
            java.lang.String r6 = "PENDING"
            java.lang.String r5 = "EXPIRED"
            java.lang.String r4 = "IN_REVIEW"
            java.lang.String r3 = "CANCELLED"
            java.lang.String r2 = "FAILED"
            java.lang.String r1 = "SUCCESS"
            if (r9 == r0) goto L_0x00bd
            r0 = 2
            if (r9 == r0) goto L_0x0082
            r0 = 6
            if (r9 == r0) goto L_0x0140
            r0 = 8
            if (r9 == r0) goto L_0x0059
            r0 = 10
            if (r9 == r0) goto L_0x002f
            r0 = 20
            if (r9 == r0) goto L_0x002f
            r0 = 100
            if (r9 == r0) goto L_0x00bd
            r0 = 200(0xc8, float:2.8E-43)
            if (r9 == r0) goto L_0x0082
        L_0x002d:
            r0 = 0
            return r0
        L_0x002f:
            r0 = 12
            if (r10 != r0) goto L_0x0036
            java.lang.String r0 = "COLLECT_SUCCESS"
            return r0
        L_0x0036:
            r0 = 13
            if (r10 != r0) goto L_0x003d
            java.lang.String r0 = "COLLECT_FAILED"
            return r0
        L_0x003d:
            r0 = 14
            if (r10 != r0) goto L_0x0044
            java.lang.String r0 = "COLLECT_FAILED_RISK"
            return r0
        L_0x0044:
            r0 = 15
            if (r10 != r0) goto L_0x004b
            java.lang.String r0 = "COLLECT_REJECTED"
            return r0
        L_0x004b:
            r0 = 16
            if (r10 != r0) goto L_0x0052
            java.lang.String r0 = "COLLECT_EXPIRED"
            return r0
        L_0x0052:
            r0 = 18
            if (r10 != r0) goto L_0x002d
            java.lang.String r0 = "COLLECT_CANCELED"
            return r0
        L_0x0059:
            r0 = 602(0x25a, float:8.44E-43)
            if (r10 != r0) goto L_0x0060
            java.lang.String r0 = "PENDING_CODE"
            return r0
        L_0x0060:
            r0 = 603(0x25b, float:8.45E-43)
            if (r10 == r0) goto L_0x0156
            r0 = 604(0x25c, float:8.46E-43)
            if (r10 == r0) goto L_0x0159
            r0 = 605(0x25d, float:8.48E-43)
            if (r10 == r0) goto L_0x0158
            r0 = 606(0x25e, float:8.49E-43)
            if (r10 == r0) goto L_0x0154
            r0 = 607(0x25f, float:8.5E-43)
            if (r10 == r0) goto L_0x0157
            r0 = 608(0x260, float:8.52E-43)
            if (r10 != r0) goto L_0x007b
            java.lang.String r0 = "WITHDRAWAL_ACTIVE"
            return r0
        L_0x007b:
            r0 = 609(0x261, float:8.53E-43)
            if (r10 != r0) goto L_0x002d
            java.lang.String r0 = "PENDING_CANCELLATION"
            return r0
        L_0x0082:
            r0 = 102(0x66, float:1.43E-43)
            if (r10 != r0) goto L_0x0089
            java.lang.String r0 = "PENDING_SETUP"
            return r0
        L_0x0089:
            r0 = 103(0x67, float:1.44E-43)
            if (r10 == r0) goto L_0x015a
            r0 = 104(0x68, float:1.46E-43)
            if (r10 != r0) goto L_0x0094
            java.lang.String r0 = "FAILED_PROCESSING"
            return r0
        L_0x0094:
            r0 = 106(0x6a, float:1.49E-43)
            if (r10 == r0) goto L_0x0159
            r0 = 105(0x69, float:1.47E-43)
            if (r10 == r0) goto L_0x0158
            r0 = 107(0x6b, float:1.5E-43)
            if (r10 == r0) goto L_0x0157
            r0 = 109(0x6d, float:1.53E-43)
            if (r10 != r0) goto L_0x00a7
            java.lang.String r0 = "WITHDRAWAL_PROCESSING"
            return r0
        L_0x00a7:
            r0 = 110(0x6e, float:1.54E-43)
            if (r10 != r0) goto L_0x00ae
            java.lang.String r0 = "WITHDRAWAL_FAILURE"
            return r0
        L_0x00ae:
            r0 = 111(0x6f, float:1.56E-43)
            if (r10 != r0) goto L_0x00b5
            java.lang.String r0 = "WITHDRAWAL_PERMANENT_FAILED"
            return r0
        L_0x00b5:
            r0 = 112(0x70, float:1.57E-43)
            if (r10 == r0) goto L_0x0154
            r0 = 113(0x71, float:1.58E-43)
            goto L_0x013d
        L_0x00bd:
            r0 = 402(0x192, float:5.63E-43)
            if (r10 != r0) goto L_0x00c4
            java.lang.String r0 = "PENDING_RECEIVER_SETUP"
            return r0
        L_0x00c4:
            r0 = 403(0x193, float:5.65E-43)
            if (r10 == r0) goto L_0x015a
            r0 = 404(0x194, float:5.66E-43)
            if (r10 != r0) goto L_0x00cf
            java.lang.String r0 = "REFUND_FAILED_DA"
            return r0
        L_0x00cf:
            r0 = 407(0x197, float:5.7E-43)
            if (r10 != r0) goto L_0x00d6
            java.lang.String r0 = "FAILED_RISK"
            return r0
        L_0x00d6:
            r0 = 405(0x195, float:5.68E-43)
            if (r10 == r0) goto L_0x0159
            r0 = 406(0x196, float:5.69E-43)
            if (r10 == r0) goto L_0x0158
            r0 = 408(0x198, float:5.72E-43)
            if (r10 != r0) goto L_0x00e5
            java.lang.String r0 = "REFUNDED"
            return r0
        L_0x00e5:
            r0 = 409(0x199, float:5.73E-43)
            if (r10 != r0) goto L_0x00ec
            java.lang.String r0 = "REFUND_FAILED"
            return r0
        L_0x00ec:
            r0 = 410(0x19a, float:5.75E-43)
            if (r10 != r0) goto L_0x00f3
            java.lang.String r0 = "FAILED_RECEIVER_PROCESSING"
            return r0
        L_0x00f3:
            r0 = 411(0x19b, float:5.76E-43)
            if (r10 != r0) goto L_0x00fa
            java.lang.String r0 = "REFUND_FAILED_PROCESSING"
            return r0
        L_0x00fa:
            r0 = 412(0x19c, float:5.77E-43)
            if (r10 != r0) goto L_0x0101
            java.lang.String r0 = "FAILED_DA_FINAL"
            return r0
        L_0x0101:
            r0 = 413(0x19d, float:5.79E-43)
            if (r10 != r0) goto L_0x0108
            java.lang.String r0 = "AUTH_CANCEL_FAILED_PROCESSING"
            return r0
        L_0x0108:
            r0 = 414(0x19e, float:5.8E-43)
            if (r10 != r0) goto L_0x010f
            java.lang.String r0 = "AUTH_CANCEL_FAILED"
            return r0
        L_0x010f:
            r0 = 415(0x19f, float:5.82E-43)
            if (r10 != r0) goto L_0x0116
            java.lang.String r0 = "AUTH_CANCELED"
            return r0
        L_0x0116:
            r0 = 416(0x1a0, float:5.83E-43)
            if (r10 == r0) goto L_0x0157
            r0 = 419(0x1a3, float:5.87E-43)
            if (r10 == r0) goto L_0x0156
            r0 = 420(0x1a4, float:5.89E-43)
            if (r10 == r0) goto L_0x0155
            r0 = 421(0x1a5, float:5.9E-43)
            if (r10 == r0) goto L_0x0154
            r0 = 422(0x1a6, float:5.91E-43)
            if (r10 != r0) goto L_0x012d
            java.lang.String r0 = "REVERSAL_SUCCESS"
            return r0
        L_0x012d:
            r0 = 423(0x1a7, float:5.93E-43)
            if (r10 != r0) goto L_0x0134
            java.lang.String r0 = "REVERSAL_PENDING"
            return r0
        L_0x0134:
            r0 = 424(0x1a8, float:5.94E-43)
            if (r10 != r0) goto L_0x013b
            java.lang.String r0 = "REFUND_PENDING"
            return r0
        L_0x013b:
            r0 = 425(0x1a9, float:5.96E-43)
        L_0x013d:
            if (r10 != r0) goto L_0x002d
            return r8
        L_0x0140:
            r0 = 701(0x2bd, float:9.82E-43)
            if (r10 == r0) goto L_0x0155
            r0 = 702(0x2be, float:9.84E-43)
            if (r10 == r0) goto L_0x0156
            r0 = 703(0x2bf, float:9.85E-43)
            if (r10 == r0) goto L_0x0159
            r0 = 704(0x2c0, float:9.87E-43)
            if (r10 == r0) goto L_0x0158
            r0 = 705(0x2c1, float:9.88E-43)
            if (r10 != r0) goto L_0x002d
        L_0x0154:
            return r3
        L_0x0155:
            return r6
        L_0x0156:
            return r4
        L_0x0157:
            return r5
        L_0x0158:
            return r2
        L_0x0159:
            return r1
        L_0x015a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203419nz.A03(int, int):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r1 = (r0 = r4.A08).A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A06(X.C202319lY r4) {
        /*
            r3 = 1
            if (r4 == 0) goto L_0x001f
            int r2 = r4.A03
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 0
            if (r2 != r1) goto L_0x000b
            return r0
        L_0x000b:
            r0 = 4
            if (r2 == r0) goto L_0x001f
            X.16X r0 = r4.A08
            if (r0 == 0) goto L_0x001f
            java.math.BigDecimal r1 = r0.A00
            if (r1 == 0) goto L_0x001f
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
            int r0 = r1.compareTo(r0)
            if (r0 <= 0) goto L_0x001f
            r3 = 0
        L_0x001f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203419nz.A06(X.9lY):boolean");
    }

    public static C202319lY A00(long j) {
        C202159l8 r0 = C202159l8.A0E;
        return new C202319lY("UNSET", 4, 1, 0, j);
    }

    static {
        C202159l8 r0 = C202159l8.A0E;
    }

    public static C202319lY A01(AnonymousClass16U r24, AnonymousClass16X r25, UserJid userJid, UserJid userJid2, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, long j) {
        ArrayList A0I = AnonymousClass001.A0I();
        int i6 = i5;
        if (i6 == 1) {
            A0I.add("feature_bip");
        }
        String str4 = str3;
        int i7 = 1;
        if (!TextUtils.isEmpty(str4) && C190919Av.A00.containsKey(str4)) {
            if (A0I.isEmpty()) {
                i7 = AnonymousClass9ZS.A00(str4);
            } else {
                Integer A01 = AnonymousClass9ZS.A01(str4, (String) Collections.max(A0I, new AXS(str4)));
                if (A01 != null) {
                    i7 = A01.intValue();
                }
            }
        }
        return new C202319lY(r24, r25, userJid, userJid2, str, (String) null, (String) null, (String) null, (String) null, str2, str4, i, i2, Math.max(i7, i3), i4, i6, j, 0);
    }

    public static String A04(List list) {
        if (list.size() <= 0) {
            return null;
        }
        JSONArray A0u = C90524aI.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0u.put(A05((AnonymousClass9K8) it.next(), false));
        }
        return A0u.toString();
    }

    public static JSONObject A05(AnonymousClass9K8 r4, boolean z) {
        Object obj;
        JSONObject A1B = C36441kJ.A1B();
        try {
            C207249un r3 = r4.A01;
            A1B.put("t", r3.A09());
            A1B.put("st", (Object) null);
            A1B.put("cc", r3.A07.A03);
            if (!z) {
                A1B.put("c", r3.A0A);
                C135086c7 r0 = r3.A09;
                if (r0 == null) {
                    obj = null;
                } else {
                    obj = r0.A00;
                }
                A1B.put("n", obj);
                C90504aG.A1J(r4.A02, "a", A1B);
            }
            if (r3 instanceof C175798b4) {
                A1B.put("ci", ((C175798b4) r3).A01);
            }
            A1B.put("sd", r4.A00);
            return A1B;
        } catch (JSONException e) {
            if (z) {
                return null;
            }
            Log.w("PAY: PaymentTransaction:Source:toJsonString threw creating json string: ", e);
            return null;
        }
    }

    public static boolean A07(String str) {
        if (TextUtils.isEmpty(str) || "UNSET".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean A08(String str, int i) {
        AbstractMap abstractMap;
        Number number;
        int i2 = 1;
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = C190919Av.A00;
            if (!(!hashMap.containsKey(str) || (abstractMap = (AbstractMap) hashMap.get(str)) == null || (number = (Number) Collections.max(abstractMap.values())) == null)) {
                i2 = number.intValue();
            }
        }
        return C36371kC.A1T(i2, i);
    }
}
