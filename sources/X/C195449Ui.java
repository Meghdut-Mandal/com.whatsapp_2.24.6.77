package X;

import android.content.Context;
import android.graphics.Rect;
import java.util.Locale;

/* renamed from: X.9Ui  reason: invalid class name and case insensitive filesystem */
public class C195449Ui {
    public final Context A00;
    public final AnonymousClass004 A01;
    public final AnonymousClass004 A02;
    public final AnonymousClass004 A03;
    public final AnonymousClass004 A04;
    public final AnonymousClass004 A05;
    public final AnonymousClass004 A06;
    public final AnonymousClass004 A07;
    public final AnonymousClass004 A08;
    public final AnonymousClass004 A09;
    public final AnonymousClass004 A0A;
    public final AnonymousClass004 A0B;
    public final AnonymousClass004 A0C;
    public final AnonymousClass004 A0D;

    public Rect A02(int i) {
        AnonymousClass004 r1;
        if (i != 1) {
            if (i == 2) {
                r1 = this.A0C;
            } else if (i == 3) {
                r1 = this.A0D;
            } else {
                throw C90524aI.A0Y(AnonymousClass000.A0r("Unreachable code: direction=", AnonymousClass000.A0u(), i));
            }
            AnonymousClass00C.A0D(r1, 0);
            Rect rect = (Rect) r1.get();
            AnonymousClass00C.A08(rect);
            return rect;
        }
        AnonymousClass004 r12 = this.A0B;
        AnonymousClass00C.A0D(r12, 0);
        Rect rect2 = new Rect((Rect) r12.get());
        int i2 = ((Rect) r12.get()).left / 4;
        rect2.right = i2;
        rect2.left = i2;
        return rect2;
    }

    public static AZ4 A00(Object obj, int i, boolean z) {
        BAS bas = new BAS(obj, i);
        if (z) {
            return new AZ4((Object) null, bas);
        }
        return new AZ4(bas.get(), (AnonymousClass004) null);
    }

    public int A01() {
        AnonymousClass004 r1 = this.A0C;
        AnonymousClass00C.A0D(r1, 0);
        return ((Rect) r1.get()).left;
    }

    public C195449Ui(Context context, C23066B2s b2s, C20810yC r7) {
        C36321k7.A11(context, r7, b2s);
        this.A00 = context;
        boolean A0E = r7.A0E(7071);
        this.A08 = A00(b2s, 1, A0E);
        this.A07 = A00(b2s, 7, A0E);
        AnonymousClass004 bas = new BAS(this, 13);
        this.A09 = A0E ? new AZ4((Object) null, bas) : bas;
        AnonymousClass004 bas2 = new BAS(this, 9);
        this.A0A = A0E ? new AZ4((Object) null, bas2) : bas2;
        this.A04 = A00(b2s, 5, A0E);
        this.A03 = A00(b2s, 6, A0E);
        AnonymousClass004 bas3 = new BAS(this, 2);
        this.A05 = A0E ? new AZ4((Object) null, bas3) : bas3;
        AnonymousClass004 bas4 = new BAS(this, 10);
        this.A06 = A0E ? new AZ4((Object) null, bas4) : bas4;
        this.A01 = A00(this, 3, A0E);
        this.A02 = A00(this, 12, A0E);
        this.A0D = A00(this, 4, A0E);
        this.A0C = A00(this, 8, A0E);
        this.A0B = A00(this, 11, A0E);
        String A0k = C90484aE.A0k(this);
        AnonymousClass00C.A08(A0k);
        AnonymousClass00C.A08(A0k.toLowerCase(Locale.ROOT));
    }
}
