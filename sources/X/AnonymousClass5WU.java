package X;

import android.content.Context;
import androidx.compose.ui.platform.AndroidComposeView;
import com.whatsapp.WaEditText;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$shareSticker$1;

/* renamed from: X.5WU  reason: invalid class name */
public class AnonymousClass5WU extends C03030Cw implements C019408g {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5WU(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x001b;
                case 1: goto L_0x0013;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet> r3 = com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet.class
            r1 = 3
            java.lang.String r4 = "onStickerSelection"
            java.lang.String r5 = "onStickerSelection(Lcom/whatsapp/funstickers/data/model/FunStickerModel;ILcom/whatsapp/stickers/Sticker;)V"
        L_0x000d:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<X.6PU> r3 = X.AnonymousClass6PU.class
            r1 = 3
            java.lang.String r4 = "startAddNewAccountFlow"
            java.lang.String r5 = "startAddNewAccountFlow(Landroid/content/Context;IZ)V"
            goto L_0x000d
        L_0x001b:
            java.lang.Class<androidx.compose.ui.platform.AndroidComposeView> r3 = androidx.compose.ui.platform.AndroidComposeView.class
            r1 = 3
            java.lang.String r4 = "startDrag"
            java.lang.String r5 = "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z"
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5WU.<init>(java.lang.Object, int):void");
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        switch (this.A00) {
            case 0:
                long j = ((AnonymousClass6X0) obj2).A00;
                AndroidComposeView.A0C((AndroidComposeView) this.receiver, (C006302t) obj3, j);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            case 1:
                Context context = (Context) obj;
                AnonymousClass6PU.A00(context, (AnonymousClass6PU) C90514aH.A0q(context, this), AnonymousClass000.A0I(obj2), AnonymousClass000.A1X(obj3));
                break;
            default:
                C134936bq r6 = (C134936bq) obj;
                int A0I = AnonymousClass000.A0I(obj2);
                C135066c4 r8 = (C135066c4) obj3;
                C36321k7.A0v(r6, 0, r8);
                SearchFunStickersBottomSheet searchFunStickersBottomSheet = (SearchFunStickersBottomSheet) this.receiver;
                WaEditText waEditText = searchFunStickersBottomSheet.A09;
                if (waEditText != null) {
                    waEditText.A0B();
                }
                SearchFunStickersViewModel A0X = C90484aE.A0X(searchFunStickersBottomSheet);
                AnonymousClass01I A0i = searchFunStickersBottomSheet.A0i();
                AnonymousClass00C.A0B(A0i);
                if (!AnonymousClass00C.A0J(A0X.A0D.A04(), C1035956b.A00)) {
                    C36331k8.A1T(new SearchFunStickersViewModel$shareSticker$1(A0X, r8, (C023509x) null, A0I), C109325Xd.A00(A0X));
                    break;
                } else {
                    A0X.A0S(A0i, r6);
                    break;
                }
        }
        return AnonymousClass0AJ.A00;
    }
}
