package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.9hR  reason: invalid class name and case insensitive filesystem */
public abstract class C200459hR {
    public static UserJid A00(C19730wQ r2, C220412q r3, AnonymousClass11F r4, boolean z) {
        UserJid A0n;
        if (!(r4 instanceof GroupJid) || (r3.A05((GroupJid) r4) != 3 && !z)) {
            A0n = C36441kJ.A0n(r2);
        } else {
            A0n = r2.A08();
        }
        C18740tg.A06(A0n);
        return A0n;
    }

    public static C191949Fc A01(AnonymousClass8NX r5, List list, int i) {
        StringBuilder sb;
        String obj;
        HashSet A16 = C36441kJ.A16();
        C23122B6c<C21674AUx> b6c = r5.selectedOptions_;
        if (b6c != null) {
            if (b6c.size() > list.size() || (i > 0 && b6c.size() > i)) {
                sb = AnonymousClass000.A0u();
                C36371kC.A1R("MessageAddOnPollVoteUtils/decryptPollVotePayload poll_vote_invalid_options_count selectedOptionsSize=", sb, b6c);
                C36371kC.A1R(" pollOptionsSize=", sb, list);
                sb.append(" selectableOptionCount=");
                sb.append(i);
            } else {
                for (C21674AUx A06 : b6c) {
                    byte[] A062 = A06.A06();
                    int length = A062.length;
                    if (length != 32) {
                        sb = AnonymousClass000.A0u();
                        sb.append("MessageAddOnPollVoteUtils/decryptPollVotePayload poll_vote_invalid_option optionLength=");
                        sb.append(length);
                    } else {
                        A16.add(C36441kJ.A13(A062));
                    }
                }
                ArrayList A02 = A02(list, A16);
                if (A02.size() == A16.size()) {
                    return new C191949Fc(A02);
                }
                obj = "MessageAddOnPollVoteUtils/decryptPollVotePayload poll_vote_option_not_found pollVoteSelectedOptionSha256Strings is not same size as pollVoteSelectedOptionIds";
            }
            obj = sb.toString();
            break;
        }
        obj = "MessageAddOnPollVoteUtils/decryptPollVotePayload selectedOptionsSha256ByteArrays is null";
        Log.e(obj);
        return null;
    }

    public static ArrayList A02(List list, Set set) {
        if (set.size() == 0) {
            return AnonymousClass001.A0I();
        }
        HashSet A16 = C36441kJ.A16();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3PS r1 = (AnonymousClass3PS) it.next();
            if (set.contains(r1.A02)) {
                long j = r1.A01;
                if (j != -1) {
                    C36391kE.A1W(A16, j);
                }
            }
        }
        return C36441kJ.A15(A16);
    }
}
