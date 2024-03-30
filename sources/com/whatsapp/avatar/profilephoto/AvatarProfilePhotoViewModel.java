package com.whatsapp.avatar.profilephoto;

import X.AnonymousClass00F;
import X.AnonymousClass04R;
import X.AnonymousClass17Y;
import X.AnonymousClass1BF;
import X.AnonymousClass1HC;
import X.AnonymousClass1P3;
import X.AnonymousClass5Rr;
import X.AnonymousClass61E;
import X.AnonymousClass6JK;
import X.AnonymousClass7U1;
import X.C001600r;
import X.C001700s;
import X.C023409w;
import X.C101394xU;
import X.C101404xV;
import X.C101424xX;
import X.C106055Ie;
import X.C116515ki;
import X.C130456Ld;
import X.C130926Mz;
import X.C132306Ta;
import X.C1498673b;
import X.C154977Uh;
import X.C164107rH;
import X.C19730wQ;
import X.C19770wU;
import X.C23871Ae;
import X.C24251Bs;
import X.C28201Rs;
import X.C36321k7;
import X.C36341k9;
import X.C36441kJ;
import X.C90514aH;
import com.whatsapp.R;
import java.util.List;
import java.util.NoSuchElementException;

public final class AvatarProfilePhotoViewModel extends AnonymousClass04R {
    public final C001700s A00;
    public final AnonymousClass17Y A01;
    public final C19730wQ A02;
    public final AnonymousClass6JK A03;
    public final AnonymousClass1BF A04;
    public final C23871Ae A05;
    public final AnonymousClass1HC A06;
    public final AnonymousClass1P3 A07;
    public final C28201Rs A08 = C36441kJ.A0t();
    public final C19770wU A09;
    public final C164107rH A0A;
    public final C116515ki A0B;
    public final C130456Ld A0C;
    public final C24251Bs A0D;
    public final List A0E;

    public static final void A01(AvatarProfilePhotoViewModel avatarProfilePhotoViewModel) {
        C101404xV[] r4 = new C101404xV[5];
        r4[0] = new C101404xV(Integer.valueOf(AnonymousClass00F.A00(avatarProfilePhotoViewModel.A03.A00.A00.getApplicationContext(), R.color.f6nameremoved)), true);
        r4[1] = new C101404xV((Integer) null, false);
        r4[2] = new C101404xV((Integer) null, false);
        r4[3] = new C101404xV((Integer) null, false);
        List A0m = C36341k9.A0m(new C101404xV((Integer) null, false), r4, 4);
        List<C101424xX> list = avatarProfilePhotoViewModel.A0E;
        for (C101424xX r42 : list) {
            if (r42.A03) {
                avatarProfilePhotoViewModel.A00.A0D(new C132306Ta(r42, (C101394xU) null, A0m, list, false, true, false));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public AvatarProfilePhotoViewModel(AnonymousClass17Y r9, C19730wQ r10, AnonymousClass6JK r11, C116515ki r12, AnonymousClass1BF r13, C130456Ld r14, C24251Bs r15, C23871Ae r16, AnonymousClass1HC r17, AnonymousClass1P3 r18, C19770wU r19) {
        C23871Ae r3 = r16;
        AnonymousClass1P3 r1 = r18;
        C19770wU r0 = r19;
        C36321k7.A1B(r9, r10, r0, r3, r1);
        AnonymousClass1HC r2 = r17;
        C36321k7.A13(r13, r2, r15);
        this.A01 = r9;
        this.A02 = r10;
        this.A09 = r0;
        this.A05 = r3;
        this.A07 = r1;
        this.A04 = r13;
        this.A06 = r2;
        this.A0D = r15;
        this.A0B = r12;
        this.A03 = r11;
        this.A0C = r14;
        C023409w r32 = C023409w.A00;
        this.A00 = C36441kJ.A0Z(new C132306Ta((C101424xX) null, (C101394xU) null, r32, r32, false, false, false));
        C101424xX[] r33 = new C101424xX[7];
        r33[0] = AnonymousClass6JK.A00(r11, R.color.f6nameremoved, R.color.f6nameremoved, R.string.f12nameremoved, true);
        r33[1] = AnonymousClass6JK.A00(r11, R.color.f6nameremoved, R.color.f6nameremoved, R.string.f12nameremoved, false);
        r33[2] = AnonymousClass6JK.A00(r11, R.color.f6nameremoved, R.color.f6nameremoved, R.string.f12nameremoved, false);
        r33[3] = AnonymousClass6JK.A00(r11, R.color.f6nameremoved, R.color.f6nameremoved, R.string.f12nameremoved, false);
        r33[4] = AnonymousClass6JK.A00(r11, R.color.f6nameremoved, R.color.f6nameremoved, R.string.f12nameremoved, false);
        r33[5] = AnonymousClass6JK.A00(r11, R.color.f6nameremoved, R.color.f6nameremoved, R.string.f12nameremoved, false);
        this.A0E = C36341k9.A0m(AnonymousClass6JK.A00(r11, R.color.f6nameremoved, R.color.f6nameremoved, R.string.f12nameremoved, false), r33, 6);
        C164107rH r02 = new C164107rH(this, 0);
        this.A0A = r02;
        r15.registerObserver(r02);
        A01(this);
        if (r13.A01()) {
            A02(this, "profile_photo_tool", 0, false);
        } else {
            this.A08.A0D(AnonymousClass5Rr.AVATAR_EDITOR);
        }
    }

    public static final void A02(AvatarProfilePhotoViewModel avatarProfilePhotoViewModel, String str, int i, boolean z) {
        AnonymousClass1HC r1 = avatarProfilePhotoViewModel.A06;
        int A002 = r1.A00();
        r1.A01(A002, "fetch_poses");
        r1.A05(C106055Ie.A00, str, A002);
        C130456Ld r2 = avatarProfilePhotoViewModel.A0C;
        r2.A03.Bp1(new C1498673b(r2, new C154977Uh(avatarProfilePhotoViewModel, i, A002), new AnonymousClass7U1(avatarProfilePhotoViewModel, A002), A002, 1, z));
    }

    public static final void A03(AvatarProfilePhotoViewModel avatarProfilePhotoViewModel, boolean z) {
        Object r2;
        C001600r r1 = avatarProfilePhotoViewModel.A00;
        C132306Ta A0a = C90514aH.A0a(r1);
        List list = A0a.A03;
        List list2 = A0a.A02;
        C101424xX r3 = A0a.A00;
        C101394xU r4 = A0a.A01;
        boolean z2 = A0a.A05;
        if (z) {
            boolean z3 = A0a.A04;
            C36321k7.A0x(list, list2);
            r1.A0C(new C132306Ta(r3, r4, list, list2, false, z2, z3));
            r1 = avatarProfilePhotoViewModel.A08;
            r2 = AnonymousClass5Rr.CLOSE_SCREEN;
        } else {
            C36321k7.A0v(list, 1, list2);
            r2 = new C132306Ta(r3, r4, list, list2, false, z2, true);
        }
        r1.A0C(r2);
    }

    public void A0R() {
        this.A0D.unregisterObserver(this.A0A);
        AnonymousClass61E.A00(((C130926Mz) this.A0C.A04.get()).A00, false);
    }
}
