package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;

/* renamed from: X.6VI  reason: invalid class name */
public final class AnonymousClass6VI {
    public static boolean A0C = true;
    public static Bitmap.Config A0D = Bitmap.Config.ARGB_8888;
    public static BitmapFactory.Options A0E;
    public static final Bitmap A0F = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
    public static final AnonymousClass6P6 A0G = new AnonymousClass6P6(20);
    public static final AnonymousClass6P6 A0H = new AnonymousClass6P6(32);
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = -1;
    public int A04 = -1;
    public Bitmap A05;
    public AnonymousClass6VI A06 = null;
    public AnonymousClass6VI A07 = null;
    public BitmapFactory.Options A08;
    public final AnonymousClass6VI[] A09 = new AnonymousClass6VI[4];
    public final AnonymousClass75L A0A = new C97764qE(this);
    public volatile int A0B = 0;

    public static AnonymousClass6VI A00(byte[] bArr, int i) {
        Bitmap bitmap;
        AnonymousClass6VI r5 = new AnonymousClass6VI(-1, -1);
        if (A0C) {
            BitmapFactory.Options options = r5.A08;
            if (options.inBitmap == null) {
                options.inBitmap = (Bitmap) A0H.A00();
            }
        }
        try {
            BitmapFactory.Options options2 = r5.A08;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, i, options2);
            r5.A05 = bitmap;
            if (A0C) {
                options2.inBitmap = null;
            }
        } catch (IllegalArgumentException unused) {
            AnonymousClass6TY.A06.A03();
            A0C = false;
            BitmapFactory.Options options3 = r5.A08;
            options3.inBitmap.recycle();
            options3.inBitmap = null;
            A0H.A01();
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, i, options3);
            r5.A05 = bitmap;
        }
        if (bitmap == null) {
            r5.A03();
            return null;
        }
        r5.A01 = bitmap.getWidth();
        r5.A00 = r5.A05.getHeight();
        return r5;
    }

    public static synchronized void A01(AnonymousClass6VI r3) {
        synchronized (r3) {
            Bitmap bitmap = r3.A05;
            if (!(bitmap == null || bitmap == A0F)) {
                if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                    A0G.A02(r3.A05);
                } else if (A0C) {
                    A0H.A02(r3.A05);
                } else {
                    r3.A05.recycle();
                }
            }
            r3.A05 = null;
        }
    }

    public synchronized Bitmap A02() {
        return this.A05;
    }

    public void A03() {
        this.A01 = -1;
        this.A00 = -1;
        for (int i = 0; i < 4; i++) {
            this.A09[i] = null;
        }
        A01(this);
        this.A0B = 0;
        this.A06 = null;
        this.A07 = null;
        this.A02 = -1;
        this.A03 = -1;
        this.A04 = -1;
    }

    public synchronized String toString() {
        StringBuilder A0u;
        String str;
        A0u = AnonymousClass000.A0u();
        AnonymousClass000.A1C(this, A0u);
        A0u.append(" {x=");
        A0u.append(this.A02);
        A0u.append(", y=");
        A0u.append(this.A03);
        A0u.append(", zoom=");
        A0u.append(this.A04);
        A0u.append(", status=");
        A0u.append(this.A0B);
        A0u.append("}");
        if (this.A05 == null) {
            str = "x";
        } else {
            str = "o";
        }
        return AnonymousClass000.A0q(str, A0u);
    }

    public AnonymousClass6VI(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (!A0C) {
            BitmapFactory.Options options = A0E;
            if (options == null) {
                options = new BitmapFactory.Options();
                A0E = options;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
            }
            this.A08 = options;
            return;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        this.A08 = options2;
        options2.inSampleSize = 1;
        options2.inPreferredConfig = A0D;
        options2.inMutable = true;
    }

    public void A04() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.A0B = 0;
            if (this.A06 == null && this.A07 == null) {
                A03();
                return;
            }
            return;
        }
        C133046Wl.A01.post(this.A0A);
    }
}
