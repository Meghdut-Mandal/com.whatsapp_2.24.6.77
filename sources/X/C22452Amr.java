package X;

import com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment;

/* renamed from: X.Amr  reason: case insensitive filesystem */
public final class C22452Amr extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ NotificationsAndSoundsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22452Amr(NotificationsAndSoundsFragment notificationsAndSoundsFragment) {
        super(1);
        this.this$0 = notificationsAndSoundsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass011 r4 = (AnonymousClass011) obj;
        Object obj2 = r4.first;
        if (C36381kD.A13("jid_message_tone", "jid_call_ringtone").contains(obj2)) {
            NotificationsAndSoundsFragment.A00(this.this$0, (String) r4.second, (String) r4.first);
        } else if (C36381kD.A13("jid_message_vibration", "jid_call_vibration").contains(obj2)) {
            NotificationsAndSoundsFragment.A03(this.this$0, (String) r4.second, (String) r4.first);
        }
        return AnonymousClass0AJ.A00;
    }
}
