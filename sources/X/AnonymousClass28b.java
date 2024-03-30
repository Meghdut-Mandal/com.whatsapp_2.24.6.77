package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.28b  reason: invalid class name */
public final class AnonymousClass28b extends AnonymousClass18Q {
    public C49682jW A00;
    public Integer A01 = C36371kC.A0o();
    public Runnable A02;
    public final AnonymousClass01L A03;
    public final C19700wN A04;
    public final C225014r A05;
    public final AnonymousClass17Y A06;
    public final C21100yf A07;
    public final AnonymousClass1X4 A08;
    public final AnonymousClass1NG A09;
    public final C19600wD A0A;
    public final AnonymousClass16D A0B;
    public final AnonymousClass171 A0C;
    public final C63633Ku A0D;
    public final C21060yb A0E;
    public final C19970wo A0F;
    public final C19420v0 A0G;
    public final C18820ts A0H;
    public final AnonymousClass1A5 A0I;
    public final C24381Cf A0J;
    public final AnonymousClass17X A0K;
    public final C24541Cv A0L;
    public final AnonymousClass4UR A0M;
    public final C54192sY A0N;
    public final AnonymousClass1N0 A0O;
    public final C1261362r A0P;
    public final AnonymousClass6O1 A0Q;
    public final AnonymousClass1XN A0R;
    public final AnonymousClass1H2 A0S;
    public final EmojiSearchProvider A0T;
    public final C20810yC A0U;
    public final C20500xf A0V;
    public final C21010yW A0W;
    public final C20350xQ A0X;
    public final C20510xg A0Y;
    public final AnonymousClass11F A0Z;
    public final AnonymousClass1C4 A0a;
    public final C19890wg A0b;
    public final AnonymousClass1N2 A0c;
    public final C19770wU A0d;
    public final C19460v5 A0e;
    public final C24801Dv A0f;
    public final C87444Ov A0g;
    public final C87454Ow A0h;
    public final C65373Ru A0i;
    public final C33771fu A0j;
    public final AnonymousClass185 A0k;
    public final AnonymousClass171 A0l;
    public final C235618y A0m;
    public final C33751fs A0n;
    public final C64693Pb A0o;
    public final C220412q A0p;
    public final AnonymousClass1DW A0q;
    public final AnonymousClass17V A0r;
    public final AnonymousClass1EL A0s;
    public final AnonymousClass1CF A0t;
    public final AnonymousClass3O0 A0u;
    public final AnonymousClass1AW A0v;
    public final AnonymousClass1EO A0w;
    public final C20380xT A0x;
    public final C33051ed A0y;

    public Dialog A00(AnonymousClass141 r47, int i) {
        C39001qm r6;
        int i2;
        DialogInterface.OnClickListener onClickListener;
        int i3;
        C39001qm A002;
        AnonymousClass147 A012;
        int i4;
        C62473Gh selectedMessages;
        int i5;
        int i6;
        int i7 = i;
        if (i7 == 0) {
            AnonymousClass01L r3 = this.A03;
            AnonymousClass3SJ.A00(r3, 0);
            AnonymousClass3SJ.A00(r3, 20);
            AnonymousClass4Y2 r4 = new AnonymousClass4Y2(this, 0);
            r3.getString(R.string.f12nameremoved);
            AnonymousClass0FM create = this.A0y.A00(r3, r4, 1, 3, 0, true).create();
            create.show();
            return create;
        }
        AnonymousClass141 r2 = r47;
        if (i7 == 28 || i7 == 29) {
            AnonymousClass01L r62 = this.A03;
            AnonymousClass3SJ.A00(r62, i7);
            Object[] objArr = new Object[1];
            C36361kB.A1F(this.A0C, r2, objArr, 0);
            r62.getString(R.string.f12nameremoved, objArr);
            return this.A0y.A00(r62, new AnonymousClass4Y2(new C79183tJ(r2, this, i7), 2), 1, 2, 0, false).create();
        } else if (i7 == 20) {
            AnonymousClass01L r42 = this.A03;
            AnonymousClass3SJ.A00(r42, 0);
            AnonymousClass3SJ.A00(r42, 20);
            C89814Xz r22 = new C89814Xz(this, 1);
            r42.getString(R.string.f12nameremoved);
            return this.A0y.A00(r42, new AnonymousClass4Y2(r22, 2), 1, 3, 0, false).create();
        } else {
            if (i7 == 2) {
                AnonymousClass4XM r1 = new AnonymousClass4XM(this, 42);
                r6 = AnonymousClass3LW.A00(this.A03);
                r6.A0d(R.string.f12nameremoved);
                r6.A0c(R.string.f12nameremoved);
                r6.A0h(r1, R.string.f12nameremoved);
            } else {
                if (i7 == 106 || i7 == 603 || i7 == 607 || i7 == 608) {
                    if (AnonymousClass3M3.A01(this.A0V, this.A0Z)) {
                        i3 = R.string.f12nameremoved;
                    } else if (i7 == 106) {
                        i3 = R.string.f12nameremoved;
                    } else if (i7 == 607) {
                        i3 = R.string.f12nameremoved;
                    } else {
                        i3 = R.string.f12nameremoved;
                        if (i7 == 608) {
                            i3 = R.string.f12nameremoved;
                        }
                    }
                    AnonymousClass01L r5 = this.A03;
                    A002 = AnonymousClass3LW.A00(r5);
                    Object[] objArr2 = new Object[1];
                    C36361kB.A1F(this.A0C, r2, objArr2, 0);
                    A002.A0p(r5.getString(i3, objArr2));
                    A002.A0h(new AnonymousClass4X6(r2, i7, 2, this), R.string.f12nameremoved);
                    i2 = R.string.f12nameremoved;
                    onClickListener = new C89784Xw(this, i7, 4);
                } else {
                    if (i7 == 7) {
                        Log.w("conversation/dialog/oom");
                        r6 = AnonymousClass3LW.A00(this.A03);
                        r6.A0c(R.string.f12nameremoved);
                        i5 = R.string.f12nameremoved;
                        i6 = 44;
                    } else if (i7 == 8) {
                        Log.e("conversation/dialog/not-an-image");
                        r6 = AnonymousClass3LW.A00(this.A03);
                        r6.A0c(R.string.f12nameremoved);
                        i5 = R.string.f12nameremoved;
                        i6 = 45;
                    } else {
                        if (i7 == 9) {
                            Log.i("conversation/warned-about-call-charges");
                            A002 = AnonymousClass3LW.A00(this.A03);
                            A002.A0c(R.string.f12nameremoved);
                            C39001qm.A0H(A002, this, 46, R.string.f12nameremoved);
                            i2 = R.string.f12nameremoved;
                            i4 = 47;
                        } else if (i7 == 10) {
                            return this.A0o.A01(this.A03, this.A05, r2);
                        } else {
                            if (i7 == 115) {
                                Log.i("conversation/dialog software-about-to-expire");
                                return this.A0i.A02(this.A03, this.A0j);
                            } else if (i7 == 12) {
                                Log.w("conversation/add existing contact: activity not found, probably tablet");
                                r6 = AnonymousClass3LW.A00(this.A03);
                                r6.A0c(R.string.f12nameremoved);
                                i5 = R.string.f12nameremoved;
                                i6 = 48;
                            } else {
                                if (i7 == 13) {
                                    C89874Yf r32 = (C89874Yf) this.A0M;
                                    if (!(r32.A01 == 0 || (selectedMessages = ((C70803fk) r32.A00).A2l.getSelectedMessages()) == null)) {
                                        HashMap hashMap = selectedMessages.A03;
                                        if (!hashMap.isEmpty()) {
                                            StringBuilder A0u2 = AnonymousClass000.A0u();
                                            A0u2.append("conversation/dialog/delete/");
                                            C36321k7.A1Y(A0u2, hashMap.size());
                                            AnonymousClass01L r12 = this.A03;
                                            C19970wo r28 = this.A0F;
                                            C20810yC r27 = this.A0U;
                                            AnonymousClass17Y r25 = this.A06;
                                            C19770wU r23 = this.A0d;
                                            C21010yW r21 = this.A0W;
                                            AnonymousClass1H2 r20 = this.A0S;
                                            AnonymousClass1X4 r222 = this.A08;
                                            AnonymousClass16D r11 = this.A0B;
                                            AnonymousClass1DW r19 = this.A0q;
                                            AnonymousClass171 r10 = this.A0C;
                                            C18820ts r29 = this.A0H;
                                            C235618y r26 = this.A0m;
                                            AnonymousClass1EL r18 = this.A0s;
                                            AnonymousClass1CF r17 = this.A0t;
                                            AnonymousClass17V r16 = this.A0r;
                                            AnonymousClass185 r24 = this.A0k;
                                            C19420v0 r15 = this.A0G;
                                            C19460v5 r9 = this.A0e;
                                            AnonymousClass17X r8 = this.A0K;
                                            AnonymousClass3O0 r7 = this.A0u;
                                            HashSet hashSet = new HashSet(hashMap.values());
                                            AnonymousClass11F A0j2 = C36351kA.A0j(r2);
                                            C87454Ow r52 = this.A0h;
                                            C87444Ov r43 = this.A0g;
                                            AnonymousClass1AW r33 = this.A0v;
                                            AnonymousClass1EO r210 = this.A0w;
                                            C220412q r13 = this.A0p;
                                            C220412q r30 = r13;
                                            AnonymousClass17X r31 = r8;
                                            AnonymousClass1DW r322 = r19;
                                            AnonymousClass1H2 r332 = r20;
                                            C20810yC r34 = r27;
                                            C21010yW r35 = r21;
                                            AnonymousClass17V r36 = r16;
                                            AnonymousClass1EL r37 = r18;
                                            AnonymousClass1CF r38 = r17;
                                            AnonymousClass3O0 r39 = r7;
                                            AnonymousClass1AW r40 = r33;
                                            AnonymousClass1EO r41 = r210;
                                            C19770wU r422 = r23;
                                            return AnonymousClass3SH.A00(r12, r9, new C89444Wo(r12, 0), r43, r52, r25, r222, r11, r24, r10, r26, r28, r15, r29, r30, r31, r322, r332, r34, r35, r36, r37, r38, r39, r40, r41, r422, AnonymousClass3SH.A01(r12, r11, r10, A0j2, hashSet), hashSet, true);
                                        }
                                    }
                                    Log.e("conversation/dialog/delete no messages");
                                } else if (i7 == 17) {
                                    AnonymousClass01L r53 = this.A03;
                                    A002 = AnonymousClass3LW.A00(r53);
                                    Object[] objArr3 = new Object[1];
                                    AnonymousClass000.A1L(objArr3, 65536, 0);
                                    A002.A0p(r53.getString(R.string.f12nameremoved, objArr3));
                                    C39001qm.A0H(A002, this, 49, R.string.f12nameremoved);
                                    i2 = R.string.f12nameremoved;
                                    i4 = 43;
                                } else if (i7 == 25) {
                                    C225314u r102 = (C225314u) this.A03;
                                    C24801Dv r92 = this.A0f;
                                    C20380xT r14 = this.A0x;
                                    return C53132qp.A00(r92, r102, new C89464Wq(r102, this.A0G, 25, 1), this.A0n, this.A0Z, r14, true);
                                } else if (i7 == 19) {
                                    C225314u r103 = (C225314u) this.A03;
                                    C24801Dv r93 = this.A0f;
                                    C20380xT r142 = this.A0x;
                                    return C53132qp.A00(r93, r103, new C89464Wq(r103, this.A0G, 19, 1), this.A0n, this.A0Z, r142, false);
                                } else if (i7 == 23) {
                                    C225314u r44 = (C225314u) this.A03;
                                    C24801Dv r310 = this.A0f;
                                    C20380xT r82 = this.A0x;
                                    return C53132qp.A00(r310, r44, new C89464Wq(r44, this.A0G, 23, 0), this.A0n, this.A0Z, r82, true);
                                } else if (i7 == 24) {
                                    C225314u r45 = (C225314u) this.A03;
                                    C24801Dv r311 = this.A0f;
                                    C20380xT r83 = this.A0x;
                                    return C53132qp.A00(r311, r45, new C89464Wq(r45, this.A0G, 24, 0), this.A0n, this.A0Z, r83, false);
                                } else if (i7 != 30 || (A012 = C65533Sl.A01(this.A0Z)) == null) {
                                    return null;
                                } else {
                                    C20810yC r252 = this.A0U;
                                    AnonymousClass01L r54 = this.A03;
                                    AnonymousClass17Y r372 = this.A06;
                                    AnonymousClass1C4 r112 = this.A0a;
                                    C21100yf r122 = this.A07;
                                    C18820ts r223 = this.A0H;
                                    AnonymousClass171 r132 = this.A0C;
                                    AnonymousClass16D r94 = this.A0B;
                                    C20350xQ r72 = this.A0X;
                                    C20510xg r63 = this.A0Y;
                                    C63433Ka r143 = new C63433Ka((View) null, (C225314u) r54, r372, r122, this.A0A, r94, r132, r223, this.A0J, this.A0K, r252, r72, r63, A012, r112);
                                    C19970wo r172 = this.A0F;
                                    AnonymousClass1N2 r162 = this.A0c;
                                    C19700wN r144 = this.A04;
                                    AnonymousClass1H2 r133 = this.A0S;
                                    AnonymousClass1XN r113 = this.A0R;
                                    C21060yb r104 = this.A0E;
                                    C1261362r r95 = this.A0P;
                                    EmojiSearchProvider emojiSearchProvider = this.A0T;
                                    C19420v0 r64 = this.A0G;
                                    C19890wg r46 = this.A0b;
                                    AnonymousClass6O1 r312 = this.A0Q;
                                    AnonymousClass1N0 r211 = this.A0O;
                                    AnonymousClass1N2 r292 = r162;
                                    AnonymousClass17Y r152 = r372;
                                    C21060yb r163 = r104;
                                    C19420v0 r182 = r64;
                                    C18820ts r192 = r223;
                                    AnonymousClass3R5 r202 = new AnonymousClass3R5(r143, 2);
                                    AnonymousClass1N0 r212 = r211;
                                    C1261362r r224 = r95;
                                    AnonymousClass6O1 r232 = r312;
                                    AnonymousClass1XN r242 = r113;
                                    AnonymousClass1H2 r253 = r133;
                                    AnonymousClass01L r134 = r54;
                                    AnonymousClass227 r123 = new AnonymousClass227(r134, r144, r152, r163, r172, r182, r192, r202, r212, r224, r232, r242, r253, emojiSearchProvider, r252, r46, r292, "", 30, R.string.f12nameremoved, Math.max(0, r122.A04(C21100yf.A1v)), R.string.f12nameremoved, R.string.f12nameremoved, 16385);
                                    r123.A04 = false;
                                    return r123;
                                }
                                return null;
                            }
                        }
                        onClickListener = new AnonymousClass4XM(this, i4);
                    }
                    C39001qm.A0H(r6, this, i6, i5);
                }
                r6.A0f(onClickListener, i2);
            }
            return r6.create();
        }
    }

    public void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
        this.A02 = null;
        C49682jW r1 = this.A00;
        if (r1 != null) {
            r1.A01 = null;
            r1.A00 = null;
            r1.A0D(true);
            this.A00 = null;
        }
    }

    public AnonymousClass28b(AnonymousClass01L r4, C19460v5 r5, C24801Dv r6, C19700wN r7, C87444Ov r8, C87454Ow r9, C225014r r10, AnonymousClass17Y r11, C21100yf r12, C65373Ru r13, C33771fu r14, AnonymousClass1X4 r15, AnonymousClass1NG r16, C19600wD r17, AnonymousClass16D r18, AnonymousClass185 r19, AnonymousClass171 r20, AnonymousClass171 r21, C235618y r22, C33751fs r23, C64693Pb r24, C63633Ku r25, C21060yb r26, C19970wo r27, C19420v0 r28, C18820ts r29, C220412q r30, AnonymousClass1A5 r31, C24381Cf r32, AnonymousClass17X r33, C24541Cv r34, AnonymousClass1DW r35, AnonymousClass4UR r36, C54192sY r37, AnonymousClass1N0 r38, C1261362r r39, AnonymousClass6O1 r40, AnonymousClass1XN r41, AnonymousClass1H2 r42, EmojiSearchProvider emojiSearchProvider, C20810yC r44, C20500xf r45, C21010yW r46, AnonymousClass17V r47, C20350xQ r48, C20510xg r49, AnonymousClass1EL r50, AnonymousClass1CF r51, AnonymousClass11F r52, AnonymousClass3O0 r53, AnonymousClass1C4 r54, C19890wg r55, AnonymousClass1AW r56, AnonymousClass1EO r57, C20380xT r58, C33051ed r59, AnonymousClass1N2 r60, C19770wU r61) {
        this.A03 = r4;
        this.A0F = r27;
        this.A0U = r44;
        this.A0j = r14;
        this.A0c = r60;
        this.A06 = r11;
        this.A04 = r7;
        this.A0d = r61;
        this.A0W = r46;
        this.A0p = r30;
        this.A0S = r42;
        this.A0a = r54;
        this.A07 = r12;
        this.A08 = r15;
        this.A0V = r45;
        this.A0R = r41;
        this.A0f = r6;
        this.A0B = r18;
        this.A0q = r35;
        this.A0x = r58;
        this.A0E = r26;
        this.A0C = r20;
        this.A0H = r29;
        this.A0P = r39;
        this.A09 = r16;
        this.A0X = r48;
        this.A0Y = r49;
        this.A0L = r34;
        this.A0m = r22;
        this.A0s = r50;
        this.A0D = r25;
        this.A0t = r51;
        this.A0i = r13;
        this.A0r = r47;
        this.A0e = r5;
        this.A0T = emojiSearchProvider;
        this.A0k = r19;
        this.A0G = r28;
        this.A0l = r21;
        this.A0n = r23;
        this.A0J = r32;
        this.A0o = r24;
        this.A0y = r59;
        this.A0K = r33;
        this.A0b = r55;
        this.A0A = r17;
        this.A0I = r31;
        this.A0u = r53;
        this.A0Q = r40;
        this.A0O = r38;
        this.A0w = r57;
        this.A05 = r10;
        this.A0h = r9;
        this.A0g = r8;
        AnonymousClass4UR r2 = r36;
        this.A0M = r2;
        this.A0v = r56;
        this.A0Z = r52;
        this.A0N = r37;
        this.A02 = new C80403vL(this, r10, r2, 34);
    }
}
