package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass147;
import X.AnonymousClass19R;
import X.AnonymousClass314;
import X.C005602m;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.CompoundContactsLoader$loadContacts$3", f = "CompoundContactsLoader.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
public final class CompoundContactsLoader$loadContacts$3 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int $concurrentCapacity;
    public final /* synthetic */ AnonymousClass147 $groupJid;
    public int label;
    public final /* synthetic */ AnonymousClass314 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompoundContactsLoader$loadContacts$3(AnonymousClass314 r2, AnonymousClass147 r3, C023509x r4, int i) {
        super(2, r4);
        this.this$0 = r2;
        this.$groupJid = r3;
        this.$concurrentCapacity = i;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new CompoundContactsLoader$loadContacts$3(this.this$0, this.$groupJid, r6, this.$concurrentCapacity);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass314 r4 = this.this$0;
            AnonymousClass147 r5 = this.$groupJid;
            int i2 = this.$concurrentCapacity;
            C005602m r7 = AnonymousClass19R.A01;
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r7, new CompoundContactsLoader$loadContacts$2(r4, r5, (C023509x) null, r7, i2));
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CompoundContactsLoader$loadContacts$3) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
