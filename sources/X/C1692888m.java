package X;

import android.graphics.Rect;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* renamed from: X.88m  reason: invalid class name and case insensitive filesystem */
public final class C1692888m extends C201049ih implements Cloneable {
    public Rect A00;
    public Rect A01;
    public AnonymousClass9W3 A02;
    public AnonymousClass9W3 A03;
    public AnonymousClass9W3 A04;
    public AnonymousClass9W3 A05;
    public AnonymousClass9W3 A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Boolean A0J;
    public Double A0K;
    public Double A0L;
    public Double A0M;
    public Float A0N;
    public Float A0O;
    public Float A0P;
    public Integer A0Q;
    public Integer A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Integer A0V;
    public Integer A0W;
    public Integer A0X;
    public Integer A0Y;
    public Integer A0Z;
    public Integer A0a;
    public Integer A0b;
    public Integer A0c;
    public Integer A0d;
    public Integer A0e;
    public Integer A0f;
    public Integer A0g;
    public Long A0h;
    public Long A0i;
    public Long A0j;
    public String A0k;
    public HashMap A0l;
    public List A0m;
    public List A0n;
    public float[] A0o;
    public int[] A0p;
    public final int[] A0q = C36441kJ.A1O();
    public final C198429dX A0r;

    public void A09(C191289Cj r6, Object obj) {
        int i = r6.A00;
        Rect rect = null;
        int i2 = 0;
        switch (i) {
            case 2:
                if (C198429dX.A04(C198429dX.A0G, this.A0r)) {
                    Objects.requireNonNull(obj);
                    boolean A1X = AnonymousClass000.A1X(obj);
                    int i3 = 0;
                    if (A1X) {
                        i3 = 17;
                    }
                    A00(this, C201049ih.A0r, i3);
                    if (A1X) {
                        A01(this, C201049ih.A0q, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                this.A0I = (Boolean) obj;
                return;
            case 4:
                this.A0F = (Boolean) obj;
                return;
            case 5:
                this.A0D = (Boolean) obj;
                return;
            case 6:
                this.A07 = (Boolean) obj;
                return;
            case 8:
                this.A0H = (Boolean) obj;
                return;
            case 9:
                this.A0W = (Integer) obj;
                return;
            case 10:
                Objects.requireNonNull(obj);
                int A0I2 = AnonymousClass000.A0I(obj);
                if (A0I2 != -1) {
                    i2 = A0I2;
                }
                this.A0V = Integer.valueOf(i2);
                return;
            case 11:
                this.A0Q = (Integer) obj;
                return;
            case 12:
                this.A0S = (Integer) obj;
                return;
            case 13:
                this.A0U = (Integer) obj;
                return;
            case 14:
                this.A0Y = (Integer) obj;
                return;
            case 15:
                this.A0Z = (Integer) obj;
                return;
            case 17:
                this.A0c = (Integer) obj;
                return;
            case 18:
            case 52:
                return;
            case 19:
                this.A0d = (Integer) obj;
                return;
            case 21:
                this.A0b = (Integer) obj;
                return;
            case 22:
                this.A0X = (Integer) obj;
                return;
            case 23:
                this.A0e = (Integer) obj;
                return;
            case 24:
                this.A0f = (Integer) obj;
                return;
            case 25:
                this.A0g = (Integer) obj;
                return;
            case 26:
                this.A0P = (Float) obj;
                return;
            case 27:
                this.A0i = (Long) obj;
                return;
            case 30:
                this.A0K = (Double) obj;
                return;
            case 31:
                this.A0M = (Double) obj;
                return;
            case 32:
                this.A0L = (Double) obj;
                return;
            case 33:
                AnonymousClass9W3 r7 = (AnonymousClass9W3) obj;
                this.A04 = r7;
                if (r7 != null) {
                    rect = new Rect(0, 0, r7.A02, r7.A01);
                }
                this.A01 = rect;
                return;
            case 34:
                AnonymousClass9W3 r72 = (AnonymousClass9W3) obj;
                this.A03 = r72;
                if (r72 != null) {
                    rect = new Rect(0, 0, r72.A02, r72.A01);
                }
                this.A00 = rect;
                return;
            case 35:
                this.A05 = (AnonymousClass9W3) obj;
                return;
            case 36:
                this.A02 = (AnonymousClass9W3) obj;
                return;
            case 37:
                this.A0m = C196539a1.A00((List) obj);
                return;
            case 38:
                this.A0n = C196539a1.A00((List) obj);
                return;
            case 39:
                int[] iArr = (int[]) obj;
                if (iArr != null && iArr.length == 2) {
                    int[] iArr2 = this.A0q;
                    iArr2[0] = iArr[0];
                    iArr2[1] = iArr[1];
                    return;
                }
                return;
            case 42:
                this.A0k = (String) obj;
                return;
            case 44:
                this.A0C = (Boolean) obj;
                return;
            case 45:
                this.A08 = (Boolean) obj;
                return;
            case 46:
                this.A0h = (Long) obj;
                return;
            case 47:
                this.A0T = (Integer) obj;
                return;
            case 48:
                this.A0N = (Float) obj;
                return;
            case 49:
                this.A0o = (float[]) obj;
                return;
            case 50:
                this.A0R = (Integer) obj;
                return;
            case 51:
                this.A0p = (int[]) obj;
                return;
            case 53:
                this.A09 = (Boolean) obj;
                return;
            case 54:
                this.A0O = (Float) obj;
                return;
            case 55:
                this.A0l = (HashMap) obj;
                return;
            case 56:
                this.A0B = (Boolean) obj;
                return;
            case 58:
                this.A06 = (AnonymousClass9W3) obj;
                return;
            case AnonymousClass8SX.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER /*60*/:
                this.A0G = (Boolean) obj;
                return;
            case 62:
                this.A0j = (Long) obj;
                return;
            case 63:
                this.A0E = (Boolean) obj;
                return;
            default:
                throw C165567td.A0U("Cannot directly set: ", AnonymousClass000.A0u(), i);
        }
    }

    public boolean A0A(AnonymousClass9T3 r4) {
        boolean z;
        if (r4.A0v) {
            A00(this, C201049ih.A0A, r4.A0B);
            z = true;
        } else {
            z = false;
        }
        if (r4.A0r) {
            A00(this, C201049ih.A08, r4.A0A);
            z = true;
        }
        if (r4.A18) {
            A01(this, C201049ih.A0V, r4.A17);
            z = true;
        }
        if (r4.A1a) {
            A01(this, C201049ih.A0Y, r4.A1Z);
            z = true;
        }
        if (r4.A1R) {
            A01(this, C201049ih.A0X, r4.A1Q);
            z = true;
        }
        if (r4.A1I) {
            A01(this, C201049ih.A0W, r4.A1H);
            z = true;
        }
        if (r4.A1T) {
            A01(this, C201049ih.A0q, r4.A1S);
            z = true;
        }
        if (r4.A1O) {
            A00(this, C201049ih.A0n, r4.A0J);
            z = true;
        }
        if (r4.A1N) {
            A09(C201049ih.A0m, r4.A1g);
            z = true;
        }
        if (r4.A0x) {
            A00(this, C201049ih.A0C, r4.A0C);
            z = true;
        }
        if (r4.A0i) {
            A01(this, C201049ih.A0N, r4.A0h);
            z = true;
        }
        if (r4.A1F) {
            A09(C201049ih.A0c, Float.valueOf(r4.A04));
            z = true;
        }
        if (r4.A0z) {
            A01(this, C201049ih.A0T, r4.A0y);
            z = true;
        }
        if (r4.A0e) {
            A01(this, C201049ih.A0L, r4.A0d);
            z = true;
        }
        if (r4.A0c) {
            A09(C201049ih.A02, r4.A0X);
            z = true;
        }
        if (r4.A1b) {
            A00(this, C201049ih.A0x, r4.A0M);
            z = true;
        }
        if (r4.A0a) {
            A00(this, C201049ih.A00, r4.A06);
            z = true;
        }
        if (r4.A0o) {
            A00(this, C201049ih.A06, r4.A08);
            z = true;
        }
        if (r4.A1C) {
            A00(this, C201049ih.A0Z, r4.A0E);
            z = true;
        }
        if (r4.A1D) {
            A00(this, C201049ih.A0a, r4.A0F);
            z = true;
        }
        if (r4.A1E) {
            A09(C201049ih.A0b, r4.A0R);
            z = true;
        }
        if (r4.A1K) {
            A00(this, C201049ih.A0h, r4.A0H);
            z = true;
        }
        if (r4.A1J) {
            A00(this, C201049ih.A0f, r4.A0G);
            z = true;
        }
        if (r4.A1B) {
            A00(this, C201049ih.A0K, r4.A0D);
            z = true;
        }
        if (r4.A0u) {
            A09(C201049ih.A09, Long.valueOf(r4.A0O));
            z = true;
        }
        if (r4.A0p) {
            A00(this, C201049ih.A07, r4.A09);
            z = true;
        }
        if (r4.A0b) {
            A09(C201049ih.A01, Float.valueOf(r4.A03));
            z = true;
        }
        if (r4.A0l) {
            A09(C201049ih.A03, r4.A1e);
            z = true;
        }
        if (r4.A0m) {
            A00(this, C201049ih.A04, r4.A07);
            z = true;
        }
        if (r4.A0n) {
            A09(C201049ih.A05, r4.A1f);
            z = true;
        }
        if (r4.A1U) {
            A00(this, C201049ih.A0r, r4.A0K);
            z = true;
        }
        if (r4.A1d) {
            A00(this, C201049ih.A0z, r4.A0N);
            z = true;
        }
        if (r4.A1V) {
            A09(C201049ih.A0s, Float.valueOf(r4.A05));
            z = true;
        }
        if (r4.A14) {
            A09(C201049ih.A0H, Long.valueOf(r4.A0P));
            z = true;
        }
        if (r4.A10) {
            A09(C201049ih.A0D, Double.valueOf(r4.A00));
            z = true;
        }
        if (r4.A12) {
            A09(C201049ih.A0F, Double.valueOf(r4.A02));
            z = true;
        }
        if (r4.A11) {
            A09(C201049ih.A0E, Double.valueOf(r4.A01));
            z = true;
        }
        if (r4.A13) {
            A09(C201049ih.A0G, r4.A0W);
            z = true;
        }
        if (r4.A0w) {
            A09(C201049ih.A0B, r4.A0Y);
            z = true;
        }
        if (r4.A1G) {
            A09(C201049ih.A0e, r4.A0Z);
            z = true;
        }
        if (r4.A1P) {
            A09(C201049ih.A0p, r4.A0T);
            z = true;
        }
        if (r4.A1L) {
            A09(C201049ih.A0j, r4.A0S);
            z = true;
        }
        if (r4.A1c) {
            A09(C201049ih.A0y, r4.A0V);
            z = true;
        }
        if (r4.A1Y) {
            A09(C201049ih.A0w, r4.A0U);
            z = true;
        }
        if (r4.A0t) {
            A01(this, C201049ih.A0R, r4.A0s);
            z = true;
        }
        if (r4.A0g) {
            A01(this, C201049ih.A0M, r4.A0f);
            z = true;
        }
        if (r4.A0q) {
            A09(C201049ih.A0k, (Object) null);
            z = true;
        }
        if (r4.A0k) {
            A01(this, C201049ih.A0P, r4.A0j);
            z = true;
        }
        if (r4.A1W) {
            A09(C201049ih.A0t, Long.valueOf(r4.A0Q));
            z = true;
        }
        if (!r4.A16) {
            return z;
        }
        A01(this, C201049ih.A0I, r4.A15);
        return true;
    }

    public C1692888m(C198429dX r8) {
        List list = Collections.EMPTY_LIST;
        this.A0m = list;
        this.A0n = list;
        this.A0V = 0;
        this.A0g = 0;
        this.A0P = Float.valueOf(-1.0f);
        this.A0U = 0;
        this.A0I = false;
        this.A0F = false;
        this.A0G = false;
        this.A0H = false;
        this.A0A = false;
        this.A0J = false;
        this.A0D = false;
        this.A07 = false;
        this.A0l = AnonymousClass001.A0J();
        this.A0C = false;
        this.A08 = true;
        this.A0W = 0;
        this.A0f = C90494aF.A0U();
        this.A0Q = 0;
        this.A0S = 0;
        this.A0Y = 0;
        this.A0Z = 0;
        this.A0c = 0;
        this.A0d = 0;
        this.A0b = 0;
        this.A0X = 0;
        Long A0t = C36411kG.A0t();
        this.A0h = A0t;
        Float valueOf = Float.valueOf(0.0f);
        this.A0N = valueOf;
        this.A0R = 1;
        this.A0e = 0;
        this.A0T = 1;
        this.A0i = A0t;
        Double A0S2 = C90494aF.A0S();
        this.A0K = A0S2;
        this.A0M = A0S2;
        this.A0L = A0S2;
        this.A0k = "";
        this.A09 = true;
        this.A0O = valueOf;
        this.A0B = false;
        this.A0a = 0;
        this.A0r = r8;
    }

    public static void A00(C1692888m r1, C191289Cj r2, int i) {
        r1.A09(r2, Integer.valueOf(i));
    }

    public static void A01(C1692888m r1, C191289Cj r2, boolean z) {
        r1.A09(r2, Boolean.valueOf(z));
    }

    public Object clone() {
        return super.clone();
    }
}
