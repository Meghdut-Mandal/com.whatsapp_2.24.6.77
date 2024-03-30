package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4Ii  reason: invalid class name and case insensitive filesystem */
public final class C85764Ii extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C39921uG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85764Ii(C39921uG r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass3JL r3;
        List list;
        int size;
        C63503Kh r0;
        C39921uG r4 = this.this$0;
        AnonymousClass3T1 A0r = C36431kI.A0r(r4.A00);
        List list2 = null;
        if (A0r == null || (r0 = A0r.A1K) == null) {
            r3 = null;
        } else {
            r3 = (AnonymousClass3JL) r0.A00;
        }
        AnonymousClass08S r2 = r4.A03;
        if (r3 != null) {
            list2 = r3.A02;
        }
        r2.A0D(list2);
        if (!(r3 == null || r3.A00 || (list = r3.A02) == null || (size = list.size()) == 0)) {
            Object A04 = r4.A00.A04();
            if (A04 != null) {
                r4.A0D.Boy(new C1501874h(r4, A04, 14));
            }
            AnonymousClass11F r02 = r4.A0C;
            AnonymousClass1NM r6 = r4.A09;
            long j = (long) size;
            SharedPreferences A00 = AnonymousClass1NM.A00(r6);
            String rawString = r02.getRawString();
            AnonymousClass00C.A0D(rawString, 0);
            r6.A0R.execute(new C35501in(r6, A00, AnonymousClass000.A0q("_BotMessagePromptsRowCount", AnonymousClass000.A0v(rawString)), 0, j));
            r3.A00 = true;
        }
        if (r2.A04() == null) {
            AnonymousClass3T1 A0r2 = C36431kI.A0r(r4.A00);
            if (A0r2 != null) {
                AnonymousClass11F r32 = A0r2.A1J.A00;
                if ((r32 instanceof UserJid) && r32 != null) {
                    r4.A0D.Bp1(new C1502474n(r4, r32, A0r2, 10));
                }
            }
        } else {
            r4.A02.set(false);
        }
        return AnonymousClass0AJ.A00;
    }
}
