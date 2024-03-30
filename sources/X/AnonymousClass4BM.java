package X;

import com.whatsapp.event.EventsActivity;

/* renamed from: X.4BM  reason: invalid class name */
public final class AnonymousClass4BM extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ EventsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4BM(EventsActivity eventsActivity) {
        super(0);
        this.this$0 = eventsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        EventsActivity eventsActivity = this.this$0;
        C57632yZ r2 = eventsActivity.A01;
        if (r2 != null) {
            Object value = eventsActivity.A05.getValue();
            AnonymousClass00C.A0D(value, 1);
            return AnonymousClass4ZG.A00(eventsActivity, value, r2, 10).A00(C39911uC.class);
        }
        throw C36331k8.A0d("eventsViewModelFactory");
    }
}
