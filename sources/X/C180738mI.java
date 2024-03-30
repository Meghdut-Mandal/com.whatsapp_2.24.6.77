package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8mI  reason: invalid class name and case insensitive filesystem */
public class C180738mI extends AH8 {
    public final C20440xZ A00;
    public final AnonymousClass1H2 A01;
    public final C20810yC A02;
    public final AnonymousClass1SV A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C180738mI(C20440xZ r1, AnonymousClass1H2 r2, C20810yC r3, AnonymousClass1SV r4) {
        super(r2);
        C36321k7.A18(r3, r2, r1, r4);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
    }

    public void Bo6(C62933Ic r5, AnonymousClass3T1 r6) {
        C36321k7.A0w(r6, r5);
        TextEmojiLabel textEmojiLabel = r5.A01;
        C20440xZ r2 = this.A00;
        Context context = textEmojiLabel.getContext();
        A00(textEmojiLabel, r2.A0A(context, C165577te.A0J(textEmojiLabel, context), r6));
        if (this.A02.A0E(7467)) {
            View view = r5.A00;
            this.A03.A0D(view, r6, new C148926ze(C36341k9.A0F(view).getDimensionPixelSize(R.dimen.f7nameremoved)));
        }
    }
}
