package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6iO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C138606iO implements C003801r {
    public final /* synthetic */ C160267kj A00;

    public /* synthetic */ C138606iO(C160267kj r1) {
        this.A00 = r1;
    }

    public final Bundle BpH() {
        ArrayList A15;
        Map Bla = this.A00.Bla();
        Bundle A07 = AnonymousClass001.A07();
        Iterator A0y = AnonymousClass000.A0y(Bla);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            String A0f = C90494aF.A0f(A11);
            List list = (List) A11.getValue();
            if (list instanceof ArrayList) {
                A15 = (ArrayList) list;
            } else {
                A15 = C36441kJ.A15(list);
            }
            A07.putParcelableArrayList(A0f, A15);
        }
        return A07;
    }
}
