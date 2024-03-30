package com.whatsapp.gallery.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass2U4;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C87774Qc;
import X.C88924Uo;
import com.whatsapp.util.Log;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$loadMedia$1", f = "MediaGalleryFragmentViewModel.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
public final class MediaGalleryFragmentViewModel$loadMedia$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C87774Qc $mediaListCreator;
    public final /* synthetic */ boolean $unmounted;
    public int label;
    public final /* synthetic */ MediaGalleryFragmentViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$loadMedia$1$1", f = "MediaGalleryFragmentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$loadMedia$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r6) {
            return new AnonymousClass1(r3, mediaGalleryFragmentViewModel, r6, z);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                try {
                    mediaGalleryFragmentViewModel.A06.get();
                    C87774Qc r2 = r3;
                    boolean z = z;
                    AnonymousClass00C.A0D(r2, 0);
                    C88924Uo B4h = r2.B4h(!z);
                    B4h.getCount();
                    MediaGalleryFragmentViewModel.A01(new AnonymousClass2U4(B4h, z), mediaGalleryFragmentViewModel);
                } catch (CancellationException e) {
                    Log.e("MediaGalleryFragmentViewModel/CancellationException/loadMedia/error", e);
                }
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaGalleryFragmentViewModel$loadMedia$1(C87774Qc r2, MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel, C023509x r4, boolean z) {
        super(2, r4);
        this.this$0 = mediaGalleryFragmentViewModel;
        this.$mediaListCreator = r2;
        this.$unmounted = z;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new MediaGalleryFragmentViewModel$loadMedia$1(this.$mediaListCreator, this.this$0, r6, this.$unmounted);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel = this.this$0;
            C005502l r4 = mediaGalleryFragmentViewModel.A08;
            final C87774Qc r3 = this.$mediaListCreator;
            final boolean z = this.$unmounted;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r4, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaGalleryFragmentViewModel$loadMedia$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
