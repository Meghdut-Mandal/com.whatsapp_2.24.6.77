package X;

import android.hardware.Camera;
import android.os.SystemClock;
import java.util.List;

public class BAI implements Camera.PreviewCallback {
    public Object A00;
    public final int A01;

    public BAI(AnonymousClass9XH r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        if (this.A01 != 0) {
            if (bArr != null) {
                C201199j3.A00().A02();
                C195139Sq r4 = new C195139Sq();
                AnonymousClass9XH r3 = (AnonymousClass9XH) this.A00;
                int i = r3.A00;
                AnonymousClass9W3 r0 = r3.A01;
                int i2 = r0.A02;
                int i3 = r0.A01;
                r4.A09 = bArr;
                r4.A01 = i;
                r4.A02 = i2;
                r4.A00 = i3;
                r4.A03 = SystemClock.elapsedRealtimeNanos();
                List list = r3.A03.A00;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((C22877AxY) list.get(i4)).BdU(r4);
                }
                camera.addCallbackBuffer(bArr);
            }
        } else if (bArr != null) {
            C201199j3.A00().A02();
            C195139Sq r42 = new C195139Sq();
            AnonymousClass9XH r32 = (AnonymousClass9XH) this.A00;
            int i5 = r32.A00;
            AnonymousClass9W3 r02 = r32.A01;
            int i6 = r02.A02;
            int i7 = r02.A01;
            r42.A09 = bArr;
            r42.A01 = i5;
            r42.A02 = i6;
            r42.A00 = i7;
            r42.A03 = SystemClock.elapsedRealtimeNanos();
            List list2 = r32.A03.A00;
            int size2 = list2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                ((C22877AxY) list2.get(i8)).BdU(r42);
            }
        }
    }
}
