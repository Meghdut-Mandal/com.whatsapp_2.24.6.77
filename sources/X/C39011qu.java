package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaEditText;
import com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.payments.ui.widget.CardInputText;
import com.whatsapp.status.widget.StatusEditText;
import com.whatsapp.text.FinalBackspaceAwareEntry;

/* renamed from: X.1qu  reason: invalid class name and case insensitive filesystem */
public abstract class C39011qu extends AnonymousClass074 implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public C39011qu(Context context) {
        super(context, (AttributeSet) null);
        A0A();
    }

    public static void A01(C18800tq r1, WaEditText waEditText) {
        waEditText.A03 = (C18820ts) r1.A9X.get();
        waEditText.A02 = (C21060yb) r1.A8W.get();
    }

    public void A0A() {
        if (this instanceof CardInputText) {
            CardInputText cardInputText = (CardInputText) this;
            if (!cardInputText.A05) {
                cardInputText.A05 = true;
                A01(C36391kE.A0W(cardInputText.generatedComponent()), cardInputText);
            }
        } else if (this instanceof FinalBackspaceAwareEntry) {
            FinalBackspaceAwareEntry finalBackspaceAwareEntry = (FinalBackspaceAwareEntry) this;
            if (!finalBackspaceAwareEntry.A02) {
                finalBackspaceAwareEntry.A02 = true;
                C18800tq A0W = C36391kE.A0W(finalBackspaceAwareEntry.generatedComponent());
                A01(A0W, finalBackspaceAwareEntry);
                finalBackspaceAwareEntry.A00 = C36341k9.A0V(A0W);
            }
        } else if (this instanceof AnonymousClass2H5) {
            AnonymousClass2H5 r1 = (AnonymousClass2H5) this;
            if (r1 instanceof StatusEditText) {
                StatusEditText statusEditText = (StatusEditText) r1;
                if (!statusEditText.A00) {
                    statusEditText.A00 = true;
                    C18800tq A0W2 = C36391kE.A0W(statusEditText.generatedComponent());
                    A01(A0W2, statusEditText);
                    statusEditText.A00 = C36341k9.A0V(A0W2);
                    statusEditText.A03 = C36401kF.A0f(A0W2);
                    statusEditText.A00 = C36351kA.A0N(A0W2);
                    statusEditText.A02 = C36351kA.A0Y(A0W2);
                    statusEditText.A0F = (C28371Sj) A0W2.A4r.get();
                    statusEditText.A07 = C36351kA.A0a(A0W2);
                    statusEditText.A06 = C36401kF.A0W(A0W2);
                    statusEditText.A0H = C18840tu.A00(A0W2.ACG);
                    statusEditText.A05 = C36381kD.A0Q(A0W2.ACG);
                    statusEditText.A08 = C36351kA.A0b(A0W2);
                    statusEditText.A0G = C36351kA.A0m(A0W2);
                }
            } else if (!r1.A00) {
                r1.A00 = true;
                MentionableEntry mentionableEntry = (MentionableEntry) r1;
                C18800tq r2 = ((C27861Qc) ((C27851Qb) r1.generatedComponent())).A0M;
                A01(r2, mentionableEntry);
                mentionableEntry.A00 = C36341k9.A0V(r2);
                mentionableEntry.A03 = C36401kF.A0f(r2);
                mentionableEntry.A00 = C36351kA.A0N(r2);
                mentionableEntry.A02 = C36351kA.A0Y(r2);
                mentionableEntry.A0F = (C28371Sj) r2.A4r.get();
                mentionableEntry.A07 = C36351kA.A0a(r2);
                mentionableEntry.A06 = C36401kF.A0W(r2);
                mentionableEntry.A0H = C18840tu.A00(r2.ACG);
                mentionableEntry.A05 = C36381kD.A0Q(r2.ACG);
                mentionableEntry.A08 = C36351kA.A0b(r2);
                mentionableEntry.A0G = C36351kA.A0m(r2);
            }
        } else if (this instanceof DoodleEditText) {
            DoodleEditText doodleEditText = (DoodleEditText) this;
            if (!doodleEditText.A01) {
                doodleEditText.A01 = true;
                A01(C36391kE.A0W(doodleEditText.generatedComponent()), doodleEditText);
            }
        } else if (this instanceof AnonymousClass281) {
            AnonymousClass281 r12 = (AnonymousClass281) this;
            if (!r12.A00) {
                r12.A00 = true;
                A01(C36391kE.A0W(r12.generatedComponent()), r12);
            }
        } else if (this instanceof AnonymousClass280) {
            AnonymousClass280 r13 = (AnonymousClass280) this;
            if (!r13.A00) {
                r13.A00 = true;
                A01(C36391kE.A0W(r13.generatedComponent()), r13);
            }
        } else if (!this.A01) {
            this.A01 = true;
            A01(((C27861Qc) ((C27851Qb) generatedComponent())).A0M, (WaEditText) this);
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

    public static int A00(CardInputText cardInputText) {
        cardInputText.A0A();
        cardInputText.A00 = 1.0f;
        cardInputText.A01 = 2.0f;
        cardInputText.A02 = 24.0f;
        cardInputText.A03 = 8.0f;
        cardInputText.A04 = 4;
        return 4;
    }

    public C39011qu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0A();
    }

    public C39011qu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0A();
    }
}
