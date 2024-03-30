package X;

import android.view.ViewGroup;
import com.whatsapp.bonsai.commands.BotCommandsPickerView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.3dg  reason: invalid class name and case insensitive filesystem */
public final class C69533dg implements C87054Nh {
    public C87064Ni A00;
    public BotCommandsPickerView A01;
    public UserJid A02;
    public final ViewGroup A03;
    public final AnonymousClass1NM A04;
    public final C30791am A05;
    public final MentionableEntry A06;

    public C69533dg(ViewGroup viewGroup, AnonymousClass012 r5, AnonymousClass1NM r6, C30791am r7, MentionableEntry mentionableEntry, C39781tl r9) {
        C36321k7.A11(mentionableEntry, r9, r5);
        C36341k9.A1F(r6, r7);
        this.A06 = mentionableEntry;
        this.A03 = viewGroup;
        this.A04 = r6;
        this.A05 = r7;
        C55492ui.A01(r5, r9.A05, new C85704Ic(this), 28);
        mentionableEntry.addTextChangedListener(new AnonymousClass2g9(this, r9));
        mentionableEntry.A0E = new C75753nk(this, r9);
    }
}
