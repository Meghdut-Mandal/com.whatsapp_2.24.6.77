package X;

import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector", f = "GalleryPickerViewModel.kt", i = {0, 1}, l = {89, 95}, m = "addBucket", n = {"this", "this"}, s = {"L$0", "L$0"})
/* renamed from: X.7AK  reason: invalid class name */
public final class AnonymousClass7AK extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GalleryPickerViewModel.BucketsCollector this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7AK(GalleryPickerViewModel.BucketsCollector bucketsCollector, C023509x r2) {
        super(r2);
        this.this$0 = bucketsCollector;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((C62613Gv) null, this);
    }
}
