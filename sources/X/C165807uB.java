package X;

import android.hardware.camera2.CameraDevice;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* renamed from: X.7uB  reason: invalid class name and case insensitive filesystem */
public class C165807uB extends CameraDevice.StateCallback implements C23013B0e {
    public CameraDevice A00;
    public C21829Ab6 A01;
    public Boolean A02;
    public final AnonymousClass9WY A03;
    public final AnonymousClass9CZ A04;
    public final C191199Ca A05;

    public void B1t() {
        this.A03.A00();
    }

    public /* bridge */ /* synthetic */ Object BGo() {
        Boolean bool = this.A02;
        if (bool == null) {
            throw AnonymousClass001.A09("Open Camera operation hasn't completed yet.");
        } else if (bool.booleanValue()) {
            CameraDevice cameraDevice = this.A00;
            Objects.requireNonNull(cameraDevice);
            return cameraDevice;
        } else {
            throw this.A01;
        }
    }

    public void onDisconnected(CameraDevice cameraDevice) {
        if (this.A00 == null) {
            this.A02 = C36381kD.A0j();
            this.A01 = new C21829Ab6("Could not open camera. Operation disconnected.");
            this.A03.A01();
            return;
        }
        C191199Ca r0 = this.A05;
        if (r0 != null) {
            A28 a28 = r0.A00;
            List list = a28.A0T.A00;
            UUID uuid = a28.A0W.A03;
            a28.A0X.A05(new C1502674p(new AnonymousClass78P(2, "Camera has been disconnected."), a28, list, uuid), uuid);
        }
    }

    public void onError(CameraDevice cameraDevice, int i) {
        String str;
        int i2;
        if (this.A00 == null) {
            this.A02 = C36381kD.A0j();
            this.A01 = new C21829Ab6(AnonymousClass000.A0r("Could not open camera. Operation error: ", AnonymousClass000.A0u(), i));
            this.A03.A01();
            return;
        }
        C191199Ca r0 = this.A05;
        if (r0 != null) {
            A28 a28 = r0.A00;
            if (i == 1) {
                str = "Camera in use by higher priority component.";
            } else if (i == 2) {
                str = "There are too many open camera devices.";
            } else if (i == 3) {
                str = "Camera disabled, device policy error.";
            } else if (i == 4 || i == 5) {
                i2 = 100;
                str = "Camera device has encountered a fatal error.";
                List list = a28.A0T.A00;
                UUID uuid = a28.A0W.A03;
                a28.A0X.A05(new C1502674p(new AnonymousClass78P(i2, str), a28, list, uuid), uuid);
            } else {
                str = "Unknown camera error.";
            }
            i2 = 1;
            List list2 = a28.A0T.A00;
            UUID uuid2 = a28.A0W.A03;
            a28.A0X.A05(new C1502674p(new AnonymousClass78P(i2, str), a28, list2, uuid2), uuid2);
        }
    }

    public C165807uB(AnonymousClass9CZ r4, C191199Ca r5) {
        this.A04 = r4;
        this.A05 = r5;
        AnonymousClass9WY r2 = new AnonymousClass9WY();
        this.A03 = r2;
        r2.A02(0);
    }

    public void onClosed(CameraDevice cameraDevice) {
        super.onClosed(cameraDevice);
        this.A00 = null;
        AnonymousClass9CZ r6 = this.A04;
        if (r6 != null) {
            A28 a28 = r6.A00;
            if (a28.A0j == cameraDevice) {
                a28.A0o = false;
                a28.A0j = null;
                a28.A0F = null;
                a28.A0B = null;
                a28.A0C = null;
                a28.A06 = null;
                C202639mL r2 = a28.A0A;
                if (r2 != null) {
                    r2.A0E.removeMessages(1);
                    r2.A08 = null;
                    r2.A06 = null;
                    r2.A07 = null;
                    r2.A05 = null;
                    r2.A04 = null;
                    r2.A0A = null;
                    r2.A0D = null;
                    r2.A0C = null;
                }
                a28.A0Q.A0F = false;
                a28.A0P.A00();
                C195169St r1 = a28.A0S;
                if (r1.A0D && (!a28.A0p || r1.A0C)) {
                    try {
                        a28.A0X.A00(new B6y(r6, 6), "on_camera_closed_stop_video_recording", new B8U((Object) r6, 8)).get();
                    } catch (InterruptedException | ExecutionException e) {
                        C202389lj.A01(e);
                    }
                }
                C202989n4 r3 = a28.A0R;
                if (r3.A09 != null) {
                    synchronized (C202989n4.A0S) {
                        A2F a2f = r3.A08;
                        if (a2f != null) {
                            a2f.A0H = false;
                            r3.A08 = null;
                        }
                    }
                    try {
                        r3.A09.Azq();
                        r3.A09.close();
                    } catch (Exception unused) {
                    }
                    r3.A09 = null;
                }
                String id = cameraDevice.getId();
                C1692388h r12 = a28.A0N;
                if (id.equals(r12.A00)) {
                    r12.A01();
                    r12.A00 = null;
                }
            }
        }
    }

    public void onOpened(CameraDevice cameraDevice) {
        this.A02 = C36371kC.A0m();
        this.A00 = cameraDevice;
        this.A03.A01();
    }
}
