package X;

import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.jid.UserJid;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3x6  reason: invalid class name and case insensitive filesystem */
public class C81493x6 implements Comparator {
    public final C81563xD A00;
    public final Map A01;
    public final /* synthetic */ MessageDetailsActivity A02;

    public C81493x6(MessageDetailsActivity messageDetailsActivity) {
        this.A02 = messageDetailsActivity;
        this.A00 = new C81563xD(messageDetailsActivity.A0E, messageDetailsActivity.A00);
        this.A01 = new HashMap(messageDetailsActivity.A0X.size());
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass3IC r8 = (AnonymousClass3IC) obj;
        AnonymousClass3IC r9 = (AnonymousClass3IC) obj2;
        int A002 = r8.A00();
        int A003 = r9.A00();
        if (A002 != A003) {
            Integer A022 = r8.A02();
            Integer num = C023109s.A0C;
            if (num == A022) {
                return -1;
            }
            if (num == r9.A02() || AnonymousClass3TJ.A00(A002, A003) < 0) {
                return 1;
            }
            return -1;
        }
        UserJid userJid = r8.A01;
        if (userJid != null) {
            UserJid userJid2 = r9.A01;
            if (userJid2 == null) {
                return -1;
            }
            Map map = this.A01;
            AnonymousClass141 r3 = (AnonymousClass141) map.get(userJid);
            if (r3 == null) {
                r3 = this.A02.A0C.A0D(userJid);
                map.put(userJid, r3);
            }
            AnonymousClass141 r2 = (AnonymousClass141) map.get(userJid2);
            if (r2 == null) {
                r2 = this.A02.A0C.A0D(userJid2);
                map.put(userJid2, r2);
            }
            boolean z = !C36421kH.A1Y(r3);
            if (z == (!C36421kH.A1Y(r2))) {
                return this.A00.compare(r3, r2);
            }
            if (z) {
                return -1;
            }
            return 1;
        } else if (r9.A01 == null) {
            return 0;
        } else {
            return 1;
        }
    }
}
