package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2My  reason: invalid class name */
public final class AnonymousClass2My extends C20890yK {
    public AnonymousClass2My() {
        super(2046, new C18950u5(1, 1, 1000, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, (Object) null);
        r3.Bpz(4, (Object) null);
        r3.Bpz(3, (Object) null);
        r3.Bpz(6, (Object) null);
        r3.Bpz(5, (Object) null);
        r3.Bpz(1, (Object) null);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0J(C36331k8.A0N(C36331k8.A0O(C36331k8.A0L(C36331k8.A0M(C36361kB.A0j(), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamRegInit {");
        AnonymousClass00C.A0D("contactsSyncT", 1);
        AnonymousClass00C.A0D("groupsInitDidTimeout", 1);
        AnonymousClass00C.A0D("groupsInitT", 1);
        AnonymousClass00C.A0D("profilePhotosDownloadDidTimeout", 1);
        AnonymousClass00C.A0D("profilePhotosDownloadT", 1);
        AnonymousClass00C.A0D("totalT", 1);
        String A0q = AnonymousClass000.A0q("}", A0u);
        AnonymousClass00C.A08(A0q);
        return A0q;
    }
}
