package X;

import java.util.AbstractMap;
import java.util.HashMap;

/* renamed from: X.62Y  reason: invalid class name */
public class AnonymousClass62Y {
    public HashMap A00 = AnonymousClass001.A0J();
    public HashMap A01 = AnonymousClass001.A0J();
    public HashMap A02 = AnonymousClass001.A0J();

    public void A00(C128956Eg r5) {
        int size;
        C131736Qi.A02(C36411kG.A1a(C36441kJ.A15(r5.A01)), (String) null);
        AnonymousClass5TE r3 = r5.A00;
        HashMap hashMap = this.A02;
        AbstractMap abstractMap = (AbstractMap) hashMap.get(r3);
        if (abstractMap == null) {
            abstractMap = AnonymousClass001.A0J();
            size = 0;
        } else {
            size = abstractMap.size();
        }
        C36331k8.A1Q(r5, abstractMap, size);
        hashMap.put(r3, abstractMap);
    }
}
