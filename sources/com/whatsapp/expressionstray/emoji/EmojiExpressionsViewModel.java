package com.whatsapp.expressionstray.emoji;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass05E;
import X.AnonymousClass05L;
import X.AnonymousClass1H2;
import X.AnonymousClass1XN;
import X.AnonymousClass55Z;
import X.AnonymousClass63V;
import X.AnonymousClass6CK;
import X.AnonymousClass6O1;
import X.C005502l;
import X.C023109s;
import X.C023509x;
import X.C05750Qx;
import X.C1034255h;
import X.C1034355i;
import X.C1034455j;
import X.C109325Xd;
import X.C117175lp;
import X.C119585q6;
import X.C1256760v;
import X.C1270066o;
import X.C130496Lh;
import X.C18010sR;
import X.C19420v0;
import X.C19890wg;
import X.C36321k7;
import X.C36351kA;
import X.C36381kD;
import X.C36411kG;
import X.C90504aG;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class EmojiExpressionsViewModel extends AnonymousClass04R {
    public C18010sR A00 = C05750Qx.A00(C023109s.A00, -2);
    public final C19420v0 A01;
    public final AnonymousClass6O1 A02;
    public final AnonymousClass1XN A03;
    public final C117175lp A04;
    public final C130496Lh A05;
    public final AnonymousClass63V A06;
    public final C1270066o A07;
    public final C119585q6 A08;
    public final C19890wg A09;
    public final AtomicBoolean A0A = new AtomicBoolean(true);
    public final C005502l A0B;
    public final AnonymousClass05L A0C = AnonymousClass05E.A00(AnonymousClass55Z.A00);
    public final AnonymousClass1H2 A0D;

    public EmojiExpressionsViewModel(C19420v0 r4, AnonymousClass6O1 r5, AnonymousClass1XN r6, AnonymousClass1H2 r7, C117175lp r8, C130496Lh r9, AnonymousClass63V r10, C1270066o r11, C119585q6 r12, C19890wg r13, C005502l r14) {
        AnonymousClass00C.A0D(r7, 1);
        C36321k7.A19(r6, r12, r4, r10);
        AnonymousClass00C.A0D(r13, 6);
        C36321k7.A14(r5, r8, r11);
        AnonymousClass00C.A0D(r14, 11);
        this.A0D = r7;
        this.A03 = r6;
        this.A08 = r12;
        this.A01 = r4;
        this.A06 = r10;
        this.A09 = r13;
        this.A05 = r9;
        this.A02 = r5;
        this.A04 = r8;
        this.A07 = r11;
        this.A0B = r14;
    }

    public static final ArrayList A01(EmojiExpressionsViewModel emojiExpressionsViewModel, Integer num, List list, int i) {
        EmojiExpressionsViewModel emojiExpressionsViewModel2;
        Integer num2 = num;
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        AnonymousClass6CK r13 = null;
        boolean z = true;
        while (true) {
            emojiExpressionsViewModel2 = emojiExpressionsViewModel;
            if (!it.hasNext()) {
                break;
            }
            C1256760v r3 = (C1256760v) it.next();
            if (r3 instanceof C1034255h) {
                if (C36411kG.A1a(A0I2)) {
                    ArrayList A0z = C36351kA.A0z(A0I2);
                    Iterator it2 = A0I2.iterator();
                    while (it2.hasNext()) {
                        A0z.add(C90504aG.A0Q(it2).A03);
                    }
                    int[][] iArr = (int[][]) A0z.toArray(new int[0][]);
                    ArrayList A0z2 = C36351kA.A0z(A0I2);
                    Iterator it3 = A0I2.iterator();
                    while (it3.hasNext()) {
                        A0z2.add(C90504aG.A0Q(it3).A04);
                    }
                    int[][] iArr2 = (int[][]) A0z2.toArray(new int[0][]);
                    AnonymousClass1H2 r12 = emojiExpressionsViewModel2.A0D;
                    AnonymousClass00C.A0B(r13);
                    Integer num3 = null;
                    if (z) {
                        num3 = num2;
                    }
                    A0I.add(new C1034455j(r12, r13, num3, iArr, iArr2));
                    A0I2.clear();
                    if (z) {
                        z = false;
                    }
                }
                r13 = r3.A00();
                A0I.add(r3);
            } else if (r3 instanceof C1034355i) {
                if (r13 == null) {
                    r13 = r3.A00();
                }
                AnonymousClass6CK A002 = r3.A00();
                if (!AnonymousClass00C.A0J(A002, r13) || A0I2.size() >= i) {
                    ArrayList A0z3 = C36351kA.A0z(A0I2);
                    Iterator it4 = A0I2.iterator();
                    while (it4.hasNext()) {
                        A0z3.add(C90504aG.A0Q(it4).A03);
                    }
                    int[][] iArr3 = (int[][]) A0z3.toArray(new int[0][]);
                    ArrayList A0z4 = C36351kA.A0z(A0I2);
                    Iterator it5 = A0I2.iterator();
                    while (it5.hasNext()) {
                        A0z4.add(C90504aG.A0Q(it5).A04);
                    }
                    int[][] iArr4 = (int[][]) A0z4.toArray(new int[0][]);
                    AnonymousClass1H2 r122 = emojiExpressionsViewModel2.A0D;
                    AnonymousClass00C.A0B(r13);
                    Integer num4 = null;
                    if (z) {
                        num4 = num2;
                    }
                    A0I.add(new C1034455j(r122, r13, num4, iArr3, iArr4));
                    A0I2.clear();
                    A0I2.add(r3);
                    r13 = A002;
                    if (z) {
                        z = false;
                    }
                } else {
                    A0I2.add(r3);
                }
            }
        }
        if (C36411kG.A1a(A0I2)) {
            ArrayList A0z5 = C36351kA.A0z(A0I2);
            Iterator it6 = A0I2.iterator();
            while (it6.hasNext()) {
                A0z5.add(C90504aG.A0Q(it6).A03);
            }
            int[][] iArr5 = (int[][]) A0z5.toArray(new int[0][]);
            ArrayList A0z6 = C36351kA.A0z(A0I2);
            Iterator it7 = A0I2.iterator();
            while (it7.hasNext()) {
                A0z6.add(C90504aG.A0Q(it7).A04);
            }
            int[][] iArr6 = (int[][]) A0z6.toArray(new int[0][]);
            AnonymousClass1H2 r15 = emojiExpressionsViewModel2.A0D;
            AnonymousClass00C.A0B(r13);
            if (!z) {
                num2 = null;
            }
            A0I.add(new C1034455j(r15, r13, num2, iArr5, iArr6));
        }
        return A0I;
    }

    public final void A0S(int[] iArr, int i) {
        C36381kD.A1R(this.A0B, new EmojiExpressionsViewModel$onEmojiSelected$1(this, (C023509x) null, iArr, i), C109325Xd.A00(this));
    }
}
