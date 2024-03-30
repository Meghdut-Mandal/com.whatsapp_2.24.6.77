package com.whatsapp.contact.extensions;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass11F;
import X.AnonymousClass16D;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.extensions.ContactManagerExtKt$asWaContacts$2$1$1", f = "ContactManagerExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ContactManagerExtKt$asWaContacts$2$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass16D $contactManager;
    public final /* synthetic */ AnonymousClass11F $it;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactManagerExtKt$asWaContacts$2$1$1(AnonymousClass16D r2, AnonymousClass11F r3, C023509x r4) {
        super(2, r4);
        this.$contactManager = r2;
        this.$it = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ContactManagerExtKt$asWaContacts$2$1$1(this.$contactManager, this.$it, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            return this.$contactManager.A0D(this.$it);
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContactManagerExtKt$asWaContacts$2$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
