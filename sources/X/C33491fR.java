package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

/* renamed from: X.1fR  reason: invalid class name and case insensitive filesystem */
public abstract class C33491fR extends AnonymousClass07P implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public void A09() {
        if (this instanceof C33971gE) {
            C33971gE r2 = (C33971gE) this;
            if (!r2.A00) {
                r2.A00 = true;
                TextEmojiLabel textEmojiLabel = (TextEmojiLabel) r2;
                C18800tq r1 = ((C27861Qc) ((C27851Qb) r2.generatedComponent())).A0M;
                textEmojiLabel.A01 = (C18820ts) r1.A9X.get();
                textEmojiLabel.A02 = (C20810yC) r1.A02.get();
                textEmojiLabel.A04 = (AnonymousClass1H2) r1.A2x.get();
                textEmojiLabel.A02 = (C21060yb) r1.A8W.get();
                textEmojiLabel.A05 = (C19890wg) r1.A7i.get();
                textEmojiLabel.A03 = (AnonymousClass1N0) r1.A00.A3P.get();
            }
        } else if (!this.A01) {
            this.A01 = true;
            WaTextView waTextView = (WaTextView) this;
            C18800tq r12 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0M;
            waTextView.A01 = (C18820ts) r12.A9X.get();
            waTextView.A02 = (C20810yC) r12.A02.get();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = new AnonymousClass1QZ(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C33491fR(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A09();
    }

    public C33491fR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A09();
    }

    public C33491fR(Context context) {
        super(context, (AttributeSet) null);
        A09();
    }
}
