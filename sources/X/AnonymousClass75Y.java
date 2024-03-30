package X;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;

/* renamed from: X.75Y  reason: invalid class name */
public class AnonymousClass75Y implements Comparator {
    public final /* synthetic */ AnonymousClass1AP A00;
    public final /* synthetic */ HashMap A01;

    public AnonymousClass75Y(AnonymousClass1AP r1, HashMap hashMap) {
        this.A00 = r1;
        this.A01 = hashMap;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        Pair pair2 = (Pair) obj2;
        String A012 = AnonymousClass1BM.A01((String) pair.first, (String) pair.second);
        String A013 = AnonymousClass1BM.A01((String) pair2.first, (String) pair2.second);
        HashMap hashMap = this.A01;
        return AnonymousClass000.A0I(C90514aH.A0o(A013, hashMap)) - AnonymousClass000.A0I(C90514aH.A0o(A012, hashMap));
    }
}
