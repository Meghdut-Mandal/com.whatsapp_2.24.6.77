package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6qT  reason: invalid class name and case insensitive filesystem */
public abstract class C143396qT implements C17710ru {
    public AnonymousClass1UP A00;

    public void B6Y(Object obj, String str, String str2, int i, int i2) {
        if (this instanceof C1025250j) {
            this.A00.flowEndFail(A00(), str, str2);
            ((C1025250j) this).A00 = -1;
        }
    }

    public void B6b(Object obj, int i, int i2) {
        if (this instanceof C1025250j) {
            this.A00.flowEndSuccess(A00());
            ((C1025250j) this).A00 = -1;
        }
    }

    public void BP5(Object obj, String str, String str2, int i, int i2) {
        if (this instanceof C1025250j) {
            this.A00.flowMarkError(A00(), str, str2);
            ((C1025250j) this).A00 = -1;
        }
    }

    public long A00() {
        if (this instanceof C1025250j) {
            return ((C1025250j) this).A00;
        }
        return 0;
    }

    public void A01() {
        if (this instanceof C1025250j) {
            C1025250j r6 = (C1025250j) this;
            long j = r6.A00;
            if (j != -1) {
                r6.A00.flowMarkPoint(j, "FLOW_START_BEFORE_PREVIOUS_ENDED");
                r6.A00.flowEndFail(r6.A00, "FLOW_STARTED_BEFORE_PREVIOUS_ENDED", (String) null);
            }
        }
    }

    public void A02(String str, Object obj) {
        AnonymousClass1UP r3;
        long A002;
        String obj2;
        if (obj != null) {
            String str2 = str;
            if (obj instanceof Long) {
                this.A00.flowAnnotate(A00(), str2, C36431kI.A09(obj));
            } else if (obj instanceof Double) {
                this.A00.flowAnnotate(A00(), str2, C90504aG.A01(obj));
            } else if (obj instanceof Integer) {
                this.A00.flowAnnotate(A00(), str, AnonymousClass000.A0I(obj));
            } else {
                if (obj instanceof String) {
                    r3 = this.A00;
                    A002 = A00();
                    obj2 = (String) obj;
                } else {
                    boolean z = obj instanceof Boolean;
                    r3 = this.A00;
                    A002 = A00();
                    if (z) {
                        r3.flowAnnotate(A002, str, AnonymousClass000.A1X(obj));
                        return;
                    }
                    obj2 = obj.toString();
                }
                r3.flowAnnotate(A002, str, obj2);
            }
        }
    }

    public void B10(Object obj, Map map, int i, int i2) {
        if ((this instanceof C1025250j) && map != null) {
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                A02(C90494aF.A0f(A11), A11.getValue());
            }
        }
    }

    public void BP6(Object obj, String str, Map map, int i, int i2) {
        if (this instanceof C1025250j) {
            this.A00.flowMarkPoint(A00(), str);
        }
    }

    public void Buw(Object obj, String str, int i, int i2, boolean z) {
        if (this instanceof C1025250j) {
            A01();
            this.A00.B7S(new AnonymousClass66V(str, z), A00());
        }
    }

    public void B6W(Object obj, String str, int i, int i2) {
        long A002 = A00();
        if (this instanceof C1025250j) {
            this.A00.flowEndCancel(A002, str);
            ((C1025250j) this).A00 = -1;
        }
    }
}
