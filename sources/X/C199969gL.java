package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9gL  reason: invalid class name and case insensitive filesystem */
public class C199969gL {
    public final C19420v0 A00;
    public final C21010yW A01;
    public final AnonymousClass1EZ A02;
    public final AnonymousClass629 A03;
    public final C19770wU A04;
    public final C19460v5 A05;
    public final C19730wQ A06;
    public final AnonymousClass1KK A07;
    public final AnonymousClass185 A08;
    public final C20810yC A09;
    public final C30801an A0A;
    public final AnonymousClass1EV A0B;
    public final C32971eV A0C;
    public final AnonymousClass1FR A0D;

    public void A01(AnonymousClass11F r13, C207219uk r14, Integer num, String str, String str2, List list, int i, int i2, boolean z, boolean z2, boolean z3) {
        String str3;
        String str4;
        C207199ui r1;
        String str5 = "";
        if (r14 == null || (r1 = r14.A01) == null) {
            str3 = str5;
        } else {
            str5 = r1.A09.A08;
            str3 = ((AnonymousClass16V) r1.A08).A02;
        }
        try {
            String A002 = A00(r14, this);
            JSONObject A1B = C36441kJ.A1B();
            A1B.put("cta", "order_details");
            A1B.put("wa_pay_registered", this.A02.A0E());
            A1B.put("p2m_type", A002);
            A1B.put("is_cta_available", z2);
            C207199ui r7 = r14.A01;
            C18740tg.A06(r7);
            String str6 = r7.A04;
            if ("payment_instruction".equals(str6)) {
                str4 = "cpi";
            } else {
                C18740tg.A06(r7);
                str4 = "confirm";
                if (!str4.equals(str6)) {
                    C18740tg.A06(r7);
                    str4 = "pix";
                    if (!str4.equals(str6)) {
                        if (!AnonymousClass14B.A0F(r7.A06)) {
                            str4 = "native";
                        } else {
                            str4 = null;
                        }
                    }
                }
            }
            String str7 = str2;
            String str8 = str4;
            if (!AnonymousClass14B.A0F(str7)) {
                str8 = str7;
            }
            if (!AnonymousClass14B.A0F(str8)) {
                A1B.put("payment_method_choice", str8);
            }
            if (num != null) {
                A1B.put("num_installments", num);
            }
            A1B.put("p2m_flow", str5);
            A1B.put("currency", str3);
            if (z3) {
                JSONArray A0u = C90524aI.A0u();
                if (str4 != null) {
                    A0u.put(str4);
                } else if (list != null && !list.isEmpty()) {
                    for (Object put : list) {
                        A0u.put(put);
                    }
                } else if (str2 != null) {
                    A0u.put(str7);
                }
                C90504aG.A1J(A0u, "accepted_payment_method", A1B);
            }
            if (z) {
                C207199ui r12 = r14.A01;
                C18740tg.A06(r12);
                C206979uM r0 = r12.A0B;
                C18740tg.A06(r0);
                Float valueOf = Float.valueOf(r12.A03(r0).A02.A00.floatValue());
                if (valueOf != null) {
                    A1B.put("order_amount", valueOf);
                }
            }
            A1B.put("order_content_variant", C165587tf.A05(this.A09));
            String str9 = str;
            if (!TextUtils.isEmpty(str9)) {
                A1B.put("order_funnel_id", str9);
            }
            this.A0A.A00(r13, Integer.valueOf(AnonymousClass6W7.A00(this.A08.A02(C36401kF.A0b(r13)))), A1B.toString(), (String) null, i, 4, i2, true);
        } catch (JSONException unused) {
            Log.e("OrderDetailsMessageLogging/logOrderDetailsAction failed to construct message class attributes");
        }
    }

    public void A03(C23043B1o b1o, String str, int i) {
        A02(b1o, (Integer) null, str, (List) null, i, false, false, false);
    }

    public static String A00(C207219uk r2, C199969gL r3) {
        C207199ui r22 = r2.A01;
        C18740tg.A06(r22);
        String str = r22.A0E;
        if (str != null && r3.A0B.A0I(str)) {
            return "p2m_lite";
        }
        C18740tg.A06(r22);
        AnonymousClass16U r0 = r22.A08;
        C18740tg.A06(r0);
        String str2 = ((AnonymousClass16V) r0).A02;
        if (((AnonymousClass16V) AnonymousClass16W.A04).A02.equals(str2)) {
            return "p2m_pro";
        }
        if (!((AnonymousClass16V) AnonymousClass16W.A05).A02.equals(str2)) {
            return "UNSET";
        }
        if (r3.A0B.A0K(r22.A0L)) {
            return "p2m_checkout_lite";
        }
        return "p2m_hybrid";
    }

    public C199969gL(C19460v5 r1, C19730wQ r2, AnonymousClass1KK r3, AnonymousClass185 r4, C19420v0 r5, C20810yC r6, C21010yW r7, C30801an r8, AnonymousClass1EZ r9, AnonymousClass1EV r10, C32971eV r11, AnonymousClass1FR r12, AnonymousClass629 r13, C19770wU r14) {
        this.A09 = r6;
        this.A06 = r2;
        this.A04 = r14;
        this.A01 = r7;
        this.A0D = r12;
        this.A05 = r1;
        this.A02 = r9;
        this.A08 = r4;
        this.A00 = r5;
        this.A0B = r10;
        this.A07 = r3;
        this.A0C = r11;
        this.A03 = r13;
        this.A0A = r8;
    }

    public void A02(C23043B1o b1o, Integer num, String str, List list, int i, boolean z, boolean z2, boolean z3) {
        int i2;
        C207219uk BA8 = b1o.BA8();
        if (BA8 != null && BA8.A01 != null && (b1o instanceof AnonymousClass3T1)) {
            AnonymousClass3T1 r13 = (AnonymousClass3T1) b1o;
            AnonymousClass11F r1 = r13.A1J.A00;
            if (r13 instanceof C46832bk) {
                i2 = 8;
            } else if (r13 instanceof C46872bo) {
                i2 = 2;
            } else {
                i2 = 1;
                if (r13 instanceof C181778o1) {
                    i2 = 3;
                }
            }
            A01(r1, BA8, num, (String) null, str, list, i, i2, z, z2, z3);
        }
    }
}
