package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.bonsai.commands.BotCommandsPickerView;
import com.whatsapp.mentions.MentionPickerView;

/* renamed from: X.1oD  reason: invalid class name and case insensitive filesystem */
public abstract class C38311oD extends FrameLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public static void A00(WaFrameLayout waFrameLayout) {
        waFrameLayout.A01 = 0;
        waFrameLayout.A00 = 0;
        waFrameLayout.A03 = 0;
        waFrameLayout.A02 = 0;
        waFrameLayout.A04 = false;
    }

    public void A03() {
        if (this instanceof AnonymousClass284) {
            AnonymousClass284 r1 = (AnonymousClass284) this;
            if (!r1.A01) {
                r1.A01 = true;
                r1.A00 = C36341k9.A0V(((C27861Qc) ((C27851Qb) r1.generatedComponent())).A0M);
            }
        } else if (this instanceof MentionPickerView) {
            MentionPickerView mentionPickerView = (MentionPickerView) this;
            if (!mentionPickerView.A0Q) {
                mentionPickerView.A0Q = true;
                C18800tq A0W = C36391kE.A0W(mentionPickerView.generatedComponent());
                mentionPickerView.A01 = C36341k9.A0V(A0W);
                mentionPickerView.A0B = C36351kA.A0V(A0W);
                mentionPickerView.A04 = C36351kA.A0M(A0W);
                mentionPickerView.A0K = (C28371Sj) A0W.A4r.get();
                mentionPickerView.A05 = C36351kA.A0N(A0W);
                mentionPickerView.A0N = C36341k9.A0Z(A0W);
                mentionPickerView.A0D = C36351kA.A0a(A0W);
                mentionPickerView.A09 = C36351kA.A0T(A0W);
                mentionPickerView.A07 = C36341k9.A0R(A0W);
                mentionPickerView.A08 = C36341k9.A0S(A0W);
                mentionPickerView.A0C = C36341k9.A0T(A0W);
                mentionPickerView.A0E = C36371kC.A0Z(A0W);
                mentionPickerView.A0M = C36351kA.A0n(A0W);
                mentionPickerView.A0G = C36411kG.A0d(A0W);
                mentionPickerView.A0A = C36401kF.A0W(A0W);
                mentionPickerView.A03 = C36381kD.A0Q(A0W.ACG);
                mentionPickerView.A0F = C36351kA.A0b(A0W);
                mentionPickerView.A06 = C36361kB.A0S(A0W);
            }
        } else if (this instanceof AnonymousClass2H3) {
            AnonymousClass2H3 r2 = (AnonymousClass2H3) this;
            if (!r2.A00) {
                r2.A00 = true;
                BotCommandsPickerView botCommandsPickerView = (BotCommandsPickerView) r2;
                C18800tq r12 = ((C27861Qc) ((C27851Qb) r2.generatedComponent())).A0M;
                botCommandsPickerView.A01 = C36341k9.A0V(r12);
                botCommandsPickerView.A02 = C36401kF.A0W(r12);
            }
        } else if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C38311oD(Context context) {
        super(context);
        A03();
    }

    public C38311oD(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03();
    }

    public C38311oD(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A03();
    }

    public C38311oD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
    }
}
