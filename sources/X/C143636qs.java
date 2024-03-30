package X;

import android.location.LocationManager;

/* renamed from: X.6qs  reason: invalid class name and case insensitive filesystem */
public class C143636qs implements C160617lI, C159287j7 {
    public boolean A00 = true;
    public final C1272067j A01;
    public final AnonymousClass6Th A02;
    public final C122355ui A03;
    public final C19630wG A04;
    public final C21430zE A05;
    public final C20830yE A06;

    public void BaK(C121385t3 r11) {
        Number A0z;
        Number A0z2;
        AnonymousClass6Th r2 = this.A02;
        C28201Rs r1 = r2.A04;
        if (r1.A04() != null && (A0z = C36441kJ.A0z(r1)) != null && A0z.intValue() == 0) {
            this.A01.A01(r11.A01, this, (C132406Tm) null, r11.A02, "device", r11.A00);
            if (r1.A04() != null && (A0z2 = C36441kJ.A0z(r1)) != null && A0z2.intValue() == 0) {
                C36341k9.A16(r1, 2);
                r2.A01.removeCallbacks(r2.A06);
            }
        }
    }

    public void A00() {
        C28201Rs r1;
        int i;
        boolean isProviderEnabled = ((LocationManager) this.A04.A00.getSystemService("location")).isProviderEnabled("network");
        AnonymousClass6Th r2 = this.A02;
        boolean A032 = r2.A03();
        if (isProviderEnabled) {
            if (A032) {
                r1 = r2.A04;
                i = 5;
            } else {
                return;
            }
        } else if (A032) {
            r1 = r2.A04;
            i = 6;
        } else {
            return;
        }
        C36341k9.A17(r1, i);
        r2.A01.postDelayed(r2.A06, 20000);
    }

    public void B7F() {
        this.A02.A02();
        this.A05.markerPoint(207368785, "fetch_user_location_request_start");
    }

    public void BZ6(C1261662u r6, int i) {
        AnonymousClass6Th r4 = this.A02;
        C001700s r3 = r4.A02;
        Number A0z = C36441kJ.A0z(r3);
        if (A0z != null && A0z.intValue() == 7) {
            int i2 = 3;
            if (i == -1) {
                i2 = 5;
            }
            r4.A01.removeCallbacks(r4.A06);
            Number A0z2 = C36441kJ.A0z(r3);
            if (A0z2 != null && A0z2.intValue() == 7) {
                C36341k9.A17(r4.A04, 7);
            }
            C36341k9.A16(r3, i2);
        }
    }

    public void BZ7(AnonymousClass6QG r4) {
        boolean z;
        AnonymousClass6Th r2 = this.A02;
        r2.A01.removeCallbacks(r2.A06);
        C1501874h.A01(r2.A05, r2, r4, 28);
        Number A0z = C36441kJ.A0z(r2.A02);
        if (A0z == null || A0z.intValue() != 7) {
            C122355ui r1 = this.A03;
            synchronized (r1) {
                z = r1.A02;
            }
            if (z) {
                return;
            }
        }
        this.A00 = false;
    }

    public void BaD() {
        boolean isProviderEnabled = ((LocationManager) this.A04.A00.getSystemService("location")).isProviderEnabled("gps");
        AnonymousClass6Th r1 = this.A02;
        if (isProviderEnabled) {
            r1.A02();
        } else if (r1.A03()) {
            C36341k9.A17(r1.A04, 4);
        }
    }

    public void BaH() {
        this.A02.A01();
    }

    public void Bwx() {
        AnonymousClass6Th r2 = this.A02;
        C1497172m.A00(r2.A05, r2, 32);
    }

    public C143636qs(AnonymousClass60b r2, C132296Sz r3, C142626pB r4, C142596p8 r5, C122355ui r6, C19630wG r7, C20830yE r8, C21430zE r9, C19770wU r10) {
        this.A04 = r7;
        this.A06 = r8;
        this.A05 = r9;
        this.A03 = r6;
        this.A01 = r2.A00(r5, r4);
        this.A02 = new AnonymousClass6Th(r3, r6, r8, r10);
    }
}
