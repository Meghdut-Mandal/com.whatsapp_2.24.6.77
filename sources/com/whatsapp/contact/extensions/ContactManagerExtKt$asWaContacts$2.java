package com.whatsapp.contact.extensions;

import X.AnonymousClass000;
import X.AnonymousClass040;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass16D;
import X.C008903u;
import X.C009003v;
import X.C023109s;
import X.C023509x;
import X.C06800Vd;
import X.C36321k7;
import X.C36401kF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.extensions.ContactManagerExtKt$asWaContacts$2", f = "ContactManagerExt.kt", i = {}, l = {12}, m = "invokeSuspend", n = {}, s = {})
public final class ContactManagerExtKt$asWaContacts$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass16D $contactManager;
    public final /* synthetic */ List $this_asWaContacts;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactManagerExtKt$asWaContacts$2(AnonymousClass16D r2, List list, C023509x r4) {
        super(2, r4);
        this.$this_asWaContacts = list;
        this.$contactManager = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        ContactManagerExtKt$asWaContacts$2 contactManagerExtKt$asWaContacts$2 = new ContactManagerExtKt$asWaContacts$2(this.$contactManager, this.$this_asWaContacts, r5);
        contactManagerExtKt$asWaContacts$2.L$0 = obj;
        return contactManagerExtKt$asWaContacts$2;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r8 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass040 r6 = (AnonymousClass040) this.L$0;
            List list = this.$this_asWaContacts;
            AnonymousClass16D r5 = this.$contactManager;
            ArrayList A0J = C36321k7.A0J(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ContactManagerExtKt$asWaContacts$2$1$1 contactManagerExtKt$asWaContacts$2$1$1 = new ContactManagerExtKt$asWaContacts$2$1$1(r5, C36401kF.A0a(it), (C023509x) null);
                A0J.add(AnonymousClass0A2.A01(C023109s.A00, C008903u.A00, contactManagerExtKt$asWaContacts$2$1$1, r6));
            }
            this.label = 1;
            obj = C06800Vd.A00(A0J, this);
            if (obj == r8) {
                return r8;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContactManagerExtKt$asWaContacts$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
