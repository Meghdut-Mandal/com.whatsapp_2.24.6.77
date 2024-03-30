package com.whatsapp.updates.viewmodels;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass11F;
import X.AnonymousClass3OA;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.updates.viewmodels.UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1", f = "UpdatesViewModelObservers.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass11F $jid;
    public int label;
    public final /* synthetic */ AnonymousClass3OA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1(AnonymousClass11F r2, AnonymousClass3OA r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$jid = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1(this.$jid, this.this$0, r5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.2gm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.2gm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: X.2gm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.2gm} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            if (r0 != 0) goto L_0x00da
            X.AnonymousClass0AN.A00(r9)
            X.3OA r0 = r8.this$0
            com.whatsapp.updates.viewmodels.UpdatesViewModel r7 = r0.A08
            X.16D r1 = r0.A02
            X.11F r0 = r8.$jid
            X.141 r4 = r1.A0D(r0)
            X.141 r0 = r4.A04()
            if (r0 == 0) goto L_0x001a
            r4 = r0
        L_0x001a:
            X.11F r6 = r4.A0H
            boolean r0 = r6 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x00c0
            X.00s r3 = r7.A0T
            java.util.List r0 = X.C36401kF.A0w(r3)
            r5 = 0
            if (r0 == 0) goto L_0x004d
            java.util.Iterator r2 = r0.iterator()
        L_0x002d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00be
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.2go r0 = (X.C48162go) r0
            X.141 r0 = r0.A00
            X.11F r0 = r0.A0H
            boolean r0 = X.AnonymousClass00C.A0J(r0, r6)
            if (r0 == 0) goto L_0x002d
        L_0x0044:
            X.2go r1 = (X.C48162go) r1
            if (r1 == 0) goto L_0x004d
            r1.A00 = r4
            X.AnonymousClass3R7.A00(r3)
        L_0x004d:
            X.00s r3 = r7.A0U
            java.util.List r0 = X.C36401kF.A0w(r3)
            if (r0 == 0) goto L_0x0079
            java.util.Iterator r2 = r0.iterator()
        L_0x0059:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3JI r0 = (X.AnonymousClass3JI) r0
            X.141 r0 = r0.A00
            X.11F r0 = r0.A0H
            boolean r0 = X.AnonymousClass00C.A0J(r0, r6)
            if (r0 == 0) goto L_0x0059
        L_0x0070:
            X.3JI r1 = (X.AnonymousClass3JI) r1
            if (r1 == 0) goto L_0x0079
            r1.A00 = r4
            X.AnonymousClass3R7.A00(r3)
        L_0x0079:
            X.08S r3 = r7.A0O
            java.lang.Object r0 = r3.A04()
            X.3KX r0 = (X.AnonymousClass3KX) r0
            r1 = 1
            if (r0 == 0) goto L_0x00b9
            boolean r0 = r0.A09
            if (r0 != r1) goto L_0x00b9
            java.lang.Object r0 = r3.A04()
            X.3KX r0 = (X.AnonymousClass3KX) r0
            if (r0 == 0) goto L_0x00b9
            java.util.List r0 = r0.A08
            if (r0 == 0) goto L_0x00b9
            java.util.Iterator r2 = r0.iterator()
        L_0x0098:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.2gm r0 = (X.C48142gm) r0
            X.141 r0 = r0.A00
            X.11F r0 = r0.A0H
            boolean r0 = X.AnonymousClass00C.A0J(r0, r6)
            if (r0 == 0) goto L_0x0098
            r5 = r1
        L_0x00b0:
            X.2gm r5 = (X.C48142gm) r5
            if (r5 == 0) goto L_0x00b9
            r5.A00 = r4
        L_0x00b6:
            X.AnonymousClass3R7.A00(r3)
        L_0x00b9:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x00bc:
            r1 = r5
            goto L_0x0070
        L_0x00be:
            r1 = r5
            goto L_0x0044
        L_0x00c0:
            X.08S r3 = r7.A0Q
            java.lang.Object r1 = r3.A04()
            X.3S7 r1 = (X.AnonymousClass3S7) r1
            if (r1 == 0) goto L_0x00b6
            java.util.List r0 = r1.A05
            X.AnonymousClass3S7.A01(r4, r0)
            java.util.List r0 = r1.A06
            X.AnonymousClass3S7.A01(r4, r0)
            java.util.List r0 = r1.A04
            X.AnonymousClass3S7.A01(r4, r0)
            goto L_0x00b6
        L_0x00da:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.viewmodels.UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
