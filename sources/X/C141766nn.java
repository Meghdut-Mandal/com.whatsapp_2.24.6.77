package X;

import com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkClientImpl;
import com.facebook.native_bridge.NativeDataPromise;

/* renamed from: X.6nn  reason: invalid class name and case insensitive filesystem */
public class C141766nn implements C159137is {
    public final /* synthetic */ NetworkClientImpl A00;
    public final /* synthetic */ NativeDataPromise A01;

    public C141766nn(NetworkClientImpl networkClientImpl, NativeDataPromise nativeDataPromise) {
        this.A00 = networkClientImpl;
        this.A01 = nativeDataPromise;
    }

    public void BXQ(Throwable th) {
        this.A01.setException(th.toString());
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        try {
            this.A01.setValue(obj);
        } catch (Exception e) {
            this.A01.setException(e.toString());
        }
    }
}
