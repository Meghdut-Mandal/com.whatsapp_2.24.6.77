package X;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Callable;

public class A2B implements C23076B3g {
    public Image A00;
    public A2F A01;
    public C200199gr A02;
    public ImageReader A03;
    public C201049ih A04;
    public boolean A05;
    public final AnonymousClass9VB A06 = new AnonymousClass9VB();
    public final Callable A07 = new B8U((Object) this, 12);
    public final ImageReader.OnImageAvailableListener A08 = new C23143B7d(this, 1);
    public final C191239Ce A09 = new C191239Ce(this);
    public final C195139Sq A0A = new C195139Sq();

    public boolean BNP() {
        return true;
    }

    public static void A00(A2B a2b) {
        C195139Sq r5;
        C201049ih r1;
        A2B a2b2 = a2b;
        C200199gr r0 = a2b2.A02;
        if (r0 == null) {
            return;
        }
        if (!r0.A09()) {
            throw new C21829Ab6("Method tryToNotifyCpuFrame() must run on the Optic Background Thread.");
        } else if (a2b2.A00 != null && a2b2.A04 != null && a2b2.BJw()) {
            A2F a2f = a2b2.A01;
            if (a2f == null || (r1 = a2b2.A04) == null || !C201049ih.A07(C201049ih.A0T, r1)) {
                r5 = a2b2.A0A;
                r5.A00(a2b2.A00, (Pair) null, (Float) null, (Long) null, (Long) null, (float[]) null, a2b2.A05, false);
            } else {
                long timestamp = a2b2.A00.getTimestamp();
                AnonymousClass9QP r6 = a2f.A05;
                if (r6 != null) {
                    int i = 0;
                    do {
                        C199589fZ r12 = r6.A01[i];
                        if (r12 != null) {
                            C191309Cl r3 = C199589fZ.A0P;
                            if (r12.A00(r3) != null && C36431kI.A09(r12.A00(r3)) == timestamp) {
                                try {
                                    r5 = a2b2.A0A;
                                    Image image = a2b2.A00;
                                    boolean z = a2b2.A05;
                                    Pair pair = (Pair) r12.A00(C199589fZ.A0N);
                                    Long l = (Long) r12.A00(C199589fZ.A0O);
                                    r5.A00(image, pair, (Float) r12.A00(C199589fZ.A0M), l, (Long) r12.A00(C199589fZ.A0K), (float[]) r12.A00(C199589fZ.A0Q), z, false);
                                } catch (RuntimeException unused) {
                                }
                            }
                        }
                        i++;
                    } while (i < 3);
                    return;
                }
                return;
            }
            List list = a2b2.A06.A00;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C22877AxY) list.get(i2)).BdU(r5);
            }
            C195139Sq r4 = a2b2.A0A;
            if (r4.A0B != null) {
                int i3 = 0;
                while (true) {
                    AnonymousClass9RI[] r13 = r4.A0B;
                    if (i3 >= r13.length) {
                        break;
                    }
                    AnonymousClass9RI r14 = r13[i3];
                    ByteBuffer byteBuffer = r14.A02;
                    if (byteBuffer != null) {
                        byteBuffer.clear();
                        r14.A02 = null;
                    }
                    i3++;
                }
                r4.A0B = null;
            }
            r4.A09 = null;
            r4.A0A = null;
            r4.A04 = null;
            r4.A07 = null;
            r4.A05 = null;
            r4.A06 = null;
            a2b2.A00.close();
            a2b2.A00 = null;
        }
    }

    public boolean B0Q(C22877AxY axY) {
        return this.A06.A01(axY);
    }

    public void B2s() {
        this.A06.A00();
    }

    public List BDa() {
        return this.A06.A00;
    }

    public Surface BI4() {
        ImageReader imageReader = this.A03;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        throw AnonymousClass001.A09("Getting image reader surface without initialize.");
    }

    public boolean BJw() {
        return C36401kF.A1a(this.A06.A00);
    }

    public void BKP(B4X b4x, C198429dX r16, C201049ih r17, AnonymousClass9W3 r18, C200199gr r19, int i) {
        int i2;
        AnonymousClass9W3 r8 = r18;
        this.A02 = r19;
        C198429dX r2 = r16;
        this.A05 = C198429dX.A04(C198429dX.A0O, r2);
        C201049ih r1 = r17;
        this.A04 = r1;
        int A022 = C201049ih.A02(C201049ih.A0l, r1);
        if (C165567td.A1a(B4X.A0P, b4x)) {
            List A032 = C198429dX.A03(C198429dX.A0l, r2);
            int i3 = r8.A02;
            int i4 = r8.A01;
            int i5 = i3 * i4;
            int size = A032.size();
            for (int i6 = 0; i6 < size; i6++) {
                AnonymousClass9W3 r22 = (AnonymousClass9W3) A032.get(i6);
                int i7 = r22.A02;
                int i8 = r22.A01;
                if (C90494aF.A01(((float) Math.max(i7, i8)) / ((float) Math.min(i7, i8)), ((float) Math.max(i3, i4)) / ((float) Math.min(i3, i4))) <= 1.0E-4f && (i2 = r22.A02 * r22.A01) < i5 && i2 >= 180000) {
                    r8 = r22;
                    i5 = i2;
                }
            }
        }
        ImageReader newInstance = ImageReader.newInstance(r8.A02, r8.A01, A022, 1);
        this.A03 = newInstance;
        newInstance.setOnImageAvailableListener(this.A08, (Handler) null);
    }

    public boolean Bnm(C22877AxY axY) {
        return this.A06.A02(axY);
    }

    public void release() {
        ImageReader imageReader = this.A03;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
            this.A03.close();
            this.A03 = null;
        }
        Image image = this.A00;
        if (image != null) {
            image.close();
            this.A00 = null;
        }
        this.A02 = null;
        this.A04 = null;
        this.A01 = null;
    }

    public void B0S(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.A06.A01(list.get(i));
        }
    }

    public C191239Ce BC5() {
        return this.A09;
    }
}
