package X;

/* renamed from: X.3cf  reason: invalid class name and case insensitive filesystem */
public class C68913cf implements C20420xX, AnonymousClass1FP {
    public final C19730wQ A00;
    public final C25951Ih A01;
    public final AnonymousClass16D A02;
    public final C27301Nr A03;
    public final AnonymousClass1A6 A04;
    public final C19970wo A05;
    public final C19420v0 A06;
    public final AnonymousClass17X A07;
    public final AnonymousClass12P A08;
    public final AnonymousClass12O A09;
    public final AnonymousClass1OE A0A;
    public final C231417i A0B;
    public final C20810yC A0C;
    public final C19770wU A0D;

    public /* synthetic */ void BYl() {
    }

    public /* synthetic */ void BYm() {
    }

    public /* synthetic */ void BYn() {
    }

    public /* synthetic */ void BYp() {
    }

    public static boolean A00(AnonymousClass3QO r9, C68913cf r10, long j) {
        long j2 = r9.A05;
        if (j - j2 >= ((long) Math.min(35, Math.max(r10.A0C.A07(730), 1))) * 86400) {
            return true;
        }
        if (r9.A02 <= j2 || r9.A04 == C36341k9.A0B(C36341k9.A0E(r10.A06), "adv_last_device_job_ts") || (j * 1000) - r9.A03 < 90000000) {
            return false;
        }
        return true;
    }

    public void BYo() {
        Boolean bool = C18750th.A03;
        this.A0D.Boz(new C81113wU((Object) this, 29), "DeviceADVInfoChecker/checkDeviceListADVInfo");
    }

    public void BYy() {
        this.A0D.Boz(new C81113wU((Object) this, 29), "DeviceADVInfoChecker/checkDeviceListADVInfo");
    }

    public C68913cf(C19730wQ r1, C25951Ih r2, AnonymousClass16D r3, C27301Nr r4, AnonymousClass1A6 r5, C19970wo r6, C19420v0 r7, AnonymousClass17X r8, AnonymousClass12P r9, AnonymousClass12O r10, AnonymousClass1OE r11, C231417i r12, C20810yC r13, C19770wU r14) {
        this.A05 = r6;
        this.A0C = r13;
        this.A00 = r1;
        this.A0D = r14;
        this.A02 = r3;
        this.A09 = r10;
        this.A03 = r4;
        this.A0B = r12;
        this.A0A = r11;
        this.A08 = r9;
        this.A06 = r7;
        this.A04 = r5;
        this.A07 = r8;
        this.A01 = r2;
    }
}
