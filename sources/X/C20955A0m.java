package X;

import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.A0m  reason: case insensitive filesystem */
public class C20955A0m implements FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler {
    public final /* synthetic */ AnonymousClass9LM A00;
    public final /* synthetic */ C195439Uh A01;

    public C20955A0m(AnonymousClass9LM r1, C195439Uh r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void handleLoadError(String str) {
        long j;
        AnonymousClass9CQ r7 = this.A00.A02;
        IOException A0X = C90524aI.A0X(str);
        HashMap hashMap = this.A01.A0B;
        StringBuilder A0v = AnonymousClass000.A0v("onFaceTrackerLoadModelFailed");
        Iterator A0s = C90484aE.A0s(hashMap);
        while (A0s.hasNext()) {
            Object next = A0s.next();
            String A0l = C90504aG.A0l(next, hashMap);
            if (A0l != null) {
                File A0S = C90524aI.A0S(A0l);
                if (A0S.exists()) {
                    j = A0S.length();
                } else {
                    j = 0;
                }
            } else {
                j = -1;
            }
            C36421kH.A1N(A0v);
            A0v.append(C90504aG.A0l(next, hashMap));
            A0v.append(":");
            A0v.append(j);
        }
        r7.A00.A00("FbMsqrdRendererModelLoaderCallback", A0v.toString(), A0X);
    }
}
