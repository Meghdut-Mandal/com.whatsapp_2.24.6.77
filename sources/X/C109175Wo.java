package X;

import com.whatsapp.WaEditText;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$onToggleFavoriteSticker$1;
import java.nio.ByteBuffer;

/* renamed from: X.5Wo  reason: invalid class name and case insensitive filesystem */
public class C109175Wo extends C03030Cw implements C009003v {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C109175Wo(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            if (r9 == 0) goto L_0x0012
            java.lang.Class<com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet> r3 = com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet.class
            r1 = 2
            java.lang.String r4 = "onToggleFavoriteSticker"
            java.lang.String r5 = "onToggleFavoriteSticker(Lcom/whatsapp/funstickers/data/model/FunStickerModel;Lcom/whatsapp/stickers/Sticker;)V"
        L_0x000c:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0012:
            java.lang.Class<X.9l0> r3 = X.C202079l0.class
            r1 = 2
            java.lang.String r4 = "send"
            java.lang.String r5 = "send(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)Lcom/facebook/wearable/datax/Error;"
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109175Wo.<init>(java.lang.Object, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A00 != 0) {
            C134936bq r9 = (C134936bq) obj;
            C135066c4 r10 = (C135066c4) obj2;
            C36321k7.A0w(r9, r10);
            SearchFunStickersBottomSheet searchFunStickersBottomSheet = (SearchFunStickersBottomSheet) this.receiver;
            WaEditText waEditText = searchFunStickersBottomSheet.A09;
            if (waEditText != null) {
                waEditText.A0B();
            }
            if (r9.A06 != null) {
                SearchFunStickersViewModel A0X = C90484aE.A0X(searchFunStickersBottomSheet);
                C36331k8.A1T(new SearchFunStickersViewModel$onToggleFavoriteSticker$1(A0X, r10, (C023509x) null), C109325Xd.A00(A0X));
            }
            return AnonymousClass0AJ.A00;
        }
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        ByteBuffer byteBuffer2 = (ByteBuffer) obj2;
        C36331k8.A1I(byteBuffer, byteBuffer2);
        C202079l0 r4 = (C202079l0) this.receiver;
        C122185uR r5 = r4.A07;
        if (r5.A03.get() == Thread.currentThread().getId()) {
            AnonymousClass6P8 A002 = C202079l0.A00(r4, byteBuffer, false);
            if (AnonymousClass00C.A0J(A002, AnonymousClass6P8.A06)) {
                return C202079l0.A00(r4, byteBuffer2, !AnonymousClass000.A1R(r5.A02.get()));
            }
            return A002;
        } else if (!r4.A0C.get()) {
            return AnonymousClass6P8.A05;
        } else {
            C128356By r0 = r4.A06;
            C1503374w r2 = new C1503374w(r0.A01(byteBuffer), r0.A01(byteBuffer2), r4, 22);
            r5.A02.incrementAndGet();
            r5.A01.execute(AnonymousClass74N.A00(r2, r5, 14));
            return AnonymousClass6P8.A06;
        }
    }
}
