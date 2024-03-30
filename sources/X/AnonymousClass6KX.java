package X;

import java.util.LinkedList;

/* renamed from: X.6KX  reason: invalid class name */
public class AnonymousClass6KX {
    public long A00;
    public Integer A01 = null;
    public boolean A02;
    public final C118545oH A03 = new C118545oH();

    public static void A00(AnonymousClass6KX r3, String str) {
        C118545oH r32 = r3.A03;
        synchronized (r32) {
            r32.A00 = System.nanoTime();
            LinkedList linkedList = r32.A01;
            linkedList.addLast(str);
            if (linkedList.size() > 40) {
                linkedList.removeFirst();
            }
        }
    }
}
