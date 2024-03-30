package X;

import android.content.Context;
import android.view.ViewGroup;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.8Wg  reason: invalid class name */
public class AnonymousClass8Wg extends AnonymousClass8VI implements AnonymousClass4PF {
    public final AnonymousClass9ED A00;
    public final AnonymousClass1KP A01;
    public final AnonymousClass4PG A02;
    public final C88374Sl A03;
    public final String A04;
    public final String A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8Wg(X.C24801Dv r15, X.AnonymousClass17Y r16, X.C19730wQ r17, X.C202279lS r18, X.AnonymousClass9ED r19, X.C196089Xp r20, X.AnonymousClass1KP r21, X.AnonymousClass4PG r22, X.C88374Sl r23, X.AnonymousClass16D r24, X.AnonymousClass185 r25, X.AnonymousClass171 r26, X.C18820ts r27, X.C20810yC r28, com.whatsapp.jid.UserJid r29, java.lang.String r30, java.lang.String r31) {
        /*
            r14 = this;
            r2 = r14
            r11 = r27
            r10 = r26
            r9 = r25
            r8 = r24
            r6 = r18
            r5 = r17
            r13 = r29
            r4 = r16
            r12 = r28
            r3 = r15
            r7 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = r23
            r14.A03 = r0
            r0 = r22
            r14.A02 = r0
            r0 = r19
            r14.A00 = r0
            r0 = r31
            r14.A04 = r0
            r0 = r30
            r14.A05 = r0
            r0 = r21
            r14.A01 = r0
            java.util.List r1 = r14.A00
            X.8WN r0 = new X.8WN
            r0.<init>()
            r1.add(r0)
            int r0 = X.C36431kI.A07(r1)
            r14.A08(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8Wg.<init>(X.1Dv, X.17Y, X.0wQ, X.9lS, X.9ED, X.9Xp, X.1KP, X.4PG, X.4Sl, X.16D, X.185, X.171, X.0ts, X.0yC, com.whatsapp.jid.UserJid, java.lang.String, java.lang.String):void");
    }

    public AnonymousClass80I A0M(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (i != 5) {
            return super.A0M(viewGroup, i);
        }
        Context context = viewGroup.getContext();
        UserJid userJid = this.A06;
        C19730wQ r3 = this.A03;
        C18820ts r11 = this.A04;
        C196089Xp r5 = this.A05;
        C88374Sl r10 = this.A03;
        AnonymousClass4PG r9 = this.A02;
        AnonymousClass9ED r4 = this.A00;
        AnonymousClass1KP r8 = this.A01;
        List list = AnonymousClass0D3.A0I;
        return C109925Zq.A00(context, viewGroup2, r3, r4, r5, this, this, r8, r9, r10, r11, userJid);
    }

    public AnonymousClass367 B9s(int i) {
        String str;
        if (C36391kE.A0t(this.A00) instanceof AnonymousClass8WP) {
            i--;
        }
        String valueOf = String.valueOf(i);
        String str2 = this.A05;
        if (str2 == null) {
            str = null;
        } else {
            str = this.A04;
        }
        return new AnonymousClass367(str2, valueOf, str);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return A0M(viewGroup, i);
    }
}
