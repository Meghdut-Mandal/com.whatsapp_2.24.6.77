package X;

import android.content.Intent;
import com.whatsapp.jid.Jid;
import java.util.HashMap;

/* renamed from: X.4Mj  reason: invalid class name and case insensitive filesystem */
public final class C86814Mj extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass155 $activity;
    public final /* synthetic */ boolean $isChatLocked;
    public final /* synthetic */ AnonymousClass3T1 $selectedMessage;
    public final /* synthetic */ C43752Jr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86814Mj(AnonymousClass155 r2, C43752Jr r3, AnonymousClass3T1 r4, boolean z) {
        super(1);
        this.this$0 = r3;
        this.$selectedMessage = r4;
        this.$activity = r2;
        this.$isChatLocked = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C19960wn r6 = (C19960wn) obj;
        HashMap hashMap = this.this$0.A01.A00;
        AnonymousClass00C.A08(hashMap);
        hashMap.put(r6.A00(), this.$selectedMessage);
        Intent A0F = AnonymousClass190.A0F(this.$activity, 0);
        AnonymousClass00C.A08(A0F);
        C36421kH.A0m(A0F, (Jid) r6.A00());
        A0F.putExtra("args_conversation_screen_entry_point", 2);
        A0F.putExtra("extra_quoted_message_row_id", this.$selectedMessage.A0F);
        if (this.$isChatLocked) {
            A0F.putExtra("chatlockEntryPoint", 2);
        }
        this.this$0.A00.A07(this.$activity, A0F);
        return AnonymousClass0AJ.A00;
    }
}
