package com.whatsapp.comments;

import X.AnonymousClass000;
import X.AnonymousClass05L;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass3T1;
import X.C009003v;
import X.C023509x;
import X.C36351kA;
import X.C65513Sj;
import X.C85854Ir;
import java.util.SortedSet;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.comments.CommentListManager$messageObserver$1$onMessageAdded$1", f = "CommentListManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentListManager$messageObserver$1$onMessageAdded$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass3T1 $message;
    public int label;
    public final /* synthetic */ C65513Sj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentListManager$messageObserver$1$onMessageAdded$1(C65513Sj r2, AnonymousClass3T1 r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$message = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new CommentListManager$messageObserver$1$onMessageAdded$1(this.this$0, this.$message, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05L r4 = this.this$0.A0A;
            AnonymousClass3T1 r3 = this.$message;
            do {
                value = r4.getValue();
            } while (!C36351kA.A1a(value, (SortedSet) value, new C85854Ir(r3), r4));
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentListManager$messageObserver$1$onMessageAdded$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
