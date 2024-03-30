package X;

import android.content.Context;

/* renamed from: X.4Mo  reason: invalid class name and case insensitive filesystem */
public final class C86864Mo extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ String $channelId;
    public final /* synthetic */ AnonymousClass11F $chatJid;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AnonymousClass2bT $eventMessage;
    public final /* synthetic */ C81313wo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86864Mo(Context context, AnonymousClass2bT r3, C81313wo r4, AnonymousClass11F r5, String str) {
        super(1);
        this.this$0 = r4;
        this.$context = context;
        this.$eventMessage = r3;
        this.$chatJid = r5;
        this.$channelId = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (AnonymousClass000.A1X(obj)) {
            C81313wo.A00(this.$context, this.$eventMessage, this.this$0, this.$chatJid, this.$channelId);
        }
        return AnonymousClass0AJ.A00;
    }
}
