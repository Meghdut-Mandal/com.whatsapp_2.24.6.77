package X;

import java.util.Enumeration;

/* renamed from: X.AXo  reason: case insensitive filesystem */
public class C21716AXo implements Enumeration {
    public final Enumeration A00;
    public final /* synthetic */ C22599ArR A01;

    public C21716AXo(Enumeration enumeration, C22599ArR arR) {
        this.A01 = arR;
        this.A00 = enumeration;
    }

    public boolean hasMoreElements() {
        return this.A00.hasMoreElements();
    }

    public Object nextElement() {
        Object nextElement = this.A00.nextElement();
        if (nextElement instanceof C22604ArW) {
            return nextElement;
        }
        if (nextElement != null) {
            return new C22604ArW(C22656AsM.A04(nextElement));
        }
        return null;
    }
}
