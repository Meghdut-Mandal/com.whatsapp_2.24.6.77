package X;

import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.9zk  reason: invalid class name and case insensitive filesystem */
public class C209279zk implements B4Y {
    public final /* synthetic */ C203139nN A00;
    public final /* synthetic */ HashMap A01;

    public List BAq(String str, boolean z, boolean z2) {
        int A0I;
        ArrayList A15 = C36441kJ.A15(B4Y.A00.BAq(str, z, false));
        HashMap hashMap = this.A01;
        if (hashMap != null && !hashMap.isEmpty()) {
            Iterator it = A15.iterator();
            while (it.hasNext()) {
                String str2 = ((C202149l7) it.next()).A02;
                if (str2 != null) {
                    String lowerCase = str2.toLowerCase(Locale.ROOT);
                    if (hashMap.containsKey(lowerCase) && ((A0I = AnonymousClass000.A0I(hashMap.get(lowerCase))) == -1 || Build.VERSION.SDK_INT < A0I)) {
                        it.remove();
                    }
                }
            }
        }
        if ("video/av01".equals(str)) {
            Collections.sort(A15, new C23176B8k(this, 4));
            Object[] A0M = AnonymousClass001.A0M();
            C36331k8.A1N("video/av01", A15, A0M);
            C131916Rh.A01("MediaCodecSelector", "%s dec order (hw first) %s", A0M);
        }
        return A15;
    }

    public C209279zk(C203139nN r1, HashMap hashMap) {
        this.A00 = r1;
        this.A01 = hashMap;
    }

    public C202149l7 BFF() {
        return B4Y.A00.BFF();
    }
}
