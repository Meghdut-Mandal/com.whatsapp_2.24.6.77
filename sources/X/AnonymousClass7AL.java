package X;

import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel", f = "GalleryPickerViewModel.kt", i = {0}, l = {199}, m = "checkFavoriteFolderBuckets", n = {"mediaList"}, s = {"L$0"})
/* renamed from: X.7AL  reason: invalid class name */
public final class AnonymousClass7AL extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GalleryPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7AL(GalleryPickerViewModel galleryPickerViewModel, C023509x r2) {
        super(r2);
        this.this$0 = galleryPickerViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GalleryPickerViewModel.A02((GalleryPickerViewModel.BucketsCollector) null, this.this$0, this);
    }
}
