package X;

import java.util.ArrayList;

/* renamed from: X.0gL  reason: invalid class name and case insensitive filesystem */
public class C11460gL implements Runnable {
    public final /* synthetic */ AnonymousClass0BV A00;
    public final /* synthetic */ ArrayList A01;

    public C11460gL(AnonymousClass0BV r1, ArrayList arrayList) {
        this.A00 = r1;
        this.A01 = arrayList;
    }

    public void run() {
        ArrayList arrayList = this.A01;
        AnonymousClass0YI r0 = C06990Vx.A00;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                AnonymousClass000.A0Z(arrayList, size).setVisibility(4);
            } else {
                return;
            }
        }
    }
}
