package X;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: X.Ara  reason: case insensitive filesystem */
public class C22608Ara extends AnonymousClass120 {
    public Hashtable A00 = new Hashtable();
    public Vector A01 = new Vector();

    public static C22608Ara A01(Object obj) {
        if (obj instanceof C22608Ara) {
            return (C22608Ara) obj;
        }
        if (obj != null) {
            return new C22608Ara(C22656AsM.A04(obj));
        }
        return null;
    }

    public AnonymousClass121 Bve() {
        Vector vector = this.A01;
        C202169lB r3 = new C202169lB(vector.size());
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            r3.A06((AnonymousClass120) this.A00.get(elements.nextElement()));
        }
        return new C22675Asf(r3);
    }

    public static C22634As0 A00(Object obj, C22608Ara ara) {
        return (C22634As0) ara.A00.get(obj);
    }

    public C22608Ara(C22656AsM asM) {
        C22634As0 as0;
        Enumeration A0I = asM.A0I();
        while (A0I.hasMoreElements()) {
            Object nextElement = A0I.nextElement();
            AnonymousClass122 r0 = C22634As0.A03;
            if (nextElement instanceof C22634As0) {
                as0 = (C22634As0) nextElement;
            } else if (nextElement != null) {
                as0 = new C22634As0(C22656AsM.A04(nextElement));
            } else {
                as0 = null;
            }
            Hashtable hashtable = this.A00;
            AnonymousClass122 r2 = as0.A00;
            if (!hashtable.containsKey(r2)) {
                this.A00.put(r2, as0);
                this.A01.addElement(r2);
            } else {
                throw C90464aC.A0P(r2, "repeated extension found: ", AnonymousClass000.A0u());
            }
        }
    }
}
