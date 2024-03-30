package X;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9l6  reason: invalid class name and case insensitive filesystem */
public class C202139l6 {
    public static final Object A06 = C36441kJ.A11();
    public static final ArrayDeque A07 = new ArrayDeque();
    public Handler A00;
    public boolean A01;
    public final MediaCodec A02;
    public final HandlerThread A03;
    public final C199339f9 A04;
    public final AtomicReference A05 = new AtomicReference();

    public C202139l6(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C199339f9 r0 = new C199339f9();
        this.A02 = mediaCodec;
        this.A03 = handlerThread;
        this.A04 = r0;
    }

    public static AnonymousClass9ME A00() {
        AnonymousClass9ME r0;
        ArrayDeque arrayDeque = A07;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                r0 = new AnonymousClass9ME();
            } else {
                r0 = (AnonymousClass9ME) arrayDeque.removeFirst();
            }
        }
        return r0;
    }

    public static void A01(C202139l6 r3) {
        C199339f9 r2 = r3.A04;
        r2.A00();
        Handler handler = r3.A00;
        Objects.requireNonNull(handler);
        handler.obtainMessage(2).sendToTarget();
        synchronized (r2) {
            while (!r2.A00) {
                r2.wait();
            }
        }
    }

    public void A02() {
        if (this.A01) {
            try {
                Handler handler = this.A00;
                Objects.requireNonNull(handler);
                handler.removeCallbacksAndMessages((Object) null);
                A01(this);
            } catch (InterruptedException e) {
                C90484aE.A0z();
                throw new IllegalStateException(e);
            }
        }
    }

    public void A03(AnonymousClass9OC r8, int i, long j) {
        int length;
        int length2;
        int length3;
        int length4;
        Throwable th = (Throwable) this.A05.getAndSet((Object) null);
        if (th == null) {
            AnonymousClass9ME A002 = A00();
            A002.A01 = i;
            A002.A02 = 0;
            A002.A03 = j;
            A002.A00 = 0;
            MediaCodec.CryptoInfo cryptoInfo = A002.A04;
            cryptoInfo.numSubSamples = r8.A03;
            int[] iArr = r8.A06;
            int[] iArr2 = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArr2 == null || iArr2.length < (length4 = iArr.length)) {
                    iArr2 = Arrays.copyOf(iArr, iArr.length);
                } else {
                    System.arraycopy(iArr, 0, iArr2, 0, length4);
                }
            }
            cryptoInfo.numBytesOfClearData = iArr2;
            int[] iArr3 = r8.A07;
            int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr3 != null) {
                if (iArr4 == null || iArr4.length < (length3 = iArr3.length)) {
                    iArr4 = Arrays.copyOf(iArr3, iArr3.length);
                } else {
                    System.arraycopy(iArr3, 0, iArr4, 0, length3);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArr4;
            byte[] bArr = r8.A05;
            byte[] bArr2 = cryptoInfo.key;
            if (bArr != null) {
                if (bArr2 == null || bArr2.length < (length2 = bArr.length)) {
                    bArr2 = Arrays.copyOf(bArr, bArr.length);
                } else {
                    System.arraycopy(bArr, 0, bArr2, 0, length2);
                }
            }
            Objects.requireNonNull(bArr2);
            cryptoInfo.key = bArr2;
            byte[] bArr3 = r8.A04;
            byte[] bArr4 = cryptoInfo.iv;
            if (bArr3 != null) {
                if (bArr4 == null || bArr4.length < (length = bArr3.length)) {
                    bArr4 = Arrays.copyOf(bArr3, bArr3.length);
                } else {
                    System.arraycopy(bArr3, 0, bArr4, 0, length);
                }
            }
            Objects.requireNonNull(bArr4);
            cryptoInfo.iv = bArr4;
            cryptoInfo.mode = r8.A02;
            if (Util.A00 >= 24) {
                cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(r8.A01, r8.A00));
            }
            C165577te.A0w(this.A00, A002, 1);
            return;
        }
        throw th;
    }
}
