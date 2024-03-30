package X;

import java.util.Map;

/* renamed from: X.0lr  reason: invalid class name and case insensitive filesystem */
public final class C14580lr extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass0i6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14580lr(AnonymousClass0i6 r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String valueOf;
        String valueOf2;
        Map.Entry entry = (Map.Entry) obj;
        AnonymousClass00C.A0D(entry, 0);
        AnonymousClass0i6 r2 = this.this$0;
        StringBuilder A0u = AnonymousClass000.A0u();
        Object key = entry.getKey();
        if (key == r2) {
            valueOf = "(this Map)";
        } else {
            valueOf = String.valueOf(key);
        }
        A0u.append(valueOf);
        A0u.append('=');
        Object value = entry.getValue();
        if (value == r2) {
            valueOf2 = "(this Map)";
        } else {
            valueOf2 = String.valueOf(value);
        }
        return AnonymousClass000.A0q(valueOf2, A0u);
    }
}
