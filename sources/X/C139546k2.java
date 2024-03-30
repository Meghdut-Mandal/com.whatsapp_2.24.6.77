package X;

import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.util.Pair;
import com.facebook.avatar.autogen.presenter.AECapturePresenter$saveImage$1;
import java.nio.ByteBuffer;

/* renamed from: X.6k2  reason: invalid class name and case insensitive filesystem */
public final class C139546k2 implements C157737eb {
    public final /* synthetic */ C132676Uu A00;

    public C139546k2(C132676Uu r1) {
        this.A00 = r1;
    }

    public final void BdT(C124845yt r29) {
        byte[] bArr;
        float[] fArr;
        Pair pair;
        Long l;
        Float f;
        Long l2;
        int i;
        C132676Uu r1 = this.A00;
        C124845yt r11 = r29;
        if (r1.A04) {
            C139536k1 r10 = r1.A01;
            if (r10 != null && !r10.A01) {
                r10.A01 = true;
                C132676Uu r0 = r10.A04;
                AnonymousClass5TZ r12 = AnonymousClass5TZ.AUTOGEN_FINISHED;
                C119115pG r02 = r0.A07;
                String str = r12.key;
                AnonymousClass00C.A0D(str, 0);
                C53372rD.A00(r02.A00, r02.A01, str, 38);
                C22775Avl[] avlArr = r11.A0C;
                int i2 = r11.A01;
                int i3 = i2;
                if (i2 != 35 || avlArr == null) {
                    bArr = r11.A0A;
                    if (bArr == null) {
                        if (avlArr == null || avlArr.length != 3) {
                            bArr = null;
                        } else {
                            int i4 = r11.A03;
                            int i5 = r11.A00;
                            C22775Avl avl = avlArr[0];
                            C22775Avl avl2 = avlArr[1];
                            C22775Avl avl3 = avlArr[2];
                            C90474aD.A1A(avl, avl2, avl3);
                            C20953A0k a0k = (C20953A0k) avl;
                            ByteBuffer byteBuffer = a0k.A02;
                            AnonymousClass00C.A08(byteBuffer);
                            C20953A0k a0k2 = (C20953A0k) avl2;
                            ByteBuffer byteBuffer2 = a0k2.A02;
                            AnonymousClass00C.A08(byteBuffer2);
                            C20953A0k a0k3 = (C20953A0k) avl3;
                            ByteBuffer byteBuffer3 = a0k3.A02;
                            AnonymousClass00C.A08(byteBuffer3);
                            int bitsPerPixel = ImageFormat.getBitsPerPixel(i3);
                            int i6 = bitsPerPixel / 8;
                            int i7 = i4 * i5;
                            bArr = new byte[((bitsPerPixel * i7) / 8)];
                            int i8 = a0k2.A01;
                            int i9 = i8;
                            byte[] bArr2 = new byte[i8];
                            byte[] bArr3 = new byte[a0k3.A01];
                            int i10 = i7 * i6;
                            int i11 = i10 / 4;
                            int i12 = 0;
                            for (int i13 = 0; i13 < i5; i13++) {
                                int i14 = i6 * i4;
                                byteBuffer.get(bArr, i12, i14);
                                if (i5 - i13 != 1) {
                                    byteBuffer.position((byteBuffer.position() + a0k.A01) - i14);
                                }
                                i12 += i14;
                                int i15 = i5 / 2;
                                if (i13 < i15) {
                                    if (i15 - i13 == 1) {
                                        i = ((i4 / 2) - a0k2.A00) + 1;
                                    } else {
                                        i = i9;
                                    }
                                    byteBuffer2.get(bArr2, 0, i);
                                    byteBuffer3.get(bArr3, 0, i);
                                    int i16 = i4 / 2;
                                    for (int i17 = 0; i17 < i16; i17++) {
                                        int i18 = (i13 * i4) / 2;
                                        bArr[i10 + i18 + i17] = bArr2[a0k2.A00 * i17];
                                        bArr[i10 + i11 + i18 + i17] = bArr3[a0k3.A00 * i17];
                                    }
                                }
                            }
                        }
                    }
                    fArr = r11.A0B;
                    pair = r11.A05;
                    l = r11.A08;
                    f = r11.A06;
                    l2 = r11.A07;
                } else {
                    ByteBuffer byteBuffer4 = ((C20953A0k) avlArr[0]).A02;
                    AnonymousClass00C.A08(byteBuffer4);
                    ByteBuffer byteBuffer5 = ((C20953A0k) avlArr[2]).A02;
                    AnonymousClass00C.A08(byteBuffer5);
                    int remaining = byteBuffer4.remaining();
                    int remaining2 = byteBuffer5.remaining();
                    bArr = new byte[(remaining + remaining2)];
                    byteBuffer4.get(bArr, 0, remaining);
                    byteBuffer5.get(bArr, remaining, remaining2);
                    fArr = r11.A0B;
                    pair = r11.A05;
                    l = r11.A08;
                    f = r11.A06;
                    l2 = r11.A07;
                    i3 = 17;
                }
                long j = r11.A04;
                boolean z = r11.A09;
                int i19 = r11.A03;
                int i20 = r11.A00;
                int i21 = r11.A02;
                byte[] bArr4 = new C124845yt(pair, f, l, l2, bArr, fArr, avlArr, i3, i19, i20, i21, j, z).A0A;
                if (bArr4 != null) {
                    Rect rect = new Rect(0, 0, i19, i20);
                    C36331k8.A1T(new AECapturePresenter$saveImage$1(rect, r10, (C023509x) null, bArr4, i19, i20, i21), C009403z.A02(C006702x.A01));
                    return;
                }
                return;
            }
            return;
        }
        C157737eb r03 = r1.A03;
        if (r03 != null) {
            r03.BdT(r11);
        }
    }
}
