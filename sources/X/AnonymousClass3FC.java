package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3FC  reason: invalid class name */
public final class AnonymousClass3FC {
    public final AnonymousClass17Y A00;
    public final AnonymousClass1X4 A01;
    public final AnonymousClass1NG A02;
    public final C19600wD A03;
    public final AnonymousClass16D A04;
    public final C220412q A05;
    public final C24381Cf A06;
    public final AnonymousClass3GX A07;
    public final C20350xQ A08;
    public final C20510xg A09;

    public final void A00(List list, int i, int i2, int i3, int i4) {
        long j;
        int i5 = i;
        if (i5 != -1) {
            C19600wD r11 = this.A03;
            if (!r11.A09()) {
                this.A00.A06(R.string.f12nameremoved, 0);
                return;
            }
            List list2 = list;
            Iterator it = list2.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                AnonymousClass11F A0a = C36401kF.A0a(it);
                C220412q r1 = this.A05;
                AnonymousClass16D r0 = this.A04;
                AnonymousClass00C.A0B(A0a);
                if (AnonymousClass3TD.A00(r0, r1, A0a) == 0) {
                    i6++;
                }
                if (i5 != -1) {
                    if (!r11.A09()) {
                        this.A00.A06(R.string.f12nameremoved, 1);
                    } else {
                        C18740tg.A06(A0a);
                        boolean z = A0a instanceof UserJid;
                        if (!z || !this.A02.A0O((UserJid) A0a)) {
                            boolean z2 = A0a instanceof AnonymousClass147;
                            if (z2) {
                                AnonymousClass00C.A0B(A0a);
                                C20510xg r12 = this.A09;
                                AnonymousClass00C.A0E(A0a, "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid");
                                AnonymousClass147 r02 = (AnonymousClass147) A0a;
                                r12.A0C(new AnonymousClass23D(this.A06, this.A08, r02, (String) null, (List) null, 224, true), r02, i5);
                            } else if (z) {
                                C36361kB.A1I(A0a);
                                this.A01.A0R((UserJid) A0a, true, i5, 3);
                            } else {
                                StringBuilder A0u = AnonymousClass000.A0u();
                                A0u.append("Ephemeral not supported for this type of jid, type=");
                                AnonymousClass00C.A0B(A0a);
                                C36351kA.A1R(A0u, A0a.getType());
                            }
                            AnonymousClass3GX r122 = this.A07;
                            AnonymousClass00C.A0D(A0a, 0);
                            C45282Qt r10 = new C45282Qt();
                            r10.A02 = C36441kJ.A0y(i5);
                            int i7 = i2;
                            if (i7 == -1) {
                                j = 0;
                            } else {
                                j = (long) i7;
                            }
                            r10.A03 = Long.valueOf(j);
                            r10.A00 = C36371kC.A0o();
                            r10.A04 = r122.A03.A03(A0a.getRawString());
                            if (z2) {
                                C20760y7 A0R = C36381kD.A0R(r122.A00, C65533Sl.A02(A0a));
                                AnonymousClass00C.A08(A0R);
                                r10.A01 = Integer.valueOf(AnonymousClass3UK.A02(A0R.size()));
                            }
                            r122.A02.Bly(r10);
                        } else {
                            int i8 = R.string.f12nameremoved;
                            if (i == 0) {
                                i8 = R.string.f12nameremoved;
                            }
                            this.A00.A06(i8, 1);
                        }
                    }
                }
            }
            AnonymousClass3GX r13 = this.A07;
            int i9 = i4;
            r13.A01(list2, 3, i5, i6, i3, i9);
            if (list2.size() > 0) {
                r13.A00(2, i9);
            }
        }
    }

    public AnonymousClass3FC(AnonymousClass17Y r2, AnonymousClass1X4 r3, AnonymousClass1NG r4, C19600wD r5, AnonymousClass16D r6, C220412q r7, C24381Cf r8, AnonymousClass3GX r9, C20350xQ r10, C20510xg r11) {
        C36321k7.A1B(r2, r7, r3, r6, r4);
        C36321k7.A13(r10, r11, r8);
        AnonymousClass00C.A0D(r5, 10);
        this.A00 = r2;
        this.A05 = r7;
        this.A01 = r3;
        this.A04 = r6;
        this.A02 = r4;
        this.A08 = r10;
        this.A09 = r11;
        this.A06 = r8;
        this.A07 = r9;
        this.A03 = r5;
    }
}
