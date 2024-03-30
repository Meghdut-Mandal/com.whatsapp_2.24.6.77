package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8lw  reason: invalid class name and case insensitive filesystem */
public class C180518lw extends AH8 {
    public final AnonymousClass1H2 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C180518lw(AnonymousClass1H2 r2) {
        super(r2);
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void Bo6(C62933Ic r5, AnonymousClass3T1 r6) {
        AnonymousClass00C.A0D(r5, 1);
        TextEmojiLabel textEmojiLabel = r5.A01;
        Context context = textEmojiLabel.getContext();
        CharSequence A0a = C165597tg.A0a(C165587tf.A0D(context, R.drawable.msg_status_sticker), textEmojiLabel, context.getString(R.string.f12nameremoved));
        AnonymousClass00C.A08(A0a);
        A00(textEmojiLabel, A0a);
    }
}
