package X;

import com.whatsapp.stickers.flow.StickerPackFlow;
import com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$observer$1$onThirdPartyPackAdded$1;

/* renamed from: X.7pL  reason: invalid class name and case insensitive filesystem */
public class C162907pL extends C129156Fn {
    public Object A00;
    public Object A01;
    public final int A02;

    public C162907pL(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void A0B(String str, String str2) {
        if (1 - this.A02 == 0) {
            C36321k7.A0w(str, str2);
            StickerPackFlow stickerPackFlow = (StickerPackFlow) this.A01;
            C36381kD.A1R(stickerPackFlow.A0D, new StickerPackFlow$packFlow$1$observer$1$onThirdPartyPackAdded$1(stickerPackFlow, str, str2, (C023509x) null, (C18000sQ) this.A00), stickerPackFlow.A0E);
        }
    }
}
