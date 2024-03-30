package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.compliance.IndiaConfirmLegalNameBottomSheetFragment;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.8iy  reason: invalid class name and case insensitive filesystem */
public abstract class C179048iy extends C179068j0 {
    public long A00;
    public C195389Uc A01;
    public AnonymousClass6AT A02;
    public C197789cN A03;
    public C64933Qa A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public List A09;
    public boolean A0A;
    public B1M A0B;

    public static void A11(C207119ua r19, C22981AzX azX, C179048iy r21, PaymentBottomSheet paymentBottomSheet, Runnable runnable, Runnable runnable2) {
        String str;
        AnonymousClass011 r10;
        Long l;
        String str2;
        C179048iy r2 = r21;
        UserJid userJid = r2.A0E;
        C18740tg.A06(userJid);
        String str3 = r2.A06;
        C18740tg.A06(str3);
        String str4 = r2.A07;
        C18740tg.A06(str4);
        C64933Qa r0 = r2.A04;
        if (r0 != null) {
            str = r0.A01;
        } else {
            str = "";
        }
        long j = r2.A00;
        boolean A0y = C173858Tk.A0y(r2);
        C36321k7.A11(userJid, str3, str4);
        C207119ua r13 = r19;
        C36421kH.A1J(r13, 4, str);
        C21245AEb aEb = new C21245AEb(azX, r2, paymentBottomSheet, runnable, runnable2);
        r2.A0B = aEb;
        C197789cN r9 = r2.A03;
        List list = r2.A09;
        C147216wr r22 = C147216wr.A00;
        AnonymousClass00C.A0D(r22, 4);
        if (A0y) {
            C21332AHk A002 = AnonymousClass97Q.A00(list);
            if (A002 != null) {
                String str5 = A002.A01;
                AnonymousClass00C.A07(str5);
                r10 = C36441kJ.A19(str5, A002.A02);
            } else {
                r10 = null;
            }
            JSONObject jSONObject = null;
            if (j > 0) {
                l = Long.valueOf(j);
            } else {
                l = null;
            }
            C198199d4 r92 = r9.A02;
            String A0V = C90464aC.A0V();
            if (r10 != null) {
                str2 = (String) r10.first;
                jSONObject = (JSONObject) r10.second;
            } else {
                str2 = null;
            }
            C183358qf r102 = r92.A05;
            synchronized (r102) {
                r102.A02.A0E(7302);
            }
            AnonymousClass8gF r1 = r92.A03;
            AnonymousClass8gF r16 = r1;
            r1.A07.Boy(new AW8(r13, userJid, new C21244AEa(aEb, r92, str, "HPP_PAYMENT_LINK"), r16, l, str3, str, str4, "HPP_PAYMENT_LINK", A0V, str2, jSONObject));
            return;
        }
        C105605Fi r12 = r9.A00;
        r12.A07.Boy(new C1503574y(r12, userJid, r22, str4, 18));
    }

    public static void A12(C202059ky r9, C22981AzX azX, C179048iy r11, PaymentBottomSheet paymentBottomSheet) {
        PaymentBottomSheet paymentBottomSheet2;
        if (r9.A00 == 10755) {
            C131606Ps r7 = new C131606Ps((String) null, new C131606Ps[0]);
            r7.A02("payments_error_code", r9.A00);
            r7.A03("payments_error_text", r9.A07);
            r11.A35(new B8N(r7, r11, 1), R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved);
            r11.BOo(r7, 0, (Integer) null, "sanction_check_error_dialog");
            return;
        }
        if (paymentBottomSheet != null) {
            paymentBottomSheet2 = paymentBottomSheet;
        } else {
            paymentBottomSheet2 = new PaymentBottomSheet();
        }
        if (r9.A00 == 10752) {
            String str = r11.A0f;
            String str2 = r11.A0i;
            String str3 = r11.A0h;
            IndiaConfirmLegalNameBottomSheetFragment indiaConfirmLegalNameBottomSheetFragment = new IndiaConfirmLegalNameBottomSheetFragment();
            Bundle A072 = AnonymousClass001.A07();
            A072.putString("extra_payment_config_id", str);
            A072.putString("extra_order_type", str2);
            A072.putString("extra_referral_screen", str3);
            indiaConfirmLegalNameBottomSheetFragment.A17(A072);
            indiaConfirmLegalNameBottomSheetFragment.A0A = new C21307AGl(azX, r11, paymentBottomSheet2, paymentBottomSheet);
            if (paymentBottomSheet != null) {
                AnonymousClass01z A0k = paymentBottomSheet.A0k();
                int A0I = A0k.A0I();
                for (int i = 0; i < A0I; i++) {
                    A0k.A0V();
                }
                paymentBottomSheet.A1n(indiaConfirmLegalNameBottomSheetFragment);
            } else {
                paymentBottomSheet2.A02 = indiaConfirmLegalNameBottomSheetFragment;
                C65443Sb.A00(paymentBottomSheet2, r11);
                r11.A4U(paymentBottomSheet2);
            }
            r11.BOo((C131606Ps) null, 0, (Integer) null, "enter_name");
        }
    }

    public String A4q(C202059ky r4) {
        int i;
        String A012;
        if (r4 != null) {
            if (this.A0D.A0E(6712)) {
                String A092 = this.A0D.A09(7336);
                if ((TextUtils.isEmpty(A092) || A092.contains(Integer.toString(r4.A00))) && (A012 = this.A09.A01(r4.A00)) != null) {
                    return A012;
                }
            }
            int i2 = r4.A00;
            Integer A013 = C202939my.A01(i2);
            if (A013 != null) {
                i = A013.intValue();
            } else {
                Object[] A0L = AnonymousClass001.A0L();
                C36331k8.A1W(A0L, i2);
                return getString(R.string.f12nameremoved, A0L);
            }
        } else {
            i = R.string.f12nameremoved;
        }
        return getString(i);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r11v2, types: [X.74y] */
    /* JADX WARNING: type inference failed for: r15v4, types: [X.AW8] */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0106, code lost:
        r1 = r13.A03;
        r0 = new X.C21244AEa(r15, r13, r8, "UPI");
        r3 = r1.A07;
        r15 = new X.AW8(r14, r10, r0, r1, r20, r11, r8, r9, "UPI", r25, r12, r5);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4r(X.C207119ua r29, X.C22981AzX r30, X.C22982AzY r31, com.whatsapp.payments.ui.PaymentBottomSheet r32, java.lang.Runnable r33, java.lang.Runnable r34) {
        /*
            r28 = this;
            r6 = r28
            boolean r0 = r6.A0A
            if (r0 != 0) goto L_0x012c
            com.whatsapp.jid.UserJid r10 = r6.A0E
            X.C18740tg.A06(r10)
            java.lang.String r11 = r6.A06
            X.C18740tg.A06(r11)
            java.lang.String r9 = r6.A07
            X.C18740tg.A06(r9)
            X.3Qa r0 = r6.A04
            if (r0 == 0) goto L_0x0082
            java.lang.String r8 = r0.A01
        L_0x001b:
            long r0 = r6.A00
            boolean r3 = X.C173858Tk.A0y(r6)
            r14 = r29
            X.C36321k7.A1B(r10, r11, r9, r14, r8)
            X.AEc r7 = new X.AEc
            r16 = r30
            r13 = r31
            r19 = r32
            r12 = r33
            r21 = r34
            r15 = r7
            r17 = r13
            r18 = r6
            r20 = r12
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r6.A0B = r7
            X.9cN r4 = r6.A03
            java.util.List r2 = r6.A09
            X.6wq r5 = new X.6wq
            r5.<init>(r13, r6, r12)
            java.lang.String r6 = "UPI"
            if (r3 == 0) goto L_0x00f4
            X.AHk r2 = X.AnonymousClass97Q.A00(r2)
            if (r2 == 0) goto L_0x0080
            java.lang.String r3 = r2.A01
            X.AnonymousClass00C.A07(r3)
            org.json.JSONObject r2 = r2.A02
            X.011 r3 = X.C36441kJ.A19(r3, r2)
        L_0x005c:
            r5 = 0
            r12 = 0
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x007d
            java.lang.Long r20 = java.lang.Long.valueOf(r0)
        L_0x0067:
            X.9d4 r13 = r4.A02
            java.lang.String r25 = X.C90464aC.A0V()
            if (r3 == 0) goto L_0x007b
            java.lang.Object r12 = r3.first
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r5 = r3.second
            org.json.JSONObject r5 = (org.json.JSONObject) r5
        L_0x0077:
            X.8qf r4 = r13.A05
            monitor-enter(r4)
            goto L_0x0085
        L_0x007b:
            r12 = r5
            goto L_0x0077
        L_0x007d:
            r20 = r5
            goto L_0x0067
        L_0x0080:
            r3 = 0
            goto L_0x005c
        L_0x0082:
            java.lang.String r8 = ""
            goto L_0x001b
        L_0x0085:
            X.0yC r1 = r4.A02     // Catch:{ all -> 0x00f1 }
            r0 = 7302(0x1c86, float:1.0232E-41)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x0105
            android.util.LruCache r0 = r4.A01     // Catch:{ all -> 0x00f1 }
            java.lang.Object r3 = r0.get(r8)     // Catch:{ all -> 0x00f1 }
            X.9fq r3 = (X.C199719fq) r3     // Catch:{ all -> 0x00f1 }
            if (r3 == 0) goto L_0x0105
            X.1Dc r2 = r13.A04     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = "Cache found for "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r8, r1)     // Catch:{ all -> 0x00f1 }
            r2.A07(r0)     // Catch:{ all -> 0x00f1 }
            X.8vd r0 = r3.A00     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x00c4
            X.8sO r0 = r0.A01     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x00e3
            java.lang.Long r0 = r0.A00     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x00e3
            long r17 = r0.longValue()     // Catch:{ all -> 0x00f1 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00f1 }
            long r15 = X.C36391kE.A0B(r0)     // Catch:{ all -> 0x00f1 }
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e3
        L_0x00c4:
            boolean r0 = r3.A01     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x00df
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = "Request in progress for "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r8, r1)     // Catch:{ all -> 0x00f1 }
            r2.A04(r0)     // Catch:{ all -> 0x00f1 }
            android.util.LruCache r1 = r4.A00     // Catch:{ all -> 0x00f1 }
            java.lang.ref.WeakReference r0 = X.AnonymousClass001.A0F(r7)     // Catch:{ all -> 0x00f1 }
            r1.put(r8, r0)     // Catch:{ all -> 0x00f1 }
            goto L_0x00ef
        L_0x00df:
            r4.A0A(r8)     // Catch:{ all -> 0x00f1 }
            goto L_0x0105
        L_0x00e3:
            X.17Y r2 = r13.A00     // Catch:{ all -> 0x00f1 }
            r1 = 22
            X.AVb r0 = new X.AVb     // Catch:{ all -> 0x00f1 }
            r0.<init>(r7, r3, r1)     // Catch:{ all -> 0x00f1 }
            r2.A0H(r0)     // Catch:{ all -> 0x00f1 }
        L_0x00ef:
            monitor-exit(r4)
            return
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x00f4:
            X.5Fi r0 = r4.A00
            X.0wU r3 = r0.A07
            r16 = 18
            X.74y r2 = new X.74y
            r11 = r2
            r12 = r0
            r13 = r10
            r14 = r5
            r15 = r9
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x0129
        L_0x0105:
            monitor-exit(r4)
            X.8gF r1 = r13.A03
            X.AEa r0 = new X.AEa
            r0.<init>(r7, r13, r8, r6)
            X.0wU r3 = r1.A07
            X.AW8 r2 = new X.AW8
            r23 = r9
            r24 = r6
            r26 = r12
            r27 = r5
            r17 = r10
            r18 = r0
            r19 = r1
            r21 = r11
            r22 = r8
            r15 = r2
            r16 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x0129:
            r3.Boy(r2)
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C179048iy.A4r(X.9ua, X.AzX, X.AzY, com.whatsapp.payments.ui.PaymentBottomSheet, java.lang.Runnable, java.lang.Runnable):void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        int i4;
        if (i == 1008 || i == 1015) {
            A4N();
        } else if (i != 1024) {
            super.onActivityResult(i, i2, intent);
        } else {
            if (i2 == -1) {
                A4j();
                i3 = 1;
                i4 = 5;
            } else {
                i3 = 1;
                i4 = 3;
            }
            BOo((C131606Ps) null, i3, Integer.valueOf(i4), "in_app_browser_checkout");
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A06 = getIntent().getStringExtra("extra_order_id");
        this.A00 = getIntent().getLongExtra("extra_order_expiry_ts_in_sec", 0);
        this.A08 = getIntent().getStringExtra("extra_payment_type");
        this.A07 = getIntent().getStringExtra("extra_payment_config_id");
        this.A09 = getIntent().getParcelableArrayListExtra("extra_payment_settings");
        this.A0A = getIntent().getBooleanExtra("extra_checkout_lite_enabled", false);
        this.A0n = true;
        if (this.A0J != null || !C173858Tk.A0x(this)) {
            Bnv();
            return;
        }
        C183418ql r1 = new C183418ql(this);
        this.A0J = r1;
        C36391kE.A1Q(r1, this.A04);
    }

    public void onResume() {
        super.onResume();
        if (C173858Tk.A0x(this) && !this.A04.A07.contains("upi-get-challenge") && this.A0M.A09().A00 == null) {
            this.A0g.A06("onResume getChallenge");
            Bu1(R.string.f12nameremoved);
            this.A04.A01("upi-get-challenge");
            A4A();
        }
    }
}
