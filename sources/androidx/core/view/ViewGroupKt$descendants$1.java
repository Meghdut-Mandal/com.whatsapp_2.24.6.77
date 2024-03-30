package androidx.core.view;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C12250hk;
import X.C14090kx;
import X.C18650tV;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {119, 121}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach$iv", "child", "index$iv", "$this$sequence", "$this$forEach$iv", "index$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
public final class ViewGroupKt$descendants$1 extends C14090kx implements C009003v {
    public final /* synthetic */ ViewGroup $this_descendants;
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewGroupKt$descendants$1(ViewGroup viewGroup, C023509x r2) {
        super(r2);
        this.$this_descendants = viewGroup;
    }

    public final C023509x create(Object obj, C023509x r4) {
        ViewGroupKt$descendants$1 viewGroupKt$descendants$1 = new ViewGroupKt$descendants$1(this.$this_descendants, r4);
        viewGroupKt$descendants$1.L$0 = obj;
        return viewGroupKt$descendants$1;
    }

    public final Object invokeSuspend(Object obj) {
        C12250hk r4;
        ViewGroup viewGroup;
        int i;
        int childCount;
        int i2;
        AnonymousClass0AO r10 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 != 0) {
            if (i3 == 1) {
                childCount = this.I$1;
                i2 = this.I$0;
                View view = (View) this.L$2;
                viewGroup = (ViewGroup) this.L$1;
                r4 = (C12250hk) this.L$0;
                AnonymousClass0AN.A00(obj);
                if (view instanceof ViewGroup) {
                    C18650tV r0 = new C18650tV(new ViewGroupKt$descendants$1((ViewGroup) view, (C023509x) null), 1);
                    this.L$0 = r4;
                    this.L$1 = viewGroup;
                    this.L$2 = null;
                    this.I$0 = i2;
                    this.I$1 = childCount;
                    this.label = 2;
                    Iterator it = r0.iterator();
                    if (it.hasNext()) {
                        r4.A01 = it;
                        r4.A00 = 2;
                        r4.A02 = this;
                        return r10;
                    }
                }
            } else if (i3 == 2) {
                childCount = this.I$1;
                i2 = this.I$0;
                viewGroup = (ViewGroup) this.L$1;
                r4 = (C12250hk) this.L$0;
                AnonymousClass0AN.A00(obj);
            } else {
                throw AnonymousClass000.A0e();
            }
            i = i2 + 1;
        } else {
            AnonymousClass0AN.A00(obj);
            r4 = (C12250hk) this.L$0;
            viewGroup = this.$this_descendants;
            i = 0;
            childCount = viewGroup.getChildCount();
        }
        if (i >= childCount) {
            return AnonymousClass0AJ.A00;
        }
        View childAt = viewGroup.getChildAt(i);
        this.L$0 = r4;
        this.L$1 = viewGroup;
        this.L$2 = childAt;
        this.I$0 = i;
        this.I$1 = childCount;
        this.label = 1;
        r4.A01(childAt, this);
        return r10;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ViewGroupKt$descendants$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
