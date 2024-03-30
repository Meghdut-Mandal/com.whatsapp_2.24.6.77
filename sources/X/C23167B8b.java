package X;

import android.os.Handler;
import android.os.Message;
import java.util.List;

/* renamed from: X.B8b  reason: case insensitive filesystem */
public class C23167B8b implements Handler.Callback {
    public Object A00;
    public final int A01;

    public C23167B8b(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean handleMessage(Message message) {
        if (this.A01 != 0) {
            C202639mL r5 = (C202639mL) this.A00;
            if (message.what != 1) {
                return false;
            }
            List list = r5.A0A;
            List list2 = r5.A09;
            int i = message.arg1;
            C202639mL.A01(r5, r5.A04());
            if (list == null || list2 == null || i >= list.size()) {
                return true;
            }
            AnonymousClass9VB r1 = r5.A0F;
            list2.get(C36421kH.A06(list2, 1));
            list.get(C36421kH.A06(list, 1));
            List list3 = r1.A00;
            if (0 >= list3.size()) {
                return true;
            }
            list3.get(0);
            throw AnonymousClass001.A0A("onZoomChange");
        }
        if (message.what == 1) {
            C204199pc r4 = (C204199pc) this.A00;
            if (r4.A0B) {
                List list4 = r4.A0A;
                int i2 = message.arg1;
                if (list4 == null || i2 >= list4.size()) {
                    return true;
                }
                list4.get(i2);
                list4.get(0);
                list4.get(C36421kH.A06(list4, 1));
                List list5 = r4.A06.A00;
                if (0 >= list5.size()) {
                    return true;
                }
                list5.get(0);
                throw AnonymousClass001.A0A("onZoomChange");
            }
        }
        if (message.what != 2) {
            return false;
        }
        List list6 = ((C204199pc) this.A00).A06.A00;
        if (0 >= list6.size()) {
            return true;
        }
        list6.get(0);
        throw AnonymousClass001.A0A("onZoomError");
    }
}
