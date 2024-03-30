package X;

import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;
import java.util.Iterator;

/* renamed from: X.7Sk  reason: invalid class name and case insensitive filesystem */
public final class C154497Sk extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ SearchFunStickersBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154497Sk(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        super(1);
        this.this$0 = searchFunStickersBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        AnonymousClass011 r7 = (AnonymousClass011) obj;
        String str = C90484aE.A0X(this.this$0).A03;
        if (str != null) {
            SearchFunStickersBottomSheet searchFunStickersBottomSheet = this.this$0;
            AnonymousClass1BB r1 = searchFunStickersBottomSheet.A0O;
            if (r1 != null) {
                C135066c4 r4 = (C135066c4) r7.first;
                Integer num = searchFunStickersBottomSheet.A0R;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 10;
                }
                Integer valueOf = Integer.valueOf(i);
                int A08 = C90474aD.A08(r7);
                Iterator A0s = C36361kB.A0s(r1);
                while (A0s.hasNext()) {
                    ((C129156Fn) A0s.next()).A06(r4, valueOf, str, A08);
                }
            } else {
                throw C36331k8.A0d("stickerObservers");
            }
        }
        this.this$0.A1b();
        return AnonymousClass0AJ.A00;
    }
}
