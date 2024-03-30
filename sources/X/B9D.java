package X;

import android.media.Image;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.util.concurrent.locks.ReentrantLock;

public class B9D implements C157737eb {
    public Object A00;
    public final int A01;

    public B9D(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BdT(C124845yt r8) {
        if (this.A01 != 0) {
            C22775Avl[] avlArr = r8.A0C;
            VoipLiteCamera voipLiteCamera = (VoipLiteCamera) this.A00;
            ReentrantLock reentrantLock = voipLiteCamera.cachedImageLock;
            reentrantLock.lock();
            try {
                Image image = voipLiteCamera.cachedImage;
                if (image != null) {
                    image.close();
                }
                voipLiteCamera.cachedImage = null;
                if (avlArr != null) {
                    voipLiteCamera.frameCallbackInternal(new C23161B7v(r8, avlArr));
                }
            } finally {
                reentrantLock.unlock();
            }
        } else {
            C198989eW r6 = (C198989eW) this.A00;
            if (r6.A08) {
                Object obj = r6.A05;
                synchronized (obj) {
                    if (r6.A07) {
                        C193359Ld r4 = r6.A02;
                        byte[] bArr = r8.A0A;
                        C22775Avl[] avlArr2 = r8.A0C;
                        int i = r8.A03;
                        int i2 = r8.A00;
                        r4.A02 = bArr;
                        r4.A03 = avlArr2;
                        r4.A01 = i;
                        r4.A00 = i2;
                        r6.A09 = true;
                        obj.notify();
                        while (r6.A07 && r6.A08) {
                            try {
                                obj.wait();
                            } catch (InterruptedException unused) {
                            }
                        }
                        r6.A09 = false;
                    }
                }
            }
        }
    }
}
