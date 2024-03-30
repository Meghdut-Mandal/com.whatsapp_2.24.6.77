package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass7SZ;
import X.C009003v;
import X.C023509x;
import X.C15060md;
import X.C155737Xf;
import X.C90514aH;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.RecentlyAcceptedInviteContactsLoader$loadContacts$2", f = "RecentlyAcceptedInviteContactsLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RecentlyAcceptedInviteContactsLoader$loadContacts$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ RecentlyAcceptedInviteContactsLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentlyAcceptedInviteContactsLoader$loadContacts$2(RecentlyAcceptedInviteContactsLoader recentlyAcceptedInviteContactsLoader, C023509x r3) {
        super(2, r3);
        this.this$0 = recentlyAcceptedInviteContactsLoader;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new RecentlyAcceptedInviteContactsLoader$loadContacts$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new RecentlyAcceptedInviteContactsLoader$loadContacts$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            return C15060md.A01(C15060md.A02(C155737Xf.A00, C15060md.A03(new AnonymousClass7SZ(this.this$0), C90514aH.A0X(this.this$0.A01.A00()))));
        }
        throw AnonymousClass000.A0e();
    }
}
