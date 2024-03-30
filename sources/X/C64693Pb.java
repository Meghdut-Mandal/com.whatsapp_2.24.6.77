package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.3Pb  reason: invalid class name and case insensitive filesystem */
public class C64693Pb {
    public final AnonymousClass1DF A00;
    public final C61913Dz A01;
    public final C20690y0 A02;
    public final AnonymousClass171 A03;
    public final C20060wx A04;
    public final AnonymousClass3FN A05;
    public final C20810yC A06;
    public final C19770wU A07;

    public AnonymousClass0FM A01(Activity activity, C225014r r10, AnonymousClass141 r11) {
        Activity activity2 = activity;
        C39001qm A002 = AnonymousClass3LW.A00(activity);
        A002.A0c(R.string.f12nameremoved);
        C225014r r4 = r10;
        AnonymousClass141 r6 = r11;
        A002.A0h(new AnonymousClass4XC(activity2, r4, this, r6, 1), R.string.f12nameremoved);
        A002.A0g(new AnonymousClass4XC(activity2, r4, this, r6, 2), R.string.f12nameremoved);
        return A002.create();
    }

    public void A02(Activity activity, C225014r r6, AnonymousClass141 r7, AnonymousClass11F r8) {
        if (this.A00.A0E((AnonymousClass4QI) null, r8, 1, 2).size() > 0) {
            AnonymousClass3SJ.A01(activity, 10);
        } else {
            A00(activity, r6, this, r7, false);
        }
    }

    public C64693Pb(C61913Dz r1, C20690y0 r2, AnonymousClass171 r3, C20060wx r4, AnonymousClass3FN r5, AnonymousClass1DF r6, C20810yC r7, C19770wU r8) {
        this.A06 = r7;
        this.A07 = r8;
        this.A02 = r2;
        this.A01 = r1;
        this.A04 = r4;
        this.A03 = r3;
        this.A05 = r5;
        this.A00 = r6;
    }

    public static void A00(Context context, C225014r r10, C64693Pb r11, AnonymousClass141 r12, boolean z) {
        C225014r r3 = r10;
        r10.Bu2(R.string.f12nameremoved, R.string.f12nameremoved);
        C19770wU r0 = r11.A07;
        C20810yC r102 = r11.A06;
        C20690y0 r5 = r11.A02;
        Context context2 = context;
        C36331k8.A1F(new C50252kS(context2, r3, r11.A01, r5, r11.A03, r11.A04, r11.A05, r12, r102, z), r0);
    }
}
