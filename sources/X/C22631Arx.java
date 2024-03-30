package X;

/* renamed from: X.Arx  reason: case insensitive filesystem */
public class C22631Arx extends AnonymousClass120 {
    public final C22640As6[] A00;

    public C22631Arx(C22640As6 as6) {
        this.A00 = new C22640As6[]{as6};
    }

    public C22631Arx(C22656AsM asM) {
        this.A00 = new C22640As6[asM.A0H()];
        for (int i = 0; i != asM.A0H(); i++) {
            this.A00[i] = C22640As6.A01(asM.A0J(i));
        }
    }

    public AnonymousClass121 Bve() {
        return new C22675Asf((C219411z[]) this.A00);
    }

    public static C22640As6[] A00(Object obj) {
        C22631Arx arx;
        if (obj instanceof C22631Arx) {
            arx = (C22631Arx) obj;
        } else if (obj != null) {
            arx = new C22631Arx(C22656AsM.A04(obj));
        } else {
            arx = null;
        }
        C22640As6[] as6Arr = arx.A00;
        int length = as6Arr.length;
        C22640As6[] as6Arr2 = new C22640As6[length];
        System.arraycopy(as6Arr, 0, as6Arr2, 0, length);
        return as6Arr2;
    }

    public String toString() {
        StringBuffer A0x = C165607th.A0x();
        String str = AnonymousClass11q.A00;
        A0x.append("GeneralNames:");
        A0x.append(str);
        int i = 0;
        while (true) {
            C22640As6[] as6Arr = this.A00;
            if (i == as6Arr.length) {
                return A0x.toString();
            }
            A0x.append("    ");
            A0x.append(as6Arr[i]);
            A0x.append(str);
            i++;
        }
    }
}
