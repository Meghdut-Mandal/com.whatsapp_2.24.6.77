package com.whatsapp.gallery.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass2U0;
import X.AnonymousClass4V2;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C88924Uo;
import com.whatsapp.util.Log;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$fillBubble$1", f = "MediaGalleryFragmentViewModel.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
public final class MediaGalleryFragmentViewModel$fillBubble$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C88924Uo $mediaList;
    public final /* synthetic */ int $position;
    public int label;
    public final /* synthetic */ MediaGalleryFragmentViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$fillBubble$1$1", f = "MediaGalleryFragmentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$fillBubble$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r6) {
            return new AnonymousClass1(mediaGalleryFragmentViewModel, r6, i2);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass4V2 r2;
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                try {
                    C88924Uo r1 = C88924Uo.this;
                    if (r1 != null) {
                        r2 = r1.BDy(i2);
                    } else {
                        r2 = null;
                    }
                    MediaGalleryFragmentViewModel.A01(new AnonymousClass2U0(r2), mediaGalleryFragmentViewModel);
                } catch (CancellationException e) {
                    Log.e("MediaGalleryFragmentViewModel/CancellationException/fillBubble/error", e);
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
    public MediaGalleryFragmentViewModel$fillBubble$1(C88924Uo r2, MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel, C023509x r4, int i) {
        super(2, r4);
        this.this$0 = mediaGalleryFragmentViewModel;
        this.$mediaList = r2;
        this.$position = i;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new MediaGalleryFragmentViewModel$fillBubble$1(this.$mediaList, this.this$0, r6, this.$position);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel = this.this$0;
            C005502l r4 = mediaGalleryFragmentViewModel.A08;
            final C88924Uo r3 = this.$mediaList;
            final int i2 = this.$position;
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
        return ((MediaGalleryFragmentViewModel$fillBubble$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
