package X;

import android.content.res.TypedArray;
import com.whatsapp.wds.components.list.listitem.WDSListItem;

/* renamed from: X.6Lw  reason: invalid class name and case insensitive filesystem */
public final class C130646Lw {
    public int A00;
    public int A01;
    public int A02;
    public C108385Th A03;
    public C108385Th A04;
    public C108385Th A05;
    public C108385Th A06;
    public C108155Sj A07;
    public C108155Sj A08;
    public C107915Rj A09;
    public C107915Rj A0A;
    public C108445Tn A0B;
    public C108445Tn A0C;
    public C108165Sk A0D;
    public C108165Sk A0E;
    public AnonymousClass5S1 A0F;
    public AnonymousClass5SS A0G;
    public AnonymousClass5S2 A0H;
    public AnonymousClass5ST A0I;
    public C108505Tt A0J = C108505Tt.BODY2;
    public C108505Tt A0K;
    public C108525Tv A0L;
    public AnonymousClass5TY A0M;
    public C108265Sv A0N;
    public AnonymousClass5S4 A0O;
    public String A0P;
    public String A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public final WDSListItem A0V;
    public final TypedArray A0W;

    public C130646Lw(TypedArray typedArray, WDSListItem wDSListItem) {
        C108165Sk r2;
        C108155Sj r22;
        C108445Tn r23;
        C108165Sk r8;
        C108155Sj r82;
        C108445Tn r83;
        C107915Rj r84;
        C108505Tt r14;
        String str;
        TypedArray typedArray2 = typedArray;
        boolean A1U = C90484aE.A1U(typedArray2);
        WDSListItem wDSListItem2 = wDSListItem;
        this.A0V = wDSListItem2;
        this.A0W = typedArray2;
        AnonymousClass5S2 r11 = AnonymousClass5S2.STANDARD;
        this.A0H = r11;
        AnonymousClass5S1 r10 = AnonymousClass5S1.NONE;
        this.A0F = r10;
        C108505Tt r9 = C108505Tt.BODY1;
        this.A0K = r9;
        AnonymousClass5ST r85 = AnonymousClass5ST.NONE;
        this.A0I = r85;
        C107915Rj r7 = C107915Rj.CIRCLE;
        this.A0A = r7;
        C108445Tn r24 = C108445Tn.A03;
        this.A0C = r24;
        C108155Sj r1 = C108155Sj.NEUTRAL;
        this.A08 = r1;
        C108165Sk r0 = C108165Sk.BORDERLESS;
        this.A0E = r0;
        AnonymousClass5SS r6 = AnonymousClass5SS.NONE;
        this.A0G = r6;
        this.A09 = r7;
        this.A0B = r24;
        this.A07 = r1;
        this.A0D = r0;
        C108385Th r02 = C108385Th.SPACING_DOUBLE;
        this.A04 = r02;
        this.A06 = r02;
        this.A03 = r02;
        this.A05 = C108385Th.SPACING_HALF;
        AnonymousClass5TY r5 = AnonymousClass5TY.MEDIUM;
        this.A0M = r5;
        C108525Tv r4 = C108525Tv.CIRCLE;
        this.A0L = r4;
        C108265Sv r3 = C108265Sv.NONE;
        this.A0N = r3;
        AnonymousClass5S4 r25 = AnonymousClass5S4.UNSEEN;
        this.A0O = r25;
        String str2 = null;
        if (typedArray2.hasValue(4)) {
            C18820ts r03 = wDSListItem2.A03;
            if (r03 != null) {
                str = r03.A0F(typedArray2, 4);
            } else {
                str = null;
            }
            this.A0Q = str;
        }
        if (typedArray2.hasValue(5)) {
            int i = typedArray2.getInt(5, 0);
            C108505Tt[] values = C108505Tt.values();
            if (i >= 0) {
                AnonymousClass00C.A0D(values, 0);
                if (i <= values.length - 1) {
                    r14 = values[i];
                    AnonymousClass00C.A0D(r14, 0);
                    boolean A1W = C36371kC.A1W(this.A0K, r14);
                    this.A0K = r14;
                    A01(this, A1W);
                }
            }
            r14 = r9;
            AnonymousClass00C.A0D(r14, 0);
            boolean A1W2 = C36371kC.A1W(this.A0K, r14);
            this.A0K = r14;
            A01(this, A1W2);
        }
        if (typedArray2.hasValue(A1U ? 1 : 0)) {
            C18820ts r142 = wDSListItem2.A03;
            this.A0P = r142 != null ? r142.A0F(typedArray2, A1U ? 1 : 0) : str2;
        }
        if (typedArray2.hasValue(3)) {
            int i2 = typedArray2.getInt(3, 0);
            C108505Tt[] values2 = C108505Tt.values();
            if (i2 >= 0) {
                AnonymousClass00C.A0D(values2, 0);
                if (i2 <= values2.length - 1) {
                    r9 = values2[i2];
                }
            }
            AnonymousClass00C.A0D(r9, 0);
            boolean A1W3 = C36371kC.A1W(this.A0J, r9);
            this.A0J = r9;
            A01(this, A1W3);
        }
        if (typedArray2.hasValue(30)) {
            int i3 = typedArray2.getInt(30, 0);
            AnonymousClass5ST[] values3 = AnonymousClass5ST.values();
            if (i3 >= 0) {
                AnonymousClass00C.A0D(values3, 0);
                if (i3 <= values3.length - 1) {
                    r85 = values3[i3];
                }
            }
            AnonymousClass00C.A0D(r85, 0);
            boolean A1W4 = C36371kC.A1W(this.A0I, r85);
            this.A0I = r85;
            A01(this, A1W4);
        }
        if (typedArray2.hasValue(19)) {
            this.A01 = typedArray2.getResourceId(19, 0);
        }
        if (typedArray2.hasValue(22)) {
            int i4 = typedArray2.getInt(22, 0);
            C107915Rj[] values4 = C107915Rj.values();
            if (i4 >= 0) {
                AnonymousClass00C.A0D(values4, 0);
                if (i4 <= values4.length - 1) {
                    r84 = values4[i4];
                    AnonymousClass00C.A0D(r84, 0);
                    boolean A1W5 = C36371kC.A1W(this.A0A, r84);
                    this.A0A = r84;
                    A01(this, A1W5);
                }
            }
            r84 = r7;
            AnonymousClass00C.A0D(r84, 0);
            boolean A1W52 = C36371kC.A1W(this.A0A, r84);
            this.A0A = r84;
            A01(this, A1W52);
        }
        if (typedArray2.hasValue(23)) {
            int i5 = typedArray2.getInt(23, 0);
            C108445Tn[] values5 = C108445Tn.values();
            if (i5 >= 0) {
                AnonymousClass00C.A0D(values5, 0);
                if (i5 <= values5.length - 1) {
                    r83 = values5[i5];
                    AnonymousClass00C.A0D(r83, 0);
                    boolean A1W6 = C36371kC.A1W(this.A0C, r83);
                    this.A0C = r83;
                    A01(this, A1W6);
                }
            }
            r83 = C108445Tn.A04;
            AnonymousClass00C.A0D(r83, 0);
            boolean A1W62 = C36371kC.A1W(this.A0C, r83);
            this.A0C = r83;
            A01(this, A1W62);
        }
        if (typedArray2.hasValue(20)) {
            int i6 = typedArray2.getInt(20, 0);
            C108155Sj[] values6 = C108155Sj.values();
            if (i6 >= 0) {
                AnonymousClass00C.A0D(values6, 0);
                if (i6 <= values6.length - 1) {
                    r82 = values6[i6];
                    AnonymousClass00C.A0D(r82, 0);
                    boolean A1W7 = C36371kC.A1W(this.A08, r82);
                    this.A08 = r82;
                    A01(this, A1W7);
                }
            }
            r82 = C108155Sj.NORMAL;
            AnonymousClass00C.A0D(r82, 0);
            boolean A1W72 = C36371kC.A1W(this.A08, r82);
            this.A08 = r82;
            A01(this, A1W72);
        }
        if (typedArray2.hasValue(24)) {
            int i7 = typedArray2.getInt(24, 0);
            C108165Sk[] values7 = C108165Sk.values();
            if (i7 >= 0) {
                AnonymousClass00C.A0D(values7, 0);
                if (i7 <= values7.length - 1) {
                    r8 = values7[i7];
                    AnonymousClass00C.A0D(r8, 0);
                    boolean A1W8 = C36371kC.A1W(this.A0E, r8);
                    this.A0E = r8;
                    A01(this, A1W8);
                }
            }
            r8 = C108165Sk.FILLED;
            AnonymousClass00C.A0D(r8, 0);
            boolean A1W82 = C36371kC.A1W(this.A0E, r8);
            this.A0E = r8;
            A01(this, A1W82);
        }
        if (typedArray2.hasValue(21)) {
            this.A0T = typedArray2.getBoolean(21, false);
        }
        if (typedArray2.hasValue(26)) {
            this.A02 = typedArray2.getResourceId(26, 0);
        }
        if (typedArray2.hasValue(25)) {
            int i8 = typedArray2.getInt(25, 0);
            C108265Sv[] values8 = C108265Sv.values();
            if (i8 >= 0) {
                AnonymousClass00C.A0D(values8, 0);
                if (i8 <= values8.length - 1) {
                    r3 = values8[i8];
                }
            }
            AnonymousClass00C.A0D(r3, 0);
            boolean A1W9 = C36371kC.A1W(this.A0N, r3);
            this.A0N = r3;
            A01(this, A1W9);
        }
        if (typedArray2.hasValue(27)) {
            int i9 = typedArray2.getInt(27, 0);
            C108525Tv[] values9 = C108525Tv.values();
            if (i9 >= 0) {
                AnonymousClass00C.A0D(values9, 0);
                if (i9 <= values9.length - 1) {
                    r4 = values9[i9];
                }
            }
            AnonymousClass00C.A0D(r4, 0);
            boolean A1W10 = C36371kC.A1W(this.A0L, r4);
            this.A0L = r4;
            A01(this, A1W10);
        }
        if (typedArray2.hasValue(28)) {
            int i10 = typedArray2.getInt(28, 0);
            AnonymousClass5TY[] values10 = AnonymousClass5TY.values();
            if (i10 >= 0) {
                AnonymousClass00C.A0D(values10, 0);
                if (i10 <= values10.length - 1) {
                    r5 = values10[i10];
                }
            }
            AnonymousClass00C.A0D(r5, 0);
            boolean A1W11 = C36371kC.A1W(this.A0M, r5);
            this.A0M = r5;
            A01(this, A1W11);
        }
        if (typedArray2.hasValue(28)) {
            int i11 = typedArray2.getInt(28, 0);
            AnonymousClass5S4[] values11 = AnonymousClass5S4.values();
            if (i11 >= 0) {
                AnonymousClass00C.A0D(values11, 0);
                if (i11 <= values11.length - 1) {
                    r25 = values11[i11];
                }
            }
            AnonymousClass00C.A0D(r25, 0);
            boolean A1W12 = C36371kC.A1W(this.A0O, r25);
            this.A0O = r25;
            A01(this, A1W12);
        }
        if (typedArray2.hasValue(29)) {
            this.A0S = typedArray2.getBoolean(29, false);
        }
        if (typedArray2.hasValue(16)) {
            int i12 = typedArray2.getInt(16, 0);
            AnonymousClass5SS[] values12 = AnonymousClass5SS.values();
            if (i12 >= 0) {
                AnonymousClass00C.A0D(values12, 0);
                if (i12 <= values12.length - 1) {
                    r6 = values12[i12];
                }
            }
            AnonymousClass00C.A0D(r6, 0);
            boolean A1W13 = C36371kC.A1W(this.A0G, r6);
            this.A0G = r6;
            A01(this, A1W13);
        }
        if (typedArray2.hasValue(10)) {
            this.A00 = typedArray2.getResourceId(10, 0);
        }
        if (typedArray2.hasValue(13)) {
            int i13 = typedArray2.getInt(13, 0);
            C107915Rj[] values13 = C107915Rj.values();
            if (i13 >= 0) {
                AnonymousClass00C.A0D(values13, 0);
                if (i13 <= values13.length - 1) {
                    r7 = values13[i13];
                }
            }
            AnonymousClass00C.A0D(r7, 0);
            boolean A1W14 = C36371kC.A1W(this.A09, r7);
            this.A09 = r7;
            A01(this, A1W14);
        }
        if (typedArray2.hasValue(14)) {
            int i14 = typedArray2.getInt(14, 0);
            C108445Tn[] values14 = C108445Tn.values();
            if (i14 >= 0) {
                AnonymousClass00C.A0D(values14, 0);
                if (i14 <= values14.length - 1) {
                    r23 = values14[i14];
                    AnonymousClass00C.A0D(r23, 0);
                    boolean A1W15 = C36371kC.A1W(this.A0B, r23);
                    this.A0B = r23;
                    A01(this, A1W15);
                }
            }
            r23 = C108445Tn.A04;
            AnonymousClass00C.A0D(r23, 0);
            boolean A1W152 = C36371kC.A1W(this.A0B, r23);
            this.A0B = r23;
            A01(this, A1W152);
        }
        if (typedArray2.hasValue(11)) {
            int i15 = typedArray2.getInt(11, 0);
            C108155Sj[] values15 = C108155Sj.values();
            if (i15 >= 0) {
                AnonymousClass00C.A0D(values15, 0);
                if (i15 <= values15.length - 1) {
                    r22 = values15[i15];
                    AnonymousClass00C.A0D(r22, 0);
                    boolean A1W16 = C36371kC.A1W(this.A07, r22);
                    this.A07 = r22;
                    A01(this, A1W16);
                }
            }
            r22 = C108155Sj.NORMAL;
            AnonymousClass00C.A0D(r22, 0);
            boolean A1W162 = C36371kC.A1W(this.A07, r22);
            this.A07 = r22;
            A01(this, A1W162);
        }
        if (typedArray2.hasValue(15)) {
            int i16 = typedArray2.getInt(15, 0);
            C108165Sk[] values16 = C108165Sk.values();
            if (i16 >= 0) {
                AnonymousClass00C.A0D(values16, 0);
                if (i16 <= values16.length - 1) {
                    r2 = values16[i16];
                    AnonymousClass00C.A0D(r2, 0);
                    boolean A1W17 = C36371kC.A1W(this.A0D, r2);
                    this.A0D = r2;
                    A01(this, A1W17);
                }
            }
            r2 = C108165Sk.FILLED;
            AnonymousClass00C.A0D(r2, 0);
            boolean A1W172 = C36371kC.A1W(this.A0D, r2);
            this.A0D = r2;
            A01(this, A1W172);
        }
        if (typedArray2.hasValue(12)) {
            typedArray2.getBoolean(12, false);
        }
        if (typedArray2.hasValue(9)) {
            int i17 = typedArray2.getInt(9, 0);
            AnonymousClass5S1[] values17 = AnonymousClass5S1.values();
            if (i17 >= 0) {
                AnonymousClass00C.A0D(values17, 0);
                if (i17 <= values17.length - 1) {
                    r10 = values17[i17];
                }
            }
            AnonymousClass00C.A0D(r10, 0);
            boolean A1W18 = C36371kC.A1W(this.A0F, r10);
            this.A0F = r10;
            A01(this, A1W18);
        }
        if (typedArray2.hasValue(18)) {
            C108385Th A002 = A00(typedArray2.getInt(18, 0));
            AnonymousClass00C.A0D(A002, 0);
            boolean A1W19 = C36371kC.A1W(this.A04, A002);
            this.A04 = A002;
            A01(this, A1W19);
        }
        if (typedArray2.hasValue(32)) {
            C108385Th A003 = A00(typedArray2.getInt(32, 0));
            AnonymousClass00C.A0D(A003, 0);
            boolean A1W20 = C36371kC.A1W(this.A06, A003);
            this.A06 = A003;
            A01(this, A1W20);
        }
        if (typedArray2.hasValue(17)) {
            C108385Th A004 = A00(typedArray2.getInt(17, 0));
            AnonymousClass00C.A0D(A004, 0);
            boolean A1W21 = C36371kC.A1W(this.A03, A004);
            this.A03 = A004;
            A01(this, A1W21);
        }
        if (typedArray2.hasValue(31)) {
            C108385Th A005 = A00(typedArray2.getInt(31, 0));
            AnonymousClass00C.A0D(A005, 0);
            boolean A1W22 = C36371kC.A1W(this.A05, A005);
            this.A05 = A005;
            A01(this, A1W22);
        }
        if (typedArray2.hasValue(7)) {
            int i18 = typedArray2.getInt(7, 0);
            AnonymousClass5S2[] values18 = AnonymousClass5S2.values();
            if (i18 >= 0) {
                AnonymousClass00C.A0D(values18, 0);
                if (i18 <= values18.length - 1) {
                    r11 = values18[i18];
                }
            }
            AnonymousClass00C.A0D(r11, 0);
            boolean A1W23 = C36371kC.A1W(this.A0H, r11);
            this.A0H = r11;
            A01(this, A1W23);
        }
        if (typedArray2.hasValue(6)) {
            this.A0R = typedArray2.getBoolean(6, false);
        }
        this.A0U = A1U;
    }

    public static void A01(C130646Lw r1, boolean z) {
        if (z && r1.A0U) {
            r1.A0V.A06();
        }
    }

    public static final C108385Th A00(int i) {
        C108385Th[] values = C108385Th.values();
        if (i >= 0) {
            AnonymousClass00C.A0D(values, 0);
            if (i <= values.length - 1) {
                return values[i];
            }
        }
        return C108385Th.NO_SPACE;
    }
}
