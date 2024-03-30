package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment;

/* renamed from: X.7Se  reason: invalid class name and case insensitive filesystem */
public final class C154437Se extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ EmojiExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154437Se(EmojiExpressionsFragment emojiExpressionsFragment) {
        super(1);
        this.this$0 = emojiExpressionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        C1034255h r1;
        AnonymousClass6CK r8 = (AnonymousClass6CK) obj;
        AnonymousClass00C.A0D(r8, 0);
        AnonymousClass63V r12 = C90514aH.A0c(this.this$0).A06;
        AnonymousClass55N r0 = AnonymousClass55N.A00;
        r12.A00(r0, r0, 5);
        String str = r8.A02;
        int i2 = 18;
        if (AnonymousClass00C.A0J(str, "recents")) {
            i2 = 27;
        }
        AnonymousClass6O1 r2 = this.this$0.A08;
        if (r2 != null) {
            AnonymousClass6O1.A01(r2, i2, 1, 4);
            EmojiExpressionsFragment emojiExpressionsFragment = this.this$0;
            emojiExpressionsFragment.A0C = r8;
            C95864mP r4 = emojiExpressionsFragment.A0B;
            if (r4 != null) {
                int A0J = r4.A0J();
                i = 0;
                while (true) {
                    if (i >= A0J) {
                        break;
                    }
                    Object A0L = r4.A0L(i);
                    if ((A0L instanceof C1034255h) && (r1 = (C1034255h) A0L) != null && AnonymousClass00C.A0J(r1.A01.A02, str)) {
                        break;
                    }
                    i++;
                }
            }
            i = 0;
            LinearLayoutManager linearLayoutManager = this.this$0.A04;
            if (linearLayoutManager != null) {
                linearLayoutManager.A1g(i, 0);
            }
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("expressionUserJourneyLogger");
    }
}
