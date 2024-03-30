package X;

import android.os.Bundle;
import java.util.LinkedList;

/* renamed from: X.0Wc  reason: invalid class name and case insensitive filesystem */
public abstract class C07040Wc {
    public Bundle A00;
    public C17240qx A01;
    public LinkedList A02;
    public final C15970oL A03 = new C10480eJ(this);

    public static final void A00(C07040Wc r1, int i) {
        while (!r1.A02.isEmpty() && ((C17090qh) r1.A02.getLast()).Bxj() >= i) {
            r1.A02.removeLast();
        }
    }
}
