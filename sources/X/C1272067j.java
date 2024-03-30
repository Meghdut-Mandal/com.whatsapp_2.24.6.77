package X;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* renamed from: X.67j  reason: invalid class name and case insensitive filesystem */
public class C1272067j {
    public C145886ug A00;
    public AnonymousClass512 A01;
    public final C116175kA A02;
    public final AnonymousClass7fR A03;
    public final C159177iw A04;
    public final C117285m0 A05;

    public synchronized void A00() {
        AnonymousClass512 r0 = this.A01;
        if (!(r0 == null || r0.A06.A06() == 2 || C36431kI.A1Y(this.A01.A06))) {
            this.A01.A06.A0D(true);
            this.A01 = null;
        }
    }

    public void A01(LatLng latLng, C159287j7 r20, C132406Tm r21, String str, String str2, float f) {
        LatLng latLng2 = latLng;
        ArrayList A032 = C132796Vh.A03(latLng2.A00, latLng2.A01, 10);
        C18740tg.A06(A032);
        ArrayList A042 = C132796Vh.A04(10, C36431kI.A09(A032.get(0)), C36431kI.A09(A032.get(1)));
        LatLng A0S = C90484aE.A0S((Number) A042.get(1), C90504aG.A01(A042.get(0)));
        synchronized (this) {
            A00();
            C145886ug r11 = new C145886ug(latLng2, r20, this, str, str2, f);
            this.A00 = r11;
            C116175kA r1 = this.A02;
            C159177iw r8 = this.A04;
            AnonymousClass7fR r7 = this.A03;
            C1265464l r12 = this.A05.A00;
            C18800tq r13 = r1.A00.A00;
            C19700wN A0V = C36391kE.A0V(r13);
            C19770wU A0Z = C36341k9.A0Z(r13);
            AnonymousClass512 r3 = new AnonymousClass512(A0S, A0V, C18830tt.A13(r13.A00), r7, r8, C36411kG.A0c(r13), C36341k9.A0T(r13), r11, r12, r21, A0Z);
            r3.A0B();
            this.A01 = r3;
        }
    }

    public C1272067j(C116175kA r1, AnonymousClass7fR r2, C159177iw r3, C117285m0 r4) {
        this.A04 = r3;
        this.A03 = r2;
        this.A05 = r4;
        this.A02 = r1;
    }
}
