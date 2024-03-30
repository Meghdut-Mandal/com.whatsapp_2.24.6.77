package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import com.whatsapp.superpack.WhatsAppOpenboxArchive;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1H2  reason: invalid class name */
public class AnonymousClass1H2 {
    public static final Set A0C = new HashSet();
    public static final String[] A0D = {"➕", "➖", "➗", "✖️", "🟰", "♾️", "💲", "💱", "™️", "©️", "®️", "👁️‍🗨️", "🔚", "🔙", "🔛", "🔝", "🔜", "〰️", "➰", "➿", "✔️"};
    public C18950u5 A00 = new C18950u5(1000, 100000, 100000, false);
    public Boolean A01;
    public final C19630wG A02;
    public final AnonymousClass1H4 A03;
    public final AnonymousClass1H8 A04;
    public final AnonymousClass1H8 A05;
    public final C20810yC A06;
    public final C21010yW A07;
    public final AnonymousClass1H6 A08;
    public final C19970wo A09;
    public final AnonymousClass005 A0A;
    public volatile WhatsAppOpenboxArchive A0B;

    public static final C1275268q A02(long j) {
        int[] iArr = new int[5];
        int i = ((int) ((j >> 4) & 4095)) + 1;
        int i2 = 0;
        do {
            iArr[i2] = i;
            i2++;
            i = ((int) ((j >> ((i2 * 12) + 4)) & 4095)) + 1;
            if (i <= 1) {
                break;
            }
        } while (i2 < 5);
        int[] copyOf = Arrays.copyOf(iArr, i2);
        AnonymousClass00C.A08(copyOf);
        return new C1275268q(copyOf);
    }

    private BitmapDrawable A00(Resources resources, C1275268q r13, AnonymousClass1H8 r14, AnonymousClass7gX r15) {
        boolean contains;
        Bitmap BOG;
        int[] iArr = r13.A00;
        if (iArr.length == 1) {
            Context context = this.A02.A00;
            if (!AnonymousClass1RC.A0A(context)) {
                contains = false;
            } else {
                Set set = A0C;
                if (set.isEmpty()) {
                    String[] strArr = A0D;
                    int i = 0;
                    do {
                        set.add(A02(C1898996a.A00(new AnonymousClass2MA(strArr[i]), false)));
                        i++;
                    } while (i < 21);
                    set.add(new C1275268q(new int[]{3574}));
                }
                contains = set.contains(r13);
            }
            Bitmap B87 = r14.B87(r13, contains);
            if (B87 != null) {
                return new BitmapDrawable(resources, B87);
            }
            if (!(r15 == null || (BOG = r15.BOG(resources, iArr[0])) == null)) {
                if (contains) {
                    BOG = AnonymousClass6Y8.A05(BOG, (ColorFilter) this.A0A.get(), (float) context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
                }
                r14.Bma(BOG, r13, contains);
                return new BitmapDrawable(resources, BOG);
            }
        }
        return null;
    }

    public static BitmapDrawable A01(Resources resources, C1275268q r10, AnonymousClass1H8 r11, AnonymousClass7gX r12, AnonymousClass1H2 r13) {
        int[] iArr = r10.A00;
        int length = iArr.length;
        if (length == 1) {
            return r13.A00(resources, r10, r11, r12);
        }
        Bitmap B87 = r11.B87(r10, false);
        if (B87 == null) {
            BitmapDrawable[] bitmapDrawableArr = new BitmapDrawable[length];
            for (int i = 0; i < length; i++) {
                bitmapDrawableArr[i] = r13.A00(resources, new C1275268q(new int[]{iArr[i]}), r11, r12);
                if (bitmapDrawableArr[i] == null) {
                    return null;
                }
            }
            B87 = C54202sZ.A00(bitmapDrawableArr);
            if (B87 == null) {
                return null;
            }
            r11.Bma(B87, r10, false);
        }
        return new BitmapDrawable(resources, B87);
    }

    public static C1275268q A03(AnonymousClass3PG r5, AnonymousClass1H2 r6, long j) {
        if (j == -1) {
            j = C1898996a.A00(r5, false);
            if (j == -1) {
                return null;
            }
        }
        Long valueOf = Long.valueOf(j);
        if (valueOf == null) {
            return null;
        }
        C1275268q A022 = A02(valueOf.longValue());
        int[] iArr = A022.A00;
        if (iArr.length != 1 || iArr[0] != 574) {
            return A022;
        }
        if (!C20800yB.A01(C21000yV.A02, r6.A06, 7463)) {
            return A022;
        }
        return new C1275268q(new int[]{3574});
    }

    public AnonymousClass1H2(C19970wo r5, C19630wG r6, AnonymousClass1H4 r7, C20810yC r8, C21010yW r9, AnonymousClass1H6 r10, AnonymousClass005 r11, AnonymousClass005 r12) {
        AnonymousClass1H8 r0;
        this.A09 = r5;
        this.A06 = r8;
        this.A02 = r6;
        this.A07 = r9;
        this.A03 = r7;
        this.A08 = r10;
        if (C20800yB.A01(C21000yV.A02, r8, 7249)) {
            this.A05 = (AnonymousClass1H8) r11.get();
            r0 = (AnonymousClass1H8) r12.get();
        } else {
            this.A05 = new AnonymousClass1H9();
            r0 = new AnonymousClass1H9();
        }
        this.A04 = r0;
        this.A0A = new C18910u1((Object) null, new C36251k0(r6, 6));
    }

    public BitmapDrawable A04(Resources resources, C159437jM r5, AnonymousClass3PG r6, long j) {
        C1275268q A032 = A03(r6, this, j);
        if (A032 == null) {
            return null;
        }
        AnonymousClass1H8 r1 = this.A04;
        BitmapDrawable A012 = A01(resources, A032, r1, (AnonymousClass7gX) null, this);
        if (A012 != null) {
            return A012;
        }
        BitmapDrawable A013 = A01(resources, A032, r1, new C145286te(r5, this), this);
        if (A013 != null) {
            return A013;
        }
        return A01(resources, A032, this.A05, new C145276td(this), this);
    }

    public BitmapDrawable A05(Resources resources, AnonymousClass3PG r5, long j) {
        C1275268q A032 = A03(r5, this, j);
        if (A032 == null) {
            return null;
        }
        return A01(resources, A032, this.A05, new C145276td(this), this);
    }

    public Drawable A06(Resources resources, AnonymousClass3PG r4, float f, long j) {
        BitmapDrawable A052 = A05(resources, r4, j);
        if (A052 == null) {
            return new C36791lJ(r4.A01(), f);
        }
        return A052;
    }
}
