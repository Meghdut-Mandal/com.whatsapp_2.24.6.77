package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.FutureTask;

/* renamed from: X.9YE  reason: invalid class name */
public class AnonymousClass9YE {
    public CameraDevice A00;
    public CameraManager A01;
    public C157797eh A02;
    public AnonymousClass9CY A03;
    public C202989n4 A04;
    public C202639mL A05;
    public C1692888m A06;
    public C198429dX A07;
    public FutureTask A08;
    public boolean A09;
    public final AnonymousClass9VN A0A;
    public final C200199gr A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;

    public synchronized void A00() {
        FutureTask futureTask = this.A08;
        if (futureTask != null) {
            this.A0B.A08(futureTask);
            this.A08 = null;
        }
    }

    public synchronized void A02(CaptureRequest.Builder builder, A2F a2f, long j) {
        B8V b8v = new B8V(builder, this, a2f, 1);
        A00();
        this.A08 = this.A0B.A02("reset_focus", b8v, j);
    }

    public AnonymousClass9YE(C200199gr r2) {
        AnonymousClass9VN r0 = new AnonymousClass9VN(r2);
        this.A0B = r2;
        this.A0A = r0;
    }

    public void A01(CaptureRequest.Builder builder, A2F a2f) {
        B31 b31;
        this.A0A.A01("Can only reset focus on the Optic thread.");
        if (this.A04 != null && this.A05 != null) {
            CaptureRequest.Builder builder2 = builder;
            if (builder != null && this.A07 != null && this.A0D && (b31 = this.A04.A09) != null) {
                this.A0E = false;
                this.A0C = false;
                C202639mL r1 = this.A05;
                C202639mL r12 = this.A05;
                Rect rect = r12.A04;
                MeteringRectangle[] A032 = C202639mL.A03(r12, r12.A0D);
                C202639mL r13 = this.A05;
                MeteringRectangle[] A033 = C202639mL.A03(r13, r13.A0C);
                C202989n4.A01(rect, builder2, this.A07, A032, A033, C202639mL.A01(r1, r1.A04()) * 100.0f);
                C165577te.A0v(builder, CaptureRequest.CONTROL_AF_TRIGGER, 2);
                b31.B2a(builder.build(), (Handler) null, a2f);
                CameraManager cameraManager = this.A01;
                CameraDevice cameraDevice = this.A00;
                Objects.requireNonNull(cameraDevice);
                String id = cameraDevice.getId();
                C1692888m r9 = this.A06;
                Objects.requireNonNull(r9);
                int A002 = AnonymousClass9Yv.A00(cameraManager, builder, r9, this.A07, id, 0);
                builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                b31.Brx(builder.build(), (Handler) null, a2f);
                if (A002 == 1) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
                    C165577te.A0v(builder, key, 1);
                    b31.B2a(builder.build(), (Handler) null, a2f);
                    builder.set(key, 0);
                }
            }
        }
    }

    public void A03(A2F a2f) {
        C1692888m r1;
        C198429dX r12 = this.A07;
        Objects.requireNonNull(r12);
        if (C198429dX.A04(C198429dX.A03, r12)) {
            if (C198429dX.A04(C198429dX.A02, this.A07) && (r1 = this.A06) != null && C201049ih.A07(C201049ih.A0P, r1)) {
                this.A09 = true;
                a2f.A06 = new A2C(this);
                return;
            }
        }
        a2f.A06 = null;
        this.A09 = false;
    }

    public void A04(Integer num, float[] fArr) {
        if (this.A02 != null) {
            C202399lk.A00(new C1503374w(this, fArr, num, 18));
        }
    }
}
