package X;

import com.whatsapp.emoji.search.EmojiSearchProvider;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1uy  reason: invalid class name and case insensitive filesystem */
public final class C40121uy extends AnonymousClass04R implements C158307gi {
    public HashSet A00;
    public final C001700s A01;
    public final C001700s A02;
    public final EmojiSearchProvider A03;

    public final void A0S() {
        this.A02.A0D(AnonymousClass3RT.A01(C36401kF.A0w(this.A01), this.A00));
    }

    public void BfQ(AnonymousClass66P r6) {
        List list = r6.A01;
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj != null) {
                hashSet.add(obj);
            }
        }
        this.A00 = hashSet;
        A0S();
    }

    public C40121uy(EmojiSearchProvider emojiSearchProvider) {
        this.A03 = emojiSearchProvider;
        C001700s A0S = C36431kI.A0S();
        this.A01 = A0S;
        C001700s A0S2 = C36431kI.A0S();
        this.A02 = A0S2;
        A0S.A0D(C36441kJ.A14(0));
        A0S2.A0D(C36441kJ.A14(0));
    }
}
