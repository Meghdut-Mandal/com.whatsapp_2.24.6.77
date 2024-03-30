package com.whatsapp.gallery.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass005;
import X.AnonymousClass04R;
import X.AnonymousClass05H;
import X.AnonymousClass05J;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass0R1;
import X.C001700s;
import X.C005502l;
import X.C007403e;
import X.C009003v;
import X.C023109s;
import X.C023509x;
import X.C06820Vf;
import X.C109325Xd;
import X.C15350nC;
import X.C18510tH;
import X.C36321k7;
import X.C36331k8;
import X.C36431kI;
import X.C54362sp;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class MediaGalleryFragmentViewModel extends AnonymousClass04R {
    public C007403e A00;
    public C007403e A01;
    public C007403e A02;
    public C007403e A03;
    public final C001700s A04 = C36431kI.A0S();
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;
    public final AnonymousClass005 A07;
    public final C005502l A08;
    public final C005502l A09;
    public final AnonymousClass05J A0A;

    @DebugMetadata(c = "com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$1", f = "MediaGalleryFragmentViewModel.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public /* synthetic */ Object L$0;
        public int label;

        public final C023509x create(Object obj, C023509x r3) {
            AnonymousClass1 r0 = new AnonymousClass1(r3);
            r0.L$0 = obj;
            return r0;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r1 = new AnonymousClass1((C023509x) obj2);
            r1.L$0 = obj;
            return r1.invokeSuspend(AnonymousClass0AJ.A00);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                this.label = 1;
                if (((C007403e) this.L$0).BNp(this) == r2) {
                    return r2;
                }
            } else if (i == 1) {
                AnonymousClass0AN.A00(obj);
            } else {
                throw AnonymousClass000.A0e();
            }
            return AnonymousClass0AJ.A00;
        }
    }

    public void A0R() {
        C007403e r0 = this.A02;
        if (r0 != null) {
            r0.B2S((CancellationException) null);
        }
        C007403e r02 = this.A01;
        if (r02 != null) {
            r02.B2S((CancellationException) null);
        }
        C007403e r03 = this.A00;
        if (r03 != null) {
            r03.B2S((CancellationException) null);
        }
        C007403e r04 = this.A03;
        if (r04 != null) {
            r04.B2S((CancellationException) null);
        }
    }

    public MediaGalleryFragmentViewModel(AnonymousClass005 r6, AnonymousClass005 r7, AnonymousClass005 r8, C005502l r9, C005502l r10) {
        C36321k7.A1B(r6, r7, r8, r9, r10);
        this.A06 = r6;
        this.A05 = r7;
        this.A07 = r8;
        this.A08 = r9;
        this.A09 = r10;
        C15350nC r3 = new C15350nC(C023109s.A00, 0, Integer.MAX_VALUE);
        this.A0A = r3;
        C06820Vf.A01(C109325Xd.A00(this), AnonymousClass0R1.A00(r9, new C18510tH((C009003v) new AnonymousClass1((C023509x) null), (AnonymousClass05H) r3, 5)));
    }

    public static final void A01(C54362sp r3, MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel) {
        C36331k8.A1T(new MediaGalleryFragmentViewModel$notifyGalleryState$1(r3, mediaGalleryFragmentViewModel, (C023509x) null), C109325Xd.A00(mediaGalleryFragmentViewModel));
    }
}
