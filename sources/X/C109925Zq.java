package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.5Zq  reason: invalid class name and case insensitive filesystem */
public abstract class C109925Zq {
    public static final C102264ze A00(Context context, ViewGroup viewGroup, C19730wQ r15, AnonymousClass9ED r16, C196089Xp r17, C159967kF r18, AnonymousClass4PF r19, AnonymousClass1KP r20, AnonymousClass4PG r21, C88374Sl r22, C18820ts r23, UserJid userJid) {
        AnonymousClass00C.A0D(context, 0);
        C196089Xp r5 = r17;
        C18820ts r11 = r23;
        UserJid userJid2 = userJid;
        C36321k7.A1B(userJid2, r15, viewGroup, r11, r5);
        C88374Sl r10 = r22;
        AnonymousClass00C.A0D(r10, 8);
        AnonymousClass1KP r8 = r20;
        AnonymousClass00C.A0D(r8, 11);
        View inflate = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, viewGroup, false);
        C33521fV.A02(inflate);
        List list = AnonymousClass0D3.A0I;
        AnonymousClass00C.A0B(inflate);
        return new C102264ze(inflate, r15, r16, r5, r18, r19, r8, r21, r10, r11, userJid2);
    }
}
