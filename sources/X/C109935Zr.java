package X;

import com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$onMultiSkinToneSelected$1;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$onSkinToneSelected$1;

/* renamed from: X.5Zr  reason: invalid class name and case insensitive filesystem */
public class C109935Zr implements AnonymousClass4QU {
    public Object A00;
    public Object A01;
    public final int A02;

    public C109935Zr(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void Bgo(int[] iArr) {
        int i = this.A02;
        EmojiExpressionsFragment emojiExpressionsFragment = (EmojiExpressionsFragment) this.A00;
        Object obj = this.A01;
        if (i != 0) {
            AnonymousClass55T r0 = (AnonymousClass55T) obj;
            if (iArr != null) {
                EmojiExpressionsViewModel A0c = C90514aH.A0c(emojiExpressionsFragment);
                int i2 = r0.A00;
                AnonymousClass3TY.A03(A0c.A09, iArr);
                A0c.A0S(iArr, i2);
                C36331k8.A1T(new EmojiExpressionsViewModel$onSkinToneSelected$1(A0c, (C023509x) null, iArr, i2), C109325Xd.A00(A0c));
                return;
            }
            return;
        }
        AnonymousClass55S r02 = (AnonymousClass55S) obj;
        if (iArr != null) {
            EmojiExpressionsViewModel A0c2 = C90514aH.A0c(emojiExpressionsFragment);
            int i3 = r02.A00;
            AnonymousClass3TY.A02(A0c2.A09, iArr);
            A0c2.A0S(iArr, i3);
            C36331k8.A1T(new EmojiExpressionsViewModel$onMultiSkinToneSelected$1(A0c2, (C023509x) null, iArr, i3), C109325Xd.A00(A0c2));
        }
    }
}
