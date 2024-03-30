package X;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.components.InviteViaLinkView;
import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1wY  reason: invalid class name and case insensitive filesystem */
public final class C41061wY extends AnonymousClass0CZ {
    public C62523Gm A00;
    public final AnonymousClass17Y A01;
    public final C62823Hr A02 = new C62823Hr(7, (Object) null);
    public final C62823Hr A03 = new C62823Hr(0, (Object) null);
    public final C62823Hr A04 = new C62823Hr(1, (Object) null);
    public final C62823Hr A05 = new C62823Hr(5, (Object) null);
    public final C61013Af A06;
    public final AnonymousClass17X A07;
    public final C232317r A08;
    public final AnonymousClass190 A09;
    public final GroupJid A0A;
    public final List A0B = AnonymousClass001.A0I();
    public final AnonymousClass1WR A0C;
    public final C19730wQ A0D;
    public final AnonymousClass1LI A0E;
    public final C62823Hr A0F = new C62823Hr(6, (Object) null);
    public final C62823Hr A0G = new C62823Hr(4, (Object) null);
    public final AnonymousClass1Pp A0H;
    public final AnonymousClass171 A0I;
    public final AnonymousClass1RY A0J;
    public final AnonymousClass147 A0K;

    public C41061wY(AnonymousClass1WR r17, AnonymousClass17Y r18, C19730wQ r19, AnonymousClass1LI r20, C61013Af r21, AnonymousClass1Pp r22, AnonymousClass171 r23, AnonymousClass1RY r24, AnonymousClass17X r25, C232317r r26, AnonymousClass190 r27, GroupJid groupJid, AnonymousClass147 r29) {
        AnonymousClass190 r1 = r27;
        AnonymousClass17Y r14 = r18;
        AnonymousClass1WR r15 = r17;
        C36321k7.A16(r14, r1, r15, 1);
        C19730wQ r13 = r19;
        AnonymousClass00C.A0D(r13, 4);
        AnonymousClass1Pp r11 = r22;
        AnonymousClass00C.A0D(r11, 5);
        AnonymousClass171 r10 = r23;
        AnonymousClass00C.A0D(r10, 6);
        AnonymousClass17X r9 = r25;
        C232317r r2 = r26;
        C36361kB.A1J(r2, 7, r9);
        AnonymousClass1LI r12 = r20;
        AnonymousClass00C.A0D(r12, 9);
        AnonymousClass147 r0 = r29;
        AnonymousClass00C.A0D(r0, 11);
        this.A01 = r14;
        this.A09 = r1;
        this.A0C = r15;
        this.A0D = r13;
        this.A0H = r11;
        this.A0I = r10;
        this.A08 = r2;
        this.A07 = r9;
        this.A0E = r12;
        this.A0A = groupJid;
        this.A0K = r0;
        this.A0J = r24;
        this.A06 = r21;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r6.A02.A0M(r5.A03) == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BSE(X.AnonymousClass0D3 r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r14, r0)
            boolean r0 = r14 instanceof X.C42451yq
            if (r0 == 0) goto L_0x00dc
            java.util.List r0 = r13.A0B
            java.lang.Object r0 = r0.get(r15)
            X.3Hr r0 = (X.C62823Hr) r0
            java.lang.Object r5 = r0.A01
            X.3Gm r5 = (X.C62523Gm) r5
            X.1yq r14 = (X.C42451yq) r14
            if (r5 == 0) goto L_0x0149
            X.3Af r6 = r13.A06
            r4 = 0
            r3 = 1
            X.AnonymousClass00C.A0D(r6, r3)
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x002e
            X.0wQ r1 = r6.A02
            com.whatsapp.jid.UserJid r0 = r5.A03
            boolean r0 = r1.A0M(r0)
            r2 = 0
            if (r0 != 0) goto L_0x0039
        L_0x002e:
            r2 = 1
            android.view.ViewGroup r1 = r14.A00
            X.4a1 r0 = new X.4a1
            r0.<init>(r5, r6, r4)
            r1.setOnCreateContextMenuListener(r0)
        L_0x0039:
            android.view.ViewGroup r1 = r14.A00
            r1.setClickable(r2)
            if (r2 == 0) goto L_0x00d2
            r0 = 32
            X.C66933Xw.A00(r1, r14, r0)
            r0 = 2131233671(0x7f080b87, float:1.8083486E38)
        L_0x0048:
            r1.setBackgroundResource(r0)
            X.141 r9 = r5.A02
            r2 = r9
            if (r9 != 0) goto L_0x0057
            com.whatsapp.jid.UserJid r0 = r5.A03
            X.141 r9 = new X.141
            r9.<init>(r0)
        L_0x0057:
            r11 = 7
            X.2ol r6 = X.C52022ol.UNKNOWN
            X.0wQ r1 = r14.A03
            com.whatsapp.jid.UserJid r0 = r5.A03
            boolean r0 = r1.A0M(r0)
            if (r0 == 0) goto L_0x00bb
            X.3SF r0 = r14.A06
            r0.A02()
            com.whatsapp.TextEmojiLabel r1 = r14.A05
            X.1WR r0 = r14.A02
            java.lang.String r0 = r0.A00()
        L_0x0071:
            r1.A0I(r0)
            if (r2 == 0) goto L_0x00b0
            X.1RY r1 = r14.A0A
            android.widget.ImageView r0 = r14.A01
            r1.A08(r0, r2)
        L_0x007d:
            int r5 = r5.A00
            r2 = 8
            if (r5 != 0) goto L_0x009f
            com.whatsapp.WaTextView r0 = r14.A07
            r0.setVisibility(r2)
        L_0x0088:
            X.171 r0 = r14.A09
            java.lang.String r1 = r0.A0G(r6, r9, r11)
            if (r1 == 0) goto L_0x0143
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0143
            com.whatsapp.TextEmojiLabel r0 = r14.A04
            r0.setVisibility(r4)
            r0.A0I(r1)
        L_0x009e:
            return
        L_0x009f:
            com.whatsapp.WaTextView r1 = r14.A07
            r0 = 2131888052(0x7f1207b4, float:1.9410728E38)
            if (r5 != r3) goto L_0x00a9
            r0 = 2131888041(0x7f1207a9, float:1.9410706E38)
        L_0x00a9:
            r1.setText(r0)
            r1.setVisibility(r4)
            goto L_0x0088
        L_0x00b0:
            X.1Pp r2 = r14.A08
            android.widget.ImageView r1 = r14.A01
            r0 = 2131231033(0x7f080139, float:1.8078136E38)
            r2.A06(r1, r0)
            goto L_0x007d
        L_0x00bb:
            X.171 r0 = r14.A09
            X.34G r8 = r0.A0C(r9, r11)
            X.2ol r6 = r8.A00
            X.3SF r7 = r14.A06
            r10 = 0
            boolean r12 = r9.A0O()
            r7.A04(r8, r9, r10, r11, r12)
            com.whatsapp.TextEmojiLabel r1 = r14.A05
            java.lang.String r0 = r5.A04
            goto L_0x0071
        L_0x00d2:
            android.content.Context r0 = r1.getContext()
            int r0 = X.C36411kG.A01(r0)
            goto L_0x0048
        L_0x00dc:
            boolean r0 = r14 instanceof X.C41511xK
            if (r0 == 0) goto L_0x0107
            java.util.List r0 = r13.A0B
            java.lang.Object r0 = r0.get(r15)
            X.3Hr r0 = (X.C62823Hr) r0
            java.lang.Object r5 = r0.A01
            java.lang.Number r5 = (java.lang.Number) r5
            X.1xK r14 = (X.C41511xK) r14
            if (r5 == 0) goto L_0x009e
            com.whatsapp.WaTextView r4 = r14.A00
            android.view.View r0 = r14.A0H
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131755412(0x7f100194, float:1.9141703E38)
            int r1 = r5.intValue()
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r5)
            X.C36351kA.A16(r3, r4, r0, r2, r1)
            return
        L_0x0107:
            boolean r0 = r14 instanceof X.C41501xJ
            if (r0 == 0) goto L_0x009e
            X.3Sl r0 = X.AnonymousClass147.A01
            com.whatsapp.jid.GroupJid r4 = r13.A0A
            X.147 r0 = X.C65533Sl.A03(r4)
            if (r0 == 0) goto L_0x009e
            X.1xJ r14 = (X.C41501xJ) r14
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid"
            X.AnonymousClass00C.A0E(r4, r0)
            X.147 r4 = (X.AnonymousClass147) r4
            X.147 r3 = r13.A0K
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            X.1qV r2 = r14.A00
            r2.A02 = r4
            r2.A03 = r3
            X.14u r1 = r2.getActivity()
            X.AnonymousClass00C.A08(r1)
            X.4Nn r0 = r2.getCommunityMembersViewModelFactory$app_product_community_community_non_modified()
            com.whatsapp.community.CommunityMembersViewModel r0 = X.C53582rY.A00(r1, r0, r3)
            r2.A01 = r0
            android.view.View r1 = r2.A07
            r0 = 8
            X.C48932iI.A00(r1, r3, r4, r2, r0)
            return
        L_0x0143:
            com.whatsapp.TextEmojiLabel r0 = r14.A04
            r0.setVisibility(r2)
            return
        L_0x0149:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41061wY.BSE(X.0D3, int):void");
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater A092;
        int i2;
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i != 0) {
            switch (i) {
                case 2:
                    return new C42451yq(C36371kC.A0I(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved), this.A0C, this.A0D, this.A0E, this.A0H, this.A0I, this.A0J);
                case 3:
                    List list = AnonymousClass0D3.A0I;
                    AnonymousClass147 r2 = this.A0K;
                    View inflate = C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false);
                    C48932iI.A00(inflate, r2, viewGroup, this, 9);
                    return new C41511xK(inflate);
                case 4:
                    A092 = C36331k8.A09(viewGroup);
                    i2 = R.layout.f9nameremoved;
                    break;
                case 5:
                    List list2 = AnonymousClass0D3.A0I;
                    AnonymousClass147 r22 = this.A0K;
                    View inflate2 = C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false);
                    C36391kE.A0O(inflate2, R.id.text).setText(R.string.f12nameremoved);
                    C48932iI.A00(inflate2, r22, viewGroup, this, 10);
                    view = inflate2;
                    break;
                case 6:
                    A092 = C36331k8.A09(viewGroup);
                    i2 = R.layout.f9nameremoved;
                    break;
                case 7:
                    return new C41501xJ(new C38931qV(C36351kA.A09(viewGroup)));
                default:
                    A092 = C36331k8.A09(viewGroup);
                    i2 = R.layout.f9nameremoved;
                    break;
            }
            view = C36371kC.A0J(A092, viewGroup, i2, false);
        } else {
            List list3 = AnonymousClass0D3.A0I;
            AnonymousClass147 r23 = this.A0K;
            InviteViaLinkView inviteViaLinkView = new InviteViaLinkView(C36371kC.A0B(viewGroup), (AttributeSet) null, 0);
            inviteViaLinkView.setupOnClick(r23, C36401kF.A0L(C36361kB.A06(viewGroup)), (C45632Sc) null, (AnonymousClass147) null);
            TextView A0P = C36391kE.A0P(inviteViaLinkView, R.id.invite_via_link_text);
            view = inviteViaLinkView;
            if (A0P != null) {
                A0P.setText(R.string.f12nameremoved);
                view = inviteViaLinkView;
            }
        }
        return new C41361x5(view);
    }

    public long A0E(int i) {
        C62823Hr r2 = (C62823Hr) this.A0B.get(i);
        int i2 = r2.A00;
        if (i2 == 2) {
            C62523Gm r0 = (C62523Gm) r2.A01;
            if (r0 != null) {
                i2 = r0.A03.hashCode();
            } else {
                throw C36381kD.A0l();
            }
        }
        return (long) i2;
    }

    public int A0J() {
        return this.A0B.size();
    }

    public int getItemViewType(int i) {
        return ((C62823Hr) this.A0B.get(i)).A00;
    }

    public final void A0L(List list) {
        ArrayList A0l = C36341k9.A0l(list);
        A0l.add(this.A0G);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C62523Gm r3 = (C62523Gm) it.next();
            GroupJid groupJid = this.A0A;
            if (groupJid != null && this.A07.A03(groupJid, r3.A03) == null) {
                A0l.add(new C62823Hr(2, r3));
            }
        }
        A0l.add(this.A0F);
        List list2 = this.A0B;
        C36341k9.A1A(new C40181v5(list2, A0l), this, A0l, list2);
    }
}
