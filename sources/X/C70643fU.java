package X;

import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.3fU  reason: invalid class name and case insensitive filesystem */
public final class C70643fU implements AnonymousClass7gN {
    public final View A00;
    public final AnonymousClass17Y A01;
    public final C19730wQ A02;
    public final AnonymousClass16D A03;
    public final AnonymousClass171 A04;
    public final AnonymousClass1RY A05;
    public final AnonymousClass3HF A06;
    public final AnonymousClass1V6 A07;
    public final C19420v0 A08;
    public final C18820ts A09;
    public final C20810yC A0A;
    public final C19770wU A0B;
    public final AnonymousClass005 A0C;
    public final WeakReference A0D;

    public void Bcm(int i) {
        AnonymousClass1V6 r0 = this.A07;
        C46812bi A012 = r0.A01();
        C148826zU A002 = r0.A00();
        if (A002 != null && A012 != null) {
            this.A0B.Boy(new C80603vf(this, A012, 0, i, A002.A0P));
        }
    }

    public C70643fU(Activity activity, View view, AnonymousClass17Y r4, C19730wQ r5, AnonymousClass16D r6, AnonymousClass171 r7, AnonymousClass1RY r8, AnonymousClass3HF r9, AnonymousClass1V6 r10, C19420v0 r11, C18820ts r12, C20810yC r13, C19770wU r14, AnonymousClass005 r15) {
        C36321k7.A11(r13, view, r9);
        AnonymousClass00C.A0D(r15, 5);
        C36321k7.A13(r4, activity, r12);
        AnonymousClass00C.A0D(r5, 10);
        C36321k7.A15(r6, r7, r14);
        AnonymousClass00C.A0D(r11, 14);
        this.A0A = r13;
        this.A00 = view;
        this.A06 = r9;
        this.A07 = r10;
        this.A0C = r15;
        this.A01 = r4;
        this.A0D = AnonymousClass001.A0F(activity);
        this.A09 = r12;
        this.A05 = r8;
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A0B = r14;
        this.A08 = r11;
    }
}
