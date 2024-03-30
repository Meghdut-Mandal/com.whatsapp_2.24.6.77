package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.Calendar;

/* renamed from: X.2KO  reason: invalid class name */
public final class AnonymousClass2KO extends C196209Yd {
    public AnonymousClass0FM A00;
    public C18820ts A01;
    public Calendar A02;
    public Calendar A03;
    public final C24801Dv A04;
    public final AnonymousClass3CS A05;
    public final C65003Qi A06;
    public final C236519h A07;
    public final C19970wo A08;
    public final C19630wG A09;
    public final C19420v0 A0A;
    public final AnonymousClass163 A0B;
    public final C20310xM A0C;
    public final C62173Fb A0D;
    public final C238019x A0E;
    public final AnonymousClass1CR A0F;
    public final C19770wU A0G;
    public final C25271Fq A0H;

    public String A05() {
        return "cta_reminder";
    }

    public String A06(Context context, C206969uL r4) {
        String str;
        String optString;
        AnonymousClass00C.A0D(context, 0);
        if (r4 != null && (str = r4.A01) != null && (optString = C36441kJ.A1C(str).optString("display_text")) != null && optString.length() != 0) {
            return optString;
        }
        String string = context.getString(R.string.f12nameremoved);
        AnonymousClass00C.A0B(string);
        return string;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        if (r0 != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(android.app.Activity r13, X.AnonymousClass3T1 r14, X.C206969uL r15, int r16) {
        /*
            r12 = this;
            r0 = 0
            r7 = r13
            r8 = r14
            X.C36321k7.A16(r13, r14, r15, r0)
            X.3Qa r0 = r14.A1J
            X.11F r10 = r0.A00
            r9 = r12
            if (r10 == 0) goto L_0x010b
            X.1CR r0 = r12.A0F
            boolean r0 = r0.A0j(r10)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x0017:
            X.1Fq r0 = r12.A0H
            X.03c r0 = r0.A00
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0058
            X.1qm r2 = X.AnonymousClass3LW.A00(r13)
            r0 = 2131891244(0x7f12142c, float:1.9417203E38)
            r2.A0d(r0)
            r0 = 2131891242(0x7f12142a, float:1.9417199E38)
            r2.A0c(r0)
            boolean r0 = X.C19550w8.A09()
            if (r0 == 0) goto L_0x0044
            X.0v0 r1 = r12.A0A
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            boolean r0 = r1.A2U(r0)
            r1 = 2131891244(0x7f12142c, float:1.9417203E38)
            if (r0 == 0) goto L_0x0047
        L_0x0044:
            r1 = 2131891243(0x7f12142b, float:1.94172E38)
        L_0x0047:
            r0 = 13
            X.C39001qm.A0J(r2, r13, r12, r0, r1)
            r1 = 2131891246(0x7f12142e, float:1.9417207E38)
            X.3Vi r0 = X.C66273Vi.A00
        L_0x0051:
            r2.A0f(r0, r1)
            X.C36341k9.A11(r2)
        L_0x0057:
            return
        L_0x0058:
            boolean r0 = X.C36341k9.A1Z(r1)
            if (r0 == 0) goto L_0x007c
            X.1qm r2 = X.AnonymousClass3LW.A00(r13)
            r0 = 2131891248(0x7f121430, float:1.941721E38)
            r2.A0d(r0)
            r0 = 2131891245(0x7f12142d, float:1.9417205E38)
            r2.A0c(r0)
            r1 = 2131891247(0x7f12142f, float:1.9417209E38)
            r0 = 14
            X.C39001qm.A0J(r2, r12, r10, r0, r1)
            r1 = 2131891246(0x7f12142e, float:1.9417207E38)
            X.3Vj r0 = X.C66283Vj.A00
            goto L_0x0051
        L_0x007c:
            X.1qm r4 = X.AnonymousClass3LW.A00(r13)
            r0 = 2131891240(0x7f121428, float:1.9417194E38)
            r4.A0d(r0)
            r0 = 2131893766(0x7f121e06, float:1.9422318E38)
            r11 = 3
            X.4XC r6 = new X.4XC
            r6.<init>(r7, r8, r9, r10, r11)
            r4.A0h(r6, r0)
            r1 = 2131896389(0x7f122845, float:1.9427638E38)
            X.3Vh r0 = X.C66263Vh.A00
            r4.A0f(r0, r1)
            r0 = 5
            java.lang.CharSequence[] r5 = new java.lang.CharSequence[r0]
            X.0ts r0 = r12.A01
            if (r0 == 0) goto L_0x011d
            r6 = 1
            r2 = 2
            java.lang.String r0 = X.AnonymousClass3UY.A03(r0, r6, r2)
            X.AnonymousClass00C.A08(r0)
            r3 = 0
            r5[r3] = r0
            X.0ts r1 = r12.A01
            if (r1 == 0) goto L_0x0118
            r0 = 24
            java.lang.String r0 = X.AnonymousClass3UY.A03(r1, r0, r2)
            X.AnonymousClass00C.A08(r0)
            r5[r6] = r0
            X.0ts r1 = r12.A01
            if (r1 == 0) goto L_0x0113
            r0 = 7
            java.lang.String r0 = X.AnonymousClass3UY.A03(r1, r0, r11)
            X.AnonymousClass00C.A08(r0)
            r5[r2] = r0
            X.0wG r1 = r12.A09
            r0 = 2131891239(0x7f121427, float:1.9417192E38)
            java.lang.String r0 = X.C36371kC.A0v(r1, r0)
            r5[r11] = r0
            X.0ts r1 = r12.A01
            if (r1 == 0) goto L_0x010e
            r0 = 10
            java.lang.String r1 = X.AnonymousClass3UY.A03(r1, r0, r3)
            X.AnonymousClass00C.A08(r1)
            r0 = 4
            r5[r0] = r1
            r0 = 9
            X.4XI r2 = new X.4XI
            r2.<init>(r15, r13, r12, r0)
            r1 = -1
            androidx.appcompat.app.AlertDialog$Builder r0 = r4.A00
            r0.A0U(r2, r5, r1)
            X.0FM r0 = r4.create()
            r12.A00 = r0
            if (r0 == 0) goto L_0x00fd
            r0.show()
        L_0x00fd:
            X.0FM r0 = r12.A00
            if (r0 == 0) goto L_0x0057
            X.0YZ r0 = r0.A00
            android.widget.Button r0 = r0.A0H
            if (r0 == 0) goto L_0x0057
            r0.setEnabled(r3)
            return
        L_0x010b:
            r1 = 0
            goto L_0x0017
        L_0x010e:
            java.lang.RuntimeException r0 = X.C36321k7.A09()
            throw r0
        L_0x0113:
            java.lang.RuntimeException r0 = X.C36321k7.A09()
            throw r0
        L_0x0118:
            java.lang.RuntimeException r0 = X.C36321k7.A09()
            throw r0
        L_0x011d:
            java.lang.RuntimeException r0 = X.C36321k7.A09()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2KO.A08(android.app.Activity, X.3T1, X.9uL, int):void");
    }

    public void A09(Activity activity, AnonymousClass3T1 r3, C206969uL r4, Class cls) {
        AnonymousClass00C.A0D(activity, 0);
        C36321k7.A0x(r4, r3);
        A08(activity, r3, r4, 0);
    }

    public boolean A0B(C20810yC r2, AnonymousClass8SX r3) {
        AnonymousClass00C.A0D(r2, 1);
        return !r2.A0E(5075);
    }

    public AnonymousClass2KO(C24801Dv r2, AnonymousClass3CS r3, C65003Qi r4, C236519h r5, C19970wo r6, C19630wG r7, C25271Fq r8, C19420v0 r9, AnonymousClass163 r10, C20310xM r11, C62173Fb r12, C238019x r13, AnonymousClass1CR r14, C19770wU r15) {
        C36321k7.A1B(r6, r5, r15, r7, r3);
        C36321k7.A1C(r2, r14, r9, r13, r8);
        AnonymousClass00C.A0D(r11, 11);
        AnonymousClass00C.A0D(r12, 13);
        AnonymousClass00C.A0D(r10, 14);
        this.A08 = r6;
        this.A07 = r5;
        this.A0G = r15;
        this.A09 = r7;
        this.A05 = r3;
        this.A04 = r2;
        this.A0F = r14;
        this.A0A = r9;
        this.A0E = r13;
        this.A0H = r8;
        this.A0C = r11;
        this.A06 = r4;
        this.A0D = r12;
        this.A0B = r10;
    }

    public static final void A00(Activity activity, AnonymousClass2KO r10) {
        Activity activity2 = activity;
        View inflate = View.inflate(activity, R.layout.f9nameremoved, (ViewGroup) null);
        TextView A0M = C36341k9.A0M(inflate, R.id.permission_message);
        ImageView A0L = C36341k9.A0L(inflate, R.id.permission_image_1);
        View A0G2 = C36361kB.A0G(inflate, R.id.submit);
        View A0G3 = C36361kB.A0G(inflate, R.id.cancel);
        A0M.setText(R.string.f12nameremoved);
        A0L.setImageResource(R.drawable.clock_icon);
        C39001qm A002 = AnonymousClass3LW.A00(activity);
        A002.A0j(inflate);
        A002.A0r(false);
        AnonymousClass0FM A0O = C36371kC.A0O(A002);
        Window window = A0O.getWindow();
        if (window != null) {
            C36341k9.A0r(activity, window, R.color.f6nameremoved);
        }
        A0G2.setOnClickListener(new AnonymousClass3YS(A0O, r10, activity2, activity.getPackageName(), 1));
        C66963Xz.A00(A0G3, A0O, 14);
        A0O.show();
    }

    public int A03() {
        return R.drawable.ic_settings_notification;
    }
}
