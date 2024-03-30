package X;

import android.content.Context;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8m9  reason: invalid class name and case insensitive filesystem */
public class C180648m9 extends AH8 {
    public final C20440xZ A00;
    public final AnonymousClass1H2 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C180648m9(C20440xZ r1, AnonymousClass1H2 r2) {
        super(r2);
        C36321k7.A0x(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public void Bo6(C62933Ic r5, AnonymousClass3T1 r6) {
        C36321k7.A0w(r6, r5);
        TextEmojiLabel textEmojiLabel = r5.A01;
        C20440xZ r2 = this.A00;
        Context context = textEmojiLabel.getContext();
        A00(textEmojiLabel, r2.A09(context, C165577te.A0J(textEmojiLabel, context), r6));
    }
}
