package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.7YY  reason: invalid class name */
public final class AnonymousClass7YY extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ C009003v $content;
    public final /* synthetic */ AndroidComposeView $owner;
    public final /* synthetic */ AnonymousClass6h3 $uriHandler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7YY(AndroidComposeView androidComposeView, AnonymousClass6h3 r3, C009003v r4) {
        super(2);
        this.$owner = androidComposeView;
        this.$uriHandler = r3;
        this.$content = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma r5 = (C161337ma) obj;
        if ((AnonymousClass000.A0I(obj2) & 11) != 2 || !r5.BHg()) {
            C131996Rr.A00(r5, this.$owner, this.$uriHandler, this.$content, 72);
        } else {
            r5.BuE();
        }
        return AnonymousClass0AJ.A00;
    }
}
