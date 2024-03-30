package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.3Pc  reason: invalid class name and case insensitive filesystem */
public final class C64703Pc {
    public final AnonymousClass17Y A00;
    public final C29411Wn A01;
    public final C19630wG A02;
    public final C25271Fq A03;
    public final C29501Ww A04;
    public final AnonymousClass12U A05;
    public final AnonymousClass66X A06;
    public final C62273Fm A07;

    public final void A01() {
        C62273Fm r1;
        String str;
        String str2;
        String A002 = this.A06.A00();
        AnonymousClass00C.A0D(AnonymousClass000.A0p("WfacManager/startWfacLogging for main with ban state ", A002, AnonymousClass000.A0u()), 0);
        switch (A002.hashCode()) {
            case -358171056:
                str2 = "UNKNOWN_IN_CLIENT";
                break;
            case 191367207:
                str2 = "CHECKPOINTED";
                break;
            case 272787191:
                if (A002.equals("UNBANNED")) {
                    r1 = this.A07;
                    str = "unbanned";
                    break;
                } else {
                    return;
                }
            case 1951953694:
                if (A002.equals("BANNED")) {
                    r1 = this.A07;
                    str = "banned";
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        if (A002.equals(str2)) {
            r1 = this.A07;
            str = "other";
            r1.A00(str, -1, 1);
        }
    }

    public C64703Pc(AnonymousClass17Y r2, C29411Wn r3, C19630wG r4, C25271Fq r5, C29501Ww r6, AnonymousClass12U r7, AnonymousClass66X r8, C62273Fm r9) {
        C36321k7.A1B(r2, r4, r3, r6, r8);
        C36361kB.A1J(r5, 6, r7);
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = r6;
        this.A06 = r8;
        this.A03 = r5;
        this.A07 = r9;
        this.A05 = r7;
    }

    public static final Intent A00(Context context, String str, String str2, String str3, int i, int i2, int i3) {
        Intent A0D = C36431kI.A0D();
        A0D.setClassName(context.getPackageName(), "com.whatsapp.waffle.wfac.ui.WfacBanActivity");
        A0D.putExtra("ban_violation_type", i);
        A0D.putExtra("ban_violation_reason", str2);
        A0D.putExtra("ban_violation_source", i2);
        A0D.putExtra("launch_source", i3);
        A0D.putExtra("appeal_decision", str3);
        A0D.putExtra("ban_status_request_token", str);
        return A0D;
    }

    public final void A02(int i, int i2) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WfacManager/startWfacBanLogging launchSource {");
        A0u.append(i);
        A0u.append("} vs {");
        A0u.append(i2);
        AnonymousClass00C.A0D(AnonymousClass000.A0s(A0u), 0);
        this.A07.A00("banned", i2, i);
    }
}
