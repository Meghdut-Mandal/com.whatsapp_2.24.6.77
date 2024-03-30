package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1oy  reason: invalid class name and case insensitive filesystem */
public final class C38471oy extends LinearLayout {
    public boolean A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38471oy(Context context) {
        super(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
        setId(R.id.bot_message_prompts_view);
        setOrientation(1);
        setGravity(8388613);
        setImportantForAccessibility(2);
    }

    public final void setData(List list, AnonymousClass4PM r13) {
        boolean A1a = C36341k9.A1a(list, r13);
        removeAllViews();
        int dimensionPixelSize = C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        int dimensionPixelSize2 = C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                throw C36351kA.A0v();
            }
            String str = (String) next;
            View inflate = C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this, false);
            C33521fV.A02(inflate);
            AnonymousClass00C.A0B(inflate);
            TextView A0P = C36391kE.A0P(inflate, R.id.bot_message_prompt_text);
            if (A0P != null) {
                A0P.setText(str);
            }
            inflate.setOnClickListener(new AnonymousClass3YL(this, i, A1a ? 1 : 0, r13));
            ViewGroup.MarginLayoutParams A0N = C36411kG.A0N(inflate);
            int i3 = dimensionPixelSize2;
            if (i == 0) {
                i3 = dimensionPixelSize;
            }
            A0N.topMargin = i3;
            inflate.setLayoutParams(A0N);
            addView(inflate);
            i = i2;
        }
        this.A00 = false;
    }

    public static final void setData$lambda$2$lambda$0(C38471oy r19, AnonymousClass4PM r20, int i, View view) {
        List list;
        AnonymousClass11F r2;
        C64933Qa r0;
        AnonymousClass11F r22;
        Integer valueOf;
        AnonymousClass3JL r10;
        AnonymousClass4PM r1 = r20;
        C38471oy r23 = r19;
        boolean A1a = C36341k9.A1a(r23, r1);
        if (!r23.A00) {
            r23.A00 = A1a;
            AnonymousClass4Y8 r12 = (AnonymousClass4Y8) r1;
            int i2 = r12.A01;
            Object obj = r12.A00;
            int i3 = i;
            if (i2 != 0) {
                C39921uG r3 = (C39921uG) obj;
                List A0w = C36401kF.A0w(r3.A03);
                if (A0w == null) {
                    return;
                }
                if (i < 0 || i3 >= A0w.size()) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("BotMessagePromptsViewModel/onPromptClick ");
                    A0u.append(i3);
                    A0u.append(" out of range ");
                    C36351kA.A1L(new C15020mZ(0, C36431kI.A07(A0w)), A0u);
                    return;
                }
                AnonymousClass3T1 A0r = C36431kI.A0r(r3.A00);
                if (A0r != null && (r0 = A0r.A1J) != null && (r22 = r0.A00) != null) {
                    String A0s = C36401kF.A0s(A0w, i3);
                    AnonymousClass1X4 r7 = r3.A05;
                    AtomicBoolean atomicBoolean = r3.A02;
                    if (atomicBoolean.get()) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(i3);
                    }
                    if (valueOf != null) {
                        r10 = new AnonymousClass3JL(valueOf, (List) null, false);
                    } else {
                        r10 = null;
                    }
                    r7.A0D((C145166tS) null, (AnonymousClass3XT) null, r10, (C63663Kx) null, (AnonymousClass3BG) null, (AnonymousClass3T1) null, (AnonymousClass3L1) null, (AnonymousClass4UX) null, (Integer) null, A0s, Collections.singletonList(r22), (List) null, false, false, false);
                    if (!atomicBoolean.get()) {
                        AnonymousClass11F r02 = r3.A0C;
                        AnonymousClass1NM r6 = r3.A09;
                        SharedPreferences A002 = AnonymousClass1NM.A00(r6);
                        String rawString = r02.getRawString();
                        AnonymousClass00C.A0D(rawString, 0);
                        r6.A0R.execute(new C35491im(r6, A002, AnonymousClass000.A0q("_BotMessagePromptsRowCount", AnonymousClass000.A0v(rawString)), A1a ? 1 : 0));
                        return;
                    }
                    return;
                }
                return;
            }
            C39931uI r32 = (C39931uI) obj;
            if (r32.A04 || r32.A03 || r32.A01.length() > 0) {
                list = C023409w.A00;
            } else {
                list = r32.A02;
            }
            AnonymousClass69W r03 = (AnonymousClass69W) C007103b.A0P(list, i3);
            if (r03 != null && (r2 = r32.A00) != null) {
                r32.A06.A0N(r2, r03.A01);
                C39931uI.A01(r32);
            }
        }
    }
}
