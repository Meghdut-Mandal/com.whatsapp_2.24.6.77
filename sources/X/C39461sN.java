package X;

import android.app.Application;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1sN  reason: invalid class name and case insensitive filesystem */
public class C39461sN extends AnonymousClass08X {
    public List A00;
    public final C001700s A01 = C36431kI.A0S();
    public final AnonymousClass08M A02;
    public final Set A03;

    public static void A01(C39461sN r9) {
        C62283Fo r0;
        C001700s r8 = r9.A01;
        List list = r9.A00;
        Set set = r9.A03;
        ArrayList A0I = AnonymousClass001.A0I();
        for (int i = 0; i < list.size(); i++) {
            C134986bw r2 = (C134986bw) list.get(i);
            if (set.contains(r2)) {
                r0 = new C62283Fo(r2, true);
            } else {
                r0 = new C62283Fo(r2, false);
            }
            A0I.add(r0);
        }
        r8.A0C(A0I);
    }

    public C39461sN(Application application, AnonymousClass08M r4, List list, List list2) {
        super(application);
        HashSet A16 = C36441kJ.A16();
        this.A03 = A16;
        this.A02 = r4;
        this.A00 = list;
        if (list2 != null) {
            A16.addAll(list2);
        }
        Map map = r4.A03;
        List list3 = (List) map.get("saved_all_categories");
        if (list3 != null) {
            this.A00 = list3;
        }
        Collection collection = (Collection) map.get("saved_selected_categories");
        if (collection != null) {
            Set set = this.A03;
            set.clear();
            set.addAll(collection);
        }
        A01(this);
    }
}
