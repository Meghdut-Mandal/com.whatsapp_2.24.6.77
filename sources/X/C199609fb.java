package X;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* renamed from: X.9fb  reason: invalid class name and case insensitive filesystem */
public class C199609fb {
    public static final C191329Cn A0K = new C191329Cn(6);
    public static final C191329Cn A0L = new C191329Cn(5);
    public static final C191329Cn A0M = new C191329Cn(4);
    public static final C191329Cn A0N = new C191329Cn(3);
    public static final C191339Co A0O = new C191339Co(9);
    public static final C191339Co A0P = new C191339Co(10);
    public static final C191339Co A0Q = new C191339Co(14);
    public static final C191339Co A0R = new C191339Co(13);
    public static final C191339Co A0S = new C191339Co(17);
    public static final C191339Co A0T = new C191339Co(7);
    public static final C191339Co A0U = new C191339Co(20);
    public static final C191339Co A0V = new C191339Co(11);
    public static final C191339Co A0W = new C191339Co(21);
    public static final C191339Co A0X = new C191339Co(0);
    public static final C191339Co A0Y = new C191339Co(1);
    public static final C191339Co A0Z = new C191339Co(8);
    public static final C191339Co A0a = new C191339Co(15);
    public static final C191339Co A0b = new C191339Co(19);
    public static final C191339Co A0c = new C191339Co(18);
    public static final C191339Co A0d = new C191339Co(2);
    public static final C191339Co A0e = new C191339Co(16);
    public final int A00;
    public final int A01;
    public final Rect A02;
    public final Rect A03;
    public final Bitmap A04;
    public final Rect A05;
    public final C195139Sq A06;
    public final C199609fb A07;
    public final Boolean A08;
    public final Float A09;
    public final Float A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final Long A0H;
    public final byte[] A0I;
    public final byte[] A0J;

    public Object A00(C191339Co r4) {
        int i = r4.A00;
        switch (i) {
            case 0:
                return this.A0I;
            case 1:
                return this.A06;
            case 2:
                return this.A05;
            case 3:
                return this.A03;
            case 7:
                return this.A0H;
            case 8:
                return this.A0D;
            case 9:
                return this.A09;
            case 10:
                return this.A0B;
            case 11:
                return this.A0A;
            case 13:
                return null;
            case 14:
                return this.A07;
            case 15:
                return this.A0E;
            case 16:
                return this.A0G;
            case 17:
                return this.A08;
            case 18:
                return this.A0F;
            case 19:
                return this.A0J;
            case 20:
                return this.A0C;
            case 21:
                return this.A04;
            default:
                throw C165567td.A0U("Invalid photo capture result key: ", AnonymousClass000.A0u(), i);
        }
    }

    public C199609fb(C195499Un r2) {
        this.A02 = r2.A01;
        this.A03 = r2.A0J;
        this.A01 = r2.A0I;
        this.A00 = r2.A0H;
        this.A0I = r2.A0F;
        this.A0J = r2.A0G;
        this.A06 = r2.A03;
        this.A05 = r2.A02;
        this.A0H = r2.A0E;
        this.A0D = r2.A0A;
        this.A09 = r2.A06;
        this.A0B = r2.A08;
        this.A0A = r2.A07;
        this.A07 = r2.A04;
        this.A0E = r2.A0B;
        this.A0G = r2.A0D;
        this.A08 = r2.A05;
        this.A0F = r2.A0C;
        this.A0C = r2.A09;
        this.A04 = r2.A00;
    }
}
