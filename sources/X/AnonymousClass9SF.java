package X;

import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkPolicyConfiguration;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9SF  reason: invalid class name */
public class AnonymousClass9SF {
    public Map A00;
    public final AnonymousClass9MH A01;
    public final ProductFeatureConfig A02;
    public final AnonymousClass9GQ A03;
    public final NetworkPolicyConfiguration A04;
    public final HashMap A05;

    public AnonymousClass9T6 A00(AnonymousClass9Ys r3) {
        AnonymousClass9T6 r0 = (AnonymousClass9T6) this.A05.get(r3);
        if (r0 != null) {
            return r0;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Invalid configuration key: ");
        A0u.append(r3);
        throw AnonymousClass000.A0c(" Please use hasConfiguration() to check if the configuration is available.", A0u);
    }

    public AnonymousClass9SF(C198069cr r3) {
        HashMap A0J = AnonymousClass001.A0J();
        this.A05 = A0J;
        A0J.putAll(r3.A05);
        this.A01 = r3.A00;
        this.A00 = r3.A04;
        this.A02 = r3.A01;
        this.A03 = r3.A02;
        this.A04 = r3.A03;
    }
}
