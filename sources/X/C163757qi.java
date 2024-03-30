package X;

import android.graphics.BitmapFactory;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob;
import com.whatsapp.jobqueue.job.SendLiveLocationKeyJob;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: X.7qi  reason: invalid class name and case insensitive filesystem */
public class C163757qi implements Callable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C163757qi(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public /* bridge */ /* synthetic */ Object call() {
        int i;
        switch (this.A02) {
            case 0:
                return BitmapFactory.decodeFile(((C120725ry) this.A01).A01);
            case 1:
                try {
                    C160937lp r0 = (C160937lp) ((Future) this.A01).get();
                    if (r0 == null) {
                        return null;
                    }
                    r0.release();
                    return null;
                } catch (Throwable th) {
                    ((AnonymousClass6XM) this.A00).A0D.obtainMessage(7, th).sendToTarget();
                    return null;
                }
            case 2:
                C107305Nn r1 = (C107305Nn) this.A00;
                AnonymousClass6PE r2 = (AnonymousClass6PE) this.A01;
                if (!C19550w8.A0A()) {
                    VirtualDisplay virtualDisplay = r1.A00;
                    if (virtualDisplay != null) {
                        virtualDisplay.release();
                    }
                    r1.A00 = null;
                }
                Image image = r1.A01;
                if (image != null) {
                    image.close();
                }
                r1.A01 = null;
                r1.A02.close();
                r1.stopPeriodicCameraCallbackCheck();
                r1.A03 = r2;
                int i2 = r2.A02;
                int i3 = r2.A01;
                VoipPhysicalCamera.CameraInfo cameraInfo = r1.A04;
                r1.A04 = new VoipPhysicalCamera.CameraInfo(i2, i3, cameraInfo.format, cameraInfo.fps1000, cameraInfo.isFrontCamera, cameraInfo.orientation, cameraInfo.idx);
                C107305Nn.A02(r1);
                return Integer.valueOf(C107305Nn.A00(r1));
            case 3:
                C1493370u r3 = (C1493370u) this.A00;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("voip/CoreVideoPort/ releasing surface texture holder for ");
                C36321k7.A1N(r3.A0D, A0u);
                ((C1272467n) this.A01).A00();
                C18740tg.A03(r3.A0B);
                r3.A04 = null;
                return C36381kD.A0m();
            case 4:
                C1493370u r22 = (C1493370u) this.A00;
                float[] fArr = (float[]) this.A01;
                if (!r22.A0G.get()) {
                    i = -6;
                } else {
                    boolean backgroundColor = r22.A0E.setBackgroundColor(fArr);
                    i = -2;
                    if (backgroundColor) {
                        i = 0;
                    }
                }
                return Integer.valueOf(i);
            case 5:
                return SendFinalLiveLocationNotificationJob.A00((SendFinalLiveLocationNotificationJob) this.A00, (AnonymousClass8SX) this.A01);
            case 6:
                SendFinalLiveLocationRetryJob sendFinalLiveLocationRetryJob = (SendFinalLiveLocationRetryJob) this.A00;
                return C110545aq.A01(C133256Xm.A02(DeviceJid.getNullable(sendFinalLiveLocationRetryJob.rawDeviceJid)), sendFinalLiveLocationRetryJob.A01, ((AnonymousClass8SX) this.A01).A0o());
            case 7:
                return SendLiveLocationKeyJob.A00((Jid) this.A01, (SendLiveLocationKeyJob) this.A00);
            default:
                return AnonymousClass1P5.A01((AnonymousClass1P5) this.A00, (AnonymousClass8SX) this.A01);
        }
    }
}
