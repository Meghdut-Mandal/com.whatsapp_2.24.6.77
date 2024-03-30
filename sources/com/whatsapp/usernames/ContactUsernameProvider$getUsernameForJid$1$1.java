package com.whatsapp.usernames;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass11F;
import X.C001600r;
import X.C001700s;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C122825vU;
import X.C223313w;
import com.whatsapp.jid.PhoneUserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.ContactUsernameProvider$getUsernameForJid$1$1", f = "ContactUsernameProvider.kt", i = {}, l = {34, 35}, m = "invokeSuspend", n = {}, s = {})
public final class ContactUsernameProvider$getUsernameForJid$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass11F $chatJid;
    public final /* synthetic */ C001700s $it;
    public Object L$0;
    public int label;
    public final /* synthetic */ C122825vU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactUsernameProvider$getUsernameForJid$1$1(C001700s r2, AnonymousClass11F r3, C122825vU r4, C023509x r5) {
        super(2, r5);
        this.$it = r2;
        this.$chatJid = r3;
        this.this$0 = r4;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new ContactUsernameProvider$getUsernameForJid$1$1(this.$it, this.$chatJid, this.this$0, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C001600r r5;
        C005502l r3;
        C009003v contactUsernameProvider$getUsernameForPn$2;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            r5 = this.$it;
            AnonymousClass11F r4 = this.$chatJid;
            if (r4 instanceof C223313w) {
                C122825vU r1 = this.this$0;
                this.L$0 = r5;
                this.label = 1;
                r3 = r1.A02;
                contactUsernameProvider$getUsernameForPn$2 = new ContactUsernameProvider$getUsernameForLid$2((C223313w) r4, r1, (C023509x) null);
            } else if (r4 instanceof PhoneUserJid) {
                C122825vU r12 = this.this$0;
                this.L$0 = r5;
                this.label = 2;
                r3 = r12.A02;
                contactUsernameProvider$getUsernameForPn$2 = new ContactUsernameProvider$getUsernameForPn$2((PhoneUserJid) r4, r12, (C023509x) null);
            } else {
                obj = null;
            }
            obj = AnonymousClass0A2.A00(this, r3, contactUsernameProvider$getUsernameForPn$2);
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1 || i == 2) {
            r5 = (C001600r) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        r5.A0C(obj);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContactUsernameProvider$getUsernameForJid$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
