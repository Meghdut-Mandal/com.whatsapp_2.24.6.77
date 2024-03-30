package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8sL  reason: invalid class name and case insensitive filesystem */
public final class C184378sL extends C118095nK {
    public final UserJid A00;
    public final UserJid A01;
    public final UserJid A02;
    public final UserJid A03;
    public final C183928rc A04;
    public final C184478sV A05;

    public C184378sL(C203399nx r23) {
        C203399nx r4 = r23;
        Class<String> cls = String.class;
        C203379ns.A03(r4, cls, C165607th.A0k(), C165597tg.A0e(), (Object) null, C203399nx.A0M(r4, "group"), false);
        Class<UserJid> cls2 = UserJid.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        C203399nx r11 = r4;
        this.A00 = (UserJid) C203539oF.A07(r11, cls2, A0P, A0Q, (Object) null, new String[]{"creator"}, false);
        this.A01 = (UserJid) C203539oF.A07(r11, cls2, A0P, A0Q, (Object) null, new String[]{"creator_pn"}, false);
        Class<Long> cls3 = Long.class;
        Long A0t = C36411kG.A0t();
        C203399nx r15 = r4;
        Long l = A0Q;
        C203379ns.A03(r15, cls3, A0t, l, (Object) null, new String[]{"creation"}, false);
        Long A0Y = C90474aD.A0Y();
        Long A0b = C165587tf.A0b();
        C203539oF.A07(r4, cls, A0Y, A0b, (Object) null, new String[]{"p_v_id"}, false);
        C203539oF.A07(r4, cls, A0Y, A0b, (Object) null, new String[]{"a_v_id"}, false);
        C203539oF.A07(r15, cls3, A0t, l, (Object) null, new String[]{"s_t"}, false);
        this.A02 = (UserJid) C203539oF.A07(r11, cls2, A0P, A0Q, (Object) null, new String[]{"s_o"}, false);
        this.A03 = (UserJid) C203539oF.A07(r11, cls2, A0P, A0Q, (Object) null, new String[]{"s_o_pn"}, false);
        C203539oF.A07(r4, cls, A0Y, A0b, (Object) null, new String[]{"open_thread_id"}, false);
        this.A05 = (C184478sV) C203379ns.A01(r4, C21473AMv.A00);
        C22993Azj[] azjArr = new C22993Azj[2];
        azjArr[0] = C21474AMw.A00;
        this.A04 = (C183928rc) C203379ns.A06(r4, "NamedSubject|UnnamedSubjectFallback", C165567td.A0c(C21475AMx.A00, azjArr), new String[0]);
        this.A00 = r4;
    }
}
