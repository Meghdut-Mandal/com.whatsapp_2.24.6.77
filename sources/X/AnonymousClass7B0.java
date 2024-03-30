package X;

import com.whatsapp.contact.picker.DefaultContactsLoader;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.DefaultContactsLoader", f = "DefaultContactsLoader.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3}, l = {27, 28, 29, 30}, m = "loadContacts", n = {"this", "groupJid", "dispatcher", "contacts", "this", "groupJid", "dispatcher", "contacts", "this", "groupJid", "dispatcher", "contacts", "contacts"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0"})
/* renamed from: X.7B0  reason: invalid class name */
public final class AnonymousClass7B0 extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultContactsLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7B0(DefaultContactsLoader defaultContactsLoader, C023509x r2) {
        super(r2);
        this.this$0 = defaultContactsLoader;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.BOK((AnonymousClass147) null, this, (C005502l) null);
    }
}
