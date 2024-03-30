package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;

/* renamed from: X.8ld  reason: invalid class name and case insensitive filesystem */
public class C180358ld extends C167667yX {
    public final C001700s A00 = C36431kI.A0S();
    public final C001700s A01 = C36431kI.A0S();
    public final C001700s A02 = C36431kI.A0S();
    public final C001700s A03 = C36431kI.A0S();
    public final AnonymousClass9XR A04;
    public final AnonymousClass9SR A05;
    public final C201469jf A06;
    public final C19770wU A07;
    public final String A08;
    public final boolean A09;
    public final AnonymousClass17Y A0A;
    public final String A0B;

    public C180358ld(AnonymousClass17Y r8, C19970wo r9, AnonymousClass9XR r10, AnonymousClass9SR r11, C200049gU r12, C201469jf r13, AnonymousClass6VG r14, C200959iX r15, C196039Xk r16, C19770wU r17, String str, String str2, boolean z) {
        super(r9, r12, r14, r15, r16);
        this.A0A = r8;
        this.A07 = r17;
        this.A06 = r13;
        this.A0B = str;
        this.A04 = r10;
        this.A05 = r11;
        this.A08 = str2;
        this.A09 = z;
    }

    public static void A01(AF3 af3, AnonymousClass9SB r6, C180358ld r7, C203399nx r8, String str) {
        AnonymousClass9SB r2 = r6;
        try {
            C203399nx r3 = r8;
            String str2 = str;
            r7.A04.A01(r2, r3, str2, r7.A08, AF3.A00(af3, r7.A0B.getBytes(C19430v1.A0B)));
        } catch (Exception unused) {
            Log.e("DyiViewModel/request-report/sendDyiReportRequestWithPassword");
            r2.A00(C202059ky.A00());
        }
    }

    public static void A02(C180358ld r3, int i) {
        if (!r3.A0A.A0M()) {
            Log.i("DyiViewModel/check-internet :: no internet connection aborting the action");
            C165587tf.A11(r3.A03, Integer.valueOf(i), new C202059ky(7));
        }
    }

    public void A0R() {
        Log.i("DyiViewModel/on-cleared");
        C201469jf r3 = this.A06;
        String str = this.A08;
        if (r3.A02(str) == 3) {
            synchronized (r3) {
                C104895Bw r1 = r3.A00;
                if (r1 != null) {
                    AnonymousClass75I.A00(r1, false);
                }
                r3.A08.A0F(2, str);
            }
        }
    }

    public void A0V(AnonymousClass9SB r16, C203399nx r17, String str) {
        String str2;
        Log.i("DyiViewModel/request-report");
        A02(this, 0);
        C201469jf r5 = this.A06;
        long A002 = C19970wo.A00(this.A05);
        String str3 = this.A08;
        synchronized (r5) {
            Log.i("dyiReportManager/on-report-requested");
            SharedPreferences.Editor A0E = C90494aF.A0E(r5.A08);
            if ("personal".equals(str3)) {
                str2 = "payment_dyi_report_timestamp";
            } else {
                str2 = "business_payment_dyi_report_timestamp";
            }
            C36341k9.A0w(A0E, str2, A002);
        }
        C36341k9.A17(this.A02, 1);
        AnonymousClass9SB r7 = r16;
        C203399nx r52 = r17;
        String str4 = str;
        if (this.A09) {
            AF3 A012 = this.A04.A01("FB", "DYI-REPORT");
            if (A012 != null) {
                A01(A012, r7, this, r52, str4);
            } else {
                this.A05.A00(new C23193B9b(r52, this, r7, str4, 2), "FB");
            }
        } else if (str3.equals("business")) {
            this.A04.A01(r7, (C203399nx) null, str4, "business", (byte[]) null);
        } else if (!str3.equals("personal")) {
            Log.e("PAY: DyiReportViewModel/requestReport - this account type is not supported");
        } else {
            AnonymousClass9XR r9 = this.A04;
            C18740tg.A06(r52);
            r9.A01(r7, r52, str4, "personal", (byte[]) null);
        }
    }
}
