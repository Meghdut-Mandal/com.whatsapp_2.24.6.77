package X;

import android.content.Intent;
import android.text.TextUtils;

/* renamed from: X.9mb  reason: invalid class name and case insensitive filesystem */
public abstract class C202759mb {
    public static boolean A04(C20810yC r5, C203479o6 r6) {
        String str;
        if (r6 == null || !C197639c2.A00(r6.A0O)) {
            return true;
        }
        String str2 = r6.A0B;
        String str3 = r6.A0A;
        if (str2 != null && str3 != null && AnonymousClass6R8.A02(str2, 0.0f).floatValue() > AnonymousClass6R8.A02(str3, 0.0f).floatValue()) {
            return true;
        }
        String str4 = r6.A0C;
        if (str4 != null && (!r5.A0E(7256) || (!str4.equals("10") && !str4.equals("12") && !str4.equals("13") && !str4.equals("14") && !str4.equals("15")))) {
            switch (str4.hashCode()) {
                case 1536:
                    str = "00";
                    break;
                case 1537:
                    str = "01";
                    break;
                case 1538:
                    str = "02";
                    break;
                case 1539:
                    str = "03";
                    break;
                case 1540:
                    str = "04";
                    break;
                case 1541:
                    str = "05";
                    break;
                case 1542:
                    str = "06";
                    break;
                case 1543:
                    str = "07";
                    break;
                case 1544:
                    str = "08";
                    break;
                case 1545:
                    str = "09";
                    break;
                case 1568:
                    str = "11";
                    break;
                case 1603:
                    str = "25";
                    break;
                default:
                    return true;
            }
            if (!str4.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static int A00(C21100yf r2, C203479o6 r3) {
        C21120yh r0;
        String str;
        if (r3.A0P || (str = r3.A02) == null || (!str.equals("GALLERY_QR_CODE") && !str.equals("DEEP_LINK"))) {
            r0 = C21100yf.A1n;
        } else {
            r0 = C21100yf.A1m;
        }
        return r2.A04(r0);
    }

    public static void A03(Intent intent, C203479o6 r3, String str) {
        intent.putExtra("extra_new_mandate_transaction", true);
        intent.putExtra("extra_new_mandate_payee_name", r3.A09);
        intent.putExtra("extra_new_mandate_preset_amount", r3.A0A);
        intent.putExtra("extra_new_mandate_transaction_ref", r3.A0K);
        intent.putExtra("extra_new_mandate_merchant_code", r3.A06);
        intent.putExtra("extra_new_mandate_initiation_mode", r3.A04);
        intent.putExtra("extra_new_mandate_purpose_code", r3.A0C);
        intent.putExtra("extra_new_mandate_vpa", r3.A0O);
        intent.putExtra("extra_new_mandate_sign", r3.A0I);
        intent.putExtra("extra_new_mandate_amount_rule", r3.A00);
        intent.putExtra("extra_new_mandate_note", r3.A07);
        intent.putExtra("extra_new_mandate_mandate_name", r3.A05);
        intent.putExtra("extra_new_mandate_validity_start", r3.A0N);
        intent.putExtra("extra_new_mandate_validity_end", r3.A0M);
        intent.putExtra("extra_new_mandate_frequency", r3.A03);
        intent.putExtra("extra_new_mandate_recurrence_day", r3.A0D);
        intent.putExtra("extra_new_mandate_recurrence_rule", r3.A0E);
        intent.putExtra("extra_new_mandate_rev", r3.A0G);
        intent.putExtra("extra_new_mandate_share", r3.A0H);
        intent.putExtra("extra_new_mandate_block", r3.A01);
        intent.putExtra("extra_new_mandate_unique_mandate_number", r3.A0L);
        C165597tg.A0z(intent, str);
        intent.addFlags(33554432);
    }

    public static boolean A05(String str) {
        if ("photo_received".equals(str) || "photo_received_gallery".equals(str) || "main_qr_code_gallery".equals(str)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x006e, code lost:
        if (r0 == false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.content.Intent r4, X.C21100yf r5, X.AnonymousClass11F r6, X.C203479o6 r7) {
        /*
            X.6vT r2 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r1 = r7.A0O
            java.lang.String r0 = "upiHandle"
            X.6c7 r1 = X.C165617ti.A0P(r2, r3, r1, r0)
            java.lang.String r0 = "extra_payment_handle"
            r4.putExtra(r0, r1)
            java.lang.String r1 = r7.A06
            java.lang.String r0 = "extra_merchant_code"
            r4.putExtra(r0, r1)
            java.lang.String r1 = r7.A0K
            java.lang.String r0 = "extra_transaction_ref"
            r4.putExtra(r0, r1)
            X.6vT r2 = X.C146356vT.A00()
            java.lang.String r1 = r7.A09
            java.lang.String r0 = "accountHolderName"
            X.6c7 r1 = X.C165617ti.A0P(r2, r3, r1, r0)
            java.lang.String r0 = "extra_payee_name"
            r4.putExtra(r0, r1)
            java.lang.String r1 = r7.A0F
            java.lang.String r0 = "extra_transaction_ref_url"
            r4.putExtra(r0, r1)
            java.lang.String r1 = r7.A04
            java.lang.String r0 = "extra_initiation_mode"
            r4.putExtra(r0, r1)
            java.lang.String r1 = r7.A0C
            java.lang.String r0 = "extra_purpose_code"
            r4.putExtra(r0, r1)
            java.lang.String r1 = r7.A0A
            java.lang.String r0 = "extra_payment_preset_amount"
            r4.putExtra(r0, r1)
            java.lang.String r1 = r7.A0J
            java.lang.String r0 = "extra_transaction_id"
            r4.putExtra(r0, r1)
            java.lang.String r1 = r7.A0B
            java.lang.String r0 = "extra_payment_preset_min_amount"
            r4.putExtra(r0, r1)
            java.lang.String r1 = "extra_skip_value_props_display"
            r0 = 0
            r4.putExtra(r1, r0)
            java.lang.String r1 = r7.A02
            if (r1 == 0) goto L_0x0070
            java.lang.String r0 = "DEEP_LINK"
            boolean r0 = r1.equals(r0)
            r1 = 9
            if (r0 != 0) goto L_0x0072
        L_0x0070:
            r1 = 8
        L_0x0072:
            java.lang.String r0 = "extra_payments_entry_type"
            r4.putExtra(r0, r1)
            int r0 = A00(r5, r7)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "extra_payment_preset_max_amount"
            r4.putExtra(r0, r1)
            java.lang.String r1 = "extra_is_first_payment_method"
            r0 = 1
            r4.putExtra(r1, r0)
            if (r6 == 0) goto L_0x0096
            java.lang.String r1 = r6.getRawString()
        L_0x0090:
            java.lang.String r0 = "extra_chat_jid"
            r4.putExtra(r0, r1)
            return
        L_0x0096:
            java.lang.String r1 = ""
            goto L_0x0090
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202759mb.A01(android.content.Intent, X.0yf, X.11F, X.9o6):void");
    }

    public static void A02(Intent intent, C21100yf r4, AnonymousClass11F r5, C203479o6 r6, String str, boolean z) {
        A01(intent, r4, r5, r6);
        C165597tg.A0z(intent, str);
        intent.putExtra("extra_is_pay_money_only", !TextUtils.isEmpty(r6.A0A));
        intent.putExtra("return-after-pay", "DEEP_LINK".equals(r6.A02));
        intent.putExtra("verify-vpa-in-background", true);
        if (A05(str)) {
            intent.putExtra("extra_payment_preset_max_amount", String.valueOf(r4.A04(C21100yf.A1n)));
        }
        if (z) {
            intent.addFlags(33554432);
        }
    }
}
