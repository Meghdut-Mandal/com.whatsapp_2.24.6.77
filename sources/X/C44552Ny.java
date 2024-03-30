package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Ny  reason: invalid class name and case insensitive filesystem */
public final class C44552Ny extends C20890yK {
    public Boolean A00;

    public C44552Ny() {
        super(2098, C36441kJ.A0p(1, 10, SearchActionVerificationClientService.NOTIFICATION_ID), 1, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36361kB.A0i(), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamUiActionRealTime {");
        return C36321k7.A0C(this.A00, "chatdInternetConnectivity", A0u);
    }
}
