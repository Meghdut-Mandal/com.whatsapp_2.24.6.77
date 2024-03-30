package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.ConversationListRowHeaderView;
import com.whatsapp.conversationslist.ViewHolder;
import java.util.Collections;

/* renamed from: X.8a1  reason: invalid class name and case insensitive filesystem */
public class C175208a1 extends C201679k6 {
    public C175308aB A00;
    public final Context A01;
    public final AnonymousClass16D A02;
    public final C33301f4 A03;
    public final C28251Rx A04;
    public final C18820ts A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C175208a1(android.content.Context r28, X.C19730wQ r29, X.AnonymousClass1T1 r30, X.AnonymousClass1NG r31, X.AnonymousClass16D r32, X.AnonymousClass171 r33, X.C33301f4 r34, X.C28251Rx r35, com.whatsapp.conversationslist.ViewHolder r36, X.C21060yb r37, X.C19970wo r38, X.C19630wG r39, X.C18820ts r40, X.C220412q r41, X.AnonymousClass165 r42, X.C20810yC r43, X.C20500xf r44, X.AnonymousClass1EL r45, X.C28371Sj r46, X.AnonymousClass1EV r47, X.AnonymousClass1EU r48, X.AnonymousClass1FR r49, X.AnonymousClass1AW r50, X.AnonymousClass1EM r51, X.C65783Tl r52, X.AnonymousClass005 r53) {
        /*
            r27 = this;
            r12 = r39
            r11 = r38
            r10 = r37
            r9 = r36
            r8 = r35
            r7 = r33
            r6 = r32
            r5 = r31
            r4 = r30
            r3 = r29
            r2 = r28
            r1 = r27
            r13 = r40
            r26 = r53
            r25 = r52
            r24 = r51
            r23 = r50
            r22 = r49
            r21 = r48
            r20 = r47
            r19 = r46
            r18 = r45
            r17 = r44
            r16 = r43
            r15 = r42
            r14 = r41
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1.A01 = r2
            r1.A05 = r13
            r0 = r34
            r1.A03 = r0
            r1.A04 = r8
            r1.A02 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175208a1.<init>(android.content.Context, X.0wQ, X.1T1, X.1NG, X.16D, X.171, X.1f4, X.1Rx, com.whatsapp.conversationslist.ViewHolder, X.0yb, X.0wo, X.0wG, X.0ts, X.12q, X.165, X.0yC, X.0xf, X.1EL, X.1Sj, X.1EV, X.1EU, X.1FR, X.1AW, X.1EM, X.3Tl, X.005):void");
    }

    public static void A00(AnonymousClass9K1 r18, C175208a1 r19) {
        AnonymousClass9K1 r0 = r18;
        if (r18 != null) {
            AnonymousClass3T1 r10 = r0.A02;
            AnonymousClass141 r8 = r0.A00;
            AnonymousClass141 r9 = r0.A01;
            C175208a1 r6 = r19;
            C18820ts r15 = r6.A05;
            ViewHolder viewHolder = r6.A06;
            View view = viewHolder.A04;
            Context context = r6.A01;
            AnonymousClass1JZ.A07(view, r15, context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0, 0, 0);
            View view2 = viewHolder.A03;
            view2.setVisibility(8);
            viewHolder.A0A.setVisibility(8);
            viewHolder.A09.setVisibility(8);
            viewHolder.A08.setVisibility(8);
            viewHolder.A0T.A03(8);
            viewHolder.A0R.A03(8);
            viewHolder.A0M.A03(8);
            viewHolder.A0I(false, 0);
            TextEmojiLabel textEmojiLabel = viewHolder.A0D;
            textEmojiLabel.setVisibility(0);
            C36331k8.A0r(context, textEmojiLabel, R.color.f6nameremoved);
            textEmojiLabel.A0C();
            textEmojiLabel.setPlaceholder(0);
            C200229gu r3 = viewHolder.A0G;
            int A002 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
            ConversationListRowHeaderView conversationListRowHeaderView = r3.A03;
            conversationListRowHeaderView.A01.setTextColor(A002);
            conversationListRowHeaderView.A01.setVisibility(0);
            ImageView imageView = viewHolder.A07;
            imageView.setEnabled(false);
            imageView.setOnClickListener((View.OnClickListener) null);
            imageView.setOnLongClickListener((View.OnLongClickListener) null);
            view2.setOnClickListener((View.OnClickListener) null);
            view2.setOnLongClickListener((View.OnLongClickListener) null);
            AnonymousClass3YG.A00(viewHolder.A0H, r6, r10, 9);
            r3.A06(r8, r6.A0H, r6.A04.BFy());
            r3.A04.A0B(r8);
            r6.A0U((AnonymousClass141) null, r8, r9, r10, (AnonymousClass35M) null, Collections.emptyList(), 0);
        }
    }

    public void A0R() {
        super.A0R();
        C36351kA.A1H(this.A00);
    }
}
