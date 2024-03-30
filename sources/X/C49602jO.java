package X;

import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.group.GroupChangedParticipantsBottomSheet;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2jO  reason: invalid class name and case insensitive filesystem */
public final class C49602jO extends C132446Tt {
    public final AnonymousClass171 A00;
    public final C18820ts A01;
    public final String A02;
    public final WeakReference A03;
    public final List A04;
    public final /* synthetic */ GroupChangedParticipantsBottomSheet A05;

    public C49602jO(AnonymousClass171 r3, C18820ts r4, GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet, GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet2, String str, List list) {
        AnonymousClass00C.A0D(list, 5);
        this.A05 = groupChangedParticipantsBottomSheet;
        this.A00 = r3;
        this.A01 = r4;
        ArrayList A0I = AnonymousClass001.A0I();
        this.A04 = A0I;
        this.A03 = AnonymousClass001.A0F(groupChangedParticipantsBottomSheet2);
        A0I.addAll(list);
        this.A02 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str = this.A02;
        if (str == null || str.length() == 0) {
            return this.A04;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        C18820ts r5 = this.A01;
        ArrayList A032 = C202859mm.A03(r5, str);
        AnonymousClass00C.A08(A032);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            AnonymousClass141 A0f = C36391kE.A0f(it);
            if (this.A00.A0h(A0f, A032, true) || C202859mm.A04(r5, A0f.A0a, A032, true)) {
                A0I.add(A0f);
            }
        }
        return A0I;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str;
        List list = (List) obj;
        AnonymousClass00C.A0D(list, 0);
        GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet = (GroupChangedParticipantsBottomSheet) this.A03.get();
        if (groupChangedParticipantsBottomSheet != null && !groupChangedParticipantsBottomSheet.A0i().isFinishing()) {
            C40591vn r2 = groupChangedParticipantsBottomSheet.A0A;
            if (r2 == null) {
                throw C36331k8.A0Y();
            }
            String str2 = groupChangedParticipantsBottomSheet.A0C;
            r2.A01 = list;
            C18820ts r0 = r2.A02.A09;
            if (r0 != null) {
                ArrayList A032 = C202859mm.A03(r0, str2);
                AnonymousClass00C.A08(A032);
                r2.A00 = A032;
                r2.A06();
                AnonymousClass1RJ A0X = C36341k9.A0X(groupChangedParticipantsBottomSheet.A0d(), R.id.search_no_matches);
                if (!list.isEmpty() || (str = groupChangedParticipantsBottomSheet.A0C) == null || str.length() == 0) {
                    A0X.A03(8);
                    return;
                }
                C36381kD.A1E((TextView) C36391kE.A0L(A0X, 0), groupChangedParticipantsBottomSheet, new Object[]{groupChangedParticipantsBottomSheet.A0C}, R.string.f12nameremoved);
                return;
            }
            throw C36321k7.A09();
        }
    }
}
