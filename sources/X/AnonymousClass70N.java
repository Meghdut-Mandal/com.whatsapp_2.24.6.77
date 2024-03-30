package X;

import com.whatsapp.util.Log;

/* renamed from: X.70N  reason: invalid class name */
public final /* synthetic */ class AnonymousClass70N implements C25711Hj {
    public final /* synthetic */ AnonymousClass1D0 A00;
    public final /* synthetic */ C146506vi A01;
    public final /* synthetic */ C131516Pj A02;
    public final /* synthetic */ C101314xL A03;

    public /* synthetic */ AnonymousClass70N(AnonymousClass1D0 r1, C146506vi r2, C131516Pj r3, C101314xL r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final void accept(Object obj) {
        boolean A012;
        C21010yW r4;
        int i;
        AnonymousClass1D0 r5 = this.A00;
        C146506vi r6 = this.A01;
        C131516Pj r2 = this.A02;
        C101314xL r3 = this.A03;
        C123865xD r11 = (C123865xD) obj;
        int i2 = r11.A00;
        if (r6.A07() && ((A012 = AnonymousClass6H7.A01(i2)) || 27 == i2)) {
            if (A012) {
                Log.e("mediaJobManager/mediaUpload/whenResponse; express path upload failed, fallback to normal upload");
                r4 = r5.A04;
                i = 24;
            } else {
                if (27 == i2) {
                    Log.e("mediaJobManager/mediaUpload/whenResponse; express path upload no primary host, skip and fallback to normal upload");
                    r4 = r5.A04;
                    i = 26;
                }
                C19770wU r32 = r5.A0F;
                r6.A0N.A08(0);
                r6.A0X = "mms";
                r32.Boy(new C35631j0(r5, r6, new C131516Pj(r6, r6.A02()), 28));
            }
            Integer valueOf = Integer.valueOf(i);
            AnonymousClass590 r1 = new AnonymousClass590();
            r1.A0H = C36391kE.A0r();
            r1.A0I = null;
            r1.A0J = valueOf;
            r1.A0F = null;
            r4.Bly(r1);
            C19770wU r322 = r5.A0F;
            r6.A0N.A08(0);
            r6.A0X = "mms";
            r322.Boy(new C35631j0(r5, r6, new C131516Pj(r6, r6.A02()), 28));
        } else if (!(r2 instanceof AnonymousClass5BQ) || ((!AnonymousClass6H7.A01(i2) && 11 != i2) || !r5.A03.A0E(3602))) {
            C132976Wa r12 = r6.A0N;
            synchronized (r12) {
                r12.A0H = true;
            }
            r5.A0F.Boy(new C35631j0(r5, r6, r11, 29));
            r3.A0E();
        } else {
            r5.A0F.Boy(new C35341iX(r5, r6, new C131516Pj(r6, r6.A02()), i2, 8));
        }
    }
}
