package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1G2  reason: invalid class name */
public final class AnonymousClass1G2 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C20520xh this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1G2(C20520xh r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        List A0c = C007103b.A0c(C13620kA.A0F(((AnonymousClass9XG) this.this$0.A09.getValue()).A01()), new C89824Ya(0));
        ArrayList arrayList = new ArrayList();
        for (Object next : A0c) {
            Object obj = ((AnonymousClass011) next).second;
            AnonymousClass00C.A0D(obj, 0);
            if ((obj instanceof C22938Ayo) && !(obj instanceof ABD)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(AnonymousClass03U.A06(arrayList, 10));
        for (Object next2 : arrayList) {
            AnonymousClass00C.A0E(next2, "null cannot be cast to non-null type kotlin.Pair<kotlin.Int, com.whatsapp.fmessage.protobuf.deserialization.FMessageProtobufDeserializer>");
            arrayList2.add(next2);
        }
        return arrayList2;
    }
}
