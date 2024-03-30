package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9S2  reason: invalid class name */
public class AnonymousClass9S2 {
    public boolean A00;
    public final ArrayList A01 = AnonymousClass001.A0I();
    public final Map A02 = C165607th.A12();
    public final Map A03 = new HashMap(1);
    public final C22790Aw1[] A04;

    public C22876AxX A00(AnonymousClass94T r2) {
        C22876AxX axX = (C22876AxX) this.A02.get(r2);
        if (axX != null) {
            return axX;
        }
        throw AnonymousClass001.A08("CoreComponent not available. Did you add specify component dependency or the plugin configuration?");
    }

    public AnonymousClass9S2(C22790Aw1[] aw1Arr) {
        this.A04 = aw1Arr;
    }
}
