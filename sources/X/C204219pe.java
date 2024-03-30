package X;

import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import java.util.Objects;

/* renamed from: X.9pe  reason: invalid class name and case insensitive filesystem */
public class C204219pe implements Camera.PictureCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Rect A02;
    public final /* synthetic */ AnonymousClass61X A03;
    public final /* synthetic */ A29 A04;
    public final /* synthetic */ C198749e8 A05;
    public final /* synthetic */ C195499Un A06;

    public C204219pe(Rect rect, AnonymousClass61X r2, A29 a29, C198749e8 r4, C195499Un r5, int i, int i2) {
        this.A04 = a29;
        this.A00 = i;
        this.A02 = rect;
        this.A05 = r4;
        this.A01 = i2;
        this.A03 = r2;
        this.A06 = r5;
    }

    public void onPictureTaken(byte[] bArr, Camera camera) {
        Rect rect;
        int i;
        Integer valueOf;
        Float valueOf2;
        Float valueOf3;
        byte[] bArr2 = bArr;
        if (C131956Rl.A00()) {
            bArr2 = C131956Rl.A01();
        } else if (this.A04.A0T.get()) {
            Log.d("Camera1Device", "Photo capture took too long, not invoking photo capture callback");
            return;
        }
        Rect rect2 = null;
        if (bArr2 != null) {
            int A002 = C196319Yw.A00(bArr2);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length, options);
            rect2 = new Rect(0, 0, options.outWidth, options.outHeight);
            AnonymousClass94Y.A00(rect2, this.A02, this.A00, A002);
            rect = rect2;
        } else {
            rect = new Rect();
        }
        Rect rect3 = this.A02;
        int i2 = this.A00;
        A29 a29 = this.A04;
        C195499Un r4 = new C195499Un(rect, rect3, i2, a29.A01);
        C191339Co r1 = C199609fb.A0d;
        C198749e8 r14 = this.A05;
        r4.A01(r1, r14.A01(C198749e8.A05));
        r4.A01(C199609fb.A0X, bArr2);
        C204199pc r3 = a29.A0N;
        C191339Co r12 = C199609fb.A0e;
        if (r3.A0B) {
            i = r3.A09;
        } else {
            i = 0;
        }
        r4.A01(r12, Integer.valueOf(i));
        r4.A01(C199609fb.A0c, Integer.valueOf(this.A01));
        C199609fb r8 = new C199609fb(r4);
        AnonymousClass61X r122 = this.A03;
        a29.A0S.A05(new AnonymousClass75C((Object) r8, (Object) r122, 45), a29.A0R.A03);
        B4X b4x = a29.A08;
        Objects.requireNonNull(b4x);
        if (!C165567td.A1a(B4X.A0L, b4x) && bArr2 != null) {
            boolean z = C201349jN.A08;
            C201349jN r7 = new C201349jN(C90524aI.A0P(bArr2));
            C195499Un r6 = this.A06;
            C191339Co r13 = C199609fb.A0T;
            Long l = null;
            double A012 = r7.A01("ExposureTime");
            if (A012 != -1.0d) {
                l = Long.valueOf((long) (A012 * Math.pow(10.0d, 9.0d)));
            }
            r6.A01(r13, l);
            C191339Co r2 = C199609fb.A0Z;
            Integer num = null;
            int A022 = r7.A02("PhotographicSensitivity");
            if (A022 == -1) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(A022);
            }
            r6.A01(r2, valueOf);
            C191339Co r42 = C199609fb.A0O;
            double A013 = r7.A01("ApertureValue");
            if (A013 == -1.0d) {
                valueOf2 = null;
            } else {
                valueOf2 = Float.valueOf((float) A013);
            }
            r6.A01(r42, valueOf2);
            C191339Co r43 = C199609fb.A0V;
            double A014 = r7.A01("FocalLength");
            if (A014 == -1.0d) {
                valueOf3 = null;
            } else {
                valueOf3 = Float.valueOf((float) A014);
            }
            r6.A01(r43, valueOf3);
            C191339Co r22 = C199609fb.A0P;
            int A023 = r7.A02("WhiteBalance");
            if (A023 != -1) {
                num = Integer.valueOf(A023);
            }
            r6.A01(r22, num);
        }
        B4X b4x2 = a29.A08;
        AnonymousClass61X r15 = r122;
        A29.A03(r15, a29, b4x2, r14, this.A06, r8);
        C165587tf.A1R(a29.A0M.A00);
        if (rect2 != null) {
            rect2.width();
            rect2.height();
        } else {
            new IllegalStateException("JPEG byte array was null.");
        }
        C202389lj.A00();
    }
}
