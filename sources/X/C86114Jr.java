package X;

import android.database.Cursor;
import com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.4Jr  reason: invalid class name and case insensitive filesystem */
public final class C86114Jr extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ ReportToAdminMessagesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86114Jr(ReportToAdminMessagesActivity reportToAdminMessagesActivity) {
        super(1);
        this.this$0 = reportToAdminMessagesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass011 r8 = (AnonymousClass011) obj;
        Cursor cursor = (Cursor) r8.first;
        List<C184828t4> list = (List) r8.second;
        C41031wV r6 = this.this$0.A06;
        if (r6 == null) {
            throw C36331k8.A0Y();
        }
        AnonymousClass00C.A0D(list, 1);
        r6.A00 = cursor;
        int A02 = C000300d.A02(AnonymousClass03U.A06(list, 10));
        if (A02 < 16) {
            A02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A02);
        for (C184828t4 r0 : list) {
            String str = r0.A01;
            AnonymousClass00C.A08(str);
            List<C184818t3> list2 = (List) r0.A00;
            AnonymousClass00C.A08(list2);
            ArrayList A0z = C36351kA.A0z(list2);
            for (C184818t3 r02 : list2) {
                A0z.add(r02.A00);
            }
            linkedHashMap.put(str, C36441kJ.A15(A0z));
        }
        r6.A01 = linkedHashMap;
        r6.A06();
        ReportToAdminMessagesActivity.A07(this.this$0);
        ((AnonymousClass1RJ) this.this$0.A0B.getValue()).A03(8);
        return AnonymousClass0AJ.A00;
    }
}
