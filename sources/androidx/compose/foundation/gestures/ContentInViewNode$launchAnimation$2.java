package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass040;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass5RT;
import X.AnonymousClass61R;
import X.AnonymousClass7US;
import X.C007403e;
import X.C009003v;
import X.C023509x;
import X.C07570Yj;
import X.C15020mZ;
import X.C1506776e;
import X.C151837Ie;
import X.C157507de;
import X.C160557lC;
import X.C94264hv;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
public final class ContentInViewNode$launchAnimation$2 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C94264hv this$0;

    @DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public /* synthetic */ Object L$0;
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            AnonymousClass1 r0 = new AnonymousClass1(r5, A01);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                C94264hv r0 = C94264hv.this;
                r0.A0B.A00 = C94264hv.A00(r0);
                C94264hv r3 = C94264hv.this;
                UpdatableAnimationState updatableAnimationState = r3.A0B;
                AnonymousClass7US r1 = new AnonymousClass7US(r3, (C157507de) this.L$0, A01);
                C151837Ie r02 = new C151837Ie(r3);
                this.label = 1;
                if (updatableAnimationState.A00(this, r02, r1) == r6) {
                    return r6;
                }
            } else if (i == 1) {
                AnonymousClass0AN.A00(obj);
            } else {
                throw AnonymousClass000.A0e();
            }
            return AnonymousClass0AJ.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentInViewNode$launchAnimation$2(C94264hv r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(this.this$0, r4);
        contentInViewNode$launchAnimation$2.L$0 = obj;
        return contentInViewNode$launchAnimation$2;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final C007403e A01 = C07570Yj.A01(((AnonymousClass040) this.L$0).BAE());
            try {
                final C94264hv r0 = this.this$0;
                r0.A05 = true;
                C160557lC r2 = r0.A03;
                AnonymousClass1 r1 = new AnonymousClass1((C023509x) null);
                this.label = 1;
                if (r2.BpQ(AnonymousClass5RT.Default, this, r1) == r6) {
                    return r6;
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                C94264hv r12 = this.this$0;
                r12.A05 = false;
                r12.A0A.A00(e);
                this.this$0.A07 = false;
                throw th;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C1506776e r5 = this.this$0.A0A.A00;
        C15020mZ r02 = new C15020mZ(0, r5.A00 - 1);
        int i2 = r02.A00;
        int i3 = r02.A01;
        if (i2 <= i3) {
            while (true) {
                ((AnonymousClass61R) r5.A01[i2]).A01.resumeWith(AnonymousClass0AJ.A00);
                if (i2 == i3) {
                    break;
                }
                i2++;
            }
        }
        r5.A06();
        C94264hv r13 = this.this$0;
        r13.A05 = false;
        r13.A0A.A00((Throwable) null);
        this.this$0.A07 = false;
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContentInViewNode$launchAnimation$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
