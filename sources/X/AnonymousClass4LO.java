package X;

import android.net.Uri;
import com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet;

/* renamed from: X.4LO  reason: invalid class name */
public final class AnonymousClass4LO extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ StickerInfoBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4LO(StickerInfoBottomSheet stickerInfoBottomSheet) {
        super(1);
        this.this$0 = stickerInfoBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        C55542un r9 = (C55542un) obj;
        if (r9 instanceof C47682fS) {
            StickerInfoBottomSheet stickerInfoBottomSheet = this.this$0;
            if (!C36431kI.A0w(stickerInfoBottomSheet).A01) {
                AnonymousClass3QU r0 = stickerInfoBottomSheet.A08;
                if (r0 == null) {
                    throw C36331k8.A0d("stickerInfo");
                }
                boolean z = r0.A07;
                AnonymousClass005 r02 = stickerInfoBottomSheet.A0H;
                if (r02 != null) {
                    AnonymousClass1YD r03 = (AnonymousClass1YD) r02.get();
                    if (z) {
                        r03.A02("starred", 1);
                    } else {
                        r03.A03("starred", 1);
                    }
                } else {
                    throw C36331k8.A0d("stickerPickerOpenObservers");
                }
            }
        } else if (r9 instanceof C47672fR) {
            StickerInfoBottomSheet.A05(this.this$0);
            StickerInfoBottomSheet stickerInfoBottomSheet2 = this.this$0;
            AnonymousClass11F r3 = stickerInfoBottomSheet2.A05;
            if (r3 != null) {
                AnonymousClass005 r04 = stickerInfoBottomSheet2.A0F;
                if (r04 != null) {
                    r04.get();
                    C47672fR r92 = (C47672fR) r9;
                    Uri uri = r92.A01;
                    int i2 = r92.A00;
                    AnonymousClass01I A0i = stickerInfoBottomSheet2.A0i();
                    AnonymousClass00C.A0B(A0i);
                    C64473Oc.A00(A0i, uri, r3, i2);
                } else {
                    throw C36331k8.A0d("stickerMakerActions");
                }
            }
        } else if (r9 instanceof C47662fQ) {
            StickerInfoBottomSheet.A05(this.this$0);
            StickerInfoBottomSheet stickerInfoBottomSheet3 = this.this$0;
            AnonymousClass11F r5 = stickerInfoBottomSheet3.A05;
            if (r5 != null) {
                AnonymousClass005 r05 = stickerInfoBottomSheet3.A0G;
                if (r05 != null) {
                    AnonymousClass63W r2 = (AnonymousClass63W) r05.get();
                    C47662fQ r93 = (C47662fQ) r9;
                    int i3 = r93.A00;
                    AnonymousClass01I A0i2 = stickerInfoBottomSheet3.A0i();
                    C52482pV r06 = stickerInfoBottomSheet3.A09;
                    if (r06 == null) {
                        throw C36331k8.A0d("origin");
                    }
                    int ordinal = r06.ordinal();
                    if (ordinal == 4) {
                        i = 10;
                    } else if (ordinal == 3 || ordinal == 1 || ordinal == 2) {
                        i = 11;
                    } else if (ordinal == 0) {
                        i = 12;
                    } else {
                        throw C36441kJ.A18();
                    }
                    AnonymousClass3XM r4 = r93.A01;
                    AnonymousClass00C.A0B(A0i2);
                    r2.A00(A0i2, r4, r5, i3, i);
                } else {
                    throw C36331k8.A0d("stickerMakerBottomSheetProviderFactory");
                }
            }
        } else {
            AnonymousClass00C.A0J(r9, C47692fT.A00);
        }
        this.this$0.A1b();
        return AnonymousClass0AJ.A00;
    }
}
