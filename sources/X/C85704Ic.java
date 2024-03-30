package X;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.bonsai.commands.BotCommandsPickerView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;
import java.util.List;

/* renamed from: X.4Ic  reason: invalid class name and case insensitive filesystem */
public final class C85704Ic extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C69533dg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85704Ic(C69533dg r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        BotCommandsPickerView botCommandsPickerView;
        AnonymousClass3Q4 r12 = (AnonymousClass3Q4) obj;
        List list = r12.A02;
        if (list == null) {
            BotCommandsPickerView botCommandsPickerView2 = this.this$0.A01;
            if (botCommandsPickerView2 != null) {
                botCommandsPickerView2.A08(0);
            }
        } else {
            if (C36401kF.A1a(list)) {
                list.size();
            }
            C69533dg r9 = this.this$0;
            Bitmap bitmap = r12.A00;
            UserJid userJid = r12.A01;
            r9.A02 = userJid;
            if (r9.A01 == null) {
                MentionableEntry mentionableEntry = r9.A06;
                LayoutInflater A0C = C36351kA.A0C(mentionableEntry);
                ViewGroup viewGroup = r9.A03;
                View A0E = C36361kB.A0E(A0C, viewGroup, R.layout.f9nameremoved);
                AnonymousClass00C.A08(A0E);
                if (A0E instanceof BotCommandsPickerView) {
                    r9.A01 = (BotCommandsPickerView) A0E;
                    if (viewGroup != null) {
                        viewGroup.addView(A0E);
                    }
                }
                C87064Ni r7 = r9.A00;
                if (!(r7 == null || (botCommandsPickerView = r9.A01) == null)) {
                    botCommandsPickerView.setupView(list, bitmap, r7, mentionableEntry.A03, r9, userJid);
                }
            }
            BotCommandsPickerView botCommandsPickerView3 = this.this$0.A01;
            if (botCommandsPickerView3 != null) {
                botCommandsPickerView3.setCommandList(list, bitmap);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
