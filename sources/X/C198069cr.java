package X;

import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkPolicyConfiguration;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9cr  reason: invalid class name and case insensitive filesystem */
public class C198069cr {
    public AnonymousClass9MH A00;
    public ProductFeatureConfig A01;
    public AnonymousClass9GQ A02;
    public NetworkPolicyConfiguration A03;
    public Map A04;
    public final HashMap A05;

    public C198069cr(AnonymousClass9SF r3) {
        HashMap A0J = AnonymousClass001.A0J();
        this.A05 = A0J;
        this.A04 = AnonymousClass001.A0J();
        A0J.putAll(r3.A05);
        this.A00 = r3.A01;
        this.A04 = r3.A00;
        this.A01 = r3.A02;
        this.A02 = r3.A03;
        this.A03 = r3.A04;
    }

    public C198069cr() {
        this.A05 = AnonymousClass001.A0J();
        this.A04 = AnonymousClass001.A0J();
    }
}
