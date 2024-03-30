package X;

import androidx.appcompat.widget.SwitchCompat;

/* renamed from: X.3Kb  reason: invalid class name and case insensitive filesystem */
public class C63443Kb {
    public String A00;
    public boolean A01;
    public boolean A02 = false;
    public final C19700wN A03;
    public final AnonymousClass17Y A04;
    public final C64523Oi A05;
    public final C62533Gn A06;
    public final AnonymousClass3B5 A07;
    public final AnonymousClass3QT A08;
    public final AnonymousClass2Fm A09;
    public final C88714Tt A0A;
    public final AnonymousClass3P7 A0B;
    public final AnonymousClass312 A0C;
    public final C20810yC A0D;
    public final C19770wU A0E;
    public final Long A0F;
    public final Long A0G;
    public final C229216m A0H;
    public final C20830yE A0I;

    public void A02() {
        this.A02 = true;
        if (!AnonymousClass3T6.A04(this.A0H, this.A0I)) {
            this.A0A.requestPermission();
        } else {
            this.A0E.Bp6(C80213v2.A00(this, 33), "Save to Phone");
        }
    }

    public void A00() {
        if (AnonymousClass3T6.A04(this.A0H, this.A0I)) {
            if (this.A0G == null) {
                SwitchCompat switchCompat = this.A0C.A00;
                if (switchCompat.getVisibility() == 0) {
                    switchCompat.setChecked(true);
                    return;
                }
            }
            if (this.A02) {
                A02();
            } else {
                A01();
            }
        } else {
            this.A02 = false;
            this.A0C.A00.setChecked(false);
        }
    }

    public void A01() {
        AnonymousClass2Fm r1 = this.A09;
        if (!r1.A07()) {
            boolean A1Y = C36401kF.A1Y(this.A0D);
            this.A01 = A1Y;
            if (!A1Y || this.A0C.A00.isChecked()) {
                this.A0E.Bp2(C80213v2.A00(this, 31), "Saving Contact");
                return;
            }
            String A022 = r1.A02();
            StringBuilder A0v = AnonymousClass000.A0v(A022);
            A0v.append("@");
            AnonymousClass11F A0N = C36421kH.A0N(AnonymousClass000.A0q("s.whatsapp.net", A0v));
            AnonymousClass3IL r2 = null;
            Long l = this.A0G;
            if (l != null) {
                r2 = new AnonymousClass3IL(l.longValue(), A022);
            }
            this.A0B.A01(r2, A0N, this.A0F, A022, this.A00);
        }
    }

    public C63443Kb(C19700wN r3, AnonymousClass17Y r4, C229216m r5, C64523Oi r6, C62533Gn r7, AnonymousClass3B5 r8, AnonymousClass3QT r9, AnonymousClass2Fm r10, AnonymousClass3D5 r11, C88714Tt r12, AnonymousClass3P7 r13, AnonymousClass312 r14, C20830yE r15, C20810yC r16, C19770wU r17, Long l, Long l2, String str) {
        this.A0D = r16;
        this.A04 = r4;
        this.A0E = r17;
        this.A03 = r3;
        this.A0H = r5;
        this.A0I = r15;
        this.A05 = r6;
        this.A0A = r12;
        this.A08 = r9;
        this.A09 = r10;
        this.A0C = r14;
        this.A07 = r8;
        this.A0B = r13;
        this.A06 = r7;
        this.A0G = l;
        this.A0F = l2;
        this.A00 = str;
        C66943Xx r1 = new C66943Xx(this, 30);
        r11.A00.setOnClickListener(r1);
        r11.A01.setOnClickListener(r1);
    }
}
