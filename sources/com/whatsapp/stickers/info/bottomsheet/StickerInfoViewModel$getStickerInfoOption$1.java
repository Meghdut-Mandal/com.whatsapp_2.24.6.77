package com.whatsapp.stickers.info.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass1Ax;
import X.AnonymousClass39V;
import X.AnonymousClass3QU;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C135066c4;
import X.C19730wQ;
import X.C20810yC;
import X.C28201Rs;
import X.C36321k7;
import X.C36361kB;
import X.C47742fY;
import X.C47752fZ;
import X.C47762fa;
import X.C47772fb;
import X.C47782fc;
import X.C47792fd;
import X.C47802fe;
import X.C47812ff;
import X.C47822fg;
import X.C47832fh;
import X.C52482pV;
import X.C63563Kn;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$getStickerInfoOption$1", f = "StickerInfoViewModel.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
public final class StickerInfoViewModel$getStickerInfoOption$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ boolean $fromMe;
    public final /* synthetic */ C52482pV $origin;
    public final /* synthetic */ C135066c4 $sticker;
    public final /* synthetic */ AnonymousClass3QU $stickerInfo;
    public int label;
    public final /* synthetic */ StickerInfoViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$getStickerInfoOption$1$1", f = "StickerInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$getStickerInfoOption$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r9) {
            return new AnonymousClass1(r4, r5, r6, stickerInfoViewModel, r9, z);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                StickerInfoViewModel stickerInfoViewModel = stickerInfoViewModel;
                C28201Rs r9 = stickerInfoViewModel.A0A;
                AnonymousClass39V r8 = stickerInfoViewModel.A08;
                boolean z = z;
                C135066c4 r6 = r4;
                boolean z2 = stickerInfoViewModel.A01;
                AnonymousClass3QU r4 = r5;
                C52482pV r3 = r6;
                C36321k7.A0y(r6, r4);
                AnonymousClass00C.A0D(r3, 4);
                ArrayList A0I = AnonymousClass001.A0I();
                if (!z2 && r3 != C52482pV.MESSAGE && r8.A01.A0E(7838)) {
                    A0I.add(C47812ff.A00);
                }
                if (!r4.A08 && ((!r8.A00.A0L() && r4.A07 && r4.A0C && r8.A01.A0E(1396) && (!r4.A06 || !r8.A03.A00.A0E(5979))) || !r4.A07)) {
                    A0I.add(C47752fZ.A00);
                }
                C19730wQ r10 = r8.A00;
                if (!r10.A0L() && r4.A07 && !r4.A0C && r8.A01.A0E(1396)) {
                    A0I.add(C47782fc.A00);
                }
                if (r4.A06 && r8.A03.A00.A0E(5979)) {
                    A0I.add(C47762fa.A00);
                }
                if (!z2) {
                    C63563Kn r1 = r8.A02;
                    if (r4.A05 && r1.A00()) {
                        A0I.add(C47772fb.A00);
                    }
                    if (!r6.A0L && AnonymousClass1Ax.A03(r8.A04.A01, 7314)) {
                        A0I.add(C47802fe.A00);
                    }
                }
                if (r10.A0L() || !r4.A07 || !r4.A0C || !r8.A01.A0E(1396) ? (r4.A0A || (((str = r4.A03) != null && str.length() > 0) || r4.A04)) && (!r6.A0N || r8.A01.A0E(5693)) : r3 == C52482pV.MESSAGE) {
                    A0I.add(C47832fh.A00);
                }
                if (!z2) {
                    if (AnonymousClass00C.A0J(r4.A02, "Giphy")) {
                        C20810yC r12 = r8.A01;
                        if (r12.A0E(3792) && AnonymousClass1Ax.A03(r12, 6471)) {
                            A0I.add(C47822fg.A00);
                        }
                    }
                    if (r4.A09 && !z && !r6.A0L && AnonymousClass1Ax.A03(r8.A04.A01, 7314)) {
                        A0I.add(C47792fd.A00);
                    }
                }
                if (r3 != C52482pV.MESSAGE && (r4.A08 || r4.A0B)) {
                    A0I.add(new C47742fY(C36361kB.A1a(r3, C52482pV.TRAY_RECENT)));
                }
                r9.A0C(A0I);
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerInfoViewModel$getStickerInfoOption$1(C135066c4 r2, AnonymousClass3QU r3, C52482pV r4, StickerInfoViewModel stickerInfoViewModel, C023509x r6, boolean z) {
        super(2, r6);
        this.this$0 = stickerInfoViewModel;
        this.$fromMe = z;
        this.$sticker = r2;
        this.$stickerInfo = r3;
        this.$origin = r4;
    }

    public final C023509x create(Object obj, C023509x r9) {
        return new StickerInfoViewModel$getStickerInfoOption$1(this.$sticker, this.$stickerInfo, this.$origin, this.this$0, r9, this.$fromMe);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final StickerInfoViewModel stickerInfoViewModel = this.this$0;
            C005502l r0 = stickerInfoViewModel.A0H;
            final boolean z = this.$fromMe;
            final C135066c4 r4 = this.$sticker;
            final AnonymousClass3QU r5 = this.$stickerInfo;
            final C52482pV r6 = this.$origin;
            AnonymousClass1 r3 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r0, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerInfoViewModel$getStickerInfoOption$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
