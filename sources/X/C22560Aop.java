package X;

import com.facebook.wearable.applinks.AppLinkLinkAddress;
import java.util.List;
import java.util.UUID;

/* renamed from: X.Aop  reason: case insensitive filesystem */
public final class C22560Aop extends AnonymousClass00R implements C020008m {
    public final /* synthetic */ UUID $serviceUUID;
    public final /* synthetic */ C203689oX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22560Aop(C203689oX r2, UUID uuid) {
        super(9);
        this.$serviceUUID = uuid;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object BKw(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        List list = (List) obj2;
        int A1a = C36341k9.A1a(obj, list);
        String str = ((AppLinkLinkAddress) C007103b.A0L(list)).address;
        AnonymousClass6YR.A06("lam:LinkedAppManager", AnonymousClass000.A0p("prepareDeviceConfigForWiFi: ipAddress=", str, AnonymousClass000.A0u()));
        AnonymousClass88C r4 = new AnonymousClass88C((AnonymousClass887) null, (String) null, (String) obj3, (String) obj4, str, (String) obj5, (String) obj6, (String) obj7, (String) obj8, (String) obj9, this.$serviceUUID);
        C006302t r1 = this.this$0.A05;
        if (r1 != null) {
            AnonymousClass88C[] r0 = new AnonymousClass88C[A1a];
            r0[0] = r4;
            r1.invoke(AnonymousClass03T.A03(r0));
        }
        return AnonymousClass0AJ.A00;
    }
}
