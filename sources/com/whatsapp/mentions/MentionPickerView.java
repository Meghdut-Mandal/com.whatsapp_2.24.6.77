package com.whatsapp.mentions;

import X.AnonymousClass11F;
import X.AnonymousClass12O;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass17Y;
import X.AnonymousClass1A1;
import X.AnonymousClass1LI;
import X.AnonymousClass1NM;
import X.AnonymousClass2HA;
import X.AnonymousClass4R7;
import X.AnonymousClass4R8;
import X.AnonymousClass75B;
import X.C18820ts;
import X.C19460v5;
import X.C19730wQ;
import X.C19770wU;
import X.C19970wo;
import X.C20310xM;
import X.C20810yC;
import X.C220412q;
import X.C27731Pn;
import X.C28371Sj;
import X.C36341k9;
import X.C36351kA;
import X.C36431kI;
import X.C36441kJ;
import X.C41091wb;
import X.C51912oa;
import X.C65533Sl;
import X.C89114Vh;
import X.C89144Vk;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

public class MentionPickerView extends AnonymousClass2HA {
    public int A00;
    public LinearLayoutManager A01;
    public RecyclerView A02;
    public C19460v5 A03;
    public AnonymousClass17Y A04;
    public C19730wQ A05;
    public AnonymousClass1LI A06;
    public AnonymousClass16D A07;
    public AnonymousClass171 A08;
    public C27731Pn A09;
    public AnonymousClass1NM A0A;
    public C19970wo A0B;
    public C18820ts A0C;
    public C220412q A0D;
    public C20310xM A0E;
    public AnonymousClass17X A0F;
    public AnonymousClass12O A0G;
    public AnonymousClass11F A0H;
    public AnonymousClass147 A0I;
    public AnonymousClass4R7 A0J;
    public C28371Sj A0K;
    public C41091wb A0L;
    public AnonymousClass1A1 A0M;
    public C19770wU A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public volatile boolean A0R;

    public static void A01(MentionPickerView mentionPickerView) {
        AnonymousClass1NM r2;
        AnonymousClass11F r1;
        C51912oa r0;
        if (mentionPickerView.A0H != null) {
            int A1V = mentionPickerView.A01.A1V();
            for (int A1T = mentionPickerView.A01.A1T(); A1T <= A1V; A1T++) {
                int itemViewType = mentionPickerView.A0L.getItemViewType(A1T);
                if (itemViewType != 8) {
                    if (itemViewType == 32 && (mentionPickerView.A00 & 32) == 0) {
                        r2 = mentionPickerView.A0A;
                        r1 = mentionPickerView.A0H;
                        r0 = C51912oa.DEFAULT_BOT_IMAGINE_CMD_SHOWN;
                    }
                } else if ((mentionPickerView.A00 & 8) == 0) {
                    r2 = mentionPickerView.A0A;
                    r1 = mentionPickerView.A0H;
                    r0 = C51912oa.DEFAULT_BOT_SHOWN;
                }
                r2.A08(r0, r1);
                mentionPickerView.A00 = itemViewType | mentionPickerView.A00;
            }
        }
    }

    public void setup(AnonymousClass4R8 r21, Bundle bundle) {
        Bundle bundle2 = bundle;
        AnonymousClass11F A0i = C36351kA.A0i(bundle2, "ARG_JID");
        boolean z = bundle2.getBoolean("ARG_IS_DARK_THEME");
        boolean z2 = bundle2.getBoolean("ARG_HIDE_END_DIVIDER");
        boolean z3 = bundle2.getBoolean("ARG_WITH_BACKGROUND");
        boolean z4 = bundle2.getBoolean("ARG_INCLUDE_BOT_CONTACTS");
        this.A0H = A0i;
        this.A0I = C65533Sl.A01(A0i);
        getContext();
        this.A01 = C36431kI.A0T();
        RecyclerView A0c = C36441kJ.A0c(this, R.id.list);
        this.A02 = A0c;
        A0c.setLayoutManager(this.A01);
        this.A02.A0v(new C89144Vk(this, 5));
        setVisibility(8);
        if (z3) {
            if (!z) {
                setBackgroundResource(R.drawable.ib_new_expanded_top);
            } else {
                C36341k9.A0q(getContext(), this, R.color.f6nameremoved);
            }
        }
        C19970wo r12 = this.A0B;
        C20810yC r14 = this.A01;
        Context context = getContext();
        AnonymousClass17Y r7 = this.A04;
        C28371Sj r3 = this.A0K;
        C19730wQ r8 = this.A05;
        C27731Pn r11 = this.A09;
        this.A0L = new C41091wb(context, this.A03, r7, r8, this.A06, this.A08, r11, r12, this.A0C, r14, A0i, r21, r3, z, z2);
        this.A0N.Bp1(new AnonymousClass75B(42, (Object) this, z4));
        this.A0L.BnA(new C89114Vh(this, 5));
        this.A02.setAdapter(this.A0L);
    }

    public MentionPickerView(Context context) {
        super(context);
        A03();
        this.A0O = false;
        this.A00 = 0;
        this.A0R = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        if (r5.A01.A0E(7439) == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List getUserContacts() {
        /*
            r5 = this;
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            X.17X r0 = r5.A0F
            X.147 r1 = r5.A0I
            X.17r r0 = r0.A07
            X.6X6 r0 = r0.A0C(r1)
            X.0y7 r0 = r0.A05()
            X.14x r4 = r0.iterator()
        L_0x0016:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0057
            com.whatsapp.jid.UserJid r2 = X.C36441kJ.A0o(r4)
            X.0wQ r0 = r5.A05
            boolean r0 = r0.A0M(r2)
            if (r0 != 0) goto L_0x0016
            X.17X r1 = r5.A0F
            X.147 r0 = r5.A0I
            boolean r0 = r1.A0B(r0)
            if (r0 == 0) goto L_0x003d
            X.0yC r1 = r5.A01
            r0 = 7439(0x1d0f, float:1.0424E-41)
            boolean r0 = r1.A0E(r0)
            r1 = 1
            if (r0 != 0) goto L_0x003e
        L_0x003d:
            r1 = 0
        L_0x003e:
            boolean r0 = r2 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 != 0) goto L_0x0048
            boolean r0 = r2 instanceof X.C223313w
            if (r0 == 0) goto L_0x0050
            if (r1 == 0) goto L_0x0050
        L_0x0048:
            if (r2 == 0) goto L_0x0016
            X.16D r0 = r5.A07
            X.C36381kD.A1H(r0, r2, r3)
            goto L_0x0016
        L_0x0050:
            X.12O r0 = r5.A0G
            com.whatsapp.jid.UserJid r2 = r0.A0B(r2)
            goto L_0x0048
        L_0x0057:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mentions.MentionPickerView.getUserContacts():java.util.List");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.3uw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.3uw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: X.3uw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.3uw} */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b5, code lost:
        if (r1 == 6) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bf, code lost:
        if (r8.A01.A0E(4087) != false) goto L_0x0073;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A08(boolean r9) {
        /*
            r8 = this;
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            X.11F r1 = r8.A0H
            boolean r0 = X.AnonymousClass143.A0G(r1)
            if (r0 == 0) goto L_0x004c
            X.12q r0 = r8.A0D
            boolean r0 = r0.A0P(r1)
            if (r0 != 0) goto L_0x004c
            java.util.List r0 = r8.getUserContacts()
            java.util.Iterator r3 = r0.iterator()
        L_0x001c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004c
            X.141 r2 = X.C36391kE.A0f(r3)
            X.0yC r1 = r8.A01
            r0 = 6172(0x181c, float:8.649E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0042
            X.0wo r1 = r8.A0B
            android.content.Context r0 = r8.getContext()
            java.lang.String r0 = X.AnonymousClass3SX.A01(r0, r1, r2)
            boolean r0 = X.AnonymousClass14B.A0F(r0)
            r1 = 16
            if (r0 == 0) goto L_0x0043
        L_0x0042:
            r1 = 2
        L_0x0043:
            X.350 r0 = new X.350
            r0.<init>(r1, r2)
            r4.add(r0)
            goto L_0x001c
        L_0x004c:
            X.11F r1 = r8.A0H
            boolean r0 = X.AnonymousClass143.A0G(r1)
            if (r0 == 0) goto L_0x00a1
            X.12q r0 = r8.A0D
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            int r1 = r0.A05(r1)
            r0 = 3
            if (r1 != r0) goto L_0x00a1
            X.0yC r1 = r8.A01
            r0 = 3097(0xc19, float:4.34E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00a1
            X.0yC r1 = r8.A01
            r0 = 3334(0xd06, float:4.672E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00a1
        L_0x0073:
            X.1Sj r1 = r8.A0K
            X.147 r0 = r8.A0I
            java.util.ArrayList r0 = r1.A03(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x007f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r3 = r5.next()
            X.3ux r3 = (X.C80163ux) r3
            X.16D r1 = r8.A07
            X.11F r0 = r3.A00
            X.141 r2 = r1.A0D(r0)
            java.lang.String r0 = r3.A01
            r2.A0P = r0
            r1 = 2
            X.350 r0 = new X.350
            r0.<init>(r1, r2)
            r4.add(r0)
            goto L_0x007f
        L_0x00a1:
            X.11F r1 = r8.A0H
            boolean r0 = X.AnonymousClass143.A0G(r1)
            if (r0 == 0) goto L_0x00c2
            X.12q r0 = r8.A0D
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            int r1 = r0.A05(r1)
            r0 = 2
            if (r1 == r0) goto L_0x00b7
            r0 = 6
            if (r1 != r0) goto L_0x00c2
        L_0x00b7:
            X.0yC r1 = r8.A01
            r0 = 4087(0xff7, float:5.727E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00c2
            goto L_0x0073
        L_0x00c2:
            if (r9 == 0) goto L_0x0165
            X.0v5 r1 = r8.A03
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0165
            java.lang.Object r0 = r1.A02()
            X.1K5 r0 = (X.AnonymousClass1K5) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0165
            X.0v5 r0 = r8.A03
            java.lang.Object r2 = r0.A02()
            X.1K5 r2 = (X.AnonymousClass1K5) r2
            boolean r0 = r8.A0R
            X.005 r7 = r2.A05
            java.lang.Object r1 = r7.get()
            X.6Tc r1 = (X.C132326Tc) r1
            if (r0 == 0) goto L_0x0177
            r1.A02()
        L_0x00ef:
            X.141 r6 = r1.A08
            r3 = 0
            r8.A0R = r3
            if (r6 == 0) goto L_0x0165
            r1 = 8
            X.350 r0 = new X.350
            r0.<init>(r1, r6)
            r4.add(r3, r0)
            X.0yC r1 = r2.A04
            r0 = 6385(0x18f1, float:8.947E-42)
            boolean r0 = r1.A0E(r0)
            r5 = 0
            if (r0 == 0) goto L_0x0165
            java.lang.Object r1 = r7.get()
            X.6Tc r1 = (X.C132326Tc) r1
            X.141 r0 = r1.A08
            if (r0 != 0) goto L_0x0118
            X.C132326Tc.A00(r1, r3)
        L_0x0118:
            X.141 r0 = r1.A08
            if (r0 == 0) goto L_0x0165
            X.11F r1 = r0.A0H
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0165
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            if (r1 == 0) goto L_0x0165
            X.005 r0 = r2.A06
            java.lang.Object r0 = r0.get()
            X.6BB r0 = (X.AnonymousClass6BB) r0
            X.6E1 r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x0165
            java.util.List r0 = r0.A09
            java.util.Iterator r3 = r0.iterator()
        L_0x013a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0152
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.3uw r0 = (X.C80153uw) r0
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "imagine"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x013a
            r5 = r2
        L_0x0152:
            X.3uw r5 = (X.C80153uw) r5
            if (r5 == 0) goto L_0x0165
            r2 = 32
            X.34z r1 = new X.34z
            r1.<init>(r5, r6)
            X.350 r0 = new X.350
            r0.<init>(r2, r1)
            r4.add(r0)
        L_0x0165:
            X.1wb r3 = r8.A0L
            r3.A05 = r4
            r3.A06 = r4
            X.17Y r2 = r3.A0C
            r1 = 7
            X.72n r0 = new X.72n
            r0.<init>(r3, r1)
            r2.A0H(r0)
            return
        L_0x0177:
            X.141 r0 = r1.A08
            if (r0 != 0) goto L_0x00ef
            r0 = 0
            X.C132326Tc.A00(r1, r0)
            goto L_0x00ef
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mentions.MentionPickerView.A08(boolean):void");
    }

    public View getContentView() {
        return this.A02;
    }

    public void setVisibilityChangeListener(AnonymousClass4R7 r1) {
        this.A0J = r1;
    }

    public MentionPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A03();
    }

    public MentionPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
        this.A0O = false;
        this.A00 = 0;
        this.A0R = true;
    }
}
