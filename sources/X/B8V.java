package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Log;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class B8V implements Callable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public B8V(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        B31 b31;
        Camera.ShutterCallback shutterCallback;
        C204209pd r1;
        switch (this.A03) {
            case 0:
                A29 a29 = (A29) this.A00;
                AnonymousClass61X r7 = (AnonymousClass61X) this.A01;
                C198749e8 r9 = (C198749e8) this.A02;
                A29.A0A(a29, "Cannot get camera settings");
                AnonymousClass9WX r3 = a29.A0O;
                C201049ih.A06(r3.A02(a29.A01));
                int A05 = a29.A0I.A05(a29.A01, a29.A0Z);
                C1693088o A002 = r3.A00(a29.A01);
                C191299Ck.A02(C201049ih.A0f, A002, A05);
                A002.A02();
                C201049ih A022 = r3.A02(a29.A01);
                Rect rect = (Rect) C201049ih.A04(C201049ih.A0o, A022);
                int A023 = C201049ih.A02(C201049ih.A0r, A022);
                C200199gr r32 = a29.A0S;
                UUID uuid = a29.A0R.A03;
                Objects.requireNonNull(r7);
                r32.A05(new C1497572q(r7, 4), uuid);
                if (C198749e8.A00(C198749e8.A02, r9)) {
                    shutterCallback = null;
                } else {
                    shutterCallback = A29.A0g;
                }
                C195499Un r10 = new C195499Un((Rect) C201049ih.A04(C201049ih.A0i, A022), rect, A05, a29.A01);
                if (C198749e8.A00(C198749e8.A03, r9)) {
                    r1 = new C204209pd(r7, a29, r9, r10);
                } else {
                    C165587tf.A1R(a29.A0M.A00);
                    r1 = null;
                }
                Objects.requireNonNull(a29.A0a);
                a29.A0a.takePicture(shutterCallback, (Camera.PictureCallback) null, r1, new C204219pe(rect, r7, a29, r9, r10, A05, A023));
                AnonymousClass9QO r33 = a29.A0K.A00;
                ReentrantLock reentrantLock = r33.A01;
                reentrantLock.lock();
                try {
                    r33.A00 = 0;
                    reentrantLock.unlock();
                    C202399lk.A01("Some how photo taking call is happening on the UI Thread!!");
                    try {
                        AnonymousClass9PE r34 = a29.A0M;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        Object obj = r34.A00.get();
                        Objects.requireNonNull(obj);
                        ((CountDownLatch) obj).await(10000, timeUnit);
                    } catch (InterruptedException e) {
                        Log.e("Camera1Device", "Interrupted while waiting on Camera.takePicture", e);
                    }
                    AnonymousClass9PE r72 = a29.A0M;
                    Object obj2 = r72.A00.get();
                    Objects.requireNonNull(obj2);
                    if (((CountDownLatch) obj2).getCount() <= 0) {
                        boolean A003 = C198749e8.A00(C198749e8.A04, r9);
                        C202399lk.A01("Performing post photo capture on UI thread");
                        if (!a29.isConnected()) {
                            return null;
                        }
                        if (A003) {
                            A29.A05(a29);
                        }
                        r72.A00(0);
                        return null;
                    }
                    a29.A0T.set(true);
                    throw new C21816Aas();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 1:
                AnonymousClass9YE r35 = (AnonymousClass9YE) this.A00;
                r35.A0A.A00("Cannot schedule reset focus task, not prepared");
                AnonymousClass9CY r0 = r35.A03;
                Objects.requireNonNull(r0);
                if (!r0.A00.isConnected() || r35.A0E || !r35.A0D) {
                    return null;
                }
                r35.A0C = false;
                r35.A00();
                r35.A04(C023109s.A01, (float[]) null);
                A2F a2f = (A2F) this.A01;
                a2f.A06 = null;
                a2f.A04 = null;
                try {
                    r35.A01((CaptureRequest.Builder) this.A02, a2f);
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            case 2:
                AnonymousClass9YE r2 = (AnonymousClass9YE) this.A00;
                r2.A0A.A00("Cannot schedule reset focus task, not prepared");
                AnonymousClass9CY r02 = r2.A03;
                Objects.requireNonNull(r02);
                if (!r02.A00.isConnected() || r2.A0E) {
                    return null;
                }
                ((A2F) this.A01).A04 = new C191249Cf(this);
                return null;
            case 3:
                C202989n4 r03 = ((C199599fa) this.A00).A02;
                if (r03 != null) {
                    B31 b312 = r03.A09;
                    if (b312 != null) {
                        CaptureRequest build = ((CaptureRequest.Builder) this.A01).build();
                        A2E a2e = (A2E) this.A02;
                        b312.B2a(build, (Handler) null, a2e);
                        return a2e;
                    }
                    throw new C21829Ab6("Session closed while capturing photo.");
                }
                throw new C21829Ab6("Preview closed while capturing photo.");
            case 4:
                C199599fa r12 = (C199599fa) this.A00;
                C202989n4 r04 = r12.A02;
                if (r04 == null || !r04.A0Q || (b31 = r12.A02.A09) == null) {
                    return this.A01;
                }
                CaptureRequest.Builder builder = (CaptureRequest.Builder) this.A02;
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
                Integer A0m = C36381kD.A0m();
                builder.set(key, A0m);
                CaptureRequest build2 = builder.build();
                A2F a2f2 = (A2F) this.A01;
                b31.B2a(build2, (Handler) null, a2f2);
                C165577te.A0v(builder, key, 1);
                b31.B2a(builder.build(), (Handler) null, a2f2);
                builder.set(key, A0m);
                b31.Brx(builder.build(), (Handler) null, a2f2);
                return a2f2;
            default:
                return Integer.valueOf(((VoipPhysicalCamera) this.A00).enableAREffectOnCameraThread((C128656Dc) this.A01, (AnonymousClass7d4) this.A02));
        }
    }
}
